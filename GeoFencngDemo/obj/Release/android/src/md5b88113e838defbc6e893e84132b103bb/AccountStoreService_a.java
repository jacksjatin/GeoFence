package md5b88113e838defbc6e893e84132b103bb;


public class AccountStoreService_a
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		javax.crypto.SecretKey,
		java.security.Key,
		java.io.Serializable
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getAlgorithm:()Ljava/lang/String;:GetGetAlgorithmHandler:Java.Security.IKeyInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getFormat:()Ljava/lang/String;:GetGetFormatHandler:Java.Security.IKeyInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_getEncoded:()[B:GetGetEncodedHandler:Java.Security.IKeyInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Intersoft.Crosslight.Android.AccountStoreService+a, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", AccountStoreService_a.class, __md_methods);
	}


	public AccountStoreService_a () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AccountStoreService_a.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.AccountStoreService+a, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "", this, new java.lang.Object[] {  });
	}

	public AccountStoreService_a (java.lang.String p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == AccountStoreService_a.class)
			mono.android.TypeManager.Activate ("Intersoft.Crosslight.Android.AccountStoreService+a, Intersoft.Crosslight.Android, Version=5.0.5000.1, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "System.String, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0 });
	}


	public java.lang.String getAlgorithm ()
	{
		return n_getAlgorithm ();
	}

	private native java.lang.String n_getAlgorithm ();


	public java.lang.String getFormat ()
	{
		return n_getFormat ();
	}

	private native java.lang.String n_getFormat ();


	public byte[] getEncoded ()
	{
		return n_getEncoded ();
	}

	private native byte[] n_getEncoded ();

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
