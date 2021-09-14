package space.abdilazov.kotlinlesson2.extension

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImageView(context: Context, url: String){
    Glide.with(context).load(url).into(this)
}