package com.bayour.angularcalculator;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_moa2mil:
                    mTextMessage.setText(R.string.title_moa2mil);
                    return true;
                case R.id.navigation_mil2moa:
                    mTextMessage.setText(R.string.title_mil2moa);
                    return true;
                case R.id.navigation_moa2length:
                    mTextMessage.setText(R.string.title_moa2length);
                    return true;
                case R.id.navigation_length2moa:
                    mTextMessage.setText(R.string.title_length2moa);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moa2mil);

        mTextMessage = findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
