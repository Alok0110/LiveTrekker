package com.sam.livetrekker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class SelectRouteActivity extends AppCompatActivity {

    private static final String EXTRA_DATA = "com.sam.sampapp.select_route";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_route);
    }

    public static Intent newIntent(Context packageContext, String actName) {
        Intent intent = new Intent(packageContext, SelectRouteActivity.class);
        intent.putExtra(EXTRA_DATA, actName);
        return intent;
    }
}
