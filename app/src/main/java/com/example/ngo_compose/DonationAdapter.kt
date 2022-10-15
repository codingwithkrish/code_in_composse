package com.example.ngo_compose

import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DonationAdapter(private val mList:ArrayList<Dontion_model>): RecyclerView.Adapter<DonationAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.ngo_donation_card, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentitem = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.logo.setImageResource(currentitem.image)

        // sets the text to the textview from our itemHolder class
        holder.ngo_name.text = currentitem.ngoname
        holder.desc.text = currentitem.desc
        holder.link.movementMethod = LinkMovementMethod.getInstance()

    }
    override fun getItemCount(): Int {
        return mList.size
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val logo: ImageView = itemView.findViewById(R.id.ngo_logo)
        val ngo_name: TextView = itemView.findViewById(R.id.textView)
        val desc : TextView = itemView.findViewById(R.id.textView2)
        val link :TextView = itemView.findViewById(R.id.text2)
    }
}