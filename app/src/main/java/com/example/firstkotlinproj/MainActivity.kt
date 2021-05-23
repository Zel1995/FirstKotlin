package com.example.firstkotlinproj

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value = KotlinSinglObj.strData
        val note = Note("1", "2", 3)
        val noteCopy = note.copy("title", "content", 333333)

        val button: MaterialButton = findViewById(R.id.materialButton);
        val button2: MaterialButton = findViewById(R.id.materialButton2)
        val textView: TextView = findViewById(R.id.textView)

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                textView.text = noteCopy.title + " " + noteCopy.content
                for(i in 1..5) println(noteCopy.title + i)
            }
        })
        button2.setOnClickListener {
            textView.text = KotlinSinglObj.myCopy(note)
            for (i in 3 downTo 0) println(i)
        }

        fun whenTest(item:Any){
            when(item) {
                is Note -> println("это заметка")
                is KotlinClass -> println("это класс котлина")
                else -> println("это что-то другое")
            }
        }
        fun forElement(vararg string: String) {
            for (s in string) {
                println(s)
            }
        }
    }
}