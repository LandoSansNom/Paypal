package com.cherlan.paypaltest

import android.app.Application
import com.paypal.checkout.PayPalCheckout
import com.paypal.checkout.config.CheckoutConfig
import com.paypal.checkout.config.Environment
import com.paypal.checkout.config.SettingsConfig
import com.paypal.checkout.createorder.CurrencyCode
import com.paypal.checkout.createorder.UserAction
import com.paypal.pyplcheckout.BuildConfig

class App: Application(){

    var clientId = "AXdENlfbQRm1tMnBBXaDLhM2xcmgCbxBKAkcnTpl0vcohOfPOaDWd6YVAX1MF5JHyV-Jrs_PyhNZ7LSO"
    var returnUrl = "com.cherlan.paypaltest://paypalpay"
    override fun onCreate() {
        super.onCreate()
        val config = CheckoutConfig(
            application = this,
            clientId = clientId,
            environment = Environment.SANDBOX,
            returnUrl = returnUrl,
            currencyCode = CurrencyCode.USD,
            userAction = UserAction.PAY_NOW,
            settingsConfig = SettingsConfig(
                loggingEnabled = true
            )
        )
        PayPalCheckout.setConfig(config)
    }
}