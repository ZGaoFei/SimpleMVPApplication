package com.zgf.simplemvpapplication.module;

import com.zgf.simplemvpapplication.model.StringModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zgf on 2016/12/12.
 *
 * M 层：用于处理数据
 */

public class NetWorkConnection {

    public static List<StringModel> setList() {
        List<StringModel> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            StringModel stringModel = new StringModel();
            stringModel.setTitle("item:" + (i + 1));
            stringModel.setContent("This is item" + (i + 1) + "content");
            list.add(stringModel);
        }

        return list;
    }
}
