package com.example.yadu.mvp_dagger_self;

import android.app.Application;

import com.example.yadu.mvp_dagger_self.component.DaggerNetworkComponent;
import com.example.yadu.mvp_dagger_self.component.NetworkComponent;
import com.example.yadu.mvp_dagger_self.module.AppModule;
import com.example.yadu.mvp_dagger_self.module.NetworkModule;


/**
 * Created by yadu on 4/11/16.
 */

public class MyApplication extends Application {
    public NetworkComponent networkComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        networkComponent = DaggerNetworkComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule("http://jsonplaceholder.typicode.com/"))
                .build();
        //develop

    }

    public NetworkComponent getNetworkComponent() {
        return networkComponent;
    }
}
