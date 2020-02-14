package mvvmcross.droid.support.v7.appcompat.widget;


public class MvxAppCompatAutoCompleteTextView
	extends android.support.v7.widget.AppCompatAutoCompleteTextView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatAutoCompleteTextView, MvvmCross.Droid.Support.V7.AppCompat", MvxAppCompatAutoCompleteTextView.class, __md_methods);
	}


	public MvxAppCompatAutoCompleteTextView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MvxAppCompatAutoCompleteTextView.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatAutoCompleteTextView, MvvmCross.Droid.Support.V7.AppCompat", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public MvxAppCompatAutoCompleteTextView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MvxAppCompatAutoCompleteTextView.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatAutoCompleteTextView, MvvmCross.Droid.Support.V7.AppCompat", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public MvxAppCompatAutoCompleteTextView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MvxAppCompatAutoCompleteTextView.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatAutoCompleteTextView, MvvmCross.Droid.Support.V7.AppCompat", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
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
