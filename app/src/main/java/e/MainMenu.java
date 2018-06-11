package e;


import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.arna.testerApp.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.analytics.FirebaseAnalytics;

import com.magnetadservices.sdk.MagnetSDK;

import org.arna.Advertise;

import ir.adad.client.Adad;

public abstract class MainMenu extends Menubasic{
private ViewGroup content;
public ListView menuList;
Context context;

	public MainMenu(Activity activity) {
		super(activity);
//		 menu.setShadowDrawable(R.drawable.shadowright);

//		org.arna.Advertise.beginOfOnCreate( "612fc2f1a09808d5aff33640706bcc74",//magnet_baner_id
//		"com.arnaway.trafficmap",//magnet_package
//		"ca-app-pub-7830181975348510~3011799352",//admob_APPID
//		"ca-app-pub-7830181975348510/3054007865",//admob_addunitid
//		"9d901968fb784ea1b9d5fbd80245a3a0"//adad_id
//		,"roobak.onemilionsms"//adad_package
//		,context);
//		FirebaseAnalytics mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
//		mFirebaseAnalytics.setCurrentScreen(this, "MainActivity", null /* class override */);


//		new AdverAsync().execute(content.findViewById(R.id.bannerid7),content.findViewById(R.id.bannerid6),content.findViewById(R.id.bannerid1),
//				content.findViewById(R.id.bannerid4),content.findViewById(R.id.bannerid3),content.findViewById(R.id.bannerid2),
//				content.findViewById(R.id.bannerid5)
//				);
	}


	public abstract void itemselected(int arg2);
	public ViewGroup getContent() {
		if(content==null){
			Adad.initialize(getActivity().getApplicationContext());
			MagnetSDK.initialize(getActivity().getApplicationContext());
			MobileAds.initialize(getActivity().getApplicationContext(),"ca-app-pub-7830181975348510/3054007865");

			content=(ViewGroup) View.inflate(getActivity(), R.layout.main_menu, null);
			AdView mAdView = content.findViewById(R.id.adViews);
			AdRequest adRequest = new AdRequest.Builder().build();
			mAdView.loadAd(adRequest);
			menuList=(ListView) content.findViewById(R.id.menuList);
			menuList.setAdapter(new myListUdapter(getActivity()));
			
			menuList.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					itemselected(arg2);
				}
			});
			WindowManager windowManager = (WindowManager) getActivity().getSystemService(Context.WINDOW_SERVICE);
		    int Screenw = windowManager.getDefaultDisplay().getWidth();
//		    getMenu().setBehindOffset((int) (Screenw*.1));
		}
		return content;
	}

	private class AdverAsync extends AsyncTask<View, View[], View[]> {

		@Override
		protected View[] doInBackground(View... params) {for (View v:params
				) {
			try {
					Advertise.endOfOnCreate(getActivity().getApplicationContext(),
							getActivity(), ((com.arna.manager.views.baners.AdView)v),null,
							Advertise.ADMOB,
							Advertise.ADADR
//							,
//							Advertise.MAGNET
					);


			} catch (Throwable e) {
			}
		}
			return params;
		}

		@Override
		protected void onPostExecute(View[] result) {




//			org.arna.Advertise.endOfOnCreate(getActivity(),
//					getActivity(), ((com.arna.manager.views.baners.AdView)content.findViewById(R.id.bannerid2)),
//					org.arna.Advertise.ADADR,
//					org.arna.Advertise.MAGNET ,
//					org.arna.Advertise.ADMOBR );
//
//			org.arna.Advertise.endOfOnCreate(getActivity(),
//					getActivity(), ((com.arna.manager.views.baners.AdView)content.findViewById(R.id.bannerid3)),
//					org.arna.Advertise.ADMOB,
//					org.arna.Advertise.ADADR ,
//					org.arna.Advertise.MAGNET );
//
//			org.arna.Advertise.endOfOnCreate(getActivity(),
//					getActivity(), ((com.arna.manager.views.baners.AdView)content.findViewById(R.id.bannerid4)),
//					org.arna.Advertise.ADADR,
//					org.arna.Advertise.ADMOB ,
//					org.arna.Advertise.MAGNET );
//
//			org.arna.Advertise.endOfOnCreate(getActivity(),
//					getActivity(), ((com.arna.manager.views.baners.AdView)content.findViewById(R.id.bannerid5)),
//					org.arna.Advertise.ADMOB,
//					org.arna.Advertise.ADADR ,
//					org.arna.Advertise.MAGNET );
//
//			org.arna.Advertise.endOfOnCreate(getActivity(),
//					getActivity(), ((com.arna.manager.views.baners.AdView)content.findViewById(R.id.bannerid6)),
//					org.arna.Advertise.ADMOB,
//					org.arna.Advertise.MAGNET ,
//					org.arna.Advertise.ADADR );
//
//			org.arna.Advertise.endOfOnCreate(getActivity(),
//					getActivity(), ((com.arna.manager.views.baners.AdView)content.findViewById(R.id.bannerid7)),
//					org.arna.Advertise.ADADR,
//					org.arna.Advertise.ADMOB ,
//					org.arna.Advertise.MAGNET );

		}

	}

	public void setContent(ViewGroup content) {
		this.content = content;
	}
	
