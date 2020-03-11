package com.example.sharedpreferance123;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

import com.example.sharedpreferance123.databinding.ActivityWelcomeBinding;

public class Welcome extends AppCompatActivity {

    ActivityWelcomeBinding binding;

    EditText editText1,editText2,editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_welcome);

        editText1 = findViewById(R.id.name);
        editText2 = findViewById(R.id.email);
        editText3 = findViewById(R.id.phone);

//        SharedPreferences sp = getSharedPreferences("details",MODE_PRIVATE);
//
//        String s1 = sp.getString("name",null);
//        String s2 = sp.getString("email",null);
//        String s3 = sp.getString("phone",null);
//
//        binding.name.setText(s1);
//        binding.email.setText(s2);
//        binding.phone.setText(s3);


        SharedPreferences sp = getSharedPreferences("details",MODE_PRIVATE);

        String s1 = sp.getString("name",null);
        String s2 = sp.getString("email",null);
        String s3 = sp.getString("phone",null);

        editText1.setText(s1);
        editText2.setText(s2);
        editText3.setText(s3);


    }
}
