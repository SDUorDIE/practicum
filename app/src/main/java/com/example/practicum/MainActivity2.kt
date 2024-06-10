package com.example.practicum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {

    private lateinit var pressBtn: Button
    private lateinit var clearBtn: Button
    private lateinit var saveBtn: Button
    private lateinit var nextBtn: Button
    private lateinit var dayText: EditText
    private lateinit var minText: EditText
    private lateinit var maxText: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pressBtn = findViewById(R.id.pressBtn)
        clearBtn = findViewById(R.id.clearBtn)
        saveBtn = findViewById(R.id.saveBtn)
        nextBtn = findViewById(R.id.nextBtn)
        dayText = findViewById(R.id.dayText)
        minText = findViewById(R.id.minText)
        maxText = findViewById(R.id.maxText)

        clearBtn.setOnClickListener {

            saveBtn.setOnClickListener {

                nextBtn.setOnClickListener {
                    val intent = Intent(this, MainActivity::class.java)

                    pressBtn.setOnClickListener {
                        Intent(this,MainActivity2::class.java)
                    }

                    }
                }
            }
        } data class DailyWeather(
        val day: String,
        val temperatureMax: Int,
        val temperatureLow: Int,
        val weeklyweather: Any = arrayOf(
            DailyWeather("Monday",29,17),
            DailyWeather("Tuesday",23,18),
            DailyWeather("Wednesday",30,19),
            DailyWeather("Thurday",26,14),
            DailyWeather("Friday",33,11),
            DailyWeather(" Saturday",40,23),
            DailyWeather("Sunday",37,20)
        )
    )
    private val weeklyWeatherData
        get() = mutableListOf(
            DailyWeather("Monday",29,17,30,),
            DailyWeather("Tuesday",23,18,36),
            DailyWeather("Wednesday",30,19,33),
            DailyWeather("Thursday",26,14,28),
            DailyWeather("Friday",33,11,25),
            DailyWeather("Saturday",40,23,17),
            DailyWeather("Sunday",37,20,17)

        )
    }

