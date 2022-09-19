package com.bignerdranch.android.lab11json

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessControlContext

class TaskRVAdapter(context: Context?, val data: MutableList<TaskClass?>) : RecyclerView.Adapter<TaskViewHolder>() {

    private val layoutInFlater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view: View = layoutInFlater.inflate(R.layout.tasklist, parent, false)
        return  TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val item = data[position]
        holder.nameTextView.text = item?._name
        holder.textTextView.text = item?._text
        holder.cratTextView.text = item?.names
        holder.dateTextView.text = item?.date
    }

    override fun getItemCount(): Int = data.size
}