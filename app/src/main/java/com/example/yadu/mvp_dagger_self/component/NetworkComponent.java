package com.example.yadu.mvp_dagger_self.component;

import com.example.yadu.mvp_dagger_self.module.AppModule;
import com.example.yadu.mvp_dagger_self.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by yadu on 4/11/16.
 */

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface NetworkComponent {
    Retrofit retrofit();
}
