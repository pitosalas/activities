package edu.brandeis.pitosalas.activities;

import android.content.Intent;
import android.os.Bundle;

public class Banana extends BaseActivity {

	public Banana() {
		super("[Banana]", R.layout.banana, R.id.banana_btn1, R.id.banana_btn2, R.id.banana_activity_Log);
	}

	/** Called when the activity is first created. */
	
    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setButtonIntents(new Intent(Banana.this, Apple.class), 
				    	new Intent(Banana.this, Cherry.class));
    }

}
