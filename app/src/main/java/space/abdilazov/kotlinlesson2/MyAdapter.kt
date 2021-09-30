package space.abdilazov.kotlinlesson2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import space.abdilazov.kotlinlesson2.extension.loadImageView

class MyAdapter(private val ImageUrl: MutableList<String>): RecyclerView.Adapter<MyAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {

        holder.Imageview.loadImageView(ImageUrl[position])
    }

    override fun getItemCount(): Int {

        return ImageUrl.size
    }
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var Imageview: ImageView = view.findViewById(R.id.imageView) as ImageView
    }

}
