package com.example.snackbar_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val terug = findViewById<ImageButton>(R.id.imageButton9)
        terug.setOnClickListener{
            finish()
        }

        val mayo = findViewById<ImageButton>(R.id.imageButton)
        val oorlog = findViewById<ImageButton>(R.id.imageButton2)
        val kroket = findViewById<ImageButton>(R.id.imageButton3)
        val frikandel = findViewById<ImageButton>(R.id.imageButton4)
        val kaas = findViewById<ImageButton>(R.id.imageButton5)
        val pikanto = findViewById<ImageButton>(R.id.imageButton6)

        var mayo_count = 0
        var oorlog_count = 0
        var kroket_count = 0
        var frikandel_count = 0
        var kaas_count = 0
        var pikanto_count = 0


        mayo.setOnClickListener{
            mayo_count++
        }
        oorlog.setOnClickListener{
            oorlog_count++
        }
        kroket.setOnClickListener{
            kroket_count++
        }
        frikandel.setOnClickListener{
            frikandel_count++
        }
        kaas.setOnClickListener{
            kaas_count++
        }
        pikanto.setOnClickListener{
            pikanto_count++
        }

        val name = intent.extras?.getString("naam")
        val adress = intent.extras?.getString("adress")
        val postcode = intent.extras?.getString("postcode")


        val bestellen = findViewById<Button>(R.id.button3)
        bestellen.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("mayo", mayo_count)
            intent.putExtra("oorlog", oorlog_count)
            intent.putExtra("kroket", kroket_count)
            intent.putExtra("frikandel", frikandel_count)
            intent.putExtra("kaas", kaas_count)
            intent.putExtra("pikanto", pikanto_count)
            intent.putExtra("naam", name)
            intent.putExtra("adress", adress)
            intent.putExtra("postcode", postcode)
            startActivity(intent)
        }
    }
}