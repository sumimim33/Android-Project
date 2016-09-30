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

public class ChoraItemDetails  extends Activity{
	ImageView image;
	Button b1,b2,b3;
	MediaPlayer sound;
	Intent intent;
	Typeface tf;
	boolean ischecked=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.hatti);
		 tf = Typeface.createFromAsset(getApplicationContext().getAssets(),"font/solaimanlipinormal.ttf");
		  image=(ImageView)findViewById(R.id.imageView1);
		//int num= getIntent().getExtras().getInt("key");
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b1.setTypeface(tf);
		b2.setTypeface(tf);
		b3.setTypeface(tf);
		 // image=(ImageView)findViewById(R.id.imageView1);
int num= getIntent().getExtras().getInt("key");
		  if(num==0)
		  {
			 
			  image.setImageResource(R.drawable.atagach);
			 
			  b1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					sound=MediaPlayer.create(ChoraItemDetails.this, R.raw.ata);
					
					sound.start();
					ischecked=true;
					
				}
			});
			 	
			 
			  
			  
		  }
		  if(num==1)
		  {
				
			  image.setImageResource(R.drawable.bristykos);
			  
			  b1.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						sound=MediaPlayer.create(ChoraItemDetails.this, R.raw.bristy);
						sound.start();
						ischecked=true;
						
					}
				});
			  
			  
			
		  }
		  if(num==2)
		  {image.setImageResource(R.drawable.cadmama);
		  
		  b1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					sound=MediaPlayer.create(ChoraItemDetails.this, R.raw.cadmama);
					sound.start();
				  
				  ischecked=true;
					
				}
			});
		  
				
		  }
		  if(num==3)
		  {
			 
			  image.setImageResource(R.drawable.hattimatim);
			  b1.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						 sound=MediaPlayer.create(ChoraItemDetails.this, R.raw.hatti);
						  sound.start();
						ischecked=true;
						
					}
				});
		  }
		  if(num==4)
		  {
			 
			  image.setImageResource(R.drawable.kokon);
			  b1.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						 sound=MediaPlayer.create(ChoraItemDetails.this, R.raw.khokon);
						  sound.start();
						ischecked=true;
						
					}
				});
			  
		  }
		  
		  b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if(ischecked)
				{
					sound.stop();
					Intent in = new Intent(ChoraItemDetails.this,ChoraActivity.class);
					startActivity(in);
					
				}
				else
				{
					Intent in = new Intent(ChoraItemDetails.this,ChoraActivity.class);
				startActivity(in);
				}
				
				
			}
		  
			
		});
		  

			 b3.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						if(ischecked){
							sound.stop();
							Intent in = new Intent(ChoraItemDetails.this,MainActivity.class);
							startActivity(in);
							
						}
						else
						{
							Intent in = new Intent(ChoraItemDetails.this,MainActivity.class);
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
