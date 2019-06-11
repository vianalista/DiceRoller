package com.example.android.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myRollButton: Button = findViewById(R.id.roll_button)

        //myRollButton.text = "Let's roll"
        myRollButton.setOnClickListener {
            //Toast.makeText(this, "Does something when the button is clicked.", Toast.LENGTH_SHORT).show()
            myFunc()
        }
    }


    private fun myFunc() {
        val resultText: TextView = findViewById(R.id.idTView1)
        //Use the [Random] from (import java.util.*), no the [Random] from Kotlin.
        val randomInt = Random().nextInt(6)
        resultText.text = randomInt.toString()
    }

}
