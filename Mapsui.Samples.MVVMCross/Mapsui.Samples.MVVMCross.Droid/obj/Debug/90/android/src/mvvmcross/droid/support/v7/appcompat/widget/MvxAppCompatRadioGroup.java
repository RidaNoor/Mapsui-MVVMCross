package mvvmcross.droid.support.v7.appcompat.widget;


public class MvxAppCompatRadioGroup
	extends android.widget.RadioGroup
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatRadioGroup, MvvmCross.Droid.Support.V7.AppCompat", MvxAppCompatRadioGroup.class, __md_methods);
	}


	public MvxAppCompatRadioGroup (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MvxAppCompatRadioGroup.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatRadioGroup, MvvmCross.Droid.Support.V7.AppCompat", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public MvxAppCompatRadioGroup (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MvxAppCompatRadioGroup.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.AppCompat.Widget.MvxAppCompatRadioGroup, MvvmCross.Droid.Support.V7.AppCompat", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
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
