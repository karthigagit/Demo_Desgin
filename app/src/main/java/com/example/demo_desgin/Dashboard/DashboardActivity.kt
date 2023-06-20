package com.example.demo_desgin.Dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.demo_desgin.Actvity.MainActivity

import com.example.demo_desgin.Adapters.Dashboard_Adapter
import com.example.demo_desgin.Models.ItemsViewModel
import com.example.demo_desgin.ProfileFragment
import com.example.demo_desgin.R
import com.google.android.material.navigation.NavigationBarItemView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.das_xml)
        val navigation = findViewById(R.id.navigation_market) as NavigationBarItemView
        navigation.setOnClickListener {
            val intent = Intent(this@DashboardActivity, MainActivity::class.java)
            startActivity(intent)
        }
        val recyclerView = findViewById(R.id.recylerview) as RecyclerView
            recyclerView.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
           val data = ArrayList<ItemsViewModel>()
            data.add(ItemsViewModel(R.drawable.sendmoney_image, "Send Money"))
            data.add(ItemsViewModel(R.drawable.paybills_image, "Pay Bills"))
            data.add(ItemsViewModel(R.drawable.trackrates_image, "Track Rates"))
            val adapter = Dashboard_Adapter(data)
            recyclerView.adapter = adapter
        }

    }