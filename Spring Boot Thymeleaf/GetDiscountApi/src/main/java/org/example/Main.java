package org.example;

public class Main {

    public static void main(String[] args) {

        try {
            String barcode = "74001755";

            URL url = new URL("https://jsonmock.hackerrank.com/api/inventory?barcode=" + barcode);

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

            try {
                JSONObject jsonObject = new JSONObject(ans);
                System.out.println(jsonObject);
                JSONArray family = (JSONArray) jsonObject.get("data");
                System.out.println(family);
                JSONObject sonObject = family.getJSONObject(0);
                System.out.println(sonObject);
                int discount = sonObject.getInt("discount");
                int price = sonObject.getInt("price");
                System.out.println(price + " " + discount);
                double discountedPrice = (discount*price) / 100;
                System.out.println(price-discountedPrice);

            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception in NetClientGet:- " + e);
        }
    }
    }
