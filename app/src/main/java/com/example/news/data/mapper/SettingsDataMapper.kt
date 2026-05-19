package com.example.news.data.mapper

import com.example.news.domain.entity.Interval

fun Int.toInterval(): Interval =
    Interval.entries.first { interval ->
        interval.minutes == this
    }