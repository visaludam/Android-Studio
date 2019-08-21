package com.example.share

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun gg (v: View){
        when(v.id){
            R.id.button ->{
                var pref = Myper(this@MainActivity)
                var currentScore  = pref.getScore()
                score.text = "Your score is $currentScore"
                currentScore++
                pref.setScore(currentScore)
            }
            R.id.button2 -> {
                var pref = Myper(this@MainActivity)
                var currentScore  = pref.getScore()
                score.text = "Your score is $currentScore"
                currentScore--
                pref.setScore(currentScore)
            }
        }
    }
}
