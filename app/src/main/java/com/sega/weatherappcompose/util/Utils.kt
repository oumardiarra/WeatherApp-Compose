package com.sega.weatherappcompose.util

import java.util.*

object Utils {
    fun getShortDate(ts:Long?):String{
        if(ts == null) return ""
        //Get instance of calendar
        val calendar = Calendar.getInstance(Locale.getDefault())
        //get current date from ts
        calendar.timeInMillis = ts
        //return formatted date
        return android.text.format.DateFormat.format("E, dd/MM/yyyy HH:mm:ss", calendar).toString()
    }
}