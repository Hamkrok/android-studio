package com.example.snackbar_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val terug = findViewById<ImageButton>(R.id.imageButton7)
        terug.setOnClickListener{
            finish()
        }

        val ophalen = findViewById<Button>(R.id.button1)
        val name = findViewById<EditText>(R.id.editTextText)
        val adres = findViewById<EditText>(R.id.editTextText2)
        val post = findViewById<EditText>(R.id.editTextText3)
        ophalen.setOnClickListener{
            val naam = name.text.toString()
            val adress = adres.text.toString()
            val postcode = post.text.toString()
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("naam", naam)
            intent.putExtra("adress", adress)
            intent.putExtra("postcode", postcode)
            startActivity(intent)
        }

        val bestel = findViewById<Button>(R.id.button2)
        bestel.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}