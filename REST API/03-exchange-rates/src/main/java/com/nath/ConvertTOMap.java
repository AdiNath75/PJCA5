package com.nath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ConvertTOMap {
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
				
				Type type1 = new TypeToken<Map<String, Object>>(){}.getType();
		        Map<String, Object> map1 = new Gson().fromJson(jsonChild1.toString(), type1);
		        
		        System.out.println(map1);
		        System.out.println(map1.keySet());
				
				//System.out.println("Enter name from above");
				JSONObject jsonChild2 = (JSONObject) jsonChild1.get("btc");
				System.out.println(jsonChild2);
				
				//System.out.println("Enter particular name");
				try {
					String jsonChild3 = (String) jsonChild2.get("name");
					System.out.println(jsonChild3);
				}
				catch(ClassCastException e){
					Object jsonChild3 = jsonChild2.get("value");
					System.out.println(jsonChild3);
					
				}
				
				Type type2 = new TypeToken<Map<String, Object>>(){}.getType();
		        Map<String, Object> map2 = new Gson().fromJson(jsonChild2.toString(), type2);
		        
		        System.out.println(map2);
		        
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (Exception e) {
			System.out.println("Exception in NetClientGet:- " + e);
		}
	}
}
