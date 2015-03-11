package chart.bar.custom.allstate.com.custombarchart;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

import java.util.ArrayList;

/*
 * Created by ofaro on 3/11/2015.
 */
public class CustomBarChart extends View {
    private Paint textPaint;
    private Paint grayPaint;
    private Paint yellowPaint;
    private Paint greenPaint,redPaint;
    float scaleFactor;
    ArrayList<Data> dataList;
    public CustomBarChart(Context context,ArrayList<Data> dataList) {
        super(context);
        this.dataList=dataList;
        init();
    }
    private void init() {
        DisplayMetrics matrices=getResources().getDisplayMetrics();
        scaleFactor=matrices.density;
        textPaint=new Paint();
        grayPaint=new Paint();
        yellowPaint=new Paint();
        greenPaint=new Paint();
        redPaint=new Paint();
        redPaint.setColor(Color.RED);
        grayPaint.setColor(Color.DKGRAY);
        yellowPaint.setColor(Color.YELLOW);
        greenPaint.setColor(Color.GREEN);
        textPaint.setColor(Color.DKGRAY);
        textPaint.setTextSize(30);
        textPaint.setTypeface(Typeface.create(Typeface.DEFAULT_BOLD,Typeface.BOLD));
    }

    public CustomBarChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int left= (int) (10*scaleFactor);
        //int top=250;
        int top1,top2,top3,top4;
        int right=70;
        int textLeft= (int) (8*scaleFactor);

        canvas.drawLine(left,520,getWidth(),520,grayPaint);
        greenPaint.setStyle(Paint.Style.FILL);

        for(int i=0;i<dataList.size();i++){

            //top1= (int) (500-dataList.get(i).getFirstVal());
            top1=500-scale(dataList.get(i).getFirstVal());
            canvas.drawRect(left,top1,right,500,yellowPaint);

            top2= top1-scale(dataList.get(i).getSecondVal());
            canvas.drawRect(left,top2,right,top1,greenPaint);

            top3= top2-scale(dataList.get(i).getThirdVal());
            canvas.drawRect(left,top3,right,top2,redPaint);

            top4= (int) (top3-5*scaleFactor);
            canvas.drawText(dataList.get(i).getTotalVal(),left-5*scaleFactor,top4,textPaint);

            canvas.drawText(dataList.get(i).getDay(), textLeft, 550, textPaint);
            textLeft= (int) (textLeft+40*scaleFactor);
            left= (int) (left+40*scaleFactor);
            right= (int) (right+40*scaleFactor);
        }
    }

    private int scale(float firstVal) {
        int result= (int) ((500/200)*firstVal);
        return result;
    }
}
