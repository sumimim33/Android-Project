package com.example.shishushikkha;

import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
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
public class ActivityEkDui extends Activity{
	MediaPlayer sound;
	private GridView photoGrid;
	private int mPhotoSize, mPhotoSpacing;
	private ImageAdapter imageAdapter;
	Typeface tf;
	//private ImageAdapter imageAdapter;
	Intent intent;
	
	private static final String[] CONTENT = new String[] { "এক", "দুই", "তিন", "চার","পাঁচ", 
		"ছয়", "সাত", "আট", "নয়", "দশ",
		"এগারো","বারো", "তের", "চৌদ্দ", "পনেরো", "ষোলো", "সতেরো","আঠারো","ঊনিশ", "বিশ"};


	private static final int[] ICONS = new int[] { R.drawable.ek1, R.drawable.ek2,R.drawable.ek3, R.drawable.ek4, R.drawable.ek5, R.drawable.ek6,R.drawable.ek7, R.drawable.ek8, R.drawable.ek9, R.drawable.ek10,R.drawable.ek11, R.drawable.ek12, R.drawable.ek13, R.drawable.ek14,R.drawable.ek15, R.drawable.ek16, R.drawable.ek17, R.drawable.ek18,R.drawable.ek19, R.drawable.ek20};

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
setContentView(R.layout.activity_english);
tf = Typeface.createFromAsset(getApplicationContext().getAssets(),"font/solaimanlipinormal.ttf");
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
		
	        text.setTextSize(60);
	        text.setTypeface(tf);
	        
		photoGrid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> a, View v, int position,
					long id) {
				if(position==0)
            	{

					
 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek1);
 	               sound.start();
 	               
 	             text.setText("১");
 	             Toast toast = new Toast(getApplicationContext());
 	             
 	             toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
 	            toast.setDuration(20);
 	             toast.setView(layout);
 	             
 	             toast.show();
 	            
 	                	               
            	}
				
				
				else if(position==1)
            	{
//            		 Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
// 	                ((TextView) v).setTypeface(tf,Typeface.BOLD);
// 	                ((TextView) v).setTextColor(Color.RED);
					
 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek2);
 	               sound.start();
 	             //  Toast.makeText(getApplicationContext(), "2", 20).show();
 	               
 	            text.setText("২");
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

 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek3);
 	               sound.start();
 	               
 	              text.setText("৩");
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

					
 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek4);
 	               sound.start();
 	               
 	              text.setText("৪");
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

					
 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek5);
 	               sound.start();
 	               
 	              text.setText("৫");
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

 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek6);
 	               sound.start();
 	               
 	              text.setText("৬");
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
//            		 Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
// 	                ((TextView) v).setTypeface(tf,Typeface.BOLD);
// 	                ((TextView) v).setTextColor(Color.RED);
					
 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek7);
 	               sound.start();
 	               
 	              text.setText("৭");
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
//            		 Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
// 	                ((TextView) v).setTypeface(tf,Typeface.BOLD);
// 	                ((TextView) v).setTextColor(Color.RED);
					
 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek8);
 	               sound.start();
 	               
 	              text.setText("৮");
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
//            		 Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
// 	                ((TextView) v).setTypeface(tf,Typeface.BOLD);
// 	                ((TextView) v).setTextColor(Color.RED);
					
 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek9);
 	               sound.start();
 	               
 	              text.setText("৯");
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
//            		 Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
// 	                ((TextView) v).setTypeface(tf,Typeface.BOLD);
// 	                ((TextView) v).setTextColor(Color.RED);
					
 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek10);
 	               sound.start();
 	               
 	              text.setText("১০");
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
//            		 Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
// 	                ((TextView) v).setTypeface(tf,Typeface.BOLD);
// 	                ((TextView) v).setTextColor(Color.RED);
					
 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek11);
 	               sound.start();
 	               
 	              text.setText("১১");
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
//            		 Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
// 	                ((TextView) v).setTypeface(tf,Typeface.BOLD);
// 	                ((TextView) v).setTextColor(Color.RED);
					
 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek12);
 	               sound.start();
 	               
 	              text.setText("১২");
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

					
 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek13);
 	               sound.start();
 	               
 	              text.setText("১৩");
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

 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek14);
 	               sound.start();
 	               
 	              text.setText("১৪");
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

					
 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek15);
 	               sound.start();
 	               
 	              text.setText("১৫");
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

 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek16);
 	               sound.start();
 	               
 	              text.setText("১৬");
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

 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek17);
 	               sound.start();
 	               
 	              text.setText("১৭");
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

					
 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek18);
 	               sound.start();
 	               
 	              text.setText("১৮");
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

 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek19);
 	               sound.start();
 	               
 	              text.setText("১৯");
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

					
 	               sound=MediaPlayer.create(ActivityEkDui.this, R.raw.rek20);
 	               sound.start();
 	               
 	              text.setText("২০");
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
