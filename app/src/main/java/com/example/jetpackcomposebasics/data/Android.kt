package com.example.jetpackcomposebasics.data

import com.example.jetpackcomposebasics.R


data class Android(
    val versionName: String,
    val versionNumber: Double,
    val released_year: Int,
    val image: Int
)

fun getAndroidList() = listOf(
    Android("Cupcake", 1.5, 2009, R.drawable.download),
    Android("Donut", 1.6, 2009, R.drawable.download),
    Android("Eclair", 1.5, 2009, R.drawable.download),
    Android("Froyo", 2.2, 2010, R.drawable.download),
    Android("Gingerbread", 2.3, 2010, R.drawable.download),
    Android("Honeycomb", 3.0, 2011, R.drawable.download),
    Android("Ice Cream Sandwich", 4.0, 2011, R.drawable.download),
    Android("Jelly Bean", 4.1, 2012, R.drawable.download),
    Android("KitKat", 4.4, 2013, R.drawable.download),
    Android("Lollipop", 5.0, 2014, R.drawable.download),
    Android("Marshmallow", 6.0, 2015, R.drawable.download),
    Android("Nougat", 7.0, 2016, R.drawable.download),
    Android("Oreo", 8.0, 2017, R.drawable.download),
    Android("Pie", 9.0, 2018, R.drawable.download),
    Android("Android 10 (Q)", 10.0, 2019, R.drawable.download),
    Android("Android 11", 11.0, 2020, R.drawable.download),
    Android("Android 12", 11.0, 2021, R.drawable.download),
    Android("Android 13", 11.0, 2022, R.drawable.download)

)