package com.example.notification

import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

open class FirebaseMessagingService : FirebaseMessagingService() {

    private val tag = "FirebaseMessagingServ"
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        Log.i(tag, remoteMessage.from.toString())

        if (remoteMessage.notification != null) {
            this.showNotification("1234",
                remoteMessage.notification?.title.toString(),
                remoteMessage.notification?.body.toString())
        }
    }
}