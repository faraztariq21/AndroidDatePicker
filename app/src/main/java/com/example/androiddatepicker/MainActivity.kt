package com.example.androiddatepicker

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bruce.pickerview.LoopView
import com.bruce.pickerview.popwindow.DatePickerPopWin
import com.bruce.pickerview.popwindow.DatePickerPopWin.OnDatePickedListener
import com.bruce.pickerview.popwindow.TimePickerPopWin
import com.bruce.pickerview.popwindow.TimePickerPopWin.OnTimePickListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dateButton.setOnClickListener(View.OnClickListener {
            val pickerPopWin =
                DatePickerPopWin.Builder(this@MainActivity,
                    OnDatePickedListener { year, month, day, dateDesc ->
                        Toast.makeText(
                            this@MainActivity,
                            dateDesc,
                            Toast.LENGTH_SHORT
                        ).show()
                    }).textConfirm("CONFIRM") //text of confirm button
                    .textCancel("CANCEL") //text of cancel button
                    .btnTextSize(16) // button text size
                    .viewTextSize(25) // pick view text size
                    .colorCancel(Color.parseColor("#999999")) //color of cancel button
                    .colorConfirm(Color.parseColor("#009900")) //color of confirm button
                    .minYear(1990) //min year in loop
                    .maxYear(2550) // max year in loop
                    .dateChose("2013-11-11") // date chose when init popwindow
                    .dateFormat("dd/MM/yyyy")
                    .build()
            pickerPopWin.showPopWin(this@MainActivity)
        })

        timeButton.setOnClickListener(View.OnClickListener {
            val timePickerPopWin =
                TimePickerPopWin.Builder(this@MainActivity,
                    OnTimePickListener { hour, minute, AM_PM, time ->
                        Toast.makeText(
                            this@MainActivity,
                            time,
                            Toast.LENGTH_SHORT
                        ).show()
                    }).textConfirm("CONFIRM")
                    .textCancel("CANCEL")
                    .btnTextSize(16)
                    .viewTextSize(25)
                    .colorCancel(Color.parseColor("#999999"))
                    .colorConfirm(Color.parseColor("#009900"))
                    .build()
            timePickerPopWin.showPopWin(this@MainActivity)
        })
    }
}
