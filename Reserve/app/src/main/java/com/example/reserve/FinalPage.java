package com.example.reserve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class FinalPage extends AppCompatActivity {
    TextView text;

    @Override
    public void onBackPressed() {
        FinalPage.this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);
        text = findViewById(R.id.changeText);
        Intent intent = getIntent();
        String s2 = intent.getStringExtra("userName");
        text.setText(s2);
    }
}