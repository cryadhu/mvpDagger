package com.example.yadu.mvp_dagger_self.presenter;

import com.example.yadu.mvp_dagger_self.presenter.contract.MainScreenContract;
import com.example.yadu.mvp_dagger_self.rest.apicalls.api;
import com.example.yadu.mvp_dagger_self.rest.model.Post;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Retrofit;
import rx.Observer;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by yadu on 4/11/16.
 */

public class MainScreenPresenter implements MainScreenContract.Presenter {
    private MainScreenContract.View view;
    private Retrofit retrofit;

    @Inject
    public MainScreenPresenter(MainScreenContract.View view, Retrofit retrofit) {
        this.view = view;
        this.retrofit = retrofit;
    }

    @Override
    public void loadData() {
        retrofit.create(api.class).getPostList().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<List<Post>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(List<Post> posts) {
                        view.showList(posts);
                    }
                });
    }
}
