package com.example.resortmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.resortmanagement.util.DBOperator;

public
class
MainActivity
        extends
        Activity
        {

    /** Called when the activity is first created. */
    @Override
    public
    void
    onCreate(Bundle savedInstanceState) {
        super
                .onCreate(savedInstanceState);
        setContentView(R.layout.
                activity_main
        );

        //copy database file
        try
        {
            DBOperator.
                    copyDB
                            (getBaseContext());
        }
        catch
        (Exception e){
            e.printStackTrace();
        }
    }

}


