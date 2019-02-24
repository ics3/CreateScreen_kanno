package com.example.createscreen;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.nio.FloatBuffer;

public class DrawLine extends View {
    public DrawLine(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.TRANSPARENT);

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(10);

        FloatBuffer fb = FloatBuffer.allocate(300);
        fb.put(380);
        fb.put(450);
        fb.put(380);
        fb.put(820);

        fb.put(380);
        fb.put(820);
        fb.put(700);
        fb.put(820);

        fb.put(700);
        fb.put(820);
        fb.put(700);
        fb.put(450);

        fb.put(700);
        fb.put(450);
        fb.put(380);
        fb.put(450);

        canvas.drawLines(fb.array(), paint);
//        canvas.drawLine(380, 660, 380, 1030, paint);
//        canvas.drawLine(380, 1030, 700, 1030, paint);
//        canvas.drawLine(700, 1030, 700, 660, paint);
//        canvas.drawLine(700, 660, 380, 660, paint);
    }
}
