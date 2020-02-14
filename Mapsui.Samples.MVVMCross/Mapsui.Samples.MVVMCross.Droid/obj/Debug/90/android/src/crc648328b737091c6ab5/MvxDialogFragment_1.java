package crc648328b737091c6ab5;


public abstract class MvxDialogFragment_1
	extends mvvmcross.droid.support.v4.MvxDialogFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V4.MvxDialogFragment`1, MvvmCross.Droid.Support.Fragment", MvxDialogFragment_1.class, __md_methods);
	}


	public MvxDialogFragment_1 ()
	{
		super ();
		if (getClass () == MvxDialogFragment_1.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V4.MvxDialogFragment`1, MvvmCross.Droid.Support.Fragment", "", this, new java.lang.Object[] {  });
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
