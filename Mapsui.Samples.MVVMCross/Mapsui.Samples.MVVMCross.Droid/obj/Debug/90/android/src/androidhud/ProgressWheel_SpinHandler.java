package androidhud;


public class ProgressWheel_SpinHandler
	extends android.os.Handler
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_handleMessage:(Landroid/os/Message;)V:GetHandleMessage_Landroid_os_Message_Handler\n" +
			"";
		mono.android.Runtime.register ("AndroidHUD.ProgressWheel+SpinHandler, AndHUD", ProgressWheel_SpinHandler.class, __md_methods);
	}


	public ProgressWheel_SpinHandler ()
	{
		super ();
		if (getClass () == ProgressWheel_SpinHandler.class)
			mono.android.TypeManager.Activate ("AndroidHUD.ProgressWheel+SpinHandler, AndHUD", "", this, new java.lang.Object[] {  });
	}


	public ProgressWheel_SpinHandler (android.os.Handler.Callback p0)
	{
		super (p0);
		if (getClass () == ProgressWheel_SpinHandler.class)
			mono.android.TypeManager.Activate ("AndroidHUD.ProgressWheel+SpinHandler, AndHUD", "Android.OS.Handler+ICallback, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public ProgressWheel_SpinHandler (android.os.Looper p0)
	{
		super (p0);
		if (getClass () == ProgressWheel_SpinHandler.class)
			mono.android.TypeManager.Activate ("AndroidHUD.ProgressWheel+SpinHandler, AndHUD", "Android.OS.Looper, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public ProgressWheel_SpinHandler (android.os.Looper p0, android.os.Handler.Callback p1)
	{
		super (p0, p1);
		if (getClass () == ProgressWheel_SpinHandler.class)
			mono.android.TypeManager.Activate ("AndroidHUD.ProgressWheel+SpinHandler, AndHUD", "Android.OS.Looper, Mono.Android:Android.OS.Handler+ICallback, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public void handleMessage (android.os.Message p0)
	{
		n_handleMessage (p0);
	}

	private native void n_handleMessage (android.os.Message p0);

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
