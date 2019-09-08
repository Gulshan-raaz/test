package com.my.newproject3;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.FloatingActionButton;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import android.widget.ListView;
import android.widget.BaseAdapter;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;

public class HomeActivity extends AppCompatActivity {
	
	
	private FloatingActionButton _fab;
	private double position = 0;
	
	private ArrayList<String> place = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear9;
	private LinearLayout linear5;
	private LinearLayout linear7;
	private LinearLayout linear11;
	private LinearLayout linear4;
	private TextView textview1;
	private TextView textview2;
	private HorizontalScrollView hscroll2;
	private LinearLayout linear10;
	private ImageView imageview1;
	private ImageView imageview2;
	private ImageView imageview3;
	private ImageView imageview4;
	private LinearLayout linear8;
	private TextView textview7;
	private Spinner spinner3;
	private ImageView imageview5;
	private LinearLayout linear12;
	private LinearLayout linear15;
	private LinearLayout linear13;
	private TextView textview10;
	private TextView textview9;
	private ScrollView vscroll1;
	private ListView listview1;
	
	private Intent transfer = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_fab = (FloatingActionButton) findViewById(R.id._fab);
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		hscroll2 = (HorizontalScrollView) findViewById(R.id.hscroll2);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		textview7 = (TextView) findViewById(R.id.textview7);
		spinner3 = (Spinner) findViewById(R.id.spinner3);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview9 = (TextView) findViewById(R.id.textview9);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		listview1 = (ListView) findViewById(R.id.listview1);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.setClass(getApplicationContext(), AlldataActivity.class);
				startActivity(transfer);
			}
		});
		
		spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (_position == 0) {
					
				}
				else {
					transfer.putExtra("pos", String.valueOf((long)(_position)));
					transfer.setClass(getApplicationContext(), AlldisticActivity.class);
					startActivity(transfer);
					spinner3.setSelection((int)(0));
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.setClass(getApplicationContext(), TermandconditionActivity.class);
				startActivity(transfer);
			}
		});
	}
	private void initializeLogic() {
		imageview5.setRotation((float)(90));
		place.add((int)(0), "Select Your State🤔👇");
		place.add((int)(1), "Andhra Pradesh");
		place.add((int)(2), " Arunachal Pradesh");
		place.add((int)(3), "Assam");
		place.add((int)(4), " Bihar");
		place.add((int)(5), " Chhattisgarh");
		place.add((int)(6), "Goa");
		place.add((int)(7), "Gujrat");
		place.add((int)(8), "Haryana");
		place.add((int)(9), "Himachal Pradesh");
		place.add((int)(10), "Jammu and Kashmir");
		place.add((int)(11), "Jharkhand");
		place.add((int)(12), "Karnatka");
		place.add((int)(13), "Kerala");
		place.add((int)(14), "Madhya Pradesh ");
		place.add((int)(15), " Maharashtra");
		place.add((int)(16), "Manipur");
		place.add((int)(17), "Meghalaya");
		place.add((int)(18), "Mizoram");
		place.add((int)(19), " Nagaland");
		place.add((int)(20), "Odisha");
		place.add((int)(21), "Punjab");
		place.add((int)(22), " Rajasthan");
		place.add((int)(23), "Sikkim");
		place.add((int)(24), "Tamil Nadu");
		place.add((int)(25), "Telangana");
		place.add((int)(26), "Tripura");
		place.add((int)(27), "Uttar Pradesh");
		place.add((int)(28), " Uttarakhand");
		place.add((int)(29), "West Bengal");
		place.add((int)(30), "Andman and Nicobar Islands");
		place.add((int)(31), "Chandigarh ");
		place.add((int)(32), "Dadar and Nagar Haveli");
		place.add((int)(33), "Daman and Diu");
		place.add((int)(34), "Delhi");
		place.add((int)(35), "Lakshadweep");
		place.add((int)(36), "Puducherry (pondicherry)");
		spinner3.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, place));
		((ArrayAdapter)spinner3.getAdapter()).notifyDataSetChanged();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
