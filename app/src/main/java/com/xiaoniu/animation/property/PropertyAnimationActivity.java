package com.xiaoniu.animation.property;

import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import com.xiaoniu.animation.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author xiaoniu
 * @属性动画
 */
public class PropertyAnimationActivity extends AppCompatActivity {

    @BindView(R.id.iv_rotate)
    ImageView iv_rotate;
    @BindView(R.id.tv_money)
    TextView tvMoney;
    @BindView(R.id.iv_car)
    ImageView iv_car;
    @BindView(R.id.iv_location)
    ImageView iv_location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_animation);

        ButterKnife.bind(this);
    }


    public void onStartRotate(View view){
        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0, 90).setDuration(2000);
        valueAnimator.setRepeatCount(1);
        valueAnimator.setRepeatMode(ValueAnimator.REVERSE);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                iv_rotate.setRotation((Float) animation.getAnimatedValue());
            }
        });
        valueAnimator.start();
    }

    public void onStartCalculate(View view){
        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0, 1000).setDuration(2000);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float value = (float) animation.getAnimatedValue();
                tvMoney.setText(String.valueOf(value));
            }
        });
        valueAnimator.start();
    }

    public void onStartObjectAnimation(View view){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(iv_car, "TranslationX", 0, 200).setDuration(3000);
        objectAnimator.setInterpolator(new DecelerateInterpolator());
        objectAnimator.start();
    }

    public void onStartPathAnimation(View view){
        Path path = new Path();
        path.moveTo(0,500);
        path.quadTo(20,500, 500, 700);
        path.lineTo(500, 900);

        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(iv_location,View.X, View.Y ,path).setDuration(3000);
        objectAnimator.start();
    }

}