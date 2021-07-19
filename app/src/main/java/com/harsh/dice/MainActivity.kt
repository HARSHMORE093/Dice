package com.harsh.dice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBotton:Button=findViewById(R.id.roll_button)

        rollBotton.setOnClickListener {
            Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText:TextView=findViewById(R.id.result_text)

        val randomInt= Random.nextInt(6)+1

        val drawableResourse=when (randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6

        }
        val diceImage:ImageView=findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResourse)


        resultText.text= randomInt.toString()
    }
}

