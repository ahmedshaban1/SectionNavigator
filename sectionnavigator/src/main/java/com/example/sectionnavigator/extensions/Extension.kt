package com.example.sectionnavigator.extensions

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat


fun View.gone() {
    if (visibility != View.GONE) {
        visibility = View.GONE
    }
}


fun View.visible() {
    if (visibility != View.VISIBLE) {
        visibility = View.VISIBLE
    }
}

fun View.invisible() {
    if (visibility != View.INVISIBLE) {
        visibility = View.INVISIBLE
    }
}

fun ViewGroup.inflate(id: Int): View {
    return LayoutInflater.from(context).inflate(id, this, false)
}

fun Context.toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}


fun Context.getColorRes(resId: Int): Int {
    return ContextCompat.getColor(this, resId)
}

fun Context.dp(dp: Int): Int = (dp * resources.displayMetrics.density).toInt()

