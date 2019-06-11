package com.example.android.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myRollButton: Button = findViewById(R.id.roll_button)
        //myRollButton.text = "Let's roll"
        myRollButton.setOnClickListener {
            Toast.makeText(this, "teste", Toast.LENGTH_SHORT).show()
        }
    }
}
