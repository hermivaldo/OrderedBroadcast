package com.example.logonrm.orderedbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class MeuReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Log.i("TAG", "Meu receiver")
        var results = getResultExtras(true);
        val extras = results.getString("extras");

    }

}