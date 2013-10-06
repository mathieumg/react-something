package com.example.killstuff;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnHoverListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.app.Activity;

@SuppressLint("NewApi")
public class MainActivity extends Activity implements OnHoverListener {

	private TextView text;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		RelativeLayout layout = (RelativeLayout) findViewById(R.id.Layout);
		layout.setOnHoverListener(this);
		
		text = (TextView) findViewById(R.id.text);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onHover(View v, MotionEvent e) {
		// TODO Auto-generated method stub
		switch (e.getActionMasked()) {
		case MotionEvent.ACTION_HOVER_ENTER:
			text.setText("ACTION_HOVER_ENTER");
			break;
		case MotionEvent.ACTION_HOVER_MOVE:
			text.setText("ACTION_HOVER_MOVE");
			break;
		case MotionEvent.ACTION_HOVER_EXIT:
			text.setText("ACTION_HOVER_EXIT");
			break;
		
		}
		
		text.setText(text.getText() + " - X: " + e.getX() + " - Y: " + e.getY());
		
		
		
		return true;
	}

}
