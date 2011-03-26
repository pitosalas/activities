package edu.brandeis.pitosalas.activities;

import android.content.Intent;
import android.os.Bundle;

public class Cherry extends BaseActivity {

	public Cherry() {
		super("[Cherry]", R.layout.cherry, R.id.cherry_btn1, R.id.cherry_btn2, R.id.cherry_activity_Log);
	}
    /** Called when the activity is first created. */
	
    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		setButtonIntents(new Intent(Cherry.this, Apple.class), 
				    	 new Intent(Cherry.this, Banana.class));
    }

}
