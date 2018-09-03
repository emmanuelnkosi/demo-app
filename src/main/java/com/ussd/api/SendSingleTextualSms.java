package com.ussd.api;

import com.google.gson.GsonBuilder;



import retrofit.*;
import retrofit.converter.GsonConverter;
import retrofit.http.*;

/**
 * This is a generated class and is not intended for modification!
 */
public class SendSingleTextualSms {
    private final Configuration configuration;

    public SendSingleTextualSms(Configuration configuration) {
        this.configuration = configuration;
    }

    interface SendSingleTextualSmsService {
        @POST("/sms/1/text/single")
        SMSResponse execute(@Body SMSTextualRequest bodyObject);
    }
    public SMSResponse execute(SMSTextualRequest bodyObject) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        SendSingleTextualSmsService service = restAdapter.create(SendSingleTextualSmsService.class);
        return service.execute(bodyObject);
    }

    private RequestInterceptor getRequestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void intercept(RequestFacade request) {
                if (configuration != null && configuration.getAuthorizationHeader() != null) {
                    request.addHeader("Authorization", configuration.getAuthorizationHeader());
                    request.addHeader("User-Agent", "Java-Client-Library");
                }
            }
        };
    }
}