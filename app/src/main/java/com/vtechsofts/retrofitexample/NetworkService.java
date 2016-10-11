package com.vtechsofts.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by StraxisInc on 10/11/16.
 */
//https://api.github.com/users
public interface NetworkService {
    @GET("users")
    Call<List<User>> getUsers();
}
