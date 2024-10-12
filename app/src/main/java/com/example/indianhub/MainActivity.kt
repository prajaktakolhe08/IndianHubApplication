package com.example.indianhub
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val maharashtraoverbutton = findViewById<Button>(R.id.btnm)
        maharashtraoverbutton.setOnClickListener {
            val Intent = Intent(this, MaharashtraOver::class.java)
            startActivity(Intent)
        }
        val keralaoverbutton = findViewById<Button>(R.id.btnk)
        keralaoverbutton.setOnClickListener {
            val Intent = Intent(this, Keralaover::class.java)
            startActivity(Intent)
        }
        val telanganabutton = findViewById<Button>(R.id.btnt)
        telanganabutton.setOnClickListener {
            val Intent = Intent(this, Telangana::class.java)
            startActivity(Intent)
        }
        val rajasthanbutton = findViewById<Button>(R.id.btnr)
     rajasthanbutton.setOnClickListener {
            val Intent = Intent(this, Rajasthan::class.java)
            startActivity(Intent)
        }
    }
}