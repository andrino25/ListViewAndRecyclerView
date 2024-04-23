package com.intprog.listviewandrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(context: Context, data: List<CustomListItem>) :
    ArrayAdapter<CustomListItem>(context, R.layout.custom_list_item, data) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        val viewHolder: ViewHolder

        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.custom_list_item, parent, false)
            viewHolder = ViewHolder(itemView)
            itemView.tag = viewHolder
        } else {
            viewHolder = itemView.tag as ViewHolder
        }

        val currentItem = getItem(position)

        viewHolder.imageView.setImageResource(currentItem?.imageRes ?: R.drawable.toradora)
        viewHolder.titleTextView.text = currentItem?.title
        viewHolder.statusTextView.text = currentItem?.status

        return itemView!!
    }

    private class ViewHolder(view: View) {
        val imageView: ImageView = view.findViewById(R.id.img)
        val titleTextView: TextView = view.findViewById(R.id.title)
        val statusTextView: TextView = view.findViewById(R.id.status)
    }
}

data class CustomListItem(
    val title: String,
    val status: String,
    val imageRes: Int
)
