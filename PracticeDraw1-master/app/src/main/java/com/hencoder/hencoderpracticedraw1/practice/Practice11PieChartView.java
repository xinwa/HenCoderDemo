package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint = new Paint();
        paint.setAntiAlias(true);

        int startX = 200;
        int startY = 50;
        int raduis = 250;
        int raduisX = startX + raduis;
        int raduisY = startY + raduis;


        int left = startX;
        int top = startY;
        int right = left + raduis * 2;
        int bottom = startY + raduis * 2;

        String str = "Lollipop";

        //Lollipop
        paint.setColor(Color.RED);
        paint.setStrokeWidth(3);
        canvas.drawArc(left,top,right,bottom,-180,120,true,paint);

        int[] point = getCirclePoint(raduis,30);
        Log.d("xinwa","x="+point[0]+",y="+point[1]);
        int lineX = raduisX - point[0];
        int lineY = raduisY - point[1];
        int stopX = lineX - 20;
        int stopY = lineY -20;

        paint.setColor(Color.GRAY);
        canvas.drawLine(lineX,lineY,stopX,stopY,paint);
        canvas.drawLine(stopX,stopY,stopX-160,stopY,paint);

        //获取文字宽度时，需要把文字大小也设置上
        paint.setTextSize(26);
        paint.setColor(Color.WHITE);
        int textX = stopX - 180 - getTextWidth(str,paint);
        int textY = stopY;

        canvas.drawText(str,textX,textY,paint);

        // Marsh
        str = "Marshmallow";
        paint.setColor(Color.RED);
        paint.setStrokeWidth(3);

        int offest = 13;

        left += offest;
        top += offest;
        right+= offest;
        bottom += offest;
        paint.setColor(Color.YELLOW);
        canvas.drawArc(left,top,right,bottom,-10,-50,true,paint);

        point = getCirclePoint(raduis,45);
        Log.d("xinwa","draw"+str+",x="+point[0]+",y="+point[1]);
        lineX = raduisX + offest + point[0];
        lineY = raduisY + offest - point[1];
        stopX = lineX + 20;
        stopY = lineY -20;
        paint.setColor(Color.GRAY);
        canvas.drawLine(lineX,lineY,stopX,stopY,paint);
        canvas.drawLine(stopX,stopY,stopX+160,stopY,paint);


        paint.setTextSize(26);
        paint.setColor(Color.WHITE);
        textX = stopX + 160+ 20;
        textY = stopY;

        canvas.drawText(str,textX,textY,paint);

        //Froyo
        str = "Froyo";
        paint.setColor(Color.RED);
        paint.setStrokeWidth(3);


        paint.setColor(Color.CYAN);
        canvas.drawArc(left,top,right,bottom,-6,8,true,paint);

        point = getCirclePoint(raduis,87);
        Log.d("xinwa","draw"+str+",x="+point[0]+",y="+point[1]);
        lineX = raduisX + offest + point[0];
        lineY = raduisY + offest - point[1];
        stopX = lineX + 100;
        stopY = lineY;
        paint.setColor(Color.GRAY);
        canvas.drawLine(lineX,lineY,stopX,stopY,paint);

        paint.setTextSize(26);
        paint.setColor(Color.WHITE);
        textX = stopX+ 20;
        textY = stopY + 5;

        canvas.drawText(str,textX,textY,paint);

        //draw Gingerbread
        str = "Gingerbread";
        paint.setColor(Color.RED);
        paint.setStrokeWidth(3);


        paint.setColor(Color.LTGRAY);
        canvas.drawArc(left,top,right,bottom,4,6,true,paint);

        point = getCirclePoint(raduis,6);
        Log.d("xinwa","draw"+str+",x="+point[0]+",y="+point[1]);
        lineX = raduisX + offest + point[1];
        lineY = raduisY + offest + point[0];
        stopX = lineX + 20;
        stopY = lineY;
        paint.setColor(Color.GRAY);
        canvas.drawLine(lineX,lineY,stopX,stopY,paint);
        canvas.drawLine(stopX,stopY,stopX+20,stopY+20,paint);
        canvas.drawLine(stopX+20,stopY+20,stopX+20+20,stopY+20,paint);

        paint.setTextSize(26);
        paint.setColor(Color.WHITE);
        textX = stopX+ 60;
        textY = stopY + 20+5;

        canvas.drawText(str,textX,textY,paint);

        //
        //draw Jelly Bean
        str = "Jelly Bean";

        paint.setColor(Color.GREEN);
        canvas.drawArc(left,top,right,bottom,12,48,true,paint);

        point = getCirclePoint(raduis,36);
        Log.d("xinwa","draw"+str+",x="+point[0]+",y="+point[1]);
        lineX = raduisX + offest + point[1];
        lineY = raduisY + offest + point[0];
        stopX = lineX + 20;
        stopY = lineY;
        paint.setColor(Color.GRAY);
        canvas.drawLine(lineX,lineY,stopX,stopY,paint);
        canvas.drawLine(stopX,stopY,stopX+20,stopY+20,paint);
        canvas.drawLine(stopX+20,stopY+20,stopX+20+50,stopY+20,paint);

        paint.setTextSize(26);
        paint.setColor(Color.WHITE);
        textX = stopX+ 90;
        textY = stopY + 20+5;

        canvas.drawText(str,textX,textY,paint);

        //
        str = "Kit Kat";

        paint.setColor(Color.BLUE);
        left -= 5;
        offest -= 5;
        right -=2;
        bottom -= 2;
        canvas.drawArc(left,top,right,bottom,62,116,true,paint);

        point = getCirclePoint(raduis,30);
        Log.d("xinwa","draw"+str+",x="+point[0]+",y="+point[1]);
        lineX = raduisX + offest - point[0];
        lineY = raduisY + offest + point[1];
        stopX = lineX - 20;
        stopY = lineY + 20;
        paint.setColor(Color.GRAY);
        canvas.drawLine(lineX,lineY,stopX,stopY,paint);
        canvas.drawLine(stopX,stopY,stopX-100,stopY,paint);


        paint.setTextSize(26);
        paint.setColor(Color.WHITE);
        textX = stopX+ -120 - getTextWidth(str,paint);
        textY = stopY;

        canvas.drawText(str,textX,textY,paint);



    }

    private int getTextWidth(String text, Paint paint){
        Rect rect = new Rect();
        paint.getTextBounds(text,0,text.length(), rect);
        return rect.width();
    }

    //根据角度求圆上的坐标点
    private int[] getCirclePoint(int radius,int angle){
        int point[] = new int[2];
        point[0] = (int) (radius * Math.sin(angle * 3.14 / 180));
        point[1] = (int) (radius * Math.cos(angle *3.14 /180));
        return point;
    }

}
