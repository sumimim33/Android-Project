package com.example.shishushikkha;





import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ChoraActivity extends Activity{
	
	private ListView listView1;
	Intent intent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cora);
		
		Chora_list chora_data[] = new Chora_list[]
		        {
		            new Chora_list(R.drawable.ata, "আতা গাছে তোতা পাখি"),
		            new Chora_list(R.drawable.bristy1, "আয় বৃষ্টি ঝেঁপে"),
		            new Chora_list(R.drawable.chad, "আয় আয় চাঁদ মামা"),
		            new Chora_list(R.drawable.hatti1, "হাটটিমাটিম টিম"),
		            new Chora_list(R.drawable.khokon, "খোকন খোকন করে মায়")
		        };
		
		
		ChoraAdapter adapter = new ChoraAdapter(this,  R.layout.listview_item_row, chora_data);
        
        
        listView1 = (ListView)findViewById(R.id.listView1);
        listView1.setOnItemClickListener(new OnItemClickListener() {
        	@Override
        	public void onItemClick(AdapterView<?> a, View v, int position, long id) { 
        		@SuppressWarnings("unused")
				Object o = listView1.getItemAtPosition(position);
        		
        		Intent intent=new Intent(ChoraActivity.this,ChoraItemDetails.class);
        		intent.putExtra("key", position);
				startActivity(intent);
				
                  
                   
            	
        	}  
        });
		
        
        
        listView1.setAdapter(adapter);
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
}

