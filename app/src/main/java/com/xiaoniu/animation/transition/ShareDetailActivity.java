package com.xiaoniu.animation.transition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.xiaoniu.animation.R;

import java.io.Serializable;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShareDetailActivity extends AppCompatActivity {

    @BindView(R.id.iv_icon)
    ImageView imageView;
    @BindView(R.id.tv_title)
    TextView title;
    @BindView(R.id.tv_description)
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_share_detail);
        ButterKnife.bind(this);

        NewBean bean = (NewBean) getIntent().getSerializableExtra("bean");
        imageView.setImageResource(bean.getIconId());
        title.setText(bean.getTitle());
        description.setText(bean.getDescription());
    }
}
