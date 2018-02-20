package com.jd.jd158.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.jd.jd158.coderswag.Model.Product
import com.jd.jd158.coderswag.R

/**
 * Created by jd158 on 20/02/2018.
 */
class ProductAdapter (val context : Context, val products : List<Product> ): RecyclerView.Adapter<ProductAdapter.ProductHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.products_list_item, parent, false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder?, position: Int) {
      holder?.bindProduct(products[position], context)
    }

    override fun getItemCount(): Int {
        return products.count()
    }


    inner class ProductHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)
        val finalPrice = "$ $productPrice"

        fun bindProduct(product : Product, context : Context){
            var resouceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage.setImageResource(resouceId)
            productName.setText(product.title)
            productPrice.setText(product.price)
        }

    }

}