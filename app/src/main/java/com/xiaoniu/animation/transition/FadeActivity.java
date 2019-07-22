package com.xiaoniu.animation.transition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;

import com.xiaoniu.animation.R;

public class FadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setEnterTransition(new Fade());
        getWindow().setExitTransition(new Fade());
        setContentView(R.layout.activity_fade);
    }
}
