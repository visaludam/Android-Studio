package com.example.sharereference

import android.content.Context

class Myref (context:Context){
    val Name_Pref = "Pref"
    val MyScore = "SCORE"
    val pref = context.getSharedPreferences(Name_Pref,Context.MODE_PRIVATE)
    fun getScore():Int{
        val score = pref.getInt(MyScore,0)
        return score
    }
    fun setScore(score:Int){
        val editor = pref.edit()
        editor.putInt(MyScore,score)
        editor.apply()
    }
}