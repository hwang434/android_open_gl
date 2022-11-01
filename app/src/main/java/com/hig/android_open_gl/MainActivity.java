package com.hig.android_open_gl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.hig.open_gl_client.OpenGLActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent openGLClient = new Intent(this, OpenGLActivity.class);
        startActivity(openGLClient);
    }
}