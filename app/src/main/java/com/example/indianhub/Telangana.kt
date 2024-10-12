package com.example.indianhub
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Telangana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telangana)

        val TelCulturebutton = findViewById<Button>(R.id.btc)
        TelCulturebutton.setOnClickListener {
            val Intent = Intent(this, TelCulture::class.java)
            startActivity(Intent)
        }
        val TelFoodbutton = findViewById<Button>(R.id.btf)
       TelFoodbutton.setOnClickListener {
            val Intent = Intent(this, TelFood::class.java)
            startActivity(Intent)
        }

        val TelPlacebutton = findViewById<Button>(R.id.btp)
        TelPlacebutton.setOnClickListener {
            val Intent = Intent(this, TelPlace::class.java)
            startActivity(Intent)
        }
        val TelOutfitbutton = findViewById<Button>(R.id.bto)
        TelOutfitbutton.setOnClickListener {
            val Intent = Intent(this, TelOutfit::class.java)
            startActivity(Intent)
        }
    }
}