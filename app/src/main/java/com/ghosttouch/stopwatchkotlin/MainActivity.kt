package com.ghosttouch.stopwatchkotlin

import android.graphics.Typeface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvSplash:TextView = findViewById(R.id.tvSplash)
        val tvSubSplash:TextView = findViewById(R.id.tvSplash)
        val btnGet:Button = findViewById(R.id.btnGet)
        val ivSplash:ImageView = findViewById(R.id.ivSplash)

        //load animation
        val atg:Animation = AnimationUtils.loadAnimation(this,R.anim.atg)
        val btngoneone = AnimationUtils.loadAnimation(this,R.anim.btgoneone)
        val btngonetwo = AnimationUtils.loadAnimation(this,R.anim.btngonetwo)


        //passing animation
        ivSplash.startAnimation(atg)
        tvSplash.startAnimation(btngoneone)
        tvSubSplash.startAnimation(btngoneone)
        btnGet.startAnimation(btngonetwo)


        //import font
        val Light:Typeface = Typeface.createFromAsset(assets,"light.ttf")
        val Medium:Typeface = Typeface.createFromAsset(assets,"medium.ttf")
        val Regular:Typeface = Typeface.createFromAsset(assets,"regular.ttf")


        //custom font
        tvSplash.setTypeface(Regular)
        tvSubSplash.setTypeface(Light)
        btnGet.setTypeface(Medium)



    }
}
