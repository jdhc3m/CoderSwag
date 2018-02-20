package com.jd.jd158.coderswag.Controler

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.jd.jd158.coderswag.Adapters.CategotyRecycleAdapter
import com.jd.jd158.coderswag.Utils.EXTRA_PRODUCT
import com.jd.jd158.coderswag.R
import com.jd.jd158.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategotyRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategotyRecycleAdapter(this, DataService.categories) {category ->
            val productIntent = Intent (this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_PRODUCT, category.title)
            startActivity(productIntent)

        }

        categoryListview.adapter = adapter
        val layoutManager = LinearLayoutManager(this)
        categoryListview.layoutManager = layoutManager
        categoryListview.setHasFixedSize(true)

    }
}
