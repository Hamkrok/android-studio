package com.example.snackbar_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val terug = findViewById<ImageButton>(R.id.imageButton8)
        terug.setOnClickListener{
            finish()
        }
        val name = intent.extras?.getString("naam")
        val adress = intent.extras?.getString("adress")
        val postcode = intent.extras?.getString("postcode")

        val betalen = findViewById<Button>(R.id.button4)
        betalen.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("naam", name)
            intent.putExtra("adress", adress)
            intent.putExtra("postcode", postcode)
            startActivity(intent)
        }
    }
}