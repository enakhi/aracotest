package com.arna.testerApp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.arna.Advertise;
import com.arna.manager.views.baners.AdView;
import com.brain.arna.Util;
import com.google.android.gms.ads.AdRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.OneSignal;

import co.ronash.pushe.Pushe;
import e.MainMenu;


public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    Advertise.ShowInterstitialAd(MainActivity.this,null);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };
    private FirebaseAnalytics mFirebaseAnalytics;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.currentTimeMillis();
//        Util.checkCode(this,this,"sadasd");
        Advertise.start(this);

        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
        Pushe.initialize(this,false);
        org.arna.Advertise.beginOfOnCreate(
                "612fc2f1a09808d5aff33640706bcc74",
                "com.arnaway.trafficmap",
                "ca-app-pub-7830181975348510~3011799352",
                "ca-app-pub-7830181975348510/3054007865",
                "ae3c6834482d4043b8273eeb3102bf9a"
                ,"com.ara.illdrugdiclitle",getApplicationContext());
//        org.arna.Advertise.beginOfOnCreate(
//                "612fc2f1a09808d5aff33640706bcc74",
//                "com.arnaway.trafficmap",
//                "ca-app-pub-7830181975348510~3011799352",
//                "ca-app-pub-7830181975348510/3054007865",
//                "ae3c6834482d4043b8273eeb3102bf9a"
//                ,"com.ara.illdrugdiclitle",getApplicationContext());
//        new MainMenu(this) {
//            @Override
//            public void itemselected(int arg2) {
//
//            }
//        }.getMenu().showContent();
//        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
//
//        mFirebaseAnalytics.setCurrentScreen(this, "MainActivity", null /* class override */);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                webView.loadUrl(
                        "javascript:(function() { " +
                                "var element = document.getElementById('hplogo');"
                                + "element.parentNode.removeChild(element);" +
                                "document.getElementByName('q')[0].value = 'fuck';" +
                                "document.getElementsByClassName('Tg7LZd')[0].click();" +
                                "})()");
            }
        });
        webView.loadUrl("https://www.google.com/");
//
//        Advertise.start(getApplicationContext());
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation =  findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

//        new AdverAsync().execute(findViewById(R.id.banner8),findViewById(R.id.banner9),findViewById(R.id.banner10),findViewById(R.id.banner11));

//        org.arna.Advertise.endOfOnCreate(this,this, (AdView) findViewById(R.id.banner8));
//        org.arna.Advertise.endOfOnCreate(this,this, (AdView) findViewById(R.id.banner9));
//        org.arna.Advertise.endOfOnCreate(this,this, (AdView) findViewById(R.id.banner10));
//        org.arna.Advertise.endOfOnCreate(this,this, (AdView) findViewById(R.id.banner11));


        org.arna.Advertise.attachBannerToActivity(this, Advertise.BANNER_MODE_UNDER_VIEWS, null);
//com.google.android.gms.ads.AdView mAdView = findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);
    }
    private class AdverAsync extends AsyncTask<View, View[], View[]>  {

        @Override
        protected View[] doInBackground(View... params) {for (View v:params
                ) {
            try {
                org.arna.Advertise.endOfOnCreate(getApplicationContext(),
                        MainActivity.this, ((com.arna.manager.views.baners.AdView)v),null,
                        org.arna.Advertise.ADMOB
//                        org.arna.Advertise.ADADR
//              ,
//              Advertise.MAGNET
                );


            } catch (Throwable e) {
            }
        }
            return params;
        }

        @Override
        protected void onPostExecute(View[] result) {




//      org.arna.Advertise.endOfOnCreate(getActivity(),
//          getActivity(), ((com.arna.manager.views.baners.AdView)content.findViewById(R.id.bannerid2)),
//          org.arna.Advertise.ADADR,
//          org.arna.Advertise.MAGNET ,
//          org.arna.Advertise.ADMOBR );
//
//      org.arna.Advertise.endOfOnCreate(getActivity(),
//          getActivity(), ((com.arna.manager.views.baners.AdView)content.findViewById(R.id.bannerid3)),
//          org.arna.Advertise.ADMOB,
//          org.arna.Advertise.ADADR ,
//          org.arna.Advertise.MAGNET );
//
//      org.arna.Advertise.endOfOnCreate(getActivity(),
//          getActivity(), ((com.arna.manager.views.baners.AdView)content.findViewById(R.id.bannerid4)),
//          org.arna.Advertise.ADADR,
//          org.arna.Advertise.ADMOB ,
//          org.arna.Advertise.MAGNET );
//
//      org.arna.Advertise.endOfOnCreate(getActivity(),
//          getActivity(), ((com.arna.manager.views.baners.AdView)content.findViewById(R.id.bannerid5)),
//          org.arna.Advertise.ADMOB,
//          org.arna.Advertise.ADADR ,
//          org.arna.Advertise.MAGNET );
//
//      org.arna.Advertise.endOfOnCreate(getActivity(),
//          getActivity(), ((com.arna.manager.views.baners.AdView)content.findViewById(R.id.bannerid6)),
//          org.arna.Advertise.ADMOB,
//          org.arna.Advertise.MAGNET ,
//          org.arna.Advertise.ADADR );
//
//      org.arna.Advertise.endOfOnCreate(getActivity(),
//          getActivity(), ((com.arna.manager.views.baners.AdView)content.findViewById(R.id.bannerid7)),
//          org.arna.Advertise.ADADR,
//          org.arna.Advertise.ADMOB ,
//          org.arna.Advertise.MAGNET );

        }

    }
}
