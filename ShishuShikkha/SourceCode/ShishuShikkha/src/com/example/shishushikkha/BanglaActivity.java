package com.example.shishushikkha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BanglaActivity extends Activity{
	Button shorborno, banjonborno,chora;
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bangla);
		//****Button Instilization**//
		shorborno=(Button)findViewById(R.id.btnShorborno);
		banjonborno=(Button)findViewById(R.id.btnBanjonborno);
		chora = (Button)findViewById(R.id.btnChora);
		//****Shorborno**//
		shorborno.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				intent= new Intent(BanglaActivity.this,BanglaShorActivity.class);
				startActivity(intent);
				
				
			}
		});
		
		//****Banjonborno**//
		banjonborno.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				intent= new Intent(BanglaActivity.this,BanjonBornoActivity.class);
				startActivity(intent);
				
			}
		});
		
chora.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				intent= new Intent(BanglaActivity.this,ChoraActivity.class);
				startActivity(intent);
				
			}
		});
		
	}
//	@Override
//	protected void onPause() {
//		// TODO Auto-generated method stub
//		super.onPause();
//		finish();
//	}

}
