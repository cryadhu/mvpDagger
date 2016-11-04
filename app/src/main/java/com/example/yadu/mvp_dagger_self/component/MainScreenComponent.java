package com.example.yadu.mvp_dagger_self.component;



import com.example.yadu.mvp_dagger_self.module.MainScreenModule;
import com.example.yadu.mvp_dagger_self.ui.activity.MainActivity;
import com.example.yadu.mvp_dagger_self.utils.CustomScope;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by yadu on 4/11/16.
 */

@CustomScope
@Component(dependencies = NetworkComponent.class,modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity mainActivity);
}
