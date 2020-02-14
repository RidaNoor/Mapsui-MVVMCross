package mvvmcross.droid.support.v7.appcompat.widget;


public class MvxAppCompatSpinner
	extends android.support.v7.widget.AppCompatSpinner
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatSpinner, MvvmCross.Droid.Support.V7.AppCompat", MvxAppCompatSpinner.class, __md_methods);
	}


	public MvxAppCompatSpinner (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MvxAppCompatSpinner.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatSpinner, MvvmCross.Droid.Support.V7.AppCompat", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public MvxAppCompatSpinner (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MvxAppCompatSpinner.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatSpinner, MvvmCross.Droid.Support.V7.AppCompat", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public MvxAppCompatSpinner (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MvxAppCompatSpinner.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatSpinner, MvvmCross.Droid.Support.V7.AppCompat", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public MvxAppCompatSpinner (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == MvxAppCompatSpinner.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatSpinner, MvvmCross.Droid.Support.V7.AppCompat", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public MvxAppCompatSpinner (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3, android.content.res.Resources.Theme p4)
	{
		super (p0, p1, p2, p3, p4);
		if (getClass () == MvxAppCompatSpinner.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatSpinner, MvvmCross.Droid.Support.V7.AppCompat", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib:Android.Content.Res.Resources+Theme, Mono.Android", this, new java.lang.Object[] { p0, p1, p2, p3, p4 });
	}


	public MvxAppCompatSpinner (android.content.Context p0, int p1)
	{
		super (p0, p1);
		if (getClass () == MvxAppCompatSpinner.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatSpinner, MvvmCross.Droid.Support.V7.AppCompat", "Android.Content.Context, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1 });
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
