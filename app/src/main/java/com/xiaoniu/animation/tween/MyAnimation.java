package com.xiaoniu.animation.tween;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

/**
 * 自定义TweenAnimation，意义不大，可以用属性动画替代
 * @author xiaoniu
 */
public class MyAnimation extends Animation {

    private Camera camera = new Camera();
    /**变化持续的事件*/
    private long duration;
    /**开始变化的角度*/
    private float fromDegrees;
    /**结束变化的角度*/
    private float toDegrees;
    /** 中心X*/
    private float mPivotX;
    /** 中心Y*/
    private float mPivotY;

    public MyAnimation(long duration, float fromDegrees, float toDegrees) {
        this.duration = duration;
        this.fromDegrees = fromDegrees;
        this.toDegrees = toDegrees;
    }

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
        setDuration(duration);
        setFillAfter(true);
        setRepeatCount(Animation.INFINITE);
        setRepeatMode(Animation.RESTART);
        setInterpolator(new LinearInterpolator());
        mPivotX = resolveSize(Animation.RELATIVE_TO_SELF, 0.5f, width, parentWidth);
        mPivotY = resolveSize(Animation.RELATIVE_TO_SELF, 0.5f, width, parentWidth);
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float degree = fromDegrees + (toDegrees - fromDegrees)*interpolatedTime;
        camera.save();
        camera.rotateX(degree);
        Matrix matrix = t.getMatrix();
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-mPivotX, -mPivotY);
        matrix.postTranslate(mPivotX, mPivotY);
    }
}
