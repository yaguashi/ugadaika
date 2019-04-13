package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText textOt;
    EditText textDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        textOt = (EditText)findViewById(R.id.textOt);
        textDo = (EditText) findViewById(R.id.textDo);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecActivity.class);
                int int_ot = Integer.parseInt(textOt.getText().toString().trim());
                intent.putExtra("OT",int_ot);
                int int_do = Integer.parseInt(textDo.getText().toString().trim());
                intent.putExtra("DO",int_do);
                startActivity(intent);
            }
        });

    }
}
