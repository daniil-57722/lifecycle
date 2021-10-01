package com.example.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    public static final String TAG = "StartActivity";
    private int num = 5;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView counterView = (TextView)findViewById(R.id.num);
        counterView.setText(""+num);
        Log.d(TAG, "onCreate");
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        resetUI();
        Log.d(TAG, "onResume");
        Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(this, "onStop()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
        Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", num);
        Log.d(TAG, "onSaveInstanceState");
        Toast.makeText(this, "onSaveInstanceState()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null){
            num = savedInstanceState.getInt("counter");
        }
        Log.d(TAG, "onRestoreInstanceState");
        Toast.makeText(this, "onRestoreInstanceState()", Toast.LENGTH_LONG).show();
    }

    private void resetUI() {
        TextView counterView = (TextView)findViewById(R.id.num);
        counterView.setText(""+num);
        Log.d(TAG, "resetUI");
        Toast.makeText(this, "ResetUI()", Toast.LENGTH_LONG).show();
    }
}
