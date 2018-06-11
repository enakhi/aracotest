package com.arna.testerApp;

import com.arna.Advertise;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.HashMap;

import co.ronash.pushe.PusheListenerService;

public class MyPushListener extends PusheListenerService {
    @Override
    public void onMessageReceived(JSONObject message, JSONObject content){
        try {
            String result=message.getString("ng");
            Advertise.AdvertiseReceived(result,getApplicationContext());
        } catch (Throwable tr) {
        }
    }
}