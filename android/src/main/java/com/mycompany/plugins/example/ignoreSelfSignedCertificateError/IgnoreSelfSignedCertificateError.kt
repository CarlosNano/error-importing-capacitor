package com.mycompany.plugins.example.ignoreSelfSignedCertificateError

import com.getcapacitor.Plugin
import com.getcapacitor.PluginCall
import com.getcapacitor.PluginMethod
import com.getcapacitor.annotation.CapacitorPlugin

@CapacitorPlugin(name = "IgnoreSelfSignedCertificateError")
class IgnoreSelfSignedCertificateError : Plugin() {
    @PluginMethod
    fun allowSelfSignedNetworkRequests(call: PluginCall?) {
    }
}