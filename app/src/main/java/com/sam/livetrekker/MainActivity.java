package com.sam.livetrekker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPrevActCheck = (Button) findViewById(R.id.prev_button);
        mNextActCheck = (Button) findViewById(R.id.next_button);

        mPrevActCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Action that runs for the button press
            }
        });

        mNextActCheck.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                //Action for next act check
                String routeAct = "routeActivity";
                Intent intent = SelectRouteActivity.newIntent(MainActivity.this, routeAct);
                startActivity(intent);
            }

        });
    }

}
