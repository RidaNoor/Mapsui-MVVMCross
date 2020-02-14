package crc64c5a61f37761d5630;


public class MvxJavaContainer
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Platform.Droid.MvxJavaContainer, MvvmCross.Platform.Droid", MvxJavaContainer.class, __md_methods);
	}


	public MvxJavaContainer ()
	{
		super ();
		if (getClass () == MvxJavaContainer.class)
			mono.android.TypeManager.Activate ("MvvmCross.Platform.Droid.MvxJavaContainer, MvvmCross.Platform.Droid", "", this, new java.lang.Object[] {  });
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
