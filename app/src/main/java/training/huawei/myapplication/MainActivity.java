package training.huawei.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String TAG = MainActivity.class.getSimpleName();
    private Button secondActivity_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate Called");
        secondActivity_btn = findViewById(R.id.secondActivity_btn);
        secondActivity_btn.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onCreate Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop Called");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.secondActivity_btn:
                Toast.makeText(this, "Go to Second Activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
        }
    }
}
