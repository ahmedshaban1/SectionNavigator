package com.example.sectionnavigatordemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sectionnavigator.models.NormalHorizontalStyle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list:MutableList<String> = mutableListOf()
        list.apply {
            add("section1")
            add("section2")
            add("section3")
            add("section4")
            add("section1")
            add("section2")
            add("section3")
            add("section4")
            add("section1")
            add("section2")
            add("section3")
            add("section4")
        }
        with(sectionSelectorView){
            setHeaderMenu(NormalHorizontalStyle(items = list))
        }

    }
}
