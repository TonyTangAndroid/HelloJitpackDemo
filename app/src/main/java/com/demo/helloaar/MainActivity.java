package com.demo.helloaar;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.demo.library1.HelloLibrary1Util;
import com.demo.library2.HelloLibrary2Util;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView textView = findViewById(R.id.tv_hello);
    textView.setText(HelloLibrary1Util.message("tony"));
    textView.setText(HelloLibrary2Util.message("tony"));
  }
}