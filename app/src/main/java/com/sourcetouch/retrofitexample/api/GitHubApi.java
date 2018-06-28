package com.sourcetouch.retrofitexample.api;

import com.sourcetouch.retrofitexample.model.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Rajashekhar Vanahalli on 27/06/18.
 */
public interface GitHubApi {
    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> getGitHubRepos(@Path("user") String user);
}
