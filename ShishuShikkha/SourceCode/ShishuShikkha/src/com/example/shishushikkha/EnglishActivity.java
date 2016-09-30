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

public class EnglishActivity extends Activity{
	private GridView photoGrid;
	private int mPhotoSize, mPhotoSpacing;
	private ImageAdapter imageAdapter;
	//Intent intent;
	private static final String[] CONTENT = new String[] { "Apple", "Ball", "Cat", "Doll",
		"Egg", "Forg", "Gun", "Heron", "Iron", "Juice", "Key",
		"Leaf", "Magpie", "Nurse", "Orange", "Pen", "Quran", "Rat",
		"Ship", "Tiger", "Umbrella", "Violin", "Watch", "X-Ray",
		"Yam", "Zebra"};

private static final int[] ICONS = new int[] { R.drawable.abc1, R.drawable.abc2,
	R.drawable.abc3, R.drawable.abc4,
	R.drawable.abc5, R.drawable.abc6,
	R.drawable.abc7, R.drawable.abc8,
	R.drawable.abc9, R.drawable.abc10,
	R.drawable.abc11, R.drawable.abc12,
R.drawable.abc13, R.drawable.abc14,R.drawable.abc15, 
R.drawable.abc16,R.drawable.abc17,
R.drawable.abc18, R.drawable.abc19, R.drawable.abc20,
R.drawable.abc21,R.drawable.abc22, R.drawable.abc23, 
R.drawable.abc24, R.drawable.abc25,R.drawable.abc26};

	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
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
		
		
		photoGrid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> a, View v, int position,
					long id) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(EnglishActivity.this,EnglishItemDetails.class);
				i.putExtra("key", position);
				startActivity(i);
				
				//Toast.makeText(getApplicationContext(), "A"+position, 100).show();
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