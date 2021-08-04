package com.mycompany.plugins.example

import com.getcapacitor.*
import com.getcapacitor.annotation.CapacitorPlugin

@CapacitorPlugin(name = "IgnoreSelfSignedCertificateError")
class IgnoreSelfSignedCertificateError : Plugin() {

    @PluginMethod
    fun allowSelfSignedNetworkRequests(call: PluginCall?) {
    }
}