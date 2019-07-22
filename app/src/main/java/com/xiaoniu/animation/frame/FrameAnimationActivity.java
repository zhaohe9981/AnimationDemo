package com.xiaoniu.animation.frame;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.xiaoniu.animation.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author xiaoniu
 *  帧动画
 */
public class FrameAnimationActivity extends AppCompatActivity {

    @BindView(R.id.iv_frame)
    ImageView iv_frame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);
        ButterKnife.bind(this);
    }

//    private boolean isStart = false;
//    private AnimationDrawable drawable = null;
//    public void onStartFrame(View view){
//        if (isStart){
//            if (drawable != null && drawable.isRunning()){
//                drawable.stop();
//            }
//            isStart = false;
//        }else {
//            if (drawable == null){
//                drawable = (AnimationDrawable) iv_frame.getDrawable();
//            }
//            isStart = true;
//            drawable.start();
//        }
//    }


    public void onStartFrame(View view){
        AnimationDrawable drawable = (AnimationDrawable) iv_frame.getDrawable();
        drawable.start();
    }
}
