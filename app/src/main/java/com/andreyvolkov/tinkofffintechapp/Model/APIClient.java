package com.andreyvolkov.tinkofffintechapp.Model;

import com.andreyvolkov.tinkofffintechapp.Retrofit.PostClient;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    private final String BASE_URL = "https://api.vk.com/";

    private Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private Retrofit retrofit = builder.build();

    public void getPosts() {
        PostClient client = retrofit.create(PostClient.class);

        //Call<VKResponse> call = client.post(methodName, domain, true, token, version);




    }
}
