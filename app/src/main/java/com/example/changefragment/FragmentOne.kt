package com.example.changefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentOne : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.fragment_one,container,false)
        val textView = view.findViewById<TextView>(R.id.fragmentOneText)

        textView.setOnClickListener {
            Toast.makeText(view.context,"Fragment one TextView Clicked",Toast.LENGTH_LONG).show()
        }
        return view

    }
}