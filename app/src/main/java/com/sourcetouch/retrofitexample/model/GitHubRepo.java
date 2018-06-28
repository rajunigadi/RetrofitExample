package com.sourcetouch.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rajashekhar Vanahalli on 27/06/18.
 */
public class GitHubRepo {

    private String name;

    @SerializedName("avatar_url")
    private String avatarUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
