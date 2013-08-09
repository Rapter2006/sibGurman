package activities;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.TextView;
import classes.AllProducts;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;

import food.sibgurman.R;


public class MainActivity extends SherlockFragmentActivity
{
	TextView menuView;
	public static int pusitionItem;
	public static int className;
	public static ListView ls; // отвечает за продукты
	public static ListView lv; //отвечает за бренды
	ViewPager mViewPager;
    TabsAdapter mTabsAdapter;
    TextView mContentTextView;
    TextView tabCenter, tabText;
 @Override
 	public void onCreate(Bundle savedInstanceState)
 	{
	 super.onCreate(savedInstanceState);
	 getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	            WindowManager.LayoutParams.FLAG_FULLSCREEN);	 
	 mViewPager = new ViewPager(this);
	 
	 mViewPager.setId(R.id.pager);
	 mViewPager.setBackgroundColor(Color.argb(255, 255, 255, 255));
	
	 ActionBar bar = getSupportActionBar();
	 bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
	 mTabsAdapter = new TabsAdapter(this, mViewPager);
	
	 AllProducts.initAll();

	 mTabsAdapter.addTab(bar.newTab().setText("Пельмени/Хинкали"), Pelmens.class, null);
	 mTabsAdapter.addTab(bar.newTab().setText("Блины"), Pancakes.class, null);
     mTabsAdapter.addTab(bar.newTab().setText("Вареники"), Dumplings.class, null); 
	 mTabsAdapter.addTab(bar.newTab().setText("Тесто"), Dough.class, null);
	 mTabsAdapter.addTab(bar.newTab().setText("Супы"), Soups.class, null);
	 mTabsAdapter.addTab(bar.newTab().setText("Котлеты"), Chops.class, null);

	 setContentView(mViewPager);
	}
 


@Override
 public boolean onOptionsItemSelected(MenuItem item) {
     switch (item.getItemId()) {
         case android.R.id.home:
        	 
//        	 mDrawer.toggleMenu();
             break;
     }

     return super.onOptionsItemSelected(item);
 }
 
  public static class TabsAdapter extends FragmentPagerAdapter implements
 		ActionBar.TabListener, ViewPager.OnPageChangeListener
 	{
 		private final Context mContext;
 		private final ActionBar mActionBar;
 		private final ViewPager mViewPager;
 		private final ArrayList<TabInfo> mTabs = new ArrayList<TabInfo>();

 		static final class TabInfo
 		{
 			private final Class<?> clss;
 			private final Bundle args;

 			TabInfo(Class<?> _class, Bundle _args)
 			{
 				clss = _class;
 				args = _args;
 			}
 }

  public TabsAdapter(SherlockFragmentActivity activity, ViewPager pager)
  {
   super(activity.getSupportFragmentManager());
   mContext = activity;
   mActionBar = activity.getSupportActionBar();
   mViewPager = pager;
   mViewPager.setAdapter(this);
   mViewPager.setOnPageChangeListener(this);
  }

  public void addTab(ActionBar.Tab tab, Class<?> clss, Bundle args)
  {
   TabInfo info = new TabInfo(clss, args);
   tab.setTag(info);
   tab.setTabListener(this);
   mTabs.add(info);
   mActionBar.addTab(tab);
   notifyDataSetChanged();
  }

  @Override
  public int getCount()
  {
   return mTabs.size();
  }

  @Override
  public Fragment getItem(int position)
  {
   TabInfo info = mTabs.get(position); 
   return Fragment.instantiate(mContext, info.clss.getName(),
     info.args);
  }

  public void onPageScrolled(int position, float positionOffset,
    int positionOffsetPixels)
  {
  }

  public void onPageSelected(int position)
  {
	 
	  mActionBar.setSelectedNavigationItem(position);
  }

  public void onPageScrollStateChanged(int state)
  {
  }

  public void onTabSelected(Tab tab, FragmentTransaction ft)
  {
  if (ls != null)
	   MainActivity.ls.setVisibility(View.VISIBLE);
  if (lv != null)
	  MainActivity.lv.setVisibility(View.INVISIBLE);	  
   Object tag = tab.getTag();
   for (int i = 0; i < mTabs.size(); i++)
   {
    if (mTabs.get(i) == tag)
    {
     mViewPager.setCurrentItem(i);
    }
   }
  }

  public void onTabUnselected(Tab tab, FragmentTransaction ft)
  {
  }

  public void onTabReselected(Tab tab, FragmentTransaction ft)
  {
  }
 }
  
  public void onBackPressed() {
	  super.onBackPressed();
	  if (lv != null) MainActivity.lv.setVisibility(View.INVISIBLE);	
	  if (ls != null) MainActivity.ls.setVisibility(View.VISIBLE);
  	               
  }

}
