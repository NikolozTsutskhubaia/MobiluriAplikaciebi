package com.example.myapplication

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     private lateinit var resultTextView: TextView
     private var shenaxuli : Double = 0.0
    private var operation : String = ""
    var LastNumeric : Boolean = false
    var stateError : Boolean = false
    var LastDot : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.textView17)
    }

    fun numberclick(clickedview:View) {

        if (clickedview is TextView ) {

            var result = resultTextView.text.toString()
            val number = clickedview.text.toString()

            resultTextView.text = result + number

            if (result == "0") {

                result = ""

            }

        }








    }




fun action(clickedview: View) {


    if (clickedview is TextView) {
         var result : String = resultTextView.text.toString()

        if (result.isNotEmpty()) {

            shenaxuli = result.toDouble()






        }

        operation = clickedview.text.toString()
        resultTextView.text = ""




    }





}

fun equals (clickedview: View) {

    val secShenaxuliText = resultTextView.text.toString()

    var secShenaxuli: Double = 0.0

    if (secShenaxuliText.isNotEmpty()) {

        secShenaxuli = secShenaxuliText.toDouble()


    }



    when (operation) {
        "+" -> resultTextView.text = (shenaxuli + secShenaxuli).toString()
        "-" -> resultTextView.text = (shenaxuli - secShenaxuli).toString()
        "*" -> resultTextView.text = (shenaxuli * secShenaxuli).toString()
        "÷" -> resultTextView.text = (shenaxuli / secShenaxuli).toString()
        "DEL" -> resultTextView.text = (shenaxuli.toString().dropLast(-1))
        "DEL" -> resultTextView.text = (secShenaxuli.toString().dropLast(-1))

    }
}




    fun onDecimalPoint(clickedview: View) {
        if (LastNumeric && !stateError && !LastDot) {
            resultTextView.append(".")
            LastNumeric = false
            LastDot = true
        }



}
    fun clear (clickedview: View){

        resultTextView.text = ""


    }




}
