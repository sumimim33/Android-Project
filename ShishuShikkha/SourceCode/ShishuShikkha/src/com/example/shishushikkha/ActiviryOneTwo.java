package com.example.shishushikkha;


import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("InlinedApi")
public class ActiviryOneTwo extends Activity {
	
	
			MediaPlayer sound;
			private GridView photoGrid;
			private int mPhotoSize, mPhotoSpacing;
			private ImageAdapter imageAdapter;
			//private ImageAdapter imageAdapter;
			Intent intent;
			 // Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
//			Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
			// Some items to add to the GRID
			private static final String[] CONTENT = new String[] { "One", "Two", "Three", "Four","Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven","Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen","nineteen", "Twenty"};


			private static final int[] ICONS = new int[] { 
				R.drawable.one1, R.drawable.one2,
				R.drawable.one3, R.drawable.one4,
				R.drawable.one5, R.drawable.one6,
				R.drawable.one7, R.drawable.one8, 
				R.drawable.one9, R.drawable.one10,
				R.drawable.one11, R.drawable.one12,
				R.drawable.one13, R.drawable.one14,
				R.drawable.one15, R.drawable.one16, 
				R.drawable.one17, R.drawable.one18,
				R.drawable.one19, R.drawable.one20
				};


			@Override
			protected void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_english);
				
				mPhotoSize = getResources().getDimensionPixelSize(R.dimen.photo_size);
				mPhotoSpacing = getResources().getDimensionPixelSize(R.dimen.photo_spacing);
				
				imageAdapter = new ImageAdapter();

				photoGrid = (GridView) findViewById(R.id.abcGrid);


				photoGrid.setAdapter(imageAdapter);

				// get the view tree observer of the grid and set the height and numcols dynamically
				photoGrid.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
					@Override
					public void onGlobalLayout() {
						if (imageAdapter.getNumColumns() == 0) {
							final int numColumns = (int) Math.floor(photoGrid.getWidth() / (mPhotoSize + mPhotoSpacing));
							if (numColumns > 0) {
								final int columnWidth = (photoGrid.getWidth() / numColumns) - mPhotoSpacing;
								imageAdapter.setNumColumns(numColumns);
								imageAdapter.setItemHeight(columnWidth);

							}
						}
					}
				});
				
				
				 LayoutInflater inflater = getLayoutInflater();

			        final View layout = inflater.inflate(R.layout.custom_toast,null);

			        // set a message
			        final TextView text = (TextView) layout.findViewById(R.id.text11);
				
				
				photoGrid.setOnItemClickListener(new OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> a, View v, int position,
							long id) {
						
						if(position==0)
		            	{

							
		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone1);
		 	               sound.start();
		 	               
		 	           
		 	             Toast toast = new Toast(getApplicationContext());
		 	            text.setText("1");
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	           text.setTextSize(60);
		 	             toast.setView(layout);
		 	           
		 	             toast.show();
		 	            
		 	                	               
		            	}
						
						
						else if(position==1)
		            	{
//		            		 Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
//		 	                ((TextView) v).setTypeface(tf,Typeface.BOLD);
//		 	                ((TextView) v).setTextColor(Color.RED);
							
		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone2);
		 	               sound.start();
		 	             //  Toast.makeText(getApplicationContext(), "2", 20).show();
		 	               
		 	            text.setText("2");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);

		 	             toast.setDuration(20);
		 	             toast.setView(layout);
		  	          
		 	             toast.show();
		 	                         
		 	               
		            	}
						
						else if(position==2)
		            	{

		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone3);
		 	               sound.start();
		 	               
		 	              text.setText("3");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==3)
		            	{

							
		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone4);
		 	               sound.start();
		 	               
		 	              text.setText("4");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	             toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==4)
		            	{

							
		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone5);
		 	               sound.start();
		 	               
		 	              text.setText("5");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==5)
		            	{

		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone6);
		 	               sound.start();
		 	               
		 	              text.setText("6");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==6)
		            	{
//		            		 Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
//		 	                ((TextView) v).setTypeface(tf,Typeface.BOLD);
//		 	                ((TextView) v).setTextColor(Color.RED);
							
		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone7);
		 	               sound.start();
		 	               
		 	              text.setText("7");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==7)
		            	{
//		            		 Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
//		 	                ((TextView) v).setTypeface(tf,Typeface.BOLD);
//		 	                ((TextView) v).setTextColor(Color.RED);
							
		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone8);
		 	               sound.start();
		 	               
		 	              text.setText("8");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==8)
		            	{
//		            		 Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
//		 	                ((TextView) v).setTypeface(tf,Typeface.BOLD);
//		 	                ((TextView) v).setTextColor(Color.RED);
							
		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone9);
		 	               sound.start();
		 	               
		 	              text.setText("9");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==9)
		            	{

							
		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone10);
		 	               sound.start();
		 	               
		 	              text.setText("10");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==10)
		            	{
//		            		 Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
//		 	                ((TextView) v).setTypeface(tf,Typeface.BOLD);
//		 	                ((TextView) v).setTextColor(Color.RED);
							
		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone11);
		 	               sound.start();
		 	               
		 	              text.setText("11");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==11)
		            	{
//		            		 Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
//		 	                ((TextView) v).setTypeface(tf,Typeface.BOLD);
//		 	                ((TextView) v).setTextColor(Color.RED);
							
		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone12);
		 	               sound.start();
		 	               
		 	              text.setText("12");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==12)
		            	{

							
		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone13);
		 	               sound.start();
		 	               
		 	              text.setText("13");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==13)
		            	{

		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone14);
		 	               sound.start();
		 	               
		 	              text.setText("14");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==14)
		            	{

							
		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone15);
		 	               sound.start();
		 	               
		 	              text.setText("15");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==15)
		            	{

		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone16);
		 	               sound.start();
		 	               
		 	              text.setText("16");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==16)
		            	{

		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone17);
		 	               sound.start();
		 	               
		 	              text.setText("17");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						
						else if(position==17)
		            	{

							
		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone18);
		 	               sound.start();
		 	               
		 	              text.setText("18");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==18)
		            	{

		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone19);
		 	               sound.start();
		 	               
		 	              text.setText("19");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						else if(position==19)
		            	{

							
		 	               sound=MediaPlayer.create(ActiviryOneTwo.this, R.raw.rone20);
		 	               sound.start();
		 	               
		 	              text.setText("20");
		                  text.setTextSize(60);
		                 
		 	             // Toast...
		 	             Toast toast = new Toast(getApplicationContext());
		 	             
		 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		 	            toast.setDuration(20);
		 	             toast.setView(layout);
		 	             toast.show();
		 	                         
		 	               
		            	}
						
					}
					
					
					

					
				});
			}
			
			
			public class ImageAdapter extends BaseAdapter {
				private LayoutInflater mInflater;
				private int mItemHeight = 0;
				private int mNumColumns = 0;
				private RelativeLayout.LayoutParams mImageViewLayoutParams;

				public ImageAdapter() {
					mInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
					mImageViewLayoutParams = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT,
							LayoutParams.MATCH_PARENT);
				}

				public int getCount() {
					return CONTENT.length;
				}

				// set numcols
				public void setNumColumns(int numColumns) {
					mNumColumns = numColumns;
				}

				public int getNumColumns() {
					return mNumColumns;
				}

				// set photo item height
				public void setItemHeight(int height) {
					if (height == mItemHeight) {
						return;
					}
					mItemHeight = height;
					mImageViewLayoutParams = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, mItemHeight);
					notifyDataSetChanged();
				}

				public Object getItem(int position) {
					return position;
				}

				public long getItemId(int position) {
					return position;
				}

				public View getView(final int position, View view, ViewGroup parent) {

					if (view == null)
						view = mInflater.inflate(R.layout.activity_banjonborno_detais, null);

					ImageView cover = (ImageView) view.findViewById(R.id.cover_banjon);
					TextView title = (TextView) view.findViewById(R.id.title_banjon);

					cover.setLayoutParams(mImageViewLayoutParams);

					// Check the height matches our calculated column width
					if (cover.getLayoutParams().height != mItemHeight) {
						cover.setLayoutParams(mImageViewLayoutParams);
					}

					cover.setImageResource(ICONS[position % ICONS.length]);
					title.setText(CONTENT[position % CONTENT.length]);

					return view;
				}
			}
}