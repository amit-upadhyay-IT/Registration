package com.amitupadhyay.registration;

import android.os.Bundle;

import carbon.widget.DropDown;
import carbon.widget.EditText;

public class TextFieldsActivity extends SamplesActivity {

    private static String[] months = new String[]{
            "Jan", "Feb", "Mar",
            "Apr", "May", "Jun",
            "Jul", "Aug", "Sep",
            "Oct", "Nov", "Dec"
    };


    private EditText userName, email, password;

    private void initDetails()
    {
        userName = (EditText) findViewById(R.id.user_name_edittext);
        email = (EditText) findViewById(R.id.email_edittext);
        password = (EditText) findViewById(R.id.password_edittext);
    }

    private void initDropDown()
    {
        String[] days = new String[31];
        for (int i = 0; i < days.length; i++)
            days[i] = "" + (i + 1);
        DropDown day = (DropDown) findViewById(R.id.day);
        day.setItems(days);

        DropDown month = (DropDown) findViewById(R.id.month);
        month.setItems(months);

        String[] years = new String[31];
        for (int i = 0; i < years.length; i++)
            years[i] = "" + (i + 1987);
        DropDown year = (DropDown) findViewById(R.id.year);
        year.setItems(years);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_fields);

        //Samples.initToolbar(this, getString(R.string.textFieldsActivity_title));

        initDetails();
        initDropDown();
    }
}