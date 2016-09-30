package com.example.shishushikkha;


import java.util.UUID;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;


public class AkiBukiActivity extends Activity
{
	private DrawingView drawView;
	private ImageButton currPaint, drawBtn, eraseBtn, newBtn, saveBtn;
	private float smallBrush, mediumBrush, largeBrush;
Typeface tf;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.draw);
		tf = Typeface.createFromAsset(getApplicationContext().getAssets(),"font/solaimanlipinormal.ttf");
	     drawView = (DrawingView)findViewById(R.id.drawing);
	     
	     newBtn = (ImageButton)findViewById(R.id.new_btn);
	     saveBtn = (ImageButton)findViewById(R.id.save_btn);
	     drawBtn = (ImageButton)findViewById(R.id.draw_btn);
	     eraseBtn = (ImageButton)findViewById(R.id.erase_btn);
	     smallBrush = getResources().getInteger(R.integer.small_size);
			mediumBrush = getResources().getInteger(R.integer.medium_size);
			largeBrush = getResources().getInteger(R.integer.large_size);
			
			LinearLayout paintLayout = (LinearLayout)findViewById(R.id.paint_colors);
			currPaint = (ImageButton)paintLayout.getChildAt(0);
			currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
			
			drawView.setBrushSize(mediumBrush);
			
			AlertDialog.Builder newDialog = new AlertDialog.Builder(this);
			newDialog.setTitle("নতুন আঁকা শুরু");
			newDialog.setMessage("নতুন আঁকা শুরু (আপনি পূর্বের আঁকা হারিয়ে ফেলবেন)?");
			newDialog.setPositiveButton("হ্যাঁ", new DialogInterface.OnClickListener(){
			    public void onClick(DialogInterface dialog, int which){
			        drawView.startNew();
			        dialog.dismiss();
			    }
			});
			newDialog.setNegativeButton("বাতিল", new DialogInterface.OnClickListener(){
			    public void onClick(DialogInterface dialog, int which){
			        dialog.cancel();
			        Intent in = new Intent(AkiBukiActivity.this,MainActivity.class);
			        startActivity(in);
			    }
			});
			newDialog.show();
			
			
	     newBtn.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Toast.makeText(getApplicationContext(), "নতুন আঁকা", 200).show();
					 drawView.startNew();
					
				}
			});
	     
	     saveBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 //save drawing
				AlertDialog.Builder saveDialog = new AlertDialog.Builder(AkiBukiActivity.this);
				saveDialog.setTitle("আঁকা সংরক্ষন");
				saveDialog.setMessage("আঁকা সংরক্ষন করবেন?");
				saveDialog.setPositiveButton("হ্যাঁ", new DialogInterface.OnClickListener(){
				    public void onClick(DialogInterface dialog, int which){
				        //save drawing
				    	drawView.setDrawingCacheEnabled(true);
				    	String imgSaved = MediaStore.Images.Media.insertImage(
				    		    getContentResolver(), drawView.getDrawingCache(),
				    		    UUID.randomUUID().toString()+".png", "আঁকা");
				    	if(imgSaved!=null){
				    	    Toast savedToast = Toast.makeText(getApplicationContext(), 
				    	        "আঁকা  গ্যালারিতে  সংরক্ষন হয়েছে!", Toast.LENGTH_SHORT);
				    	    savedToast.show();
				    	}
				    	else{
				    	    Toast unsavedToast = Toast.makeText(getApplicationContext(), 
				    	        "ইস! ছবি সংরক্ষন হয়নি।", Toast.LENGTH_SHORT);
				    	    unsavedToast.show();
				    	}
				    	drawView.destroyDrawingCache();
				    }
				});
				saveDialog.setNegativeButton("বাতিল", new DialogInterface.OnClickListener(){
				    public void onClick(DialogInterface dialog, int which){
				        dialog.cancel();
				        //Intent i= new Intent(Draw.this,MainActivity.class);
				        
				    }
				});
				saveDialog.show();
				
			}
		});
	     
	     eraseBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				final Dialog brushDialog = new Dialog(AkiBukiActivity.this);
				brushDialog.setTitle("মুছনির সাইজ:");
				brushDialog.setContentView(R.layout.brush_chooser);
				ImageButton smallBtn = (ImageButton)brushDialog.findViewById(R.id.small_brush);
				smallBtn.setOnClickListener(new OnClickListener(){
				    @Override
				    public void onClick(View v) {
				        drawView.setErase(true);
				        drawView.setBrushSize(smallBrush);
				        drawView.setErase(false);
				        brushDialog.dismiss();
				    }
				});
				ImageButton mediumBtn = (ImageButton)brushDialog.findViewById(R.id.medium_brush);
				mediumBtn.setOnClickListener(new OnClickListener(){
				    @Override
				    public void onClick(View v) {
				        drawView.setErase(true);
				        drawView.setBrushSize(mediumBrush);
				        drawView.setErase(false);
				        brushDialog.dismiss();
				    }
				});
				ImageButton largeBtn = (ImageButton)brushDialog.findViewById(R.id.large_brush);
				largeBtn.setOnClickListener(new OnClickListener(){
				    @Override
				    public void onClick(View v) {
				        drawView.setErase(true);
				        drawView.setBrushSize(largeBrush);
				        drawView.setErase(false);
				        brushDialog.dismiss();
				    }
				});
				brushDialog.show();
				
			}
		});
	     
	     drawBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				final Dialog brushDialog = new Dialog(AkiBukiActivity.this);
				brushDialog.setTitle("ব্রাশ সাইজ:");
				brushDialog.setContentView(R.layout.brush_chooser);
				ImageButton smallBtn = (ImageButton)brushDialog.findViewById(R.id.small_brush);
				smallBtn.setOnClickListener(new OnClickListener(){
				    @Override
				    public void onClick(View v) {
				        drawView.setBrushSize(smallBrush);
				        drawView.setLastBrushSize(smallBrush);
				        drawView.setErase(false);
				        brushDialog.dismiss();
				    }
				});
				
				ImageButton mediumBtn = (ImageButton)brushDialog.findViewById(R.id.medium_brush);
				mediumBtn.setOnClickListener(new OnClickListener(){
				    @Override
				    public void onClick(View v) {
				        drawView.setBrushSize(mediumBrush);
				        drawView.setLastBrushSize(mediumBrush);
				        drawView.setErase(false);
				        brushDialog.dismiss();
				    }
				});
				 
				ImageButton largeBtn = (ImageButton)brushDialog.findViewById(R.id.large_brush);
				largeBtn.setOnClickListener(new OnClickListener(){
				    @Override
				    public void onClick(View v) {
				        drawView.setBrushSize(largeBrush);
				        drawView.setLastBrushSize(largeBrush);
				        drawView.setErase(false);
				        brushDialog.dismiss();
				    }
				});
				brushDialog.show();
				
			}
		});
	     
	
	     
}
		
	public void paintClicked(View view){
	    //use chosen color
		if(view!=currPaint){
			//update color
			ImageButton imgView = (ImageButton)view;
			String color = view.getTag().toString();
			drawView.setColor(color);
			imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
			currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
			currPaint=(ImageButton)view;
			}
		drawView.setErase(false);
		drawView.setBrushSize(drawView.getLastBrushSize());
	}

	
		}