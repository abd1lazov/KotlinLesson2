package space.abdilazov.kotlinlesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_rv.*
import kotlinx.android.synthetic.main.item_rv.view.*
import space.abdilazov.kotlinlesson2.extension.loadImageView

class MainActivity : AppCompatActivity() {

    private var imgUrl = mutableListOf<String>()
    private var Adapter: MyAdapter? = null
    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgUrl = mutableListOf(
                "https://cdn.pixabay.com/photo/2018/08/14/13/23/ocean-3605547__340.jpg",
                "https://cdn.pixabay.com/photo/2015/07/27/19/47/turtle-863336__340.jpg",
                "https://cdn.pixabay.com/photo/2018/08/14/13/23/ocean-3605547__340.jpg",
                "https://cdn.pixabay.com/photo/2013/10/02/23/03/mountains-190055__340.jpg",
                "https://cdn.pixabay.com/photo/2021/08/25/20/42/field-6574455__340.jpg",
                "https://cdn.pixabay.com/photo/2021/08/26/14/31/flower-6576240__340.jpg",
                "https://cdn.pixabay.com/photo/2021/08/28/18/09/common-heather-6581569__340.jpg",
                "https://cdn.pixabay.com/photo/2021/06/05/13/10/kid-6312635__340.jpg",
                "https://cdn.pixabay.com/photo/2021/08/01/12/58/beach-6514331__340.jpg",
                "https://cdn.pixabay.com/photo/2021/08/14/01/58/museum-6544420__480.jpg",
                "https://cdn.pixabay.com/photo/2021/09/14/14/46/cologne-6624212__480.jpg",
                "https://cdn.pixabay.com/photo/2021/08/11/20/39/sunset-6539401__480.jpg",
                "https://cdn.pixabay.com/photo/2015/05/31/11/18/table-setting-791148__480.jpg",
                "https://cdn.pixabay.com/photo/2020/12/15/14/35/girl-5833835__480.jpg")

        btn_submit.setOnClickListener(View.OnClickListener {

            imgUrl.add(et_url.text.toString())
        })

        btn_random.setOnClickListener {

            imgUrl.shuffle()
        }

            recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
            recyclerView!!.layoutManager = GridLayoutManager(this,3)
            Adapter = MyAdapter(imgUrl)
    }
}