package md59ad6b75bc832b296b6784609cfbe7e98;


public class WebAuthenticatorActivity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onBackPressed:()V:GetOnBackPressedHandler\n" +
			"n_onRetainNonConfigurationInstance:()Ljava/lang/Object;:GetOnRetainNonConfigurationInstanceHandler\n" +
			"n_onSaveInstanceState:(Landroid/os/Bundle;)V:GetOnSaveInstanceState_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Auth._MobileServices.WebAuthenticatorActivity, Microsoft.WindowsAzure.Mobile.Ext, Version=2.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35", WebAuthenticatorActivity.class, __md_methods);
	}


	public WebAuthenticatorActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == WebAuthenticatorActivity.class)
			mono.android.TypeManager.Activate ("Xamarin.Auth._MobileServices.WebAuthenticatorActivity, Microsoft.WindowsAzure.Mobile.Ext, Version=2.1.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onBackPressed ()
	{
		n_onBackPressed ();
	}

	private native void n_onBackPressed ();


	public java.lang.Object onRetainNonConfigurationInstance ()
	{
		return n_onRetainNonConfigurationInstance ();
	}

	private native java.lang.Object n_onRetainNonConfigurationInstance ();


	public void onSaveInstanceState (android.os.Bundle p0)
	{
		n_onSaveInstanceState (p0);
	}

	private native void n_onSaveInstanceState (android.os.Bundle p0);

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
