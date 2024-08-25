package com.nath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.JsonArray;

public class GetDataRates {

	public static void main(String[] args) {
		try {

			URL url = new URL("https://api.coingecko.com/api/v3/exchange_rates\r\n" + "");// your url i.e fetch
																							// data from .
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP Error code : " + conn.getResponseCode());
			}
			InputStreamReader in = new InputStreamReader(conn.getInputStream());
			BufferedReader br = new BufferedReader(in);

			String output;
			String ans = "";

			while ((output = br.readLine()) != null) {
				// System.out.println(output);
				ans = ans + output;
			}
			conn.disconnect();
			System.out.println(ans);

			String jsonString = ans;
			try {
				JSONObject jsonObject = new JSONObject(jsonString);

				JSONObject jsonChild1 = (JSONObject) jsonObject.get("rates");
				System.out.println(jsonChild1);

				JSONObject jsonChild2 = (JSONObject) jsonChild1.get("btc");
				System.out.println(jsonChild2);

				String jsonChild3 = (String) jsonChild2.get("name");
				System.out.println(jsonChild3);
				System.out.println(jsonChild2.has("value"));
				
				Map<String, Object> map1 = toMap(jsonChild2);
				
				System.out.println(map1);
				System.out.println(map1.containsValue("crypto"));
				System.out.println(map1.get("value"));

			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println("Exception in NetClientGet:- " + e);
		}
	}

	public static Map<String, Object> toMap(JSONObject jsonobj) throws JSONException {
		Map<String, Object> map = new HashMap<String, Object>();
		Iterator<String> keys = jsonobj.keys();
		while (keys.hasNext()) {
			String key = keys.next();
			Object value = jsonobj.get(key);
			if (value instanceof JSONArray) {
				value = toList((JSONArray) value);
			} else if (value instanceof JSONObject) {
				value = toMap((JSONObject) value);
			}
			map.put(key, value);
		}
		return map;
	}

	public static List<Object> toList(JSONArray array) throws JSONException {
		List<Object> list = new ArrayList<Object>();
		for (int i = 0; i < array.length(); i++) {
			Object value = array.get(i);
			if (value instanceof JSONArray) {
				value = toList((JSONArray) value);
			} else if (value instanceof JSONObject) {
				value = toMap((JSONObject) value);
			}
			list.add(value);
		}
		return list;
	}

	public static boolean hasValue(JsonArray json, String key, String value) {
		for (int i = 0; i < json.size(); i++) { // iterate through the JsonArray
			// first I get the 'i' JsonElement as a JsonObject, then I get the key as a
			// string and I compare it with the value
			if (json.get(i).getAsJsonObject().get(key).getAsString().equals(value))
				return true;
		}
		return false;
	}

//			String key = "eth";
//			String a = getJsonValue(ans, key);
//			System.out.println(a);
//			String k = "unit";
//			String b = getJsonValue(a, k);
//			System.out.println(b);

	public static String getJsonValue(String jsonReq, String key) {

		JSONObject json = new JSONObject(jsonReq);
		boolean exists = json.has(key);
		Iterator<?> keys;
		String nextKeys;
		String val = "";
		if (!exists) {
			keys = json.keys();
			while (keys.hasNext()) {
				nextKeys = (String) keys.next();
				try {
					if (json.get(nextKeys) instanceof JSONObject) {
						return getJsonValue((json).getJSONObject(nextKeys).toString(), key);
					} else if (json.get(nextKeys) instanceof JSONArray) {
						JSONArray jsonArray = json.getJSONArray(nextKeys);
						int i = 0;
						if (i < jsonArray.length())
							do {
								String jsonArrayString = jsonArray.get(i).toString();
								JSONObject innerJson = new JSONObject(jsonArrayString);
								return getJsonValue(innerJson.toString(), key);
							} while (i < jsonArray.length());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else {
			val = json.get(key).toString();
		}
		return val;
	}

//			JSONObject rates = (JSONObject) jsonObject.get("rates");
//			System.out.println("rates: " + rates);
//			String usd = (String) rates.get("usd");
//			System.out.println("usd: " + usd);

//			Object rates =  jsonObject.get("rates");
//			System.out.println("rates: " + rates);
//			
//			String usd = (String) rates.get("usd");
//			System.out.println("\tjava: " + usd);

	// System.out.println(jsonObject.get("rates"));

//		      List<String> list = new ArrayList<String>();
//		      JSONArray jsonArray = jsonObject.getJSONArray("rates");
//		      for(int i = 0 ; i < jsonArray.length(); i++) {
//		         list.add(jsonArray.getJSONObject(i).getString("username"));
//		         System.out.println(jsonArray.getJSONObject(i).getString("username")); // display usernames
//		      }
//		      System.out.println(list);

}
