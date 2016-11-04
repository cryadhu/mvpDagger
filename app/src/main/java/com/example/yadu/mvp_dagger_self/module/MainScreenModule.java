package com.example.yadu.mvp_dagger_self.module;

import com.example.yadu.mvp_dagger_self.presenter.contract.MainScreenContract;
import com.example.yadu.mvp_dagger_self.utils.CustomScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yadu on 4/11/16.
 */

@Module
public class MainScreenModule {
    private final MainScreenContract.View view;

    public MainScreenModule(MainScreenContract.View view) {
        this.view = view;
    }

    @Provides
    @CustomScope
    public MainScreenContract.View getView() {
        return view;
    }
}
