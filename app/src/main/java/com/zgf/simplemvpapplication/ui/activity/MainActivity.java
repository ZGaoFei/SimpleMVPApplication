package com.zgf.simplemvpapplication.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.zgf.simplemvpapplication.R;
import com.zgf.simplemvpapplication.contract.Presenter;
import com.zgf.simplemvpapplication.model.StringModel;
import com.zgf.simplemvpapplication.presenter.MainPresenter;
import com.zgf.simplemvpapplication.ui.adapter.MainAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是一个简单的MVP模式的例子
 *
 * 这里模仿一个网络请求的方法来表现MVP模式
 */
public class MainActivity extends AppCompatActivity implements com.zgf.simplemvpapplication.contract.View{
    private Button btGetData;
    private RecyclerView rvShowData;

    private List<StringModel> list;
    private MainAdapter adapter;
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        initListener();
    }

    private void initView() {
        btGetData = (Button) findViewById(R.id.bt_get_data);
        rvShowData = (RecyclerView) findViewById(R.id.rv_show_data);
    }

    private void initData() {
        list = new ArrayList<>();
        adapter = new MainAdapter(this, list);
        rvShowData.setLayoutManager(new LinearLayoutManager(this));
        rvShowData.setAdapter(adapter);

        presenter = new MainPresenter(this);
    }

    private void initListener() {
        btGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.getData();
            }
        });
    }

    @Override
    public void showData(List<StringModel> list) {
        adapter.updateUi(list);
    }
}
