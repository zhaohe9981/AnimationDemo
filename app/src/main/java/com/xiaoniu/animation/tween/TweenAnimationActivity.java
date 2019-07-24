package com.xiaoniu.animation.tween;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.xiaoniu.animation.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author xiaoniu
 * @date 2019/7/22
 * 视图动画演示
 */
public class TweenAnimationActivity extends AppCompatActivity {


    @BindView(R.id.iv_icon)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);
        ButterKnife.bind(this);
    }


    public void onRotate(View view){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.tween_rotate);
//        animation.setDuration(1000);
//        animation.setRepeatCount(1);//这里设置次数无效
//        animation.setRepeatMode(Animation.REVERSE);
        imageView.startAnimation(animation);
    }

    public void onTranslate(View view){
        imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.tween_set));
    }

    public void onCustomAnimation(View view){
//        MyAnimation animation = new MyAnimation(1000, 0, 180);
        MyAnimation animation = new MyAnimation(10000, 0, 360);
        imageView.startAnimation(animation);

//        ObjectAnimator.ofFloat(imageView, "rotationX",0,360).setDuration(1000).start();
    }

}
