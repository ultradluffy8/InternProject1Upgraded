package com.example.internproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.NonNull

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView


class Math_Player : AppCompatActivity() {

    lateinit var youtube_player1 : YouTubePlayerView
    lateinit var youtube_player2 : YouTubePlayerView
    lateinit var youtube_player3 : YouTubePlayerView
    lateinit var youtube_player4 : YouTubePlayerView
    lateinit var youtube_player5 : YouTubePlayerView
    lateinit var youtube_player6 : YouTubePlayerView
    lateinit var youtube_player7 : YouTubePlayerView
    lateinit var youtube_player8 : YouTubePlayerView
    lateinit var youtube_player9 : YouTubePlayerView
    lateinit var txt_title1: TextView
    lateinit var txt_title2:TextView
    lateinit var txt_title3:TextView
    lateinit var txt_title4:TextView
    lateinit var txt_title5:TextView
    lateinit var txt_title6:TextView
    lateinit var txt_title7:TextView
    lateinit var txt_title8:TextView
    lateinit var txt_title9:TextView
    lateinit var str: String



    override fun onCreate(savedInstanceState: Bundle?) {
        super<AppCompatActivity>.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math__player)
        youtube_player1 = findViewById(R.id.youtube_player1)
        youtube_player2 = findViewById(R.id.youtube_player2)
        youtube_player3 = findViewById(R.id.youtube_player3)
        youtube_player4 = findViewById(R.id.youtube_player4)
        youtube_player5 = findViewById(R.id.youtube_player5)
        youtube_player6 = findViewById(R.id.youtube_player6)
        youtube_player7 = findViewById(R.id.youtube_player7)
        youtube_player8 = findViewById(R.id.youtube_player8)
        youtube_player9 = findViewById(R.id.youtube_player9)
        txt_title1 = findViewById(R.id.txt_title1)
        txt_title2 = findViewById(R.id.txt_title1)
        txt_title3 = findViewById(R.id.txt_title1)
        txt_title4 = findViewById(R.id.txt_title1)
        txt_title5 = findViewById(R.id.txt_title1)
        txt_title6 = findViewById(R.id.txt_title1)
        txt_title7 = findViewById(R.id.txt_title1)
        txt_title8 = findViewById(R.id.txt_title1)
        txt_title9 = findViewById(R.id.txt_title1)


        val data_list : ArrayList<math_data> = ArrayList()
        mathData(data_list)
        for(x in data_list){
            val youtubePlayer : YouTubePlayerView = x.youtubePlayer
            val str:String = x.str
            initializingPlayer(youtubePlayer,str)
        }

        txt_title1 = findViewById(R.id.txt_title1)
        str = "You are watching " + intent.getStringExtra("name") + " Videos"



    }
    fun mathData(data_list : ArrayList<math_data>){
        data_list.add(math_data(youtube_player1,"JbhBdOfMEPs"))
        data_list.add(math_data(youtube_player2,"rV7WjNWHOsI"))
        data_list.add(math_data(youtube_player3,"fr04p6Ar9ic"))
        data_list.add(math_data(youtube_player4,"qyW2mWvvtZ8"))
        data_list.add(math_data(youtube_player5,"AkWtUOwlUgs"))
        data_list.add(math_data(youtube_player6,"jC4SWFag6Qw"))
        data_list.add(math_data(youtube_player7,"n9fgcm0Pwgs"))
        data_list.add(math_data(youtube_player8,"-Xt4UDk7Kzw"))
        data_list.add(math_data(youtube_player9,"YFyOsvnr9ig"))
    }

   private fun initializingPlayer(youtubePlayer:YouTubePlayerView , str:String){
        youtubePlayer.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(@NonNull youTubePlayer: YouTubePlayer) {
                val videoId = str
                youTubePlayer.cueVideo(videoId, 0f)
            }
        })
        youtubePlayer.getPlayerUiController().setFullScreenButtonClickListener(View.OnClickListener {
            if (youtubePlayer.isFullScreen()) {
                youtubePlayer.exitFullScreen()
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
                // Show ActionBar
                if (supportActionBar != null) {
                    supportActionBar!!.show()
                }
            } else {
                youtubePlayer.enterFullScreen()
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
                // Hide ActionBar
                if (supportActionBar != null) {
                    supportActionBar!!.hide()
                }
            }
        })
    }


}

