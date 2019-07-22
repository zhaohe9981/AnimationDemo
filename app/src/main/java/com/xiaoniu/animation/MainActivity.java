package com.xiaoniu.animation;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.xiaoniu.animation.property.PropertyAnimationActivity;
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



    private void goOtherActivity(Class clazz){
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }
}
