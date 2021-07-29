package com.mycompany.plugins.example.ignoreSelfSignedCertificateError;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "IgnoreSelfSignedCertificateError")
public class IgnoreSelfSignedCertificateError extends Plugin {

    @PluginMethod()
    public void allowSelfSignedNetworkRequests(PluginCall call) {

    }
}
