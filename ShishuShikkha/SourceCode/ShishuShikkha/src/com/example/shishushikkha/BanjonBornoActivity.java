package com.example.shishushikkha;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BanjonBornoActivity  extends Activity{
	private GridView photoGrid;
	private int mPhotoSize, mPhotoSpacing;
	private ImageAdapter imageAdapter;
	//Intent intent;
	private static final String[] CONTENT = new String[] { 
		"কাক", "খোকন", "গরু", "ঘড়ি",//4
		"রঙ", "চক", "ছাতা", "জাহাজ", "ঝুড়ি", "মিঞ", "টিয়া",//11
		"ঠিকমত", "ডাব", "ঢাকা", "ফণা", "তরমুজ", "থালা", "দোয়েল",//18
		"ধান", "নৌকা", "পেঁপে", "ফুল", "বই", "ভাই", "মোরগ",//25
		"যাতা", "রাজহাঁস", "লিচু", "শাপলা", "ষাঁড়", "সাগর", "হরিণ",//32
		"ঘুড়ি", "আষাঢ়", "ময়ূর", "মৎস্য", "রং", "দুঃখী", "চাঁদ" };//39
private static final int[] ICONS = new int[] { 
	    R.drawable.b1, R.drawable.b2,//2
		R.drawable.b3, R.drawable.b4, R.drawable.b5, R.drawable.b6,//6
		R.drawable.b7, R.drawable.b8, R.drawable.b9, R.drawable.b10,//10
		R.drawable.b11, R.drawable.b12, R.drawable.b13, R.drawable.b14,//14
		R.drawable.b15, R.drawable.b16, R.drawable.b17, R.drawable.b18,//18
		R.drawable.b19, R.drawable.b20, R.drawable.b21, R.drawable.b22,//
		R.drawable.b23, R.drawable.b24, R.drawable.b25, R.drawable.b26,//4
		R.drawable.b27, R.drawable.b28, R.drawable.b29, R.drawable.b30,//3
		R.drawable.b31, R.drawable.b32, R.drawable.b33, R.drawable.b34,//2
		R.drawable.b35, R.drawable.b36, R.drawable.b37, R.drawable.b38,//1
		R.drawable.b39  };

	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_banjonborno);
		
		mPhotoSize = getResources().getDimensionPixelSize(R.dimen.photo_size);
		mPhotoSpacing = getResources().getDimensionPixelSize(R.dimen.photo_spacing);
		
		imageAdapter = new ImageAdapter();

		photoGrid = (GridView) findViewById(R.id.banjonGrid);


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
		
		
		photoGrid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> a, View v, int position,
					long id) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(BanjonBornoActivity.this,BanjonbornoItemDetails.class);
				i.putExtra("key", position);
				startActivity(i);
				
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
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	

}
