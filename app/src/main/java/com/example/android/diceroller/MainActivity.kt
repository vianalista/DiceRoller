package com.example.android.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
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

            var diceNumber:Int
            diceNumber = changeText()
            changeImage(diceNumber)
        }
    }


    private fun changeText():Int {
        val resultText: TextView = findViewById(R.id.idTView1)
        //Use the [Random] from (import java.util.*), no the [Random] from Kotlin.
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()
        return randomInt
    }

    private fun changeImage(num: Int) {
        val diceImage: ImageView = findViewById(R.id.idImageView01_dice)

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
