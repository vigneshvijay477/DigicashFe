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

public class SignUpdet  extends AppCompatActivity{

    Button b2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_page);

        Button b2 = (Button) findViewById(R.id.sign_but);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(SignUpdet.this, Login.class);
                // myIntent.putExtra("key", value);
                SignUpdet.this.startActivity(myIntent);
            }
        });

    }
}
