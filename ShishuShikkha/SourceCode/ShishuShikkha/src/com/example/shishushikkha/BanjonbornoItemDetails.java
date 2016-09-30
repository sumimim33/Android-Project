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

public class BanjonbornoItemDetails extends Activity{
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

		
			  
			  
	    	if(number==0)
			  {

				  image.setImageResource(R.drawable.aban1);
				  text1.setText("কাক");
				 text2.setText("ডাকে গাছে ঐ");
				  text1.setTypeface(tf);
				  text2.setTypeface(tf2);
				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b1);
			    			 sound.start();
			    			 ischecked=true;
						}
					});

			  }
			  else if(number==1)
			  {
				  image.setImageResource(R.drawable. aban2);
				  text1.setText("খোকন");
				  text2.setText("সোনা খাই খই");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b2);
			    			 sound.start();
			    			 ischecked=true;
						}
					});


			  }

			  else if(number==2)
			  {
				  image.setImageResource(R.drawable. aban3);
				  text1.setText("গরু ");
				  text2.setText("মাঠে খায় ঘাস");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b3);
			    			 sound.start();
			    			 ischecked=true;
						}
					});

			  }

			  else if(number==3)
			  {
				  image.setImageResource(R.drawable. aban4);
				  text1.setText("ঘড়ি");
				  text2.setText("চলে বারো মাস");
			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);



				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b4);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }
			  else if(number==4)
			  {
				  image.setImageResource(R.drawable. aban5);
				  text1.setText("রঙ");
				  text2.setText("দিয়ে ছবি আঁকি");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b5);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }
			  else if(number==5)
			  {
				  image.setImageResource(R.drawable. aban6);
				  text1.setText("চক");
				  text2.setText("দিয়ে অ আ লিখি");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b6);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }
			  else if(number==6)
			  {
				  image.setImageResource(R.drawable. aban7);
				  text1.setText("ছাতা");
				  text2.setText("মাথায় দাদু চলে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b7);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }
			  else if(number==7)
			  {
				  image.setImageResource(R.drawable. aban8);
				  text1.setText("জাহাজ");
				  text2.setText("চলে সাগর জলে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
			  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b8);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }
			  else if(number==8)
		 	  {
				  image.setImageResource(R.drawable. aban9);
				  text1.setText("ঝুড়ি");
			                 text2.setText("ভরে ফল রাখে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

			                 button.setOnClickListener(new OnClickListener() {

									@Override
									public void onClick(View arg0) {
										// TODO Auto-generated method stub
										sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b9);
						    			 sound.start();
						    			 ischecked=true;
									}
								});
			  }
			  else if(number==9)
			  {
				  image.setImageResource(R.drawable. aban10);
				  text1.setText("মিঞ");
				  text2.setText("মিঞ বিড়াল ডাকে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b10);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }
			  else if(number==10)
			  {
				  image.setImageResource(R.drawable. aban11);
				  text1.setText("টিয়া");
				  text2.setText("বলে খোকা ভাই");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b11);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }
		  else if(number==11)
			  {
				  image.setImageResource(R.drawable. aban12);
				  text1.setText("ঠিক");
				  text2.setText("মত পড়া চাই");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b12);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==12)
			  {
				  image.setImageResource(R.drawable. aban13);
				  text1.setText("ডাবের");
				  text2.setText("ভিতর মিষ্টি পানি");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b13);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==13)
			  {
				  image.setImageResource(R.drawable. aban14);
				  text1.setText("ঢাকা");
				  text2.setText("বাংলাদেশের রাজধানী");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b14);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==14)
			  {
				  image.setImageResource(R.drawable. aban15);
				  text1.setText("ফণা");
				  text2.setText("তুলেছে সাপের রাজা");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b15);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==15)
			  {
				  image.setImageResource(R.drawable. aban16);
				  text1.setText("তরমুজ");
				  text2.setText("খেতে ভারি মজা");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b16);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		 else if(number==16)
			  {
				  image.setImageResource(R.drawable. aban17);
				  text1.setText("থালা");
				  text2.setText("ভরা ফল রাখি");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b17);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==17)
			  {
				  image.setImageResource(R.drawable. aban18);
				  text1.setText("দোয়েল");
				  text2.setText("আমাদের জাতীয় পাখি");
			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b18);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==18)
			  {
				  image.setImageResource(R.drawable. aban19);
				  text1.setText("ধান");
				  text2.setText("বুনব সবাই মিলে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b19);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==19)
			  {
				  image.setImageResource(R.drawable. aban20);
				  text1.setText("নৌকা");
				  text2.setText("চলে পাল তুলে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b20);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==20)
			  {
				  image.setImageResource(R.drawable. aban21);	
				  text1.setText("পেঁপে");
				    text2.setText("খেলে পুষ্টি মিলে");
			  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b21);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==21)
			  {
				  image.setImageResource(R.drawable. aban22);
				  text1.setText("ফুল");
				  text2.setText("ফুটেছে গাছের ডালে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
			  text2.setTypeface(tf2);
				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b22);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==22)
			  {
				  image.setImageResource(R.drawable.aban23);
				  text1.setText("বই");
				  text2.setText("পড়ব পাঠশালে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b23);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==23)
			  {
				  image.setImageResource(R.drawable. aban24);
				  text1.setText("ভাই");
				  text2.setText("বোন থাকব মিলে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b24);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==24)
			  {
				  image.setImageResource(R.drawable. aban25);
				  text1.setText("মোরগ");
				  text2.setText("ডাকে রোজ ভোরে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b25);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==25)
			  {
				  image.setImageResource(R.drawable. aban26);
				  text1.setText("যাঁতা");
				  text2.setText("ঘুরে হাতের জোরে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b26);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==26)
			  {
				  image.setImageResource(R.drawable. aban27);
				  text1.setText("রাজহাঁস");
				  text2.setText("পানিতে ভাসে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b27);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		 else if(number==27)
			  {
				  image.setImageResource(R.drawable. aban28);
				  text1.setText("লিচু");
				  text2.setText("নিয়ে নানা আসে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b28);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==28)
			  {
				  image.setImageResource(R.drawable. aban29);
				  text1.setText("শাপলা");
				  text2.setText("আমাদের জাতীয় ফুল");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b29);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }


		  else if(number==29)
			  {
				  image.setImageResource(R.drawable. aban30);
				  text1.setText("ষাঁড়ের");
				  text2.setText("লেজে লম্বা চুল");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b30);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==30)
			  {
				  image.setImageResource(R.drawable. aban31);
				  text1.setText("সাপ");
				  text2.setText("দেখে ভয় পাই");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b31);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==31)
			  {
				  image.setImageResource(R.drawable. aban32);
				  text1.setText("হরিণ");
				  text2.setText("দেখো ঘাস খায়");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b32);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }
		  else if(number==32)
			  {
				  image.setImageResource(R.drawable. aban33);
				  text1.setText("ঘুড়ি");
				  text2.setText("উড়ে আকাশময়");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b33);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==33)
			  {
				  image.setImageResource(R.drawable. aban34);
				  text1.setText("আষাঢ়");
				  text2.setText("মাসে বৃষ্টি হয়");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
			  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b34);
			    			 sound.start();
			    			 ischecked=true;
						}
						
					});
			  }

		  else if(number==34)
			  {
				  image.setImageResource(R.drawable. aban35);
				  text1.setText("ময়ূর");
				  text2.setText("নাচে পেখম খুলে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);
				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b35);
			    			 sound.start();
						}
					});
			  }
		  else if(number==35)
			  {
				  image.setImageResource(R.drawable. aban36);
				  text1.setText("মৎস্য");
				  text2.setText("থাকে নদীর জলে");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b36);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==36)
			  {
				  image.setImageResource(R.drawable. aban37);
				  text1.setText("রং");
				  text2.setText("দিয়ে সঙ সাজা");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b37);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }

		  else if(number==37)
			  {
				  image.setImageResource(R.drawable. aban38);
				  text1.setText("দুঃখীর");
				  text2.setText("দুঃখ বড় বোঝা");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);

				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b38);
			    			 sound.start();
			    			 ischecked=true;
						}
					});
			  }


		  else if(number==38)
			  {
				  image.setImageResource(R.drawable. aban39);
				  text1.setText("চাঁদের");
				  text2.setText("আলো দেখতে মজা");
				  text1.setTypeface(tf,Typeface.BOLD_ITALIC);
				  text2.setTypeface(tf2);


				  button.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							sound=MediaPlayer.create(BanjonbornoItemDetails.this, R.raw.b39);
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
		    				Intent in= new Intent(BanjonbornoItemDetails.this,BanjonBornoActivity.class);
		    				startActivity(in);
	    				}
	    				else
	    				{
	    					Intent in= new Intent(BanjonbornoItemDetails.this,BanjonBornoActivity.class);
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
				Intent in = new Intent(BanjonbornoItemDetails.this,MainActivity.class);
				startActivity(in);
				}
				else
				{
					Intent in = new Intent(BanjonbornoItemDetails.this,MainActivity.class);
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
