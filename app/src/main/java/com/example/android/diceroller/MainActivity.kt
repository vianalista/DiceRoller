package com.example.android.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView
    private var diceNumber: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myRollButton: Button = findViewById(R.id.roll_button)

        //myRollButton.text = "Let's roll"
        myRollButton.setOnClickListener {
            //Toast.makeText(this, "Does something when the button is clicked.", Toast.LENGTH_SHORT).show()
            diceNumber = changeText()
            changeImage(diceNumber)
        }

        diceImage = findViewById(R.id.idImageView01_dice)
    }


    private fun changeText():Int {
        val resultText: TextView = findViewById(R.id.idTView1)
        //Use the [Random] from (import java.util.*), no the [Random] from Kotlin.
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()
        return randomInt
    }

    private fun changeImage(num: Int) {

        val image = when (num) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(image)
    }

}
