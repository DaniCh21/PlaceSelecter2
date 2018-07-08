package com.yoyoyo.danich.placeselecter

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_of_countries.*
import kotlinx.android.synthetic.main.lists_row.*

class CountryList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_of_countries)

        recyclerView_list.layoutManager = LinearLayoutManager(this)
        recyclerView_list.adapter = CountryAdapter()

        /*editBtn.setOnClickListener{
            val intent = Intent(this, CountryList::class.java)
            startActivity(intent)
        }*/
    }
}