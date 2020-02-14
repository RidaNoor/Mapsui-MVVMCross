package crc64fac3ba4494689704;


public class MvxContextWrapper
	extends android.content.ContextWrapper
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getSystemService:(Ljava/lang/String;)Ljava/lang/Object;:GetGetSystemService_Ljava_lang_String_Handler\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Binding.Droid.Views.MvxContextWrapper, MvvmCross.Binding.Droid", MvxContextWrapper.class, __md_methods);
	}


	public MvxContextWrapper (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MvxContextWrapper.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxContextWrapper, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public java.lang.Object getSystemService (java.lang.String p0)
	{
		return n_getSystemService (p0);
	}

	private native java.lang.Object n_getSystemService (java.lang.String p0);

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
