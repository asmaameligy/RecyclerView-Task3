package com.app.myrecv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(private val monthList: ArrayList<MonthData>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {

return monthList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = monthList[position]
        holder.imageView1.setImageResource(currentItem.imageId)
        holder.heading.text=currentItem.heading
        holder.subTitle.text=currentItem.subTitle
        holder.season.text=currentItem.season

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView1: ImageView= itemView.findViewById(R.id.imageView1)
        val heading :TextView= itemView.findViewById(R.id.heading)
        val subTitle : TextView= itemView.findViewById(R.id.subTitle)
        val season : TextView= itemView.findViewById(R.id.season)
    }


}


