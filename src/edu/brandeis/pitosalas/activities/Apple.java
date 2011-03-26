package edu.brandeis.pitosalas.activities;

import android.content.Intent;
import android.os.Bundle;

public class Apple extends BaseActivity {

	public Apple() {
		super("[Apple]", R.layout.apple, R.id.apple_btn1, R.id.apple_btn2, R.id.apple_activity_log);
	}

	/** Called when the activity is first created. */
    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		
        setButtonIntents(new Intent(Apple.this, Banana.class), 
				    	new Intent(Apple.this, Cherry.class));
    }

}
