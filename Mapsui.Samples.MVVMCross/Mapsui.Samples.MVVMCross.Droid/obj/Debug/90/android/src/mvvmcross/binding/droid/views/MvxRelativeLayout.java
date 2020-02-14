package mvvmcross.binding.droid.views;


public class MvxRelativeLayout
	extends android.widget.RelativeLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Binding.Droid.Views.MvxRelativeLayout, MvvmCross.Binding.Droid", MvxRelativeLayout.class, __md_methods);
	}


	public MvxRelativeLayout (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MvxRelativeLayout.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxRelativeLayout, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public MvxRelativeLayout (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MvxRelativeLayout.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxRelativeLayout, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public MvxRelativeLayout (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MvxRelativeLayout.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxRelativeLayout, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public MvxRelativeLayout (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == MvxRelativeLayout.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxRelativeLayout, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
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
