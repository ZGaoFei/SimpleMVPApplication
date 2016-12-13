package com.zgf.simplemvpapplication.presenter;

import com.zgf.simplemvpapplication.contract.Presenter;
import com.zgf.simplemvpapplication.contract.View;
import com.zgf.simplemvpapplication.model.StringModel;
import com.zgf.simplemvpapplication.module.NetWorkConnection;

import java.util.List;

/**
 * Created by zgf on 2016/12/12.
 *
 * P 层：用于处理逻辑
 */

public class MainPresenter implements Presenter {
    View view;

    public MainPresenter(View view) {
        this.view = view;
    }

    @Override
    public void getData() {
        List<StringModel> stringModels = NetWorkConnection.setList();
        view.showData(stringModels);
    }
}
