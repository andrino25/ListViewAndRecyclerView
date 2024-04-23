package com.intprog.listviewandrecyclerview

import RecyclerItems
import RecyclerViewAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_recycler_view)

        val listViewBtn = findViewById<Button>(R.id.listViewButton)
        listViewBtn.setOnClickListener {
            val intent = Intent(this,ListViewView::class.java)
            startActivity(intent)
        }

        val customListViewBtn = findViewById<Button>(R.id.customListViewButton)
        customListViewBtn.setOnClickListener {
            val intent = Intent(this,CustomListView::class.java)
            startActivity(intent)
        }

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Create a list of RecyclerItems
        val dataList = listOf(
            RecyclerItems("Horimiya", "Watched", R.drawable.img_2),
            RecyclerItems("Wotakoi", "Watched", R.drawable.img_3),
            RecyclerItems("Fruits Basket", "Unwatched", R.drawable.img_4),
            RecyclerItems("Your Lie in April", "Watched", R.drawable.img_5),
            RecyclerItems("Kimi ni Todoke", "Watched", R.drawable.img_6),
            RecyclerItems("Toradora", "Unwatched", R.drawable.toradora),
            RecyclerItems("Nisekoi", "Watched", R.drawable.img),
            RecyclerItems("Oregairu", "Watched", R.drawable.img_1)
        )

        // Create an instance of RecyclerViewAdapter
        val adapter = RecyclerViewAdapter(this, dataList)

        // Set layout manager and adapter to RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}