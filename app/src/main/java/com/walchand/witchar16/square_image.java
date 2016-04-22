package com.walchand.witchar16;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;


public class square_image extends ImageView {
    public square_image(Context context) {
        super(context);
    }

    public square_image(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public square_image(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth()); //Snap to width
    }
}