package com.example.example3

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter: RecyclerView.Adapter<ViewHolder> {

    val items: List<Item> = TODO()
    val context: Context = TODO()

    constructor(_context: Context,_items: List<Item>){
        items =_items
        context= _context

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.quoteView.setText(items.get(position).quote)
        holder.imageView.setImageResource(items.get(position).image)
        holder.nameView.setText(items.get(position).name)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}