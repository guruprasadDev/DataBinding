package com.guruthedev.databinding

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("loadImageFromUrl","displayTitle", requireAll = true)
fun ImageView.loadImageFromUrl(profilePhoto:String,title:String){
    this.load(profilePhoto)
    Log.d("title","title")
}
@BindingAdapter("setMyViewVisibility")
fun View.setMyViewVisibility(points: Int){
    if (points > 1){
        this.visibility = View.INVISIBLE
    }
    when(this){
        is ImageView ->{

        }
        is TextView ->{

        }
    }
}


