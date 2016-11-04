package com.example.yadu.mvp_dagger_self.rest.apicalls;

import com.example.yadu.mvp_dagger_self.rest.model.Post;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by yadu on 4/11/16.
 */

public interface api {
    @GET("/posts")
    Observable<List<Post>> getPostList();
}
