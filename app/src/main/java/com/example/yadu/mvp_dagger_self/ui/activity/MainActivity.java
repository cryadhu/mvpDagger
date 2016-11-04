package com.example.yadu.mvp_dagger_self.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.yadu.mvp_dagger_self.MyApplication;
import com.example.yadu.mvp_dagger_self.R;
import com.example.yadu.mvp_dagger_self.component.DaggerMainScreenComponent;
import com.example.yadu.mvp_dagger_self.module.AppModule;
import com.example.yadu.mvp_dagger_self.module.MainScreenModule;
import com.example.yadu.mvp_dagger_self.presenter.MainScreenPresenter;
import com.example.yadu.mvp_dagger_self.presenter.contract.MainScreenContract;
import com.example.yadu.mvp_dagger_self.rest.model.Post;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainScreenContract.View{

    @Inject
    MainScreenPresenter mainScreenPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainScreenComponent.builder().networkComponent(((MyApplication)getApplicationContext()).getNetworkComponent())
                .mainScreenModule(new MainScreenModule(this))
                .build().inject(this);

        mainScreenPresenter.loadData();
    }

    @Override
    public void showList(List<Post> posts) {
        Log.e("datafff",posts.get(0).getBody());
    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void completed() {

    }
}
