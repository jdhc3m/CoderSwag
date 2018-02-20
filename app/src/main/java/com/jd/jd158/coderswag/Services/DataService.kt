package com.jd.jd158.coderswag.Services

import com.jd.jd158.coderswag.Model.Category
import com.jd.jd158.coderswag.Model.Product

/**
 * Created by jd158 on 18/02/2018.
 */
object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Developers Grafic Beanie", "$18", "hat1"),
        Product("Developers Hat Black", "$30", "hat2"),
        Product("Developers Hat White", "$25", "hat3"),
        Product("Developers Hat Snapback", "$15", "hat4")
    )

    val hoodies = listOf(
        Product("Developers Hoodie Gray", "$28", "hoodie1"),
        Product("Developers Hoodie Red", "$15", "hoodie2"),
        Product("Developers Gray Hoodie", "$220", "hoodie3"),
        Product("Developers Black Hoodie", "$10", "hoodie4")
    )
    val shirts = listOf(
        Product("Developers Shirt Black", "$18", "shirt1"),
        Product("Developers Badge Light Gray", "$18", "shirt2"),
        Product("Developers Logo Shirt Red", "$18", "shirt3"),
        Product("Developers Hustle", "$18", "shirt4"),
        Product("Developers Studios", "$18", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category : String) : List<Product> {
        return when (category) {
            "HATS" -> return DataService.hats
            "HOODIES" -> return DataService.hoodies
            "SHIRTS" -> return DataService.shirts
            else -> digitalGoods

        }
    }

}