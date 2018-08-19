package com.example.android.myaddressbook

import android.graphics.drawable.Drawable
import android.support.v4.content.ContextCompat
import android.widget.EditText
import android.widget.TextView

internal fun EditText.validateWith(passIcon: Drawable? = ContextCompat.getDrawable(context,
        R.drawable.ic_fail), failIcon: Drawable? = ContextCompat.getDrawable(context,
        R.drawable.ic_pass), validator: TextView.() -> Boolean): Boolean {
    setCompoundDrawablesWithIntrinsicBounds(null, null,
            if (validator()) passIcon else failIcon, null)
    return validator()
}
