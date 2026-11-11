package com.example.snackbar_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
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

        val bestelling = findViewById<TextView>(R.id.textView12)
        var mayo = 0;
        var oorlog = 0;
        var kroket = 0;
        var frikandel = 0;
        var kaas = 0;
        var pikanto = 0;

        val intent = getIntent()
        val extras = intent.extras
        if (extras != null) {
            if (extras.containsKey("mayo")) {
                mayo = intent.extras!!.getInt("mayo")
            }
        }
        if (extras != null) {
            if (extras.containsKey("oorlog")) {
                oorlog = intent.extras!!.getInt("oorlog")
            }
        }
        if (extras != null) {
            if (extras.containsKey("kroket")) {
                kroket = intent.extras!!.getInt("kroket")
            }
        }
        if (extras != null) {
            if (extras.containsKey("frikandel")) {
                frikandel = intent.extras!!.getInt("frikandel")
            }
        }
        if (extras != null) {
            if (extras.containsKey("kaas")) {
                kaas = intent.extras!!.getInt("kaas")
            }
        }
        if (extras != null) {
            if (extras.containsKey("pikanto")) {
                pikanto = intent.extras!!.getInt("pikanto")
            }
        }
        bestelling.text = " $mayo patat mayo\n $oorlog patat oorlog\n $kroket kroket\n $kaas kaassoufle\n $pikanto pikanto"

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