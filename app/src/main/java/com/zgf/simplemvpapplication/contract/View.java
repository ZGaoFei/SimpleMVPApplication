package com.zgf.simplemvpapplication.contract;

import com.zgf.simplemvpapplication.model.StringModel;

import java.util.List;

/**
 * Created by zgf on 2016/12/12.
 */

public interface View {
    void showData(List<StringModel> list);
}
