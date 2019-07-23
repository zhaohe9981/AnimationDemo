package com.xiaoniu.animation;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.xiaoniu.animation.frame.FrameAnimationActivity;
import com.xiaoniu.animation.property.PropertyAnimationActivity;
import com.xiaoniu.animation.reveal.RevealAnimationActivity;
import com.xiaoniu.animation.transition.TransitionAnimationActivity;
import com.xiaoniu.animation.transition.VectorAnimationActivity;
import com.xiaoniu.animation.tween.TweenAnimationActivity;

/**
 * 主界面
 * @author xiaoniu
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 视图动画：旋转，移动，缩放，透明度
     * @param view
     */
    public void onTweenAnimation(View view){
        goOtherActivity(TweenAnimationActivity.class);
    }

    /**
     * 属性动画
     * @param view
     */
    public void onPropertyAnimation(View view){
        goOtherActivity(PropertyAnimationActivity.class);
    }

    /**
     * 帧动画
     * @param view
     */
    public void onFrameAnimation(View view){
        goOtherActivity(FrameAnimationActivity.class);
    }

    /**
     * 圆形揭露动画
     * @param view
     */
    public void onCircleRevealAnimation(View view){
        goOtherActivity(RevealAnimationActivity.class);
    }

    /**
     * 转场动画
     * @param view
     */
    public void onTransitionAnimation(View view){
        goOtherActivity(TransitionAnimationActivity.class);
    }

    /**
     * 矢量动画
     * @param view
     */
    public void onVectorAnimation(View view){
        goOtherActivity(VectorAnimationActivity.class);
    }



    private void goOtherActivity(Class clazz){
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }
}
