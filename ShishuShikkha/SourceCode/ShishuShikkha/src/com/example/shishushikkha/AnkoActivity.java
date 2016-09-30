package com.example.shishushikkha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AnkoActivity extends Activity{
	Button shorborno, banjonborno;
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_anko);
		shorborno=(Button)findViewById(R.id.ekdui);
		banjonborno=(Button)findViewById(R.id.onetwo);
		
		//****Shorborno**//
		shorborno.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				intent= new Intent(AnkoActivity.this,ActivityEkDui.class);
				startActivity(intent);
				
				
			}
		});
		
		//****Banjonborno**//
		banjonborno.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				intent= new Intent(AnkoActivity.this,ActiviryOneTwo.class);
				startActivity(intent);
				
			}
		});
		
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}


}
