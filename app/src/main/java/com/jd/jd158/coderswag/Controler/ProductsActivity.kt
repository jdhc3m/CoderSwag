package com.jd.jd158.coderswag.Controler

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.jd.jd158.coderswag.Adapters.ProductAdapter
import com.jd.jd158.coderswag.R
import com.jd.jd158.coderswag.Services.DataService
import com.jd.jd158.coderswag.Utils.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val extraIntent = intent.getStringExtra(EXTRA_PRODUCT)
        adapter = ProductAdapter(this, DataService.getProducts(extraIntent))

        productsListview.adapter = adapter
        val layoutManager = GridLayoutManager(this, 2)
        productsListview.layoutManager = layoutManager
        productsListview.adapter = adapter

    }
}
