package com.app.myrecv

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<MonthData>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    lateinit var subTitle : Array<String>
    lateinit var season : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        imageId= arrayOf(
            R.drawable.jan,
            R.drawable.feb,
            R.drawable.mar,
            R.drawable.apr,
            R.drawable.may,
            R.drawable.jun,
            R.drawable.jul,
            R.drawable.aug,
            R.drawable.sep,
            R.drawable.oct,
            R.drawable.nov,
            R.drawable.dec
        )
        heading= arrayOf(
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
        )
        subTitle= arrayOf(
            "Season",
            "Season",
            "Season",
            "Season",
            "Season",
            "Season",
            "Season",
            "Season",
            "Season",
            "Season",
            "Season",
            "Season"
        )
        season= arrayOf(
            "Winter",
            "Winter",
            "Spring",
            "Spring",
            "Spring",
            "Summer",
            "Summer",
            "Summer",
            "Autumn",
            "Autumn",
            "Autumn",
            "Winter"
        )
        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        newArrayList= arrayListOf<MonthData>()
        getUserData()





        }

    private fun getUserData() {
        for (i in imageId.indices){
            val monthData= MonthData(imageId[i],heading[i],subTitle[i],season[i])
            newArrayList.add(monthData)
            recyclerView.adapter= MyAdapter(newArrayList)
    }
}

}