package com.example.day10_webview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webViewVariable = findViewById<WebView>(R.id.webView)
        webViewSetup(webViewVariable)
    }
    @RequiresApi(Build.VERSION_CODES.O)
//                              name  type
    private fun webViewSetup(a: WebView) {

            a.webViewClient = WebViewClient()
            a.apply {
                settings.javaScriptEnabled = true
                settings.safeBrowsingEnabled = true
                loadUrl("https://github.com/Ajay-2022-Soft-Tech")
        }

    }

}
