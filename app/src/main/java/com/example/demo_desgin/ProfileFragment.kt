package com.example.demo_desgin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demo_desgin.Adapters.ParentAdapter
import com.example.demo_desgin.Models.ParentModelNew
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var ParentAdapter: RecyclerView.Adapter<*>? = null
        val parentModelArrayList: java.util.ArrayList<ParentModelNew> = java.util.ArrayList<ParentModelNew>()
        parentModelArrayList.add(ParentModelNew(R.drawable.im_account_image, "Account\n"))
        parentModelArrayList.add(ParentModelNew(R.drawable.security_image, "Security\n"))
        parentModelArrayList.add(ParentModelNew(R.drawable.support_image, "Support\n"))
        parentModelArrayList.add(ParentModelNew(R.drawable.im_privacy_image, "Privacy\n"))

    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var rootView= inflater.inflate(R.layout.fragment_profile, container, false)
        rootView.findViewById<RecyclerView>(R.id.parent_recyclerview)
        var parentRecyclerView = rootView.findViewById<RecyclerView>(R.id.parent_recyclerview)
        parentRecyclerView.setHasFixedSize(true)
        var parentLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        var ParentAdapter: RecyclerView.Adapter<*>? = null
        val parentModelArrayList: java.util.ArrayList<ParentModelNew> = java.util.ArrayList<ParentModelNew>()
      /*  ParentAdapter = ParentAdapter(parentModelArrayList!!, this@MainActivity,)
        parentRecyclerView.setLayoutManager(parentLayoutManager)
        parentRecyclerView.setAdapter(ParentAdapter)
        ParentAdapter.notifyDataSetChanged()*/
        return rootView

    }



}
