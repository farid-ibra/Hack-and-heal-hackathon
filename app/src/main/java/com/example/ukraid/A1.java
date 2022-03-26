package com.example.ukraid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class A1 extends AppCompatActivity {
    private Button add ;
    private Button next;
    private LinearLayout layout;
    private LinearLayout.LayoutParams layoutParams;
    static int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a1);
        add = findViewById(R.id.button4);
        next = findViewById(R.id.button);
        layout = (LinearLayout) findViewById(R.id.lin);
        layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText view = new EditText(A1.this);
               // view.setText(++i+" view");
                layout.addView(view, layoutParams);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ListElements.class));

            }
        });

    }
}