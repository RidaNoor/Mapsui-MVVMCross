package crc64b76f6e8b2d8c8db1;


public abstract class AbstractAppCompatDialogFragment_1
	extends android.support.v7.app.AppCompatDialogFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSaveInstanceState:(Landroid/os/Bundle;)V:GetOnSaveInstanceState_Landroid_os_Bundle_Handler\n" +
			"n_onCreateDialog:(Landroid/os/Bundle;)Landroid/app/Dialog;:GetOnCreateDialog_Landroid_os_Bundle_Handler\n" +
			"n_onDetach:()V:GetOnDetachHandler\n" +
			"";
		mono.android.Runtime.register ("Acr.UserDialogs.Fragments.AbstractAppCompatDialogFragment`1, Acr.UserDialogs", AbstractAppCompatDialogFragment_1.class, __md_methods);
	}


	public AbstractAppCompatDialogFragment_1 ()
	{
		super ();
		if (getClass () == AbstractAppCompatDialogFragment_1.class)
			mono.android.TypeManager.Activate ("Acr.UserDialogs.Fragments.AbstractAppCompatDialogFragment`1, Acr.UserDialogs", "", this, new java.lang.Object[] {  });
	}


	public void onSaveInstanceState (android.os.Bundle p0)
	{
		n_onSaveInstanceState (p0);
	}

	private native void n_onSaveInstanceState (android.os.Bundle p0);


	public android.app.Dialog onCreateDialog (android.os.Bundle p0)
	{
		return n_onCreateDialog (p0);
	}

	private native android.app.Dialog n_onCreateDialog (android.os.Bundle p0);


	public void onDetach ()
	{
		n_onDetach ();
	}

	private native void n_onDetach ();

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
