package com.example.indianhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Rajasthan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rajasthan)

        val RjCulturebutton = findViewById<Button>(R.id.brc)
        RjCulturebutton.setOnClickListener {
            val Intent = Intent(this, RjCulture::class.java)
            startActivity(Intent)
        }
        val RjFoodbutton = findViewById<Button>(R.id.brf)
        RjFoodbutton.setOnClickListener {
            val Intent = Intent(this, RjFood::class.java)
            startActivity(Intent)
        }

        val RjPlacebutton = findViewById<Button>(R.id.brp)
        RjPlacebutton.setOnClickListener {
            val Intent = Intent(this, RjPlace::class.java)
            startActivity(Intent)
        }
        val RjOutfitbutton = findViewById<Button>(R.id.bro)
       RjOutfitbutton.setOnClickListener {
            val Intent = Intent(this, RjOutfit::class.java)
            startActivity(Intent)
        }
    }
}