package com.xiaoniu.animation.transition;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.xiaoniu.animation.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 矢量动画
 * @author xiaoniu
 */
public class VectorAnimationActivity extends AppCompatActivity {

    @BindView(R.id.iv_favorite)
    ImageView iv_favorite;

    @BindView(R.id.iv_vector)
    ImageView iv_vector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_animation);

        ButterKnife.bind(this);
    }


    public void onStartVector(View view){
        AnimatedVectorDrawable drawable = (AnimatedVectorDrawable) iv_vector.getDrawable();
        drawable.start();
    }
}
