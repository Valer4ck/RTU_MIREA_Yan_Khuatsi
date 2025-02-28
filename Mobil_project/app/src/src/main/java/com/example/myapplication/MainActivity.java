package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button myButton = findViewById(R.id.print_button);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Кнопка нажата",
                        Toast.LENGTH_SHORT).show();
            }
        }
        );
    }
    private static final String TAG = "HelloWorld";

    protected void onStart(){
        super.onStart();
        Log.e(TAG, "error in onStart");
        Log.w(TAG, "warning in onStart");
        Log.i("IKBO-07-22","info in onStart");
        Log.d("IKBO-07-22","debug in onStart");
    }

    protected void onResume(){
        super.onResume();
/*        Context context = getApplicationContext();
        CharSequence text = "Method onResume";
        int duration = Toast.LENGTH_SHORT*/;
        Toast.makeText(getApplicationContext(), "Yan Khuatsi",
                Toast.LENGTH_SHORT).show();
    }
}