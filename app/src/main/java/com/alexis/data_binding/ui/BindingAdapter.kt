package com.alexis.data_binding.ui

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.alexis.data_binding.R
import com.alexis.data_binding.domain.Level

@BindingAdapter("app:levelIcon")
fun levelIcon(view: ImageView, level: Level) {
    view.setImageDrawable(getDrawableLevel(level, view.context))
}

@BindingAdapter(value = ["app:progressScaled", "android:max"])
fun setProgressBar(progressBar: ProgressBar, years: Int, maxYear: Int) {
    progressBar.progress = years * (maxYear * 2)
}

@BindingAdapter("app:progressTint")
fun tintPopularity(view: ProgressBar, experience: Int) {
    val color = getAssociatedColor(experience, view.context)
    view.progressTintList = ColorStateList.valueOf(color)
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

private fun getAssociatedColor(experience: Int, context: Context): Int {
    return when (experience) {
        1 -> ContextCompat.getColor(context, R.color.junior)
        2 -> ContextCompat.getColor(context, R.color.junior_middle)
        3 -> ContextCompat.getColor(context, R.color.middle)
        4 -> ContextCompat.getColor(context, R.color.middle_senior)
        5 -> ContextCompat.getColor(context, R.color.senior)
        else -> ContextCompat.getColor(context, R.color.senior_senior)
    }
}