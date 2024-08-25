package com.zip.rest.controller;

// Java Program to Illustrate ZipCodeController Class

// Importing required classes
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Annotation
@Controller
// Class
public class ZipCodeController {

	// Method 1
	@RequestMapping("/getLocalityDetailsByZipCode")
	public @ResponseBody JsonObject getLocalityDetailsByZipCode(String zipCode) throws IOException {

		JsonObject jsonObject = new JsonObject();
		jsonObject = getLocalityDetailsByZip(zipCode);

		// Parsing the JSONObject
		JsonObject finalJsonObject = new JsonObject();

		String country = jsonObject.get("country").toString();
		country = country.replaceAll("^\"|\"$", "");
		JsonArray jsonPlacesArray = null;

		ArrayList placesList = new ArrayList();
		ArrayList stateList = new ArrayList();
		ArrayList latitudeList = new ArrayList();
		ArrayList longitudeList = new ArrayList();

		// Places data is available as JSONArray
		jsonPlacesArray = jsonObject.get("places").getAsJsonArray();
		// It is iterated
		Iterator<JsonElement> objectIterator = jsonPlacesArray.iterator();

		while (objectIterator.hasNext()) {
			JsonElement object = objectIterator.next();
			JsonObject jObj = object.getAsJsonObject();
			System.out.println(jObj.get("place name").toString() + jObj.get("state").toString());
			placesList.add(jObj.get("place name").toString().replaceAll("^\"|\"$", ""));
			stateList.add(jObj.get("state").toString().replaceAll("^\"|\"$", ""));
			latitudeList.add(jObj.get("latitude").toString().replaceAll("^\"|\"$", ""));
			longitudeList.add(jObj.get("longitude").toString().replaceAll("^\"|\"$", ""));
		}

		finalJsonObject.addProperty("country", country);
		finalJsonObject.addProperty("associatedplaces", placesList.toString());
		finalJsonObject.addProperty("associatedplacessize", placesList.size());
		finalJsonObject.addProperty("state", stateList.toString());
		finalJsonObject.addProperty("statename", stateList.get(0).toString());
		finalJsonObject.addProperty("associatedlatitude", latitudeList.toString());
		finalJsonObject.addProperty("associatedlatitudesize", latitudeList.size());
		finalJsonObject.addProperty("associatedlongitude", longitudeList.toString());
		finalJsonObject.addProperty("associatedlongitudesize", longitudeList.size());

		return finalJsonObject;
	}

	// Method 2
	private JsonObject getLocalityDetailsByZip(String zipCode) throws IOException {

		String data = null;
		StringBuilder responseData = new StringBuilder();
		JsonObject jsonObject = null;

		URL url = null;
		url = new URL("http://api.zippopotam.us/IN/" + zipCode);

		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", "Mozilla/5.0");
		int responseCode = con.getResponseCode();

		System.out.println("\nSending 'GET' request to URL : " + url);
		// System.out.println("Response Code : " +
		// responseCode);

		// Try block to check for exceptions
		try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {

			String line;

			while ((line = in.readLine()) != null) {
				responseData.append(line);
			}

			jsonObject = new Gson().fromJson(responseData.toString(), JsonObject.class);
		}

		// System.out.println(data);
		return jsonObject;
	}
}
