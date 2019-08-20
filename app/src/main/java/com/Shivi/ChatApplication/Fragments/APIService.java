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
                    "Authorization:key=AAAALMMyF2s:APA91bG91hRRiI8xSLEQOXrDqzsAThjevrJAB47rmo80WK5SYHxSoj9fXi9t_fWp-6fyGNdmJ01rgqFrlqxJHhcQAgQrAhxiGdHB29izZNLqEtdK-3raEWJuXLJygKJ_2zwKNG9HsO4-"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
