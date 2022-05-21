package com.example.changefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentTwo : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.fragment_two,container,false)
        val textView = view.findViewById<TextView>(R.id.fragmentTwoText)
        textView.setOnClickListener {
            Toast.makeText(view.context,"Fragment two TextView clicked",Toast.LENGTH_LONG).show()
        }
        return view
    }
}