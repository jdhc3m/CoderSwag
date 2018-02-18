package com.jd.jd158.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.jd.jd158.coderswag.Model.Category
import com.jd.jd158.coderswag.R

/**
 * Created by jd158 on 18/02/2018.
 */
class CategotyAdapter(context : Context, categories : List<Category>) : BaseAdapter() {
    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView : View
        val holder : ViewHolder

        if (convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.categoty_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryText = categoryView.findViewById(R.id.categorytxt)
            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image ,"drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryText?.text = category.title
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
     return 0
    }

    override fun getCount(): Int {
        return  categories.count()
    }

    private class ViewHolder(){
        var categoryImage : ImageView? = null
        var categoryText : TextView? = null
    }

}