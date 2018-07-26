package com.yoyoyo.danich.placeselecter


import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import android.widget.CheckBox
import android.widget.ImageButton
import kotlinx.android.synthetic.main.lists_row.view.*


class MainAdapter(private val context: Context): RecyclerView.Adapter<CustomViewHolder>() {

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val readyCountryListLabel = readyCountryListLabels[position]
        holder.view.listTitleTv.text = readyCountryListLabel
        holder.view.countryAmountTv.text = europeCountries.size.toString()
    }

    private val europeCountries = arrayListOf("Andorra", "Austria", "Bulgaria", "Cyprus", "Czech Republic", "Finland", "France", "Georgia", "Greece", "Hungary", "Ireland", "Italy", "Latvia", "Norway", "Poland", "Portugal", "Slovakia", "Spain", "Sweden", "Switzerland", "Turkey", "Ukraine", "United Kingdom")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.lists_row, parent,false)

        val editButton = cellForRow.findViewById<ImageButton>(R.id.editBtn)
        editButton.setOnClickListener{
            val intent = Intent(context, CountryList::class.java)
            context.startActivity(intent)
        }

//        val addCheckBox = cellForRow.findViewById<CheckBox>(R.id.addCb)
//        if (addCheckBox.isChecked){
//
//            var f = 0
//            for (i in 1..europeCountries.size){
//                selectedCountryList.add(europeCountries[f])
//                f++
//            }
//
//        }



        return CustomViewHolder(cellForRow)
    }

    private val readyCountryListLabels = listOf("Europe", "North America", "South America", "Africa", "Asia")

    override fun getItemCount(): Int {
        return readyCountryListLabels.size
    }

}
class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view){
    /*init {
        view.setOnClickListener{
            val intent = Intent(view.context, CountryList::class.java)
            view.context.startActivity(intent)
        }
    }*/
}





