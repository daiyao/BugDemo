package com.example.navkitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    public void clickCalculate(View view) {
        Toast.makeText(this, "计算 2 / 0", Toast.LENGTH_LONG).show();
        int result = 2 / 0;
    }

    public void clickJniCalculate(View view) {
        Button tv = (Button) view;
        tv.setText(stringFromJNI());
    }
}
