package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(new myview(this));
    }
    private class myview extends View {
        public myview(Context context) {
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setColor(Color.RED);
            canvas.drawCircle(300, 300, 150, paint);
            paint.setColor(Color.CYAN);
            canvas.drawCircle(600, 600, 100, paint);
            paint.setColor(Color.GREEN); canvas.drawRect(100, 800, 200, 900,
                    paint);
        }
    }}