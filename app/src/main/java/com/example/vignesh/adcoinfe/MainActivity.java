package com.example.vignesh.adcoinfe;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements cashout.OnFragmentInteractionListener,Balance.OnFragmentInteractionListener,Banners.OnFragmentInteractionListener
,More.OnFragmentInteractionListener{

    private TextView mTextMessage;
    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ft.add(R.id.Frame1,new cashout());
//        ft.commit();
//
       // mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.removeShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_cashout:
                    //mTextMessage.setText(R.string.title_home);
                    FragmentTransaction ft0 = getSupportFragmentManager().beginTransaction();
                    ft0.replace(R.id.Frame1,new cashout());
                    ft0.commit();
                    break;


                case R.id.navigation_balance:
                //    mTextMessage.setText(R.string.title_dashboard);
                    FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();
                    ft1.replace(R.id.Frame1,new Balance());
                    ft1.commit();
                    break;
                case R.id.navigation_ad:
                    //mTextMessage.setText(R.string.title_notifications);
                    FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
                    ft2.replace(R.id.Frame1,new Banners());
                    ft2.commit();
                    break;
                case R.id.navigation_more:
                    //mTextMessage.setText(R.string.title_notifications);
                    FragmentTransaction ft3 = getSupportFragmentManager().beginTransaction();
                    ft3.replace(R.id.Frame1,new More());
                    ft3.commit();
                    break;
            }
            return false;
        }
    };


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
