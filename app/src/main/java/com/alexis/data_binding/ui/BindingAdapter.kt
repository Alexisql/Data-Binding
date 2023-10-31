package com.alexis.data_binding.ui

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.alexis.data_binding.R
import com.alexis.data_binding.domain.Level

@BindingAdapter("app:levelIcon")
fun levelIcon(view: ImageView, level: Level) {
    view.setImageDrawable(getDrawableLevel(level, view.context))
}

private fun getDrawableLevel(level: Level, context: Context): Drawable? {
    return when (level) {
        Level.JUNIOR -> {
            ContextCompat.getDrawable(context, R.drawable.ic_junior)
        }

        Level.MIDDLE -> {
            ContextCompat.getDrawable(context, R.drawable.ic_middle)
        }

        Level.SENIOR -> {
            ContextCompat.getDrawable(context, R.drawable.ic_senior)
        }
    }
}