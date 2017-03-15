package com.amitupadhyay.registration;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by aupadhyay on 3/15/17.
 */

public abstract class SamplesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Samples.applyTheme(this);
        super.onCreate(savedInstanceState);
    }

}
