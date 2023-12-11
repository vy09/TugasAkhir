package com.example.dapurbukus.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dapurbukus.R

class Menu : AppCompatActivity() {
    private var recyclerView : RecyclerView? = null
    private var recyclerViewMenu : RecyclerViewMenu? = null
    private var menulist = mutableListOf<ListMenu>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        menulist = ArrayList()

        recyclerView = findViewById<View>(R.id.listMakanan) as RecyclerView
        recyclerViewMenu = RecyclerViewMenu(this@Menu, menulist,)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewMenu

        listDataMenu()
    }

    private fun listDataMenu() {
        var daftar = ListMenu ("ayam geprek",R.drawable.img1)
        menulist.add(daftar)
        daftar = ListMenu ("lele gorneg",R.drawable.img2)
        menulist.add(daftar)
        daftar = ListMenu ("ayam bakar",R.drawable.img3)
        menulist.add(daftar)

        recyclerViewMenu!!.notifyDataSetChanged()
    }
}