package com.yoyoyo.danich.placeselecter


import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.lists_row.view.*


class MainAdapter: RecyclerView.Adapter<CustomViewHolder>() {

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val readyCountryListLabel = readyCountryListLabels.get(position)
        holder.view.listTitleTv.text = readyCountryListLabel
        holder.view.countryAmountTv.text = europeCountries.size.toString()
    }

    val europeCountries = arrayListOf("Andorra", "Austria", "Bulgaria", "Cyprus", "Czech Republic", "Finland", "France", "Georgia", "Greece", "Hungary", "Ireland", "Italy", "Latvia", "Norway", "Poland", "Portugal", "Slovakia", "Spain", "Sweden", "Switzerland", "Turkey", "Ukraine", "United Kingdom")


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
    init {
        view.setOnClickListener{
            val intent = Intent(view.context, CountryList::class.java)
            view.context.startActivity(intent)
        }
    }
}





