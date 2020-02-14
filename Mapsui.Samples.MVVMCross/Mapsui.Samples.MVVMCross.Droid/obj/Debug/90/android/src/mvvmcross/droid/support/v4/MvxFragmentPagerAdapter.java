package mvvmcross.droid.support.v4;


public class MvxFragmentPagerAdapter
	extends android.support.v4.app.FragmentPagerAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getCount:()I:GetGetCountHandler\n" +
			"n_getItem:(I)Landroid/support/v4/app/Fragment;:GetGetItem_IHandler\n" +
			"n_getPageTitle:(I)Ljava/lang/CharSequence;:GetGetPageTitle_IHandler\n" +
			"n_restoreState:(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V:GetRestoreState_Landroid_os_Parcelable_Ljava_lang_ClassLoader_Handler\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V4.MvxFragmentPagerAdapter, MvvmCross.Droid.Support.Fragment", MvxFragmentPagerAdapter.class, __md_methods);
	}


	public MvxFragmentPagerAdapter (android.support.v4.app.FragmentManager p0)
	{
		super (p0);
		if (getClass () == MvxFragmentPagerAdapter.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V4.MvxFragmentPagerAdapter, MvvmCross.Droid.Support.Fragment", "Android.Support.V4.App.FragmentManager, Xamarin.Android.Support.Fragment", this, new java.lang.Object[] { p0 });
	}


	public int getCount ()
	{
		return n_getCount ();
	}

	private native int n_getCount ();


	public android.support.v4.app.Fragment getItem (int p0)
	{
		return n_getItem (p0);
	}

	private native android.support.v4.app.Fragment n_getItem (int p0);


	public java.lang.CharSequence getPageTitle (int p0)
	{
		return n_getPageTitle (p0);
	}

	private native java.lang.CharSequence n_getPageTitle (int p0);


	public void restoreState (android.os.Parcelable p0, java.lang.ClassLoader p1)
	{
		n_restoreState (p0, p1);
	}

	private native void n_restoreState (android.os.Parcelable p0, java.lang.ClassLoader p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
