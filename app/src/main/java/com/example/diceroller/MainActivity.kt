package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImg: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.btn_roll)
        rollButton.setOnClickListener {
            rollDice()
        }
        diceImg = findViewById(R.id.img_dice)
    }

    private fun rollDice() {
        var randomInt: Int = Random.nextInt(6) + 1
        val toastText = "Dice rolled, you got number $randomInt!"
        var drawableResource = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImg.setImageResource(drawableResource)
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show()

    }
}