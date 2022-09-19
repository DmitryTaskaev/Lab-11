package com.bignerdranch.android.lab11json

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var nameTextView : TextView = itemView.findViewById(R.id.taskName)
    var textTextView : TextView = itemView.findViewById(R.id.taskText)
    var cratTextView : TextView = itemView.findViewById(R.id.taskCreate)
    var dateTextView : TextView = itemView.findViewById(R.id.taskDate)
}