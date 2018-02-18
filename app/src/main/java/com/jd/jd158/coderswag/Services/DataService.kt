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
            Product("Developers Grafic Beanie", "$18", "hat01"),
            Product("Developers Hat Black", "$30", "hat02"),
            Product("Developers Hat White", "$25", "hat03"),
            Product("Developers Hat Snapback", "$15", "hat04")
    )

    val hoodies = listOf(
            Product("Developers Hoodie Gray", "$28", "hoodie01"),
            Product("Developers Hoodie Red", "$15", "hoodie02"),
            Product("Developers Gray Hoodie", "$220", "hoodie03"),
            Product("Developers Black Hoodie", "$10", "hoodie04")
    )
    val shirts = listOf(
            Product("Developers Shirt Black", "$18", "shirt01"),
            Product("Developers Badge Light Gray", "$18", "shirt02"),
            Product("Developers Logo Shirt Red", "$18", "shirt03"),
            Product("Developers Hustle", "$18", "shirt04"),
            Product("Developers Studios", "$18", "shirt05")
    )

}