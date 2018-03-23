package com.uttej.readersclub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button skip_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        skip_button  = (Button) findViewById(R.id.skip);
        skip_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent skip_login = new Intent(LoginActivity.this, CentralActivity.class);
                startActivity(skip_login);
            }
        });
    }
}
