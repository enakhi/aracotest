package e;


import com.arna.testerApp.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;

//import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class SettingsMenu extends Menubasic{
private ViewGroup content;
public ListView menuList;
	public SettingsMenu(Activity activity) {
		super(activity);

		
	}
	public ViewGroup getContent() {
		if(content==null){
			content=(ViewGroup) View.inflate(getActivity(), R.layout.main_menu, null);
			menuList=(ListView) content.findViewById(R.id.menuList);
			menuList.setAdapter(new myListUdapter(getActivity()));
			WindowManager windowManager = (WindowManager) getActivity().getSystemService(Context.WINDOW_SERVICE);
		    int Screenw = windowManager.getDefaultDisplay().getWidth();
		}
		return content;
	}
	public void setContent(ViewGroup content) {
		this.content = content;
	}
	public static final int MENU_ICON=0;
	public static final int MENU_MAKE_IMAGE=1;
	public static final int MENU_ALL=2;
	static class myListUdapter extends BaseAdapter{
		String[] captions=new String[]{};
		int[] pics=new int[]{-1,-1,-1,-1,-1};
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
