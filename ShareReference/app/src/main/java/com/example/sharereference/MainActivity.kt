package com.example.sharereference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun gg(v: View){
        when(v.id){
            R.id.b1->{
                var ref =Myref(this@MainActivity)
                var currentScore = ref.getScore()
                score.text = "Your score is $currentScore"
                currentScore++
                ref.setScore(currentScore)
            }
            R.id.b2->{
                var ref = Myref(this)
                var currentScore = ref.getScore()
                score.text = "Your score is $currentScore"
                currentScore--
                ref.setScore(currentScore)
            }
        }
    }
}
