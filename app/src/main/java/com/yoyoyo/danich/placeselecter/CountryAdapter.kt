package com.yoyoyo.danich.placeselecter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.countries_row.view.*

class CountryAdapter: RecyclerView.Adapter<CustomViewHolderr>() {

    override fun onBindViewHolder(holder: CustomViewHolderr, position: Int) {
        val europeCountry = europeCountries.get(position)
        holder.view.countryTv.text = europeCountry
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolderr {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.countries_row, parent,false)
        return CustomViewHolderr(cellForRow)
    }

    val europeCountries = arrayListOf("Andorra", "Austria", "Bulgaria", "Cyprus", "Czech Republic", "Finland", "France", "Georgia", "Greece", "Hungary", "Ireland", "Italy", "Latvia", "Norway", "Poland", "Portugal", "Slovakia", "Spain", "Sweden", "Switzerland", "Turkey", "Ukraine", "United Kingdom")

    override fun getItemCount(): Int {
        return europeCountries.size
    }

}

class CustomViewHolderr(val view: View): RecyclerView.ViewHolder(view){

}