package mvvmcross.droid.support.v7.appcompat.widget;


public class MvxAppCompatImageView
	extends android.support.v7.widget.AppCompatImageView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_setMaxHeight:(I)V:GetSetMaxHeight_IHandler\n" +
			"n_setMaxWidth:(I)V:GetSetMaxWidth_IHandler\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatImageView, MvvmCross.Droid.Support.V7.AppCompat", MvxAppCompatImageView.class, __md_methods);
	}


	public MvxAppCompatImageView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MvxAppCompatImageView.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatImageView, MvvmCross.Droid.Support.V7.AppCompat", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public MvxAppCompatImageView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MvxAppCompatImageView.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatImageView, MvvmCross.Droid.Support.V7.AppCompat", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public MvxAppCompatImageView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MvxAppCompatImageView.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatImageView, MvvmCross.Droid.Support.V7.AppCompat", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void setMaxHeight (int p0)
	{
		n_setMaxHeight (p0);
	}

	private native void n_setMaxHeight (int p0);


	public void setMaxWidth (int p0)
	{
		n_setMaxWidth (p0);
	}

	private native void n_setMaxWidth (int p0);

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
