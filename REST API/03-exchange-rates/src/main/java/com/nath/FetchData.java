package com.nath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FetchData {
	
	public static void main(String[] args) {
		try {

			//URL url = new URL("https://api.sampleapis.com/wines/reds");
			URL url = new URL("https://api.sampleapis.com/fakebank/accounts");
			// your url i.e fetch
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
		} catch (Exception e) {
			System.out.println("Exception in NetClientGet:- " + e);
		}
	}

}
