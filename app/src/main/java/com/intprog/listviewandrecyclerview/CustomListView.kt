package com.intprog.listviewandrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class CustomListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list_view)

        val listViewBtn = findViewById<Button>(R.id.listViewButton)
        listViewBtn.setOnClickListener {
            val intent = Intent(this, ListViewView::class.java)
            startActivity(intent)
        }

        val recylerViewBtn = findViewById<Button>(R.id.recyclerViewButton)
        recylerViewBtn.setOnClickListener {
            val intent = Intent(this,MyRecyclerView::class.java)
            startActivity(intent)
        }

        val listView = findViewById<ListView>(R.id.customListView)

        // Sample data
        val data = listOf(
            CustomListItem("Kimi ni Todoke", "Watched", R.drawable.img_6),
            CustomListItem("Toradora", "Unwatched", R.drawable.toradora),
            CustomListItem("Nisekoi", "Watched", R.drawable.img),
            CustomListItem("Oregairu", "Watched", R.drawable.img_1),
            CustomListItem("Horimiya", "Watched", R.drawable.img_2),
            CustomListItem("Wotakoi", "Watched", R.drawable.img_3),
            CustomListItem("Fruits Basket", "Unwatched", R.drawable.img_4),
            CustomListItem("Your Lie in April", "Watched", R.drawable.img_5)
        )

        // Create custom adapter
        val adapter = CustomAdapter(this, data)

        // Set adapter to ListView
        listView.adapter = adapter
    }
}