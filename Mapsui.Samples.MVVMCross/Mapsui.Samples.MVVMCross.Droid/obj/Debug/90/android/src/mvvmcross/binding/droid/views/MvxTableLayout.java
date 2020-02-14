package mvvmcross.binding.droid.views;


public class MvxTableLayout
	extends android.widget.TableLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Binding.Droid.Views.MvxTableLayout, MvvmCross.Binding.Droid", MvxTableLayout.class, __md_methods);
	}


	public MvxTableLayout (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MvxTableLayout.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxTableLayout, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public MvxTableLayout (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MvxTableLayout.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxTableLayout, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
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
