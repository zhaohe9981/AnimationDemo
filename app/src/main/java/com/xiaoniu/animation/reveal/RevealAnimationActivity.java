package com.xiaoniu.animation.reveal;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.ImageView;

import com.xiaoniu.animation.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 揭露动画
 * @author xiaoniu
 */
public class RevealAnimationActivity extends AppCompatActivity {

    @BindView(R.id.iv_reveal)
    ImageView iv_reveal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reveal_animation);

        ButterKnife.bind(this);
    }

    /**
     * 从小到大
     * @param view
     */
    public void onRevealCenter(View view){
        Animator circularReveal = ViewAnimationUtils.createCircularReveal(iv_reveal, iv_reveal.getWidth() / 2, iv_reveal.getHeight() / 2, 0, iv_reveal.getWidth());
        circularReveal.setDuration(1000);
        circularReveal.start();
    }

    /**
     * 从大到小
     * @param view
     */
    public void onRevealCenter2(View view){
        Animator circularReveal = ViewAnimationUtils.createCircularReveal(iv_reveal, iv_reveal.getWidth() / 2, iv_reveal.getHeight() / 2, (float) Math.hypot(iv_reveal.getWidth(), iv_reveal.getHeight()) /2, 0);
        circularReveal.setDuration(1000);
        circularReveal.start();
    }

    /**
     * 从左到右
     * @param view
     */
    public void onRevealLTR(View view){
        Animator circularReveal = ViewAnimationUtils.createCircularReveal(iv_reveal, 0, iv_reveal.getHeight() / 2, 0, iv_reveal.getHeight());
        circularReveal.setDuration(1000);
        circularReveal.start();
    }

    /**
     * 从左上到右下
     * @param view
     */
    public void onRevealLTTRB(View view){
        Animator circularReveal = ViewAnimationUtils.createCircularReveal(iv_reveal, 0, 0, 0, (float) Math.hypot(iv_reveal.getWidth(), iv_reveal.getHeight()));
        circularReveal.setDuration(1000);
        circularReveal.start();
    }

}
