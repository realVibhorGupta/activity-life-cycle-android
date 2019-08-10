package www.vibhorgupta.in.activitylifecycle;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    public static final String TAG="Main Activity LifeCycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: executed");

    }



    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart: executed");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume: executed");
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy: executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: executed");
    }
}
