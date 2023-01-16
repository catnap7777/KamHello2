package com.example.kamhello2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button123 = (Button) findViewById(R.id.button1);
        TextView textView1 = (TextView) findViewById(R.id.title1);
        ImageView image1 = (ImageView) findViewById(R.id.image1);



        button123.setOnClickListener(new View.OnClickListener() {

            int kam1 = 0;

            @Override
            public void onClick(View view) {


                if (kam1 == 0) {
                    textView1.setBackgroundColor(Color.parseColor("#33ffff"));
                    image1.setImageResource(R.drawable.catandroid1);
                    kam1 = 1;
                    System.out.println("hello blue: " +  kam1);
                } else {
                    textView1.setBackgroundColor(Color.parseColor("#ff66ff"));
                    image1.setImageResource(R.drawable.cheetahandroid1);
                    kam1 = 0;
                    System.out.println("hello pink: " + kam1);
                }

            //textView1.setBackgroundColor(Color.RED);
//            textView1.setBackgroundColor(Color.argb(255, 155, 200, 200));
//            textView1.setBackgroundColor(Color.parseColor("#ff66ff"));
            }
        });







    }
}