package mvvmcross.binding.droid.views;


public class MvxSpinner
	extends android.widget.Spinner
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Binding.Droid.Views.MvxSpinner, MvvmCross.Binding.Droid", MvxSpinner.class, __md_methods);
	}


	public MvxSpinner (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MvxSpinner.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxSpinner, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public MvxSpinner (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MvxSpinner.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxSpinner, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public MvxSpinner (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MvxSpinner.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxSpinner, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public MvxSpinner (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == MvxSpinner.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxSpinner, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:Android.Widget.SpinnerMode, Mono.Android", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public MvxSpinner (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3, int p4)
	{
		super (p0, p1, p2, p3, p4);
		if (getClass () == MvxSpinner.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxSpinner, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib:Android.Widget.SpinnerMode, Mono.Android", this, new java.lang.Object[] { p0, p1, p2, p3, p4 });
	}


	public MvxSpinner (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3, int p4, android.content.res.Resources.Theme p5)
	{
		super (p0, p1, p2, p3, p4, p5);
		if (getClass () == MvxSpinner.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxSpinner, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib:Android.Widget.SpinnerMode, Mono.Android:Android.Content.Res.Resources+Theme, Mono.Android", this, new java.lang.Object[] { p0, p1, p2, p3, p4, p5 });
	}


	public MvxSpinner (android.content.Context p0, int p1)
	{
		super (p0, p1);
		if (getClass () == MvxSpinner.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxSpinner, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Widget.SpinnerMode, Mono.Android", this, new java.lang.Object[] { p0, p1 });
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
