package mvvmcross.droid.support.v7.recyclerview;


public class MvxRecyclerViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V7.RecyclerView.MvxRecyclerViewHolder, MvvmCross.Droid.Support.V7.RecyclerView", MvxRecyclerViewHolder.class, __md_methods);
	}


	public MvxRecyclerViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == MvxRecyclerViewHolder.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.RecyclerView.MvxRecyclerViewHolder, MvvmCross.Droid.Support.V7.RecyclerView", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
