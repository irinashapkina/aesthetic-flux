package com.example.example3

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    //val imageView: ImageView
    val imageView: ImageView = itemView.findViewById(R.id.profile_image)
    val quoteView: TextView = itemView.findViewById(R.id.quotes)
    val nameView: TextView = itemView.findViewById(R.id.name)
}