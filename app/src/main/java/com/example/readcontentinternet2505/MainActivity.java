package com.example.readcontentinternet2505;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.readcontentinternet2505.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControll();
    }

    private void addControll() {
        mainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
    }
}