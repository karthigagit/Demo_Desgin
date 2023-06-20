
package com.example.demo_desgin.Actvity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demo_desgin.Adapters.ParentAdapter
import com.example.demo_desgin.Dashboard.DashboardActivity
import com.example.demo_desgin.Models.ParentModelNew
import com.example.demo_desgin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image_view = findViewById(R.id.im_verfy_arrow_image) as ImageView
        image_view.setOnClickListener {
            val intent = Intent(this@MainActivity, DashboardActivity::class.java)
            startActivity(intent)
        }



       var ParentAdapter: RecyclerView.Adapter<*>? = null
        val parentModelArrayList: java.util.ArrayList<ParentModelNew> = java.util.ArrayList<ParentModelNew>()
        parentModelArrayList.add(ParentModelNew(R.drawable.im_account_image, "Account\n"))
        parentModelArrayList.add(ParentModelNew(R.drawable.security_image, "Security\n"))
        parentModelArrayList.add(ParentModelNew(R.drawable.support_image, "Support\n"))
        parentModelArrayList.add(ParentModelNew(R.drawable.im_privacy_image, "Privacy\n"))
        var parentRecyclerView = findViewById<RecyclerView>(R.id.parent_recyclerview)
        parentRecyclerView.setHasFixedSize(true)
        var parentLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        ParentAdapter = ParentAdapter(parentModelArrayList!!, this@MainActivity,)
        parentRecyclerView.setLayoutManager(parentLayoutManager)
        parentRecyclerView.setAdapter(ParentAdapter)
        ParentAdapter.notifyDataSetChanged()
    }

}
