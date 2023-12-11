package com.example.dapurbukus.ui.home

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.R
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewMenu(
    private val getMenu: Menu,
    private val menulist: List<ListMenu>):
    RecyclerView<RecyclerViewMenu.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout., parent, false)
        return MyViewHolder(view)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvMenuMknn.text = menulist[position].dftrMenu
        holder.btnDetail.setImageResource(menulist[position].image)

        holder.cardView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context,Menu::class.java).apply {
                putExtra("ITEM_ID",position)
            }
            context.startActivity(intent)
            Toast.makeText(getMenu,menulist[position].dftrMenu, Toast.LENGTH_LONG).show()
        }
    }
    override fun getItemCount(): Int {
        return menulist.size
    }
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val btnDetail: ImageView = itemView.findViewById(R.id.btnDetail)
        val tvMenuMknn : TextView = itemView.findViewById(R.id.tvMenuMknn)
        val cardView : CardView = itemView.findViewById(R.id.cardView)
    }
}