package md5b88113e838defbc6e893e84132b103bb;


public class SearchViewState
	extends md5b88113e838defbc6e893e84132b103bb.ViewState
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Intersoft.Crosslight.Android.SearchViewState, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", SearchViewState.class, __md_methods);
	}


	public SearchViewState () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SearchViewState.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.SearchViewState, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "", this, new java.lang.Object[] {  });
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
