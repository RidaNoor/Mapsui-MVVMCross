package mvvmcross.droid.support.v7.recyclerview;


public class MvxRecyclerAdapter
	extends android.support.v7.widget.RecyclerView.Adapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onViewAttachedToWindow:(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V:GetOnViewAttachedToWindow_Landroid_support_v7_widget_RecyclerView_ViewHolder_Handler\n" +
			"n_onViewDetachedFromWindow:(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V:GetOnViewDetachedFromWindow_Landroid_support_v7_widget_RecyclerView_ViewHolder_Handler\n" +
			"n_onViewRecycled:(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V:GetOnViewRecycled_Landroid_support_v7_widget_RecyclerView_ViewHolder_Handler\n" +
			"n_onCreateViewHolder:(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;:GetOnCreateViewHolder_Landroid_view_ViewGroup_IHandler\n" +
			"n_getItemViewType:(I)I:GetGetItemViewType_IHandler\n" +
			"n_onBindViewHolder:(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V:GetOnBindViewHolder_Landroid_support_v7_widget_RecyclerView_ViewHolder_IHandler\n" +
			"n_getItemCount:()I:GetGetItemCountHandler\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V7.RecyclerView.MvxRecyclerAdapter, MvvmCross.Droid.Support.V7.RecyclerView", MvxRecyclerAdapter.class, __md_methods);
	}


	public MvxRecyclerAdapter ()
	{
		super ();
		if (getClass () == MvxRecyclerAdapter.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V7.RecyclerView.MvxRecyclerAdapter, MvvmCross.Droid.Support.V7.RecyclerView", "", this, new java.lang.Object[] {  });
	}


	public void onViewAttachedToWindow (android.support.v7.widget.RecyclerView.ViewHolder p0)
	{
		n_onViewAttachedToWindow (p0);
	}

	private native void n_onViewAttachedToWindow (android.support.v7.widget.RecyclerView.ViewHolder p0);


	public void onViewDetachedFromWindow (android.support.v7.widget.RecyclerView.ViewHolder p0)
	{
		n_onViewDetachedFromWindow (p0);
	}

	private native void n_onViewDetachedFromWindow (android.support.v7.widget.RecyclerView.ViewHolder p0);


	public void onViewRecycled (android.support.v7.widget.RecyclerView.ViewHolder p0)
	{
		n_onViewRecycled (p0);
	}

	private native void n_onViewRecycled (android.support.v7.widget.RecyclerView.ViewHolder p0);


	public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder (android.view.ViewGroup p0, int p1)
	{
		return n_onCreateViewHolder (p0, p1);
	}

	private native android.support.v7.widget.RecyclerView.ViewHolder n_onCreateViewHolder (android.view.ViewGroup p0, int p1);


	public int getItemViewType (int p0)
	{
		return n_getItemViewType (p0);
	}

	private native int n_getItemViewType (int p0);


	public void onBindViewHolder (android.support.v7.widget.RecyclerView.ViewHolder p0, int p1)
	{
		n_onBindViewHolder (p0, p1);
	}

	private native void n_onBindViewHolder (android.support.v7.widget.RecyclerView.ViewHolder p0, int p1);


	public int getItemCount ()
	{
		return n_getItemCount ();
	}

	private native int n_getItemCount ();

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
