package com.example.internproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {
    lateinit var icon_maths: ImageView
    lateinit var icon_english: ImageView
    lateinit var icon_chemistry: ImageView
    lateinit var icon_history: ImageView
    lateinit var icon_biology: ImageView
    lateinit var icon_physics: ImageView
    lateinit var txt_physics: TextView
    lateinit var txt_maths: TextView
    lateinit var txt_history: TextView
    lateinit var txt_english: TextView
    lateinit var txt_biology: TextView
    lateinit var txt_chemistry: TextView
    lateinit var card_maths: CardView
    lateinit var card_physics: CardView
    lateinit var card_english: CardView
    lateinit var card_history: CardView
    lateinit var card_biology: CardView
    lateinit var card_chemistry: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        id()
        cardClickListener()


    }
    private fun id() {
        icon_maths = findViewById(R.id.icon_maths)
        icon_english = findViewById(R.id.icon_english)
        icon_history = findViewById(R.id.icon_history)
        icon_biology = findViewById(R.id.icon_biology)
        icon_chemistry = findViewById(R.id.icon_chemistry)
        icon_physics = findViewById(R.id.icon_physics)
        txt_maths = findViewById(R.id.txt_maths)
        txt_english = findViewById(R.id.txt_english)
        txt_chemistry = findViewById(R.id.txt_chemistry)
        txt_biology = findViewById(R.id.txt_biology)
        txt_physics = findViewById(R.id.txt_physics)
        txt_history = findViewById(R.id.txt_history)
        card_biology = findViewById(R.id.card_biology)
        card_english = findViewById(R.id.card_english)
        card_history = findViewById(R.id.card_history)
        card_maths = findViewById(R.id.card_math)
        card_physics = findViewById(R.id.card_physics)
        card_chemistry = findViewById(R.id.card_chemistry)
    }
    private fun cardClickListener() {
        card_maths.setOnClickListener {
            val intent1 = Intent(this, Math_Player::class.java)
            intent1.putExtra("name" , txt_maths.text.toString())
            startActivity(intent1)
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right)

        }
        card_chemistry.setOnClickListener {
            val intent2 = Intent(this, Chemistry_Player::class.java)
            intent2.putExtra("name",txt_chemistry.text.toString())
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right)
            startActivity(intent2)
        }
        card_english.setOnClickListener {
            val intent3 = Intent(this, English_Player::class.java)
            intent3.putExtra("name",txt_english.text.toString())
            startActivity(intent3)
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right)

        }
        card_history.setOnClickListener {
            val intent4 = Intent(this, History_Player::class.java)
            intent4.putExtra("name",txt_history.text.toString())
            startActivity(intent4)
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right)

        }
        card_physics.setOnClickListener {
            val intent5 = Intent(this, Physics_Player::class.java)
            intent5.putExtra("name",txt_physics.text.toString())
            startActivity(intent5)
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right)

        }
        card_biology.setOnClickListener {
            val intent6 = Intent(this, Biology_Player::class.java)
            intent6.putExtra("name",txt_biology.text.toString())
            startActivity(intent6)
            overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right)

        }
    }
}