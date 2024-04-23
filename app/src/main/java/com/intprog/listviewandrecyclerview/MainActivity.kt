package com.intprog.listviewandrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        val recylerViewBtn = findViewById<Button>(R.id.recyclerViewButton)
        recylerViewBtn.setOnClickListener {
            val intent = Intent(this,MyRecyclerView::class.java)
            startActivity(intent)
        }

    }
}