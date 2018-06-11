package e;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class MenuTxtLayout extends LinearLayout{
	private String str;
	private int pic;
	public int id;
	TextView text;
	ImageView ImageView;
	public void setdata(String str,int pic,int id){
		this.str=str;
		this.pic=pic;
		this.id=id;
		text.setText(str);
		if(pic>0)
			ImageView.setImageResource(pic);
		else
			ImageView.setImageBitmap(null);
	}
	public MenuTxtLayout(Context context,String str,int pic,int id) {
		this(context);
		this.str=str;
		this.pic=pic;
		this.id=id;
		text.setText(str);
		if(pic<=0)
			ImageView.setImageBitmap(null);
		else
			ImageView.setImageResource(pic);
//		Drawable d = getResources().getDrawable(pic);
//		//setBackgroundResource(R.drawable.abc_ab_solid_dark_holo);
//		setCompoundDrawablesWithIntrinsicBounds(null, null, d, null);
		setPadding(5, 5, 5, 5);
	}
	public MenuTxtLayout(Context context) {
		super(context);
		init();
	}

	public MenuTxtLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}


	private void init() {
		text=new TextView(getContext());
		ImageView=new ImageView(getContext());
		addView(text);
		addView(ImageView);
		ImageView.getLayoutParams().height=(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 40, getContext().getResources().getDisplayMetrics());
		ImageView.getLayoutParams().width=(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 40, getContext().getResources().getDisplayMetrics());
		ImageView.setScaleType(ScaleType.FIT_CENTER);
		text.setGravity(Gravity.CENTER|Gravity.RIGHT);
		text.setTextColor(0xffffffff);
		LayoutParams p = ((LayoutParams)text.getLayoutParams());
		p.weight=1;
		p.setMargins(0, 0, (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, getContext().getResources().getDisplayMetrics()), 0);
		setGravity(Gravity.CENTER|Gravity.RIGHT);
	}

	public String getGrp() {
		return str;
	}

	public void setGrp(String str) {
		this.str = str;
	}

	public int getPic() {
		return pic;
	}

	public void setPic(int pic) {
		this.pic = pic;
	}
}
