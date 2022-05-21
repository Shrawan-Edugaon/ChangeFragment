package com.example.changefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    lateinit var mButtnOne: Button
    lateinit var mButtonTwo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mButtnOne = findViewById(R.id.ButtonOne)
        mButtonTwo = findViewById(R.id.Buttontwo)

        mButtnOne.setOnClickListener {

            val fragmentOne = FragmentOne()
            loadFragment(fragmentOne)
        }

        mButtonTwo.setOnClickListener {
            val fragmentTwo = FragmentTwo()
            loadFragment(fragmentTwo)
        }
    }
    private fun loadFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentView,fragment)
        fragmentTransaction.commit()
    }
}