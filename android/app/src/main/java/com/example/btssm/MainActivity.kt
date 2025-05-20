package com.example.btssm

import android.app.Activity
import android.hardware.usb.UsbDevice
import android.hardware.usb.UsbManager
import com.example.btssm.R
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView

class MainActivity : Activity() {
    private lateinit var logView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logView = findViewById(R.id.logView)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        // TODO: Initialize USB serial connection to Arduino
        // TODO: Parse RomRaider definition file and let user select parameters
    }

    // TODO: Read serial data and update UI
}
