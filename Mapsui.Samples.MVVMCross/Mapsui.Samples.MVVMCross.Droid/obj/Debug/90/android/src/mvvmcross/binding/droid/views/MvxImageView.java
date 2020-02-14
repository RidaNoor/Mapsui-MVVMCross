package mvvmcross.binding.droid.views;


public class MvxImageView
	extends android.widget.ImageView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_setMaxHeight:(I)V:GetSetMaxHeight_IHandler\n" +
			"n_setMaxWidth:(I)V:GetSetMaxWidth_IHandler\n" +
			"n_setImageBitmap:(Landroid/graphics/Bitmap;)V:GetSetImageBitmap_Landroid_graphics_Bitmap_Handler\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Binding.Droid.Views.MvxImageView, MvvmCross.Binding.Droid", MvxImageView.class, __md_methods);
	}


	public MvxImageView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MvxImageView.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxImageView, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public MvxImageView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MvxImageView.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxImageView, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public MvxImageView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MvxImageView.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxImageView, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public MvxImageView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == MvxImageView.class)
			mono.android.TypeManager.Activate ("MvvmCross.Binding.Droid.Views.MvxImageView, MvvmCross.Binding.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
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


	public void setImageBitmap (android.graphics.Bitmap p0)
	{
		n_setImageBitmap (p0);
	}

	private native void n_setImageBitmap (android.graphics.Bitmap p0);

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
