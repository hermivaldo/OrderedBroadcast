package com.example.logonrm.orderedbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var receiver: BroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.eventoPower()
        btEnviar.setOnClickListener{
            sendBroadcast(Intent("MeuOrderBroadcast"))
        }
    }

    private fun eventoPower(){
        var filter = IntentFilter()
        filter.addAction(Intent.ACTION_POWER_CONNECTED)
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED)

        this.receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {

                when (intent?.action){
                    Intent.ACTION_POWER_CONNECTED -> tvUSB.text = "CONECTADO"
                    Intent.ACTION_POWER_DISCONNECTED -> tvUSB.text = "DESCONECTADO"
                }
            }
        }
        registerReceiver(receiver, filter)

    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
