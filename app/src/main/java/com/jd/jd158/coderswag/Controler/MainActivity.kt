package com.jd.jd158.coderswag.Controler

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jd.jd158.coderswag.Adapters.CategotyAdapter
import com.jd.jd158.coderswag.R
import com.jd.jd158.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategotyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    adapter = CategotyAdapter(this,
            DataService.categories)
        categoryListview.adapter = adapter

    }
}
