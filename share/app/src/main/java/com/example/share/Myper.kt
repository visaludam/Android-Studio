package com.example.share

import android.content.Context

class Myper (context: Context) {
    val PREF_NAME = "firstpref"
    val SCORE  = "myscore"
    val pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    fun getScore():Int{
        var score = pref.getInt(SCORE,0)
        return score
    }
    fun setScore(score:Int){
        var editor = pref.edit()
        editor.putInt(SCORE,score)
        editor.apply()
    }
}