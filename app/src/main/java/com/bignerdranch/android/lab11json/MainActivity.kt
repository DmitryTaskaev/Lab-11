package com.bignerdranch.android.lab11json

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.CalendarView
import android.widget.EditText
import android.widget.ImageButton
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity : AppCompatActivity() {
    private lateinit var nameTask: EditText
    private lateinit var namesTask: EditText
    private lateinit var textTask: EditText
    private lateinit var dateTask: CalendarView
    private lateinit var btnTask: Button
    private lateinit var btnTaskInfo: ImageButton

    private var date : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameTask = findViewById(R.id.nameTask)
        namesTask = findViewById(R.id.namesTask)
        textTask = findViewById(R.id.textTask)
        btnTask = findViewById(R.id.buttonTask)
        dateTask = findViewById(R.id.calendarView)
        btnTaskInfo = findViewById(R.id.backTaskInfo)

        dateTask.setOnDateChangeListener(){view, year, month, dayOfMonth -> date = "$dayOfMonth.${month+1}.$year"}

        //Отправка
        btnTask.setOnClickListener {
            val task = Gson().toJson(TaskClass(nameTask.text.toString(), textTask.text.toString(),namesTask.text.toString(), date.toString()))
            val int = Intent(this, TaskInfo::class.java)
            int.putExtra("JSONs", task)
            startActivity(int)
            Log.d("JSON-INFO","Данные записаны")
        }
        btnTaskInfo.setOnClickListener {
            val int = Intent(this, TaskInfo::class.java)
            startActivity(int)
        }
    }
}