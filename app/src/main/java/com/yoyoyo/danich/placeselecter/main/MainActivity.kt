package com.yoyoyo.danich.placeselecter.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yoyoyo.danich.placeselecter.MainSettings
import com.yoyoyo.danich.placeselecter.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

var selectedCountryList = arrayListOf("Japan", "Brazil", "Spain", "Pussia", "Sweden", "USA", "Poland", "Germany", "Italia")

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun View.visibleOrInvisible(visible: Boolean) {
            visibility = if(visible) View.VISIBLE
            else View.INVISIBLE
        }

        settingsImgBtn.setOnClickListener{
            val intent = Intent(this, MainSettings::class.java)
            startActivity(intent)
        }

        startBtn.setOnClickListener{
            addedTv.visibleOrInvisible(false)
            errorNotEnoughTv.visibleOrInvisible(false)
            errorMoreTv.visibleOrInvisible(false)
            val random = Random()
            val randomCountry = random.nextInt(selectedCountryList.count())
            randomCountryTv.text = selectedCountryList[randomCountry]
        }

        addBtn.setOnClickListener {
            val newCountry = enterCountryEdt.text.toString()
            when {
                newCountry.count() in 1..25 -> {

                    addedTv.visibleOrInvisible(true)
                    errorMoreTv.visibleOrInvisible(false)
                    errorNotEnoughTv.visibleOrInvisible(false)

                    selectedCountryList.add(newCountry)
                    enterCountryEdt.text.clear()
                }
                newCountry.count() > 25 -> {

                    errorMoreTv.visibleOrInvisible(true)
                    errorNotEnoughTv.visibleOrInvisible(false)
                    addedTv.visibleOrInvisible(false)
                }
                else -> {

                    errorNotEnoughTv.visibleOrInvisible(true)
                    errorMoreTv.visibleOrInvisible(false)
                    addedTv.visibleOrInvisible(false)
                }
            }

        }
    }
}

