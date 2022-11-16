package com.example.testshop

import android.app.Notification.BigPictureStyle
import android.icu.text.CaseMap.Title

data class apimain (
    val id: Int,
    val is_new: Boolean,
    val title: String,
    val subtitle: String,
    val picture: String,
    val is_buy : Boolean
)

