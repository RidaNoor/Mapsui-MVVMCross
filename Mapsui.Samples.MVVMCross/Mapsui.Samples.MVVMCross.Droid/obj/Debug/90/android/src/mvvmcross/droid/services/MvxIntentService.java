package mvvmcross.droid.services;


public abstract class MvxIntentService
	extends mono.android.app.IntentService
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onHandleIntent:(Landroid/content/Intent;)V:GetOnHandleIntent_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Services.MvxIntentService, MvvmCross.Droid", MvxIntentService.class, __md_methods);
	}


	public MvxIntentService (java.lang.String p0)
	{
		super (p0);
		if (getClass () == MvxIntentService.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Services.MvxIntentService, MvvmCross.Droid", "System.String, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public MvxIntentService ()
	{
		super ();
		if (getClass () == MvxIntentService.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Services.MvxIntentService, MvvmCross.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onHandleIntent (android.content.Intent p0)
	{
		n_onHandleIntent (p0);
	}

	private native void n_onHandleIntent (android.content.Intent p0);

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
