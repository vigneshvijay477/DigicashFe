package com.example.vignesh.adcoinfe;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by vignesh on 29/7/18.
 */

public class Signup extends AppCompatActivity{

    Button Cont;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        Button b1 = (Button) findViewById(R.id.button1);
        TextView t1 = findViewById(R.id.login);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Signup.this, SignUpdet.class);
               // myIntent.putExtra("key", value);
                Signup.this.startActivity(myIntent);
            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Signup.this, Login.class);
                // myIntent.putExtra("key", value);
                Signup.this.startActivity(myIntent);
            }
        });



    }
}
