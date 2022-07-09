package com.example.log4j2writeinfile.JsonObject;

import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

public class JsonObjectExample {
    public static void main(String[] args) {
        String url="https://api.nobitex.ir/v2/orderbook/BTCIRT";
        RestTemplate restTemplate=new RestTemplate();
        String response = restTemplate.getForObject(url,String.class);
        System.out.println(response);
        JSONObject jsonObject=new JSONObject(response);
       String s= jsonObject.get("status").toString();
       System.out.println(s);
    }
}
