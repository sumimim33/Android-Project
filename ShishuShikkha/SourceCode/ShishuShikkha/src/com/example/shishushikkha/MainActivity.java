package com.example.shishushikkha;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
Button bangla,english,anko,akibuki,about;
Intent intent;
Typeface tf,tf2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//*****Button Insitilization******//
		setContentView(R.layout.activity_main);
		bangla=(Button)findViewById(R.id.btnBangla);
		english=(Button)findViewById(R.id.btnEnglish);
		anko=(Button)findViewById(R.id.btnMath);
		akibuki=(Button)findViewById(R.id.btnAkibuki);
		about=(Button)findViewById(R.id.btnAboutUs);
		tf = Typeface.createFromAsset(getApplicationContext().getAssets(),"font/solaimanlipinormal.ttf");
		  
    	tf2 = Typeface.createFromAsset(getApplicationContext().getAssets(),"font/BenSenHandwriting.ttf");
	   bangla.setTypeface(tf2);
	   english.setTypeface(tf2);
	   anko.setTypeface(tf2);
	   akibuki.setTypeface(tf2);
	   about.setTypeface(tf2);
		
		
		//*****BANGLA*****//
		
		bangla.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				intent = new Intent(MainActivity.this,BanglaActivity.class);
				startActivity(intent);
				
			}
		});
				
		
		//*****ENGLISH*****//
		english.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						intent= new Intent(MainActivity.this,EnglishActivity.class);
						startActivity(intent);
						
					}
				});
		
		//*****ANKO*****//
		anko.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				intent = new Intent(MainActivity.this,AnkoActivity.class);
				startActivity(intent);
			}
		});
		
		
		//*****AKIBUKI*****//
		
		akibuki.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			intent = new Intent(MainActivity.this,AkiBukiActivity.class);
				startActivity(intent);
				
				
				
				//Toast.makeText(getApplicationContext(), "aki", 100).show();
				
				
			}
		});
		
		//*****ABOUT US*****//
		
		about.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				intent = new Intent(MainActivity.this,AboutUs.class);
				startActivity(intent);
				
				
			}
		});
	}

	

}
