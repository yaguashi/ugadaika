package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecActivity extends Activity {
    TextView textView;
    Button buttonDa;
    Button buttonNet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec_za);
        textView = findViewById(R.id.textView2);
        buttonDa = findViewById(R.id.bolshe);
        buttonNet = findViewById(R.id.menshe);

        Bundle args = getIntent().getExtras();
        final Sostoyanie sostoyanie = new Sostoyanie(args.getInt("OT"), args.getInt("DO"));
        textView.setText(String.format("Ваше число больше %d ?", sostoyanie.c));

        buttonDa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sostoyanie.b - sostoyanie.a == 1)
                    textView.setText(String.format("Ваше число %d", sostoyanie.b));
                else {
                    sostoyanie.a = sostoyanie.c;
                    sostoyanie.c = (sostoyanie.a + sostoyanie.b) / 2;

                    textView.setText(String.format("Ваше число больше %d ?", sostoyanie.c));
                    System.out.println(sostoyanie.a + "" + sostoyanie.b);
                }
            }
        });

        buttonNet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sostoyanie.b - sostoyanie.a == 1)
                    textView.setText(String.format("Ваше число %d", sostoyanie.a));
                else {
                    sostoyanie.b = sostoyanie.c;
                    sostoyanie.c = (sostoyanie.a + sostoyanie.b) / 2;

                    textView.setText(String.format("Ваше число больше %d ?", sostoyanie.c));
                    System.out.println(sostoyanie.a + "" + sostoyanie.b);
                }
            }
        });

    }
}
