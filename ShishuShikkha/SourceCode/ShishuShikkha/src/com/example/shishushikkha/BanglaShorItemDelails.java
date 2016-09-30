package com.example.shishushikkha;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BanglaShorItemDelails extends Activity {
	ImageView image;
	TextView text1,text2;
	Button button,but;
	Intent intent;
	MediaPlayer sound;
	Typeface tf,tf2;
	boolean ischecked=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bangla_ban_item_details);
		 tf = Typeface.createFromAsset(getApplicationContext().getAssets(),"font/solaimanlipinormal.ttf");
		  
	    	tf2 = Typeface.createFromAsset(getApplicationContext().getAssets(),"font/BenSenHandwriting.ttf");
		  
		 image=(ImageView)findViewById(R.id.banimg);
		  text1=(TextView)findViewById(R.id.bantext);
		  text2=(TextView)findViewById(R.id.bantext2);
		  button=(Button)findViewById(R.id.shunun);
		  but=(Button)findViewById(R.id.list);
		  button.setTypeface(tf);
		  but.setTypeface(tf);
		 
		  tf = Typeface.createFromAsset(getApplicationContext().getAssets(),"font/solaimanlipinormal.ttf");
		  
	    	tf2 = Typeface.createFromAsset(getApplicationContext().getAssets(),"font/BenSenHandwriting.ttf");
		  
		  
	    	int number= getIntent().getExtras().getInt("key");
	    	
	    	//*** aab1 ***//
	    	
	    	  if(number==0)
			  {

				  image.setImageResource(R.drawable.asor1);
				  text1.setText("অলি");
				  text2.setText("ফুলের মধু খায়");
				  text1.setTypeface(tf);
				  text2.setTypeface(tf2);
				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanglaShorItemDelails.this, R.raw.s1);
			    			 sound.start();
			    			 ischecked=true;
						}
					});

			  }
			  else if(number==1)
			  {
				  image.setImageResource(R.drawable.asor2);
				  text1.setText("আতা");
				  text2.setText("গাছে ঝুলে রয়");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
 button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanglaShorItemDelails.this, R.raw.s2);
			    			 sound.start();
			    			 ischecked=true;
						}
					});

			  }

			  else if(number==2)
			  {
				  image.setImageResource(R.drawable.asor3);
				  text1.setText("ইঁদুর ");
				  text2.setText("ছানা ভয়ে মরে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
 button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanglaShorItemDelails.this, R.raw.s3);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

			  else if(number==3)
			  {
				  image.setImageResource(R.drawable.asor4);
				  text1.setText("ঈগল");
				  text2.setText("পাখি ছোঁ মারে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
 button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanglaShorItemDelails.this, R.raw.s4);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }
			  else if(number==4)
			  {
				  image.setImageResource(R.drawable.asor5);
				  text1.setText("উই পোকা");
				  text2.setText("ওড়ে আকাশে");
			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
 button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanglaShorItemDelails.this, R.raw.s5);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }
			  else if(number==5)
			  {
				  image.setImageResource(R.drawable.asor6);
				  text1.setText("ঊষা");
				  text2.setText("হাসে রাঙা বেশে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
 button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanglaShorItemDelails.this, R.raw.s6);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }
			  else if(number==6)
			  {
				  image.setImageResource(R.drawable.asor7);
				  text1.setText(" ঋতু");
				  text2.setText("রাজা বসন্ত হয়");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
 button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanglaShorItemDelails.this, R.raw.s7);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }
			  else if(number==7)
			  {
				  image.setImageResource(R.drawable.asor8);
				  text1.setText("একতারা");
				  text2.setText("হাতে বাউল গায়");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
			  text2.setTypeface(tf2);
 button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanglaShorItemDelails.this, R.raw.s8);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }
			  else if(number==8)
			  {
				  image.setImageResource(R.drawable.asor10);
				  text1.setText("ঐরাবত");
			  text2.setText("হাতিকে বলে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
 button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanglaShorItemDelails.this, R.raw.s9);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }
			  else if(number==9)
			  {
				  image.setImageResource(R.drawable.asor9);
				  text1.setText("ওল");
				  text2.setText("খেলে গলা ধরে");
			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
 button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanglaShorItemDelails.this, R.raw.s10);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }
			  else if(number==10)
			  {
				  image.setImageResource(R.drawable.asor11);
				  text1.setText("ঔষধ");
				  text2.setText("খাবে অসুখ হলে");
			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
 button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanglaShorItemDelails.this, R.raw.s11);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

	    	  but.setOnClickListener(new OnClickListener() {
	    			
	    			@Override
	    			public void onClick(View arg0) {
	    				// TODO Auto-generated method stub
	    				
	    				
	    				Intent in= new Intent(BanglaShorItemDelails.this,BanglaShorActivity.class);
	    				if(ischecked)
	    				{sound.stop();	
	    					startActivity(in);
	    				}
	    				
	    				else
	    				{
	    					startActivity(in);
	    				}
	    			    				
	    			}
	    		});
	    	  
	    	  
	    	  Button home;
	  		home=(Button)findViewById(R.id.home);
	  		home.setOnClickListener(new OnClickListener() {
	  			
	  			@Override
	  			public void onClick(View arg0) {
	  				// TODO Auto-generated( method stub
	  				Intent in = new Intent(BanglaShorItemDelails.this,MainActivity.class);
	  				if(ischecked)
	  				{
	  					sound.stop();
	  				
	  				startActivity(in);
	  				}
	  				else
	  				{
	  					
	  					startActivity(in);
	  				}
	  				
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