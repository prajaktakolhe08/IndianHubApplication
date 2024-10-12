package com.example.indianhub
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Keralaover : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keralaover)

        val keralaCulturebutton = findViewById<Button>(R.id.bkc)
        keralaCulturebutton.setOnClickListener {
            val Intent = Intent(this, KeralaCulture::class.java)
            startActivity(Intent)
        }
        val KeralaFoodbutton = findViewById<Button>(R.id.bkf)
        KeralaFoodbutton.setOnClickListener {
            val Intent = Intent(this, KeralaFood::class.java)
            startActivity(Intent)
        }

        val KeralaPlacebutton = findViewById<Button>(R.id.bkp)
        KeralaPlacebutton.setOnClickListener {
            val Intent = Intent(this, KeralaPlace::class.java)
            startActivity(Intent)
        }
        val KeralaOutfitbutton = findViewById<Button>(R.id.bko)
        KeralaOutfitbutton.setOnClickListener {
            val Intent = Intent(this, KeralaOutfit::class.java)
            startActivity(Intent)
        }
    }
}