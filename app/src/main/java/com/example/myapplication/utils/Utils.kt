package com.example.myapplication.utils

import android.animation.ObjectAnimator
import android.content.ContextWrapper
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.squareup.picasso.Picasso

fun logT(message:String){
    Log.d("ProductLineDetail", message)
}

fun ImageView.loadImageUrl(imageUrl:String?){
    imageUrl?.let{
        Picasso.get().load(it).fit().centerCrop().into(this)
    }
}

fun View.hide(){
    ObjectAnimator.ofFloat(this, "alpha", 1f, 0f).apply {
        start()
    }
}