//	public static final int MENU_SEND_APP=0;
	public static final int MENU_accesslist=0;
//	public static final int MENU_DOWNLOAD_LIST=2;
//	public static final int MENU_SETTING=2;
//	public static final int MENU_GPS_SETTING=1;
//	public static final int MENU_VECTOR_BITMAP_SEETING=2;
//	public static final int MENU_ANSWER_PROBLEMS=3;
//	public static final int MENU_DOWNLOAD_IRAN_VECTOR=4;
//	public static final int MENU_DOWNLOAD_ROATING=3;
//	public static final int MENU_MAGNIFY_SETTING=6;
	public static final int MENU_SEND_OPENION=1;
	public static final int MENU_SEND_OTHER=2;
//	public static final int MENU_SEND_TO=8;
//	public static final int MENU_OTHER_APPS=9;
//	public static final int MENU_ABOUTUS=10;
	class myListUdapter extends BaseAdapter{
		String[] captions=new String[]{
//				"نقشه های ساخته شده",
//				"       ",
				"مدیریت شماره های مجاز",
			 
//				"لیست دانلودها",
//				"تنظیمات",
//				"تنظیمات وکتور بیت مپی",
//				"پاسخ به شکایت شما",
//				"دانلود نقشه ی وکتوری کل ایران",
//				"دانلود فایل های مسیریابی",
//				"تعیین بزرگنمایی"
				/*
															 * ,
															 * "تنظیمات نمایش"
															 ,*/
				"نظر در مورد برنامه",
				"ارسال برنامه برای دیگران",
				 
//				, "درباره ی ما"
				};
		int[] pics=new int[]{
//				R.drawable.ic_launcher,
				R.drawable.ic_notifications_black_24dp,
				 
//				R.drawable.download,
//				R.drawable.setting,
//				R.drawable.roating_files,
				R.drawable.ic_home_black_24dp,

				R.drawable.ic_dashboard_black_24dp
			 
				};


		private Context context;
		public myListUdapter(Context context) {
			setContext(context);
		}
		@Override
		public int getCount() {
			return captions.length;
		}

		@Override
		public Object getItem(int position) {
			return new MenuTxtLayout(getContext(), captions[position],pics[position],position);
		}

		@Override
		public long getItemId(int position) {
			return 0;
		}
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			if(convertView!=null){
				((MenuTxtLayout)convertView).setdata(captions[position],pics[position],position);
			}
			else
			{
				convertView=new MenuTxtLayout(getContext(),captions[position],pics[position],position);
			}
			return convertView;
		}
		public Context getContext() {
			return context;
		}
		public void setContext(Context context) {
			this.context = context;
		}
	}
}
