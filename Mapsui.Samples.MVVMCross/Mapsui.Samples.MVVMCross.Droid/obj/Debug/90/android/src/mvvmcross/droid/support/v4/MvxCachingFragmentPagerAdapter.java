package mvvmcross.droid.support.v4;


public abstract class MvxCachingFragmentPagerAdapter
	extends android.support.v4.view.PagerAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V:GetDestroyItem_Landroid_view_ViewGroup_ILjava_lang_Object_Handler\n" +
			"n_finishUpdate:(Landroid/view/ViewGroup;)V:GetFinishUpdate_Landroid_view_ViewGroup_Handler\n" +
			"n_instantiateItem:(Landroid/view/ViewGroup;I)Ljava/lang/Object;:GetInstantiateItem_Landroid_view_ViewGroup_IHandler\n" +
			"n_isViewFromObject:(Landroid/view/View;Ljava/lang/Object;)Z:GetIsViewFromObject_Landroid_view_View_Ljava_lang_Object_Handler\n" +
			"n_restoreState:(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V:GetRestoreState_Landroid_os_Parcelable_Ljava_lang_ClassLoader_Handler\n" +
			"n_saveState:()Landroid/os/Parcelable;:GetSaveStateHandler\n" +
			"n_setPrimaryItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V:GetSetPrimaryItem_Landroid_view_ViewGroup_ILjava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V4.MvxCachingFragmentPagerAdapter, MvvmCross.Droid.Support.Fragment", MvxCachingFragmentPagerAdapter.class, __md_methods);
	}


	public MvxCachingFragmentPagerAdapter ()
	{
		super ();
		if (getClass () == MvxCachingFragmentPagerAdapter.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V4.MvxCachingFragmentPagerAdapter, MvvmCross.Droid.Support.Fragment", "", this, new java.lang.Object[] {  });
	}

	public MvxCachingFragmentPagerAdapter (android.support.v4.app.FragmentManager p0)
	{
		super ();
		if (getClass () == MvxCachingFragmentPagerAdapter.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V4.MvxCachingFragmentPagerAdapter, MvvmCross.Droid.Support.Fragment", "Android.Support.V4.App.FragmentManager, Xamarin.Android.Support.Fragment", this, new java.lang.Object[] { p0 });
	}


	public void destroyItem (android.view.ViewGroup p0, int p1, java.lang.Object p2)
	{
		n_destroyItem (p0, p1, p2);
	}

	private native void n_destroyItem (android.view.ViewGroup p0, int p1, java.lang.Object p2);


	public void finishUpdate (android.view.ViewGroup p0)
	{
		n_finishUpdate (p0);
	}

	private native void n_finishUpdate (android.view.ViewGroup p0);


	public java.lang.Object instantiateItem (android.view.ViewGroup p0, int p1)
	{
		return n_instantiateItem (p0, p1);
	}

	private native java.lang.Object n_instantiateItem (android.view.ViewGroup p0, int p1);


	public boolean isViewFromObject (android.view.View p0, java.lang.Object p1)
	{
		return n_isViewFromObject (p0, p1);
	}

	private native boolean n_isViewFromObject (android.view.View p0, java.lang.Object p1);


	public void restoreState (android.os.Parcelable p0, java.lang.ClassLoader p1)
	{
		n_restoreState (p0, p1);
	}

	private native void n_restoreState (android.os.Parcelable p0, java.lang.ClassLoader p1);


	public android.os.Parcelable saveState ()
	{
		return n_saveState ();
	}

	private native android.os.Parcelable n_saveState ();


	public void setPrimaryItem (android.view.ViewGroup p0, int p1, java.lang.Object p2)
	{
		n_setPrimaryItem (p0, p1, p2);
	}

	private native void n_setPrimaryItem (android.view.ViewGroup p0, int p1, java.lang.Object p2);

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
