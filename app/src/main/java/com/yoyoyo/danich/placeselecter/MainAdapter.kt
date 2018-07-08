package com.yoyoyo.danich.placeselecter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.countries_row.view.*
import kotlinx.android.synthetic.main.lists_row.view.*


class MainAdapter: RecyclerView.Adapter<CustomViewHolder>() {

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val readyCountryListLabel = readyCountryListLabels.get(position)
        holder.view.listTitleTv.text = readyCountryListLabel
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.lists_row, parent,false)
        return CustomViewHolder(cellForRow)
    }

    val readyCountryListLabels = listOf("Europe", "North America", "South America", "Africa", "Asia")

    override fun getItemCount(): Int {
        return readyCountryListLabels.size
    }

}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view){

}





