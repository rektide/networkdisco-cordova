package com.voodoowarez.cordova.networkdisco;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.net.nsd.NsdManager.DiscoveryListener;

public class NetworkDiscoPlugin extends CordovaPlugin {

	DiscoveryListener listener = null;

	public NetworkDiscoPlugin() {
	}

	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
	}

	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if (action.equals("upnp")) {
			PluginResult result = new PluginResult(PluginResult.Status.OK, new JSONObject());
			callbackContext.sendPluginResult(result);
			return true;
		} else if (action.equals("zeroconf")) {
			PluginResult result = new PluginResult(PluginResult.Status.OK, new JSONObject());
			callbackContext.sendPluginResult(result);
			return true;
		}
		return false;
	}
}
