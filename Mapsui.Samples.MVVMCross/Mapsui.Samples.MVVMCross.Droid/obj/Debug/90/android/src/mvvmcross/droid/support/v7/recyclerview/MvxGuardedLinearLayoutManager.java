package mvvmcross.droid.support.v7.recyclerview;


public class MvxGuardedLinearLayoutManager
	extends android.support.v7.widget.LinearLayoutManager
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLayoutChildren:(Landroid/support/v7/widget/RecyclerView$Recycler;Landroid/support/v7/widget/RecyclerView$State;)V:GetOnLayoutChildren_Landroid_support_v7_widget_RecyclerView_Recycler_Landroid_support_v7_widget_RecyclerView_State_Handler\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V7.RecyclerView.MvxGuardedLinearLayoutManager, MvvmCross.Droid.Support.V7.RecyclerView", MvxGuardedLinearLayoutManager.class, __md_methods);
	}


	public MvxGuardedLinearLayoutManager (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MvxGuardedLinearLayoutManager.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.RecyclerView.MvxGuardedLinearLayoutManager, MvvmCross.Droid.Support.V7.RecyclerView", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public MvxGuardedLinearLayoutManager (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == MvxGuardedLinearLayoutManager.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.RecyclerView.MvxGuardedLinearLayoutManager, MvvmCross.Droid.Support.V7.RecyclerView", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public MvxGuardedLinearLayoutManager (android.content.Context p0, int p1, boolean p2)
	{
		super (p0, p1, p2);
		if (getClass () == MvxGuardedLinearLayoutManager.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.RecyclerView.MvxGuardedLinearLayoutManager, MvvmCross.Droid.Support.V7.RecyclerView", "Android.Content.Context, Mono.Android:System.Int32, mscorlib:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void onLayoutChildren (android.support.v7.widget.RecyclerView.Recycler p0, android.support.v7.widget.RecyclerView.State p1)
	{
		n_onLayoutChildren (p0, p1);
	}

	private native void n_onLayoutChildren (android.support.v7.widget.RecyclerView.Recycler p0, android.support.v7.widget.RecyclerView.State p1);

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
