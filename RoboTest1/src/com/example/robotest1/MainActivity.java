package com.example.robotest1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.example.robotest1.logic.TestLogic;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TestLogic testLogic = new TestLogic();
		int value = testLogic.plus(1, 2);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
