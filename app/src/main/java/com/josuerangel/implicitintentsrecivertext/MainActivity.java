package com.josuerangel.implicitintentsrecivertext;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String intentAction = intent.getAction();

        if (intentAction != null) {
            String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);
            TextView textView = findViewById(R.id.texto);
            textView.setText(sharedText);
        }
    }
}