package md5b88113e838defbc6e893e84132b103bb;


public abstract class ListActivity_2
	extends md5b88113e838defbc6e893e84132b103bb.ListActivity_1
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Intersoft.Crosslight.Android.ListActivity`2, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", ListActivity_2.class, __md_methods);
	}


	public ListActivity_2 () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ListActivity_2.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.ListActivity`2, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "", this, new java.lang.Object[] {  });
	}

	public ListActivity_2 (int p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == ListActivity_2.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.ListActivity`2, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0 });
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
