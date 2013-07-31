package activities;

import java.util.ArrayList;

import net.simonvt.menudrawer.MenuDrawer;
import net.simonvt.menudrawer.MenuDrawer.OnDrawerStateChangeListener;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;

import food.sibgurman.R;

public class MainActivity extends SherlockFragmentActivity
{
	TextView menuView;
	ViewPager mViewPager;
    MenuDrawer mDrawer;
    TabsAdapter mTabsAdapter;
    TextView mContentTextView;
    TextView tabCenter, tabText;

 @Override
 	public void onCreate(Bundle savedInstanceState)
 	{
	 super.onCreate(savedInstanceState);
	 	 
	 mViewPager = new ViewPager(this);
	 mViewPager.setId(R.id.pager);
	 mViewPager.setBackgroundColor(Color.argb(255, 255, 255, 255));
	 
	 mDrawer = MenuDrawer.attach(this);
     
     menuView = new TextView(this);
     menuView.setTextColor(0xFFFFFFFF);
     menuView.setText("As the drawer opens, the drawer indicator icon becomes smaller.");
     
     // The drawable that replaces the up indicator in the action bar
     mDrawer.setSlideDrawable(R.drawable.ic_drawer);
     // Whether the previous drawable should be shown
     mDrawer.setDrawerIndicatorEnabled(true);
	 
	 
	 ActionBar bar = getSupportActionBar();
	 bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
	 mTabsAdapter = new TabsAdapter(this, mViewPager);	 
	 mTabsAdapter.addTab(bar.newTab().setText("Пельмени"), FragmentOne.class, null);
	 mTabsAdapter.addTab(bar.newTab().setText("Блины"), FragmentTwo.class, null);
	 mTabsAdapter.addTab(bar.newTab().setText("Супы"), FragmentThree.class, null); 
	 
	 mDrawer.setContentView(mViewPager);
	 mDrawer.setMenuView(menuView);
     
 	}
 

 @Override
 public boolean onOptionsItemSelected(MenuItem item) {
     switch (item.getItemId()) {
         case android.R.id.home:
        	 
        	 mDrawer.toggleMenu();
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
	

	
}
