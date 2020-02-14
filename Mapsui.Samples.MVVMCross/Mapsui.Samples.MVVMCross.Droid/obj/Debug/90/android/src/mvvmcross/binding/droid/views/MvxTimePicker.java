package mvvmcross.binding.droid.views;


public class MvxTimePicker
	extends android.widget.TimePicker
	implements
		mono.android.IGCUserPeer,
		android.widget.TimePicker.OnTimeChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTimeChanged:(Landroid/widget/TimePicker;II)V:GetOnTimeChanged_Landroid_widget_TimePicker_IIHandler:Android.Widget.TimePicker/IOnTimeChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Binding.Droid.Views.MvxTimePicker, MvvmCross.Binding.Droid", MvxTimePicker.class, __md_methods);
	}


	public MvxTimePicker (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MvxTimePicker.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxTimePicker, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public MvxTimePicker (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MvxTimePicker.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxTimePicker, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public MvxTimePicker (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MvxTimePicker.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxTimePicker, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public MvxTimePicker (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == MvxTimePicker.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxTimePicker, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void onTimeChanged (android.widget.TimePicker p0, int p1, int p2)
	{
		n_onTimeChanged (p0, p1, p2);
	}

	private native void n_onTimeChanged (android.widget.TimePicker p0, int p1, int p2);

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
