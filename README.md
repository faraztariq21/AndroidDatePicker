# AndroidDatePicker
This is a helper library for us to pick date and time like IOS system WheelView widget.  Added feature to pick date with format as you want.
![Screenshot_2020-02-14-07-00-03-33](https://user-images.githubusercontent.com/15213444/74540736-2129d380-4f62-11ea-9198-d27b90e5b569.png)


An AndroidDatePicker to pick date and time.

# Step 1. Add it in your root build.gradle at the end of repositories:

     allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }

# Step 2. Add the dependency

     dependencies {
            implementation 'com.github.faraztariq21:AndroidDatePicker:1.0'
    }
Then enjoy this library.

# How To Use 
# Step 3.Add In your Activity

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
                    .pickerPopWin.showPopWin(this)
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

# Datepicker:
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
                    .pickerPopWin.showPopWin(this)
        })

# Timepicker:
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
