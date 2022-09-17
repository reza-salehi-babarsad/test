package com.rezoo.myapp39

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerView: RecyclerView =findViewById(R.id.recyclerview)
        recyclerView.layoutManager= LinearLayoutManager(this)
        val mlist=ArrayList<ItemViewModel>()
        for (i in 1..20){
            val itemViewModel=ItemViewModel(R.drawable.avatar,"ahmad","karimi")
            mlist.add(itemViewModel)
        }
        val adapter=CoustomAdapter(mlist)
        recyclerView.adapter=adapter
        Toast.makeText(this,"hihihi",Toast.LENGTH_LONG).show()
    }
}