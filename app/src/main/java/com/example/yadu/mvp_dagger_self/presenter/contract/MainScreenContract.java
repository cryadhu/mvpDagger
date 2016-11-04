package com.example.yadu.mvp_dagger_self.presenter.contract;

import com.example.yadu.mvp_dagger_self.rest.model.Post;

import java.util.List;

/**
 * Created by yadu on 4/11/16.
 */

public interface MainScreenContract {
    interface View{
        void showList(List<Post> posts);
        void showError(String message);
        void completed();
    }
    interface Presenter{
        void loadData();
    }

}
