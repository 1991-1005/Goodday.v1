package com.example.gooddayv1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mikhaellopez.circularprogressbar.CircularProgressBar

class test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val circularProgressBar = findViewById<CircularProgressBar>(R.id.circularProgressBar)
        circularProgressBar.apply {
            // Set Progress
            //progress = 85f
            // or with animation
            setProgressWithAnimation(86f, 1000) // =1s

            // Set Progress Max
            progressMax = 100f

            // Set ProgressBar Color
            progressBarColor = Color.rgb(88,139,139)

            // Set background ProgressBar Color
            backgroundProgressBarColor = Color.rgb(245,245,245)

            // Set Width
            progressBarWidth = 18f // in DP
            backgroundProgressBarWidth = 18f // in DP

            // Other
            roundBorder = true
            startAngle = 0f
            progressDirection = CircularProgressBar.ProgressDirection.TO_RIGHT
        }
    }
}