package crc643f13ae6a553fbc02;


public abstract class MvxDialogFragment_1
	extends mvvmcross.droid.fragments.MvxDialogFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Views.Fragments.MvxDialogFragment`1, MvvmCross.Droid", MvxDialogFragment_1.class, __md_methods);
	}


	public MvxDialogFragment_1 ()
	{
		super ();
		if (getClass () == MvxDialogFragment_1.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Views.Fragments.MvxDialogFragment`1, MvvmCross.Droid", "", this, new java.lang.Object[] {  });
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
