package com.example.footballtask1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.team_members.*

class FootballTeam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.team_members)

        // Set the LayoutManager that this RecyclerView will use.
        recycler_view_members.layoutManager = GridLayoutManager(this,2)

        val actionBar:ActionBar? = supportActionBar
        //actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.title = "Team Members"
        var intent = intent
        var cname = intent.getStringExtra("countryName")



        when (cname) {
            "India" -> Toast.makeText(this@FootballTeam, "Item is clicked : ${cname}", Toast.LENGTH_SHORT).show()
            "BARCELONA" -> Toast.makeText(this@FootballTeam, "Item is clicked : ${cname}", Toast.LENGTH_SHORT).show()
            "MANCHESTER UNITED" -> {
                // Adapter class is initialized and list is passed in the param.
                val   itemAdapter = MemberListAdapter(getItemsList())
                recycler_view_members.adapter = itemAdapter
            }
                "MANCHESTER CITY" -> Toast.makeText(this@FootballTeam, "Item is clicked : ${cname}", Toast.LENGTH_SHORT).show()
            else -> { // Note the block
                print("x is neither 1 nor 2")
            }
        }

    }
    private fun getItemsList(): ArrayList<footballModel> {
        val list = ArrayList<footballModel>()

        list.add(footballModel("Dean Henderson", R.drawable.deanh_enderson))
        list.add(footballModel("Harry Maguire", R.drawable.harry_maguire))
        list.add(footballModel("James Garner", R.drawable.james_garner))
        list.add(footballModel("Andreas Pereira", R.drawable.andreas_pereira))

        return list
    }

}