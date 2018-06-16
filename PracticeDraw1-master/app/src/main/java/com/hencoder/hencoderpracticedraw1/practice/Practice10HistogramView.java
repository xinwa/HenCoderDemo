package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        //画坐标系
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(3);
        paint.setAntiAlias(true);

        canvas.drawLine(100, 600, 100, 50, paint);
        canvas.drawLine(100, 600, 900, 600, paint);

        paint.setTextSize(32);
        canvas.drawText("直方图", 400, 700, paint);

        int itemX; //柱状图文字横坐标
        int itemY = 620; //柱状图文字纵坐标
        int startX = 120;//柱状图文字横坐标;
        int itemDistance = 20;//柱状图每块间隔
        int itemWidth = 100; //柱状图每块宽度
        String[] texts = {"Froyo", "GB", "ICS", "JB", "KitKat"};
        int culHeight[] = {100, 40, 150, 200, 500};

        //画柱状图
        paint.setTextSize(18);
        for (int i = 0; i < 5; i++) {
            //画文字
            itemX = startX + i * (itemDistance + itemWidth);
            //文字剧中
            int textX = itemX + (itemWidth/2 - getTextWidth(texts[i],paint)/2);
            paint.setColor(Color.WHITE);
            canvas.drawText(texts[i], textX, itemY, paint);

            //画柱
            int left = itemX;
            int top = 600 - culHeight[i];
            int right = left + itemWidth;
            int bottom = 600;
            paint.setColor(Color.GREEN);
            canvas.drawRect(left,top,right,bottom,paint);
        }
    }

    private int getTextWidth(String text, Paint paint){
        Rect rect = new Rect();
        paint.getTextBounds(text,0,text.length(), rect);
        return rect.width();
    }
}
