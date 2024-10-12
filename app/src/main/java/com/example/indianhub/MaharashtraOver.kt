package com.example.indianhub
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MaharashtraOver : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maharashtraover)

        val MsCulturebutton = findViewById<Button>(R.id.bmc)
        MsCulturebutton.setOnClickListener {
            val Intent = Intent(this, MsCulture::class.java)
            startActivity(Intent)
        }
            val MsFoodbutton = findViewById<Button>(R.id.bmf)
            MsFoodbutton.setOnClickListener {
                val Intent = Intent(this, MsFood::class.java)
                startActivity(Intent)
            }

            val MsPlacebutton= findViewById<Button>(R.id.bmp)
            MsPlacebutton.setOnClickListener {
                val Intent = Intent(this, MsPlace::class.java)
                startActivity(Intent)
            }
            val MsOutfitbutton = findViewById<Button>(R.id.bmo)
            MsOutfitbutton.setOnClickListener {
                val Intent = Intent(this, MsOutfit::class.java)
                startActivity(Intent)
            }
        }
    }