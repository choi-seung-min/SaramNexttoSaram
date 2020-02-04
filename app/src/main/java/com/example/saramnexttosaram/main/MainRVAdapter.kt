package com.example.saramnexttosaram.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.saramnexttosaram.R

class MainRVAdapter(list: ArrayList<String>): RecyclerView.Adapter<MainRVAdapter.ViewHolder>(){

    var sampleName = list

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_activity_main, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return sampleName.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(sampleName[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val profile: ImageView = itemView.findViewById(R.id.iv_main_item_profile)
        val user_name: TextView = itemView.findViewById(R.id.tv_main_item_user)
        val image: ImageView = itemView.findViewById(R.id.iv_main_item_image)

        fun bind(name: String){
            user_name.text = name
        }
    }
}