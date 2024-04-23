package com.intprog.listviewandrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class ListViewView : AppCompatActivity() {

    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val customListViewBtn = findViewById<Button>(R.id.customListViewButton)
        customListViewBtn.setOnClickListener {
            val intent = Intent(this,CustomListView::class.java)
            startActivity(intent)
        }

        val recylerViewBtn = findViewById<Button>(R.id.recyclerViewButton)
        recylerViewBtn.setOnClickListener {
            val intent = Intent(this, MyRecyclerView::class.java)
            startActivity(intent)
        }

        val listView = findViewById<ListView>(R.id.listView)
        val data = listOf(
            "Kimi ni Todoke",
            "Toradora",
            "Nisekoi",
            "Oregairu",
            "Horimiya",
            "Wotakoi",
            "Fruits Basket",
            "Your Lie in April")
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        listView.adapter = adapter

    }
}