package com.example.shishushikkha;




import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
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

@SuppressLint("InlinedApi")
public class BanglaShorActivity extends  Activity {
	MediaPlayer sound;
	private GridView photoGrid;
	private int mPhotoSize, mPhotoSpacing;
	private ImageAdapter imageAdapter;
	//private ImageAdapter imageAdapter;
	Intent intent;
	 // Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
//	Typeface tf = Typeface.createFromAsset(getAssets(), "solaimanlipinormal.ttf");
	// Some items to add to the GRID
	private static final String[] CONTENT = new String[] { "অলি", "আতা", "ইঁদুর", "ঈগল",
			"উই পোকা", "ঊষা", "ঋতু", "একতারা", "ঐরাবত", "ওল", "ঔষধ"
			};
	private static final int[] ICONS = new int[] { R.drawable.as1, R.drawable.as2,
			R.drawable.as3, R.drawable.as4, R.drawable.as5, R.drawable.as6,
			R.drawable.as7, R.drawable.as8, R.drawable.as9, R.drawable.as10,
			R.drawable.as11 };

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
		
		
		photoGrid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> a, View v, int position,
					long id) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(BanglaShorActivity.this,BanglaShorItemDelails.class);
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