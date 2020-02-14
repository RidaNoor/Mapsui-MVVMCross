package mvvmcross.droid.views;


public class MvxTabsFragmentActivity_TabFactory
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.TabHost.TabContentFactory
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_createTabContent:(Ljava/lang/String;)Landroid/view/View;:GetCreateTabContent_Ljava_lang_String_Handler:Android.Widget.TabHost/ITabContentFactoryInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Views.MvxTabsFragmentActivity+TabFactory, MvvmCross.Droid", MvxTabsFragmentActivity_TabFactory.class, __md_methods);
	}


	public MvxTabsFragmentActivity_TabFactory ()
	{
		super ();
		if (getClass () == MvxTabsFragmentActivity_TabFactory.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Views.MvxTabsFragmentActivity+TabFactory, MvvmCross.Droid", "", this, new java.lang.Object[] {  });
	}

	public MvxTabsFragmentActivity_TabFactory (android.content.Context p0)
	{
		super ();
		if (getClass () == MvxTabsFragmentActivity_TabFactory.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Views.MvxTabsFragmentActivity+TabFactory, MvvmCross.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public android.view.View createTabContent (java.lang.String p0)
	{
		return n_createTabContent (p0);
	}

	private native android.view.View n_createTabContent (java.lang.String p0);

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
