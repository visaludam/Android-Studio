package com.example.ratingbarandvideoviewer

import android.media.session.MediaController
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    var position = 0
    var mediaControls: android.widget.MediaController?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(mediaControls==null){
            mediaControls = android.widget.MediaController(this@MainActivity)
            try{
                videoView.setMediaController(mediaControls)
                videoView.setVideoURI(Uri.parse("android.resource://"+packageName+"/"+R.raw.gg))
            }catch (e:Exception){
                Log.e("Error",e.message)
            }
            videoView.setOnPreparedListener {
                videoView.seekTo(position)
                if(position == 0){
                    videoView.start()
                }
                else{
                    videoView.pause()
                }
            }
        }
    }
    fun clicked(view:View){
        val ratingValue=rB.rating
        Toast.makeText(this,"Your rating is "+ratingValue, Toast.LENGTH_LONG).show()
    }
}

