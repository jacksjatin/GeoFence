package mono.com.google.android.gms.maps;


public class GoogleMap_OnMapClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnMapClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMapClick:(Lcom/google/android/gms/maps/model/LatLng;)V:GetOnMapClick_Lcom_google_android_gms_maps_model_LatLng_Handler:Android.Gms.Maps.GoogleMap/IOnMapClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnMapClickListenerImplementor, Xamarin.GooglePlayServices.Maps, Version=1.0.0.0, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", GoogleMap_OnMapClickListenerImplementor.class, __md_methods);
	}


	public GoogleMap_OnMapClickListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == GoogleMap_OnMapClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnMapClickListenerImplementor, Xamarin.GooglePlayServices.Maps, Version=1.0.0.0, Culture=neutral, PublicKeyToken=71f3e3261ac778b5", "", this, new java.lang.Object[] {  });
	}


	public void onMapClick (com.google.android.gms.maps.model.LatLng p0)
	{
		n_onMapClick (p0);
	}

	private native void n_onMapClick (com.google.android.gms.maps.model.LatLng p0);

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
