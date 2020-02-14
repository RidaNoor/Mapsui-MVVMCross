package mvvmcross.droid.support.v4;


public abstract class MvxTabsFragmentActivity
	extends mvvmcross.droid.support.v4.MvxFragmentActivity
	implements
		mono.android.IGCUserPeer,
		android.widget.TabHost.OnTabChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_setContentView:(I)V:GetSetContentView_IHandler\n" +
			"n_onSaveInstanceState:(Landroid/os/Bundle;)V:GetOnSaveInstanceState_Landroid_os_Bundle_Handler\n" +
			"n_onTabChanged:(Ljava/lang/String;)V:GetOnTabChanged_Ljava_lang_String_Handler:Android.Widget.TabHost/IOnTabChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V4.MvxTabsFragmentActivity, MvvmCross.Droid.Support.Fragment", MvxTabsFragmentActivity.class, __md_methods);
	}


	public MvxTabsFragmentActivity ()
	{
		super ();
		if (getClass () == MvxTabsFragmentActivity.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V4.MvxTabsFragmentActivity, MvvmCross.Droid.Support.Fragment", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void setContentView (int p0)
	{
		n_setContentView (p0);
	}

	private native void n_setContentView (int p0);


	public void onSaveInstanceState (android.os.Bundle p0)
	{
		n_onSaveInstanceState (p0);
	}

	private native void n_onSaveInstanceState (android.os.Bundle p0);


	public void onTabChanged (java.lang.String p0)
	{
		n_onTabChanged (p0);
	}

	private native void n_onTabChanged (java.lang.String p0);

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
