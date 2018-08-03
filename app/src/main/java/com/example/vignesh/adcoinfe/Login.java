package com.example.vignesh.adcoinfe;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by vignesh on 29/7/18.
 */

public class Login extends AppCompatActivity {
    Button b3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button b3 = (Button) findViewById(R.id.login_b);


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Login.this, MainActivity.class);
                // myIntent.putExtra("key", value);
               Login.this.startActivity(myIntent);
            }
        });
    }
}
