package com.Shivi.ChatApplication.Fragments;

import com.Shivi.ChatApplication.Notifications.MyResponse;
import com.Shivi.ChatApplication.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key="//Firebase Cloud Messaging API Key
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
