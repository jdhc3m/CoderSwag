package com.jd.jd158.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.jd.jd158.coderswag.Model.Category
import com.jd.jd158.coderswag.R

/**
 * Created by jd158 on 18/02/2018.
 */
class CategotyRecycleAdapter(val context : Context, val categories : List<Category>,
                             val itemClick : (Category) -> Unit) : RecyclerView.Adapter<CategotyRecycleAdapter.Holder>(){
    override fun onBindViewHolder(holder: Holder?, position: Int) {
            holder?.bindCategory(categories[position], context)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.categoty_list_item, parent, false)
        return Holder(view, itemClick)
    }

    inner class Holder(itemView: View?, val itemClick : (Category) -> Unit) : RecyclerView.ViewHolder(itemView){
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryText = itemView?.findViewById<TextView>(R.id.categorytxt)

        fun bindCategory(category : Category, context : Context){
            var resouceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resouceId)
            categoryText?.text = category.title

            itemView.setOnClickListener{ itemClick(category) }

        }
    }
}