package com.example.worldclock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ConstraintLayout layout11 = findViewById(R.id.layout);
        final ConstraintLayout layout22 = findViewById(R.id.layout2);
        final ConstraintLayout layout33 = findViewById(R.id.layout3);
        final ConstraintLayout layout44 = findViewById(R.id.layout4);
        final ConstraintLayout layout55 = findViewById(R.id.layout5);


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movetoActivityTwo();
            }
        });



        Button button1 = findViewById(R.id.getime);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                TextView textView = layout11.findViewById(R.id.time);
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat format1 = new SimpleDateFormat("hh.mm aa");
                String time = format1.format(calendar.getTime());
                textView.setText(time);


                TextView textView2 = layout22.findViewById(R.id.time);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(Calendar.HOUR, -9);
                SimpleDateFormat format2 = new SimpleDateFormat("hh.mm aa");
                String time2 = format2.format(calendar2.getTime());
                textView2.setText(time2);

                TextView textView3 = layout33.findViewById(R.id.time);
                Calendar calendar3 = Calendar.getInstance();
                calendar3.add(Calendar.HOUR, -4);
                SimpleDateFormat format3 = new SimpleDateFormat("hh.mm aa");
                String time3 = format3.format(calendar3.getTime());
                textView3.setText(time3);

                TextView textView4 = layout44.findViewById(R.id.time);
                Calendar calendar4 = Calendar.getInstance();
                calendar4.add(Calendar.HOUR, -14);
                SimpleDateFormat format4 = new SimpleDateFormat("hh.mm aa");
                String time4 = format4.format(calendar4.getTime());
                textView4.setText(time4);

                TextView textView5 = layout55.findViewById(R.id.time);
                Calendar calendar5 = Calendar.getInstance();
                calendar5.add(Calendar.HOUR, -8);
                SimpleDateFormat format5 = new SimpleDateFormat("hh.mm aa");
                String time5 = format5.format(calendar5.getTime());
                textView5.setText(time5);




            }

        });


        ConstraintLayout layout = findViewById(R.id.layout);
        TextView city1 = layout.findViewById(R.id.city);
        city1.setText(R.string.sydney);

        ImageView image = layout.findViewById(R.id.image);
        image.setImageResource(R.drawable.syd);


        ConstraintLayout layout2 = findViewById(R.id.layout2);
        TextView city2 = layout2.findViewById(R.id.city);
        city2.setText(R.string.london);

        ImageView image2 = layout2.findViewById(R.id.image);
        image2.setImageResource(R.drawable.london);

        ConstraintLayout layout3 = findViewById(R.id.layout3);
        TextView city3 = layout3.findViewById(R.id.city);
        city3.setText(R.string.dhaka);
        ImageView image3 = layout3.findViewById(R.id.image);
        image3.setImageResource(R.drawable.dhaka);

        ConstraintLayout layout4 = findViewById(R.id.layout4);
        TextView city4 = layout4.findViewById(R.id.city);
        city4.setText(R.string.newyork);
        ImageView image4 = layout4.findViewById(R.id.image);
        image4.setImageResource(R.drawable.newyork);

        ConstraintLayout layout5 = findViewById(R.id.layout5);
        TextView city5 = layout5.findViewById(R.id.city);
        city5.setText(R.string.rome);
        ImageView image5 = layout5.findViewById(R.id.image);
        image5.setImageResource(R.drawable.rome);



    }
    public void movetoActivityTwo(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
