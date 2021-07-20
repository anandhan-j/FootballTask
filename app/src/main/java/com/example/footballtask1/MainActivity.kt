package com.example.footballtask1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         // Set the LayoutManager that this RecyclerView will use.
        recycler_view_items.layoutManager = LinearLayoutManager(this)

        // Adapter class is initialized and list is passed in the param.
        val itemAdapter = CustomAdapter(getItemsList())

        // adapter instance is set to the recyclerview to inflate the items.
        recycler_view_items.adapter = itemAdapter
    }

    /**
     * Function is used to get the Items List which is added in the list.
     */
    private fun getItemsList(): ArrayList<footballModel> {
        val list = ArrayList<footballModel>()

        list.add(footballModel("India", R.drawable.india))
        list.add(footballModel("BARCELONA", R.drawable.barcelona))
        list.add(footballModel("MANCHESTER UNITED", R.drawable.manchester_united))
        list.add(footballModel("MANCHESTER CITY", R.drawable.mangester_city))

        return list
    }
}