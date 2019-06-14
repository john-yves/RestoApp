package com.example.femous;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static Button log_btn;
    private static EditText email,password;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        log_btn= (Button)findViewById(R.id.btn1);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.pas);

        log_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("yves@gmail.com") && password.getText().toString().equals("12346") ){
                    openActivtyes();
                }
                else {
                    Toast.makeText(MainActivity.this, "Wrong Email or password", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void openActivtyes() {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
