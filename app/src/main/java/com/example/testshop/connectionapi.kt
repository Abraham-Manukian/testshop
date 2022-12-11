package com.example.testshop

import android.app.PendingIntent.getActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

object connectionapi: AppCompatActivity() {
    fun butapi(view: View) {
        val api_text = ""
        val textView = findViewById<TextView>(R.id.textView)
        val queue = Volley.newRequestQueue(this)
        val url = "https://run.mocky.io/v3/654bd15e-b121-49ba-a588-960956b15175"

        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                var api_tex = response
            },
            { })
        queue.add(stringRequest)
    }
}