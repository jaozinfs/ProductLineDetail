package com.example.myapplication.utils

import android.graphics.Bitmap
import android.graphics.drawable.Drawable

sealed class InsertImage(drawable: Drawable? = null, bitmap: Bitmap? = null, url: String? = null){
    class ImageDrawable(val drawable: Drawable?): InsertImage(drawable)

    class ImageUrl(val url: String): InsertImage(url = url)
}