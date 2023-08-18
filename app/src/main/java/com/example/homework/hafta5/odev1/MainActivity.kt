package com.example.homework.hafta5.odev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.homework.R
import com.example.homework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var iconList: ArrayList<DataModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val icon1 = DataModel(R.drawable.baseline_accessibility_24,"ilk icon")
        val icon2 = DataModel(R.drawable.baseline_add_to_queue_24,"ikinci icon")
        val icon3 = DataModel(R.drawable.baseline_coronavirus_24,"üçüncü icon")
        val icon4 = DataModel(R.drawable.baseline_accessibility_24,"ilk icon")
        val icon5 = DataModel(R.drawable.baseline_add_to_queue_24,"ikinci icon")
        val icon6 = DataModel(R.drawable.baseline_coronavirus_24,"üçüncü icon")
        val icon7 = DataModel(R.drawable.baseline_accessibility_24,"ilk icon")
        val icon8 = DataModel(R.drawable.baseline_add_to_queue_24,"ikinci icon")
        val icon9 = DataModel(R.drawable.baseline_coronavirus_24,"üçüncü icon")
        val icon10 = DataModel(R.drawable.baseline_accessibility_24,"ilk icon")
        val icon11 = DataModel(R.drawable.baseline_add_to_queue_24,"ikinci icon")
        val icon12 = DataModel(R.drawable.baseline_coronavirus_24,"üçüncü icon")
        val icon13 = DataModel(R.drawable.baseline_accessibility_24,"ilk icon")
        val icon14 = DataModel(R.drawable.baseline_add_to_queue_24,"ikinci icon")
        val icon15 = DataModel(R.drawable.baseline_coronavirus_24,"üçüncü icon")

        iconList = ArrayList<DataModel>()
        iconList.add(icon1)
        iconList.add(icon2)
        iconList.add(icon3)
        iconList.add(icon4)
        iconList.add(icon5)
        iconList.add(icon6)
        iconList.add(icon7)
        iconList.add(icon8)
        iconList.add(icon9)
        iconList.add(icon10)
        iconList.add(icon11)
        iconList.add(icon12)
        iconList.add(icon13)
        iconList.add(icon14)
        iconList.add(icon15)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false)
        binding.rv.adapter = Adapter(this@MainActivity, iconList)


    }
}