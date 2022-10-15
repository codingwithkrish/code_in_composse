package com.example.ngo_compose

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class galleryadapter(private val mList:ArrayList<gallery_model>): RecyclerView.Adapter<galleryadapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): galleryadapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.galler_grid, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: galleryadapter.ViewHolder, position: Int) {
        val currentitem = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.logo.setImageResource(currentitem.image)

        // sets the text to the textview from our itemHolder class

        holder.cap.text = currentitem.cap
    }

    override fun getItemCount(): Int {
        return mList.size
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val logo: ImageView = itemView.findViewById(R.id.idIVcourse)
        val cap: TextView = itemView.findViewById(R.id.idTVtext)
    }
}