package e;

import android.app.Activity;

import com.arna.testerApp.R;

public class Menubasic {
private Activity activity;
public Menubasic(Activity activity) {
	setActivity(activity);
	init();
}
public void init() {

   // menu.setSelectorDrawable(R.drawable.wikiquote);
}
public Activity getActivity() {
	return activity;
}
public void setActivity(Activity activity) {
	this.activity = activity;
}

}
