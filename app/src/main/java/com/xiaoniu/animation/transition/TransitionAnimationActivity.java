package com.xiaoniu.animation.transition;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;

import com.xiaoniu.animation.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author  xiaoniu
 * 转场动画
 */
public class TransitionAnimationActivity extends AppCompatActivity {

    @BindView(R.id.iv_car)
    View iv_car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transiton_animation);
        ButterKnife.bind(this);
    }

    /**
     * 老式转场动画
     * @param view
     */
    public void oldTransition(View view){
        Intent intent = new Intent(this, OldTransitionActivity.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }
    /**
     * 爆炸转场动画
     * @param view
     */
    public void explodeTransition(View view){
        Intent intent = new Intent(this, ExplodeActivity.class);
        //固定写法，下个activity能识别这是新的Android5.0转场动画
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    /**
     * 从下到上
     * @param view
     */
    public void slideTransition(View view){
        Intent intent = new Intent(this, SlideActivity.class);
        //固定写法，下个activity能识别这是新的Android5.0转场动画
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    /**
     *渐变
     * @param view
     */
    public void fadeTransition(View view){
        Intent intent = new Intent(this, FadeActivity.class);
        //固定写法，下个activity能识别这是新的Android5.0转场动画
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
    /**
     *共享元素
     * @param view
     */
    public void shareTransition(View view){
        Intent intent = new Intent(this, ShareActivity.class);
        startActivity(intent, ActivityOptions
                .makeSceneTransitionAnimation(this,
                        Pair.create(iv_car, "car"))
                .toBundle());
    }

    /**
     *共享元素
     * @param view
     */
    public void shareListActivity(View view){
        Intent intent = new Intent(this, ShareListActivity.class);
        startActivity(intent);
    }
}
