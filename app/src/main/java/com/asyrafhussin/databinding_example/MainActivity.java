package com.asyrafhussin.databinding_example;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.asyrafhussin.databinding_example.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static final String TAG =MainActivity.class.getSimpleName();
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User();
        binding.setUser(user);
        binding.setActivity(this);
    }

    public void showData(String data){
        Toast.makeText(this,data,Toast.LENGTH_SHORT).show();
    }
}
