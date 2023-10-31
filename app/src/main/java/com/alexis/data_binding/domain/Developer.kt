package com.alexis.data_binding.domain

data class Developer(val name: String, var yearsExperience: Int = 0) {
    val level: Level
        get() = when (yearsExperience) {
            in 0..2 -> Level.JUNIOR
            in 3..5 -> Level.MIDDLE
            else -> Level.SENIOR
        }
}

