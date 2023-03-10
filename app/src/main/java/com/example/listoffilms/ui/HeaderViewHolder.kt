package com.example.listoffilms.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listoffilms.R
import com.example.listoffilms.data.models.UiItem

class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(header: UiItem.Header) {
        itemView.findViewById<TextView>(R.id.text).text = header.tittle
    }
}
