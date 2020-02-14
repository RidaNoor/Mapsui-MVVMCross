package mvvmcross.droid.support.v4;


public class MvxCachingFragmentStatePagerAdapter
	extends mvvmcross.droid.support.v4.MvxCachingFragmentPagerAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getCount:()I:GetGetCountHandler\n" +
			"n_getItemPosition:(Ljava/lang/Object;)I:GetGetItemPosition_Ljava_lang_Object_Handler\n" +
			"n_getPageTitle:(I)Ljava/lang/CharSequence;:GetGetPageTitle_IHandler\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V4.MvxCachingFragmentStatePagerAdapter, MvvmCross.Droid.Support.Fragment", MvxCachingFragmentStatePagerAdapter.class, __md_methods);
	}


	public MvxCachingFragmentStatePagerAdapter ()
	{
		super ();
		if (getClass () == MvxCachingFragmentStatePagerAdapter.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V4.MvxCachingFragmentStatePagerAdapter, MvvmCross.Droid.Support.Fragment", "", this, new java.lang.Object[] {  });
	}

	public MvxCachingFragmentStatePagerAdapter (android.support.v4.app.FragmentManager p0)
	{
		super ();
		if (getClass () == MvxCachingFragmentStatePagerAdapter.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V4.MvxCachingFragmentStatePagerAdapter, MvvmCross.Droid.Support.Fragment", "Android.Support.V4.App.FragmentManager, Xamarin.Android.Support.Fragment", this, new java.lang.Object[] { p0 });
	}


	public int getCount ()
	{
		return n_getCount ();
	}

	private native int n_getCount ();


	public int getItemPosition (java.lang.Object p0)
	{
		return n_getItemPosition (p0);
	}

	private native int n_getItemPosition (java.lang.Object p0);


	public java.lang.CharSequence getPageTitle (int p0)
	{
		return n_getPageTitle (p0);
	}

	private native java.lang.CharSequence n_getPageTitle (int p0);

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
