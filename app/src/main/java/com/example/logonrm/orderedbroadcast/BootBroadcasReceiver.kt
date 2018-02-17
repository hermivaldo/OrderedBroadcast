package com.example.logonrm.orderedbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import java.util.logging.Logger

/**
 * Created by logonrm on 17/02/2018.
 */
class BootBroadcasReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Meu texto apenas", Toast.LENGTH_LONG).show();
        Logger.getLogger(BootBroadcasReceiver::class.java.name).warning("O Sistema ja está no ar")
    }
}