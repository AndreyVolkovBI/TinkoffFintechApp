package com.andreyvolkov.tinkofffintechapp.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PostClient {
    @GET("/method/{method_name}")
    Call<String> post(@Path("method_name") String methodName,
                          @Query("domain") String domain,
                          @Query("extended") Boolean b,
                          @Query("access_token") String token,
                          @Query("v") String version);
}
