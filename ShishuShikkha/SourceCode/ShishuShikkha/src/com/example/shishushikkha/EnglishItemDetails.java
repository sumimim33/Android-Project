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

public class EnglishItemDetails extends Activity{
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
	    	int number= getIntent().getExtras().getInt("key");

		  
		
	    	//*** aab1 ***//
	    	 if(number==0)
   		  {

   			  image.setImageResource(R.drawable.aab1);
   			  text1.setText("Apple");
   			 text2.setText("খেলে শক্তি বাড়ে");
			  text1.setTypeface(tf);
   			  text2.setTypeface(tf2);
   			 button.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e1);
		    			 sound.start();
		    			ischecked=true;
					}
				});


   		  }
   		  else if(number==1)
   		  {
   			  image.setImageResource(R.drawable.aab2);
   			  text1.setText("Ball");
   			  text2.setText("দিয়ে খেলা করে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);

   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e2);
			    			 sound.start();
			    			 ischecked=true;
			    			 
						}
					});

   		  }

   		  else if(number==2)
   		  {
   			  image.setImageResource(R.drawable.aab3);
   			  text1.setText("Cat");
   			  text2.setText("রাতে ইঁদুর ধরে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);

   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e3);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }

   		  else if(number==3)
   		  {
   			  image.setImageResource(R.drawable.aab4);
   			  text1.setText("Doll");
   			  text2.setText("দিয়ে খেলা করে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e4);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }
   		  else if(number==4)
   		  {
   			  image.setImageResource(R.drawable.aab5);
   			  text1.setText("Egg");
   			  text2.setText("খেলে পুষ্টি বাড়ে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e5);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }
   		  else if(number==5)
   		  {
   			  image.setImageResource(R.drawable.aab6);
   			  text1.setText("Frog");
   			  text2.setText("দেখে ভয়ে মরে");
			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e6);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }
   		  else if(number==6)
   		  {
   			  image.setImageResource(R.drawable.aab7);
   			  text1.setText("Gun");
   			  text2.setText("দিয়ে শিকার করে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);

   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e7);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }
   		  else if(number==7)
   		  {
   			  image.setImageResource(R.drawable.aab8);
   			  text1.setText("Heron");
   			  text2.setText("জলে মাছ ধরে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
		  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e8);
			    			 sound.start();
			    			 ischecked=true;
						}
					});

   		  }
   		  else if(number==8)
   		  {
   			  image.setImageResource(R.drawable.aab9);
   			  text1.setText("Iron");
   		  text2.setText("এ কাপড় ভাঁজ করি");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);

   		  button.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e9);
		    			 sound.start();
		    			 ischecked=true;
					}
				});
   		  }
   		  else if(number==9)
   		  {
   			  image.setImageResource(R.drawable.aab10);
   			  text1.setText("Juice");
   			  text2.setText("খেতে মজা ভারি");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e10);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }
   		  else if(number==10)
   		  {
   			  image.setImageResource(R.drawable.aab11);
   			  text1.setText("Key");
   			  text2.setText("দিয়ে তালা খুলে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e11);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }
   	  else if(number==11)
   		  {
   			  image.setImageResource(R.drawable.aab12);
   			  text1.setText("Leaf");
   			  text2.setText("থাকে গাছের ডালে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);

   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e12);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }

   	  else if(number==12)
   		  {
   			  image.setImageResource(R.drawable.aab13);
   			  text1.setText("Magpie");
   			  text2.setText("গায় মিষ্টি সুরে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e13);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }

   	  else if(number==13)
   		  {
   			  image.setImageResource(R.drawable.aab14);
   			  text1.setText("Nurse");
   			  text2.setText("রোগীর সেবা করে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e14);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }

   	  else if(number==14)
   		  {
   			  image.setImageResource(R.drawable.aab15);
   			  text1.setText("Orange");
   			  text2.setText("খেলে শক্তি বাড়ে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e15);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }

   	  else if(number==15)
   		  {
   			  image.setImageResource(R.drawable.aab16);
   			  text1.setText("Pen");
   			  text2.setText("দিয়ে লিখতে পারে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e16);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }

   	  else if(number==16)
   		  {
   			  image.setImageResource(R.drawable.aab17);
   			  text1.setText("Quran");
   			  text2.setText("পড়ব সকাল বেলা");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e17);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }

   	  else if(number==17)
   		  {
   			  image.setImageResource(R.drawable.aab18);
   			  text1.setText("Rat");
   			  text2.setText("আঁধারে করে খেলা");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e18);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }

   	  else if(number==18)
   		  {
   			  image.setImageResource(R.drawable.aab19);
   			  text1.setText("Ship");
   			  text2.setText("এ করে মাল আনে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e19);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }

   	  else if(number==19)
   		  {
   			  image.setImageResource(R.drawable.aab20);
   			  text1.setText("Tiger");
   			  text2.setText("থাকে সুন্দরবনে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e20);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }

   	  else if(number==20)
   		  {
   			  image.setImageResource(R.drawable.aab21);
   			  text1.setText("Umbrella");
   			  text2.setText("নাও বৄষ্টির দিনে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e21);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }

   	  else if(number==21)
   		  {
   			  image.setImageResource(R.drawable.aab22);
   			  text1.setText("Violin");
   			  text2.setText("বাজাও আপন মনে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e22);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }

   	  else if(number==22)
   		  {
   			  image.setImageResource(R.drawable.aab23);
   			  text1.setText("Watch");
   			  text2.setText("দেখে সময় বলে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e23);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }

   	  else if(number==23)
   		  {
   			  image.setImageResource(R.drawable.aab24);
   			  text1.setText("X-ray");
   			  text2.setText("করে অসুখ হলে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e24);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }

   	  else if(number==24)
   		  {
   			  image.setImageResource(R.drawable.aab25);
   			  text1.setText("Yam");
   			  text2.setText("মিষ্টি সবাই জানে");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e25);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }

   	  else if(number==25)
   		  {
   			  image.setImageResource(R.drawable.aab26);
   			  text1.setText("Zebra");
   			  text2.setText("হলো শান্ত প্রাণী");
   			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
   			  text2.setTypeface(tf2);
   			  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(EnglishItemDetails.this, R.raw.e26);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
   		  }
	    	

	    	  but.setOnClickListener(new OnClickListener() {
	    			
	    			@Override
	    			public void onClick(View arg0) {
	    				// TODO Auto-generated method stub
	    				if(ischecked)
	    				{
	    					sound.stop();
		    				Intent in= new Intent(EnglishItemDetails.this,EnglishActivity.class);
		    				startActivity(in);
	    				}
	    				else
	    				{
	    					Intent in= new Intent(EnglishItemDetails.this,EnglishActivity.class);
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
	  				
	  				if(ischecked)
	  				{
	  					sound.stop();
	  				Intent in = new Intent(EnglishItemDetails.this,MainActivity.class);
	  				startActivity(in);
	  				}
	  				else
	  				{
	  					Intent in = new Intent(EnglishItemDetails.this,MainActivity.class);
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