package crc64fac3ba4494689704;


public class MvxAdapter_1
	extends crc64fac3ba4494689704.MvxAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Binding.Droid.Views.MvxAdapter`1, MvvmCross.Binding.Droid", MvxAdapter_1.class, __md_methods);
	}


	public MvxAdapter_1 ()
	{
		super ();
		if (getClass () == MvxAdapter_1.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxAdapter`1, MvvmCross.Binding.Droid", "", this, new java.lang.Object[] {  });
	}

	public MvxAdapter_1 (android.content.Context p0)
	{
		super ();
		if (getClass () == MvxAdapter_1.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxAdapter`1, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}

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
