package com.xiaoniu.animation.transition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.xiaoniu.animation.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShareListActivity extends AppCompatActivity {

    @BindView(R.id.rv_list)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_list);

        ButterKnife.bind(this);
        initData();
    }

    private void initData() {
        List<NewBean> list = new ArrayList<>(6);
        list.add(new NewBean(R.drawable.ic_one, "一就是一", "我要做个不一样的一"));
        list.add(new NewBean(R.drawable.ic_two, "二就是二", "我要做个不一样的二"));
        list.add(new NewBean(R.drawable.ic_three, "三就是三", "我要做个不一样的三"));
        list.add(new NewBean(R.drawable.ic_four, "四就是四", "我要做个不一样的四"));
        list.add(new NewBean(R.drawable.ic_five, "五就是五", "我要做个不一样的五"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListAdapter(this, list));
    }

}
