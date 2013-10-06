package com.example.killstuff;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnHoverListener;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.app.Activity;
import android.webkit.WebViewClient;
import android.widget.Toast;

@SuppressLint("NewApi")
public class MainActivity extends Activity implements OnHoverListener {

	//private TextView text;
	private WebView mWebview ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		/*super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView webview = new WebView(this);
		//setContentView(webview);
		RelativeLayout layout = (RelativeLayout) findViewById(R.id.Layout);
		layout.setOnHoverListener(this);
		
		text = (TextView) findViewById(R.id.text);*/
		super.onCreate(savedInstanceState);

        mWebview  = new WebView(this);

        mWebview.getSettings().setJavaScriptEnabled(true); // enable javascript

        final Activity activity = this;

        mWebview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });

        mWebview.loadUrl("http://www.google.com");
        setContentView(mWebview );
        mWebview.setOnHoverListener(this);
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
			//text.setText("ACTION_HOVER_ENTER");
			break;
		case MotionEvent.ACTION_HOVER_MOVE:
			//text.setText("ACTION_HOVER_MOVE");
			break;
		case MotionEvent.ACTION_HOVER_EXIT:
			//text.setText("ACTION_HOVER_EXIT");
			break;
		
		}
		
		//text.setText(text.getText() + " - X: " + e.getX() + " - Y: " + e.getY());
		
		
		
		return true;
	}

}
