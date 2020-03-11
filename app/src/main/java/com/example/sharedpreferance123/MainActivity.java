package com.example.sharedpreferance123;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sharedpreferance123.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding binding;

  EditText editText1,editText2,editText3;
  Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        editText1 = findViewById(R.id.name);
        editText2 = findViewById(R.id.email);
        editText3 = findViewById(R.id.phone);
        button = findViewById(R.id.submit);


//        binding.submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SharedPreferences sp = getSharedPreferences("details",MODE_PRIVATE);
//                SharedPreferences.Editor editor = sp.edit();
//                editor.putString("name",binding.name.getText().toString().trim());
//                editor.putString("email",binding.email.getText().toString().trim());
//                editor.putString("phone",binding.phone.getText().toString().trim());
//                editor.commit();
//
//                binding.name.setText("");
//                binding.email.setText("");
//                binding.phone.setText("");
//
//                Intent intent = new Intent(MainActivity.this,Welcome.class);
//                startActivity(intent);
//            }
//
//       });

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SharedPreferences sp = getSharedPreferences("details",MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();

            editor.putString("name",editText1.getText().toString().trim());
            editor.putString("email",editText2.getText().toString().trim());
            editor.putString("phone",editText3.getText().toString().trim());
            editor.commit();

            Intent intent = new Intent(MainActivity.this,Welcome.class);
            startActivity(intent);
        }
    });












    }

}
