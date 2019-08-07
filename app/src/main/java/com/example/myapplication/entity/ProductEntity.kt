package com.example.myapplication.entity

import android.graphics.drawable.Drawable


data class ProductEntity(val txtPrincipal: String, val txtValue:String, val valueDescription: String, val url:String? = null, val drawable: Drawable? = null, val detailClickListenter: (()->Unit)? = null)
