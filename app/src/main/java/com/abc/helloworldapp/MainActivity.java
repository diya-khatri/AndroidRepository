package com.abc.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view)
    {
        EditText editText = findViewById(R.id.txt_message);
        String message= editText.getText().toString();
        Intent intent= new Intent(this, MessageActivity.class);
        intent.putExtra("message",message);
        startActivity(intent);
    }
}