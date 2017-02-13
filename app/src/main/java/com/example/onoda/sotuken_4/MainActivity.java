package com.example.onoda.sotuken_4;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //開発4
        Button btn01 = (Button)findViewById(R.id.btn);
        btn01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText editText4 = (EditText)findViewById(R.id.editTxt);
                TextView textView4 = (TextView)findViewById(R.id.textView4);
                textView4.setTypeface(Typeface.createFromAsset(getAssets(), "meiryo.ttc"));
                textView4.setText(editText4.getText());
                editText4.setText("");

            }
        });
    }
}
