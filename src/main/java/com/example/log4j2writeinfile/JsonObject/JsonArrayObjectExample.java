package com.example.log4j2writeinfile.JsonObject;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

public class JsonArrayObjectExample {
    public static void main(String[] args) {
        String url="https://api.nobitex.ir/v2/orderbook/all";
        RestTemplate restTemplate=new RestTemplate();
        String response = restTemplate.getForObject(url,String.class);
        JSONObject jsonObject=new JSONObject(response);
        String usdtiri=jsonObject.get("BTCIRT").toString();
        System.out.println("BTCIRT "+usdtiri);
        JSONObject jsonObjectInder=new JSONObject(usdtiri);
        String asks=jsonObjectInder.get("asks").toString();
        System.out.println("asks "+asks);

    }
}
