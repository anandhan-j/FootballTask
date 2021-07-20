package com.example.footballtask1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.player_details.*


class PlayerDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.player_details)

        // Set the LayoutManager that this RecyclerView will use.

        val actionBar: ActionBar? = supportActionBar
        //actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.title = "Details"
        var intent = intent
        var pName = intent.getStringExtra("playerName")

        txtName.text = pName

        // Adapter class is initialized and list is passed in the param.
        when (pName) {
            "Dean Henderson" -> Toast.makeText(this@PlayerDetails, "Item is clicked : ${pName}", Toast.LENGTH_SHORT).show()
            "Harry Maguire" -> Toast.makeText(this@PlayerDetails, "Item is clicked : ${pName}", Toast.LENGTH_SHORT).show()
            "James Garner" -> {
                view_pager.adapter = DetailAdapter(this,getItemsList())
                txtDesc.text = "James David Garner (born 13 March 2001) is an English professional footballer who plays as a midfielder for Premier League club Manchester United. Recognized for his exceptional passing, shooting and dribbling abilities, he is widely considered to be one of the best young players at the club."
            }
            "Andreas Pereira" -> Toast.makeText(this@PlayerDetails, "Item is clicked : ${pName}", Toast.LENGTH_SHORT).show()
            else -> { // Note the block
                print("x is neither 1 nor 2")
            }
        }
       // Adapter class is initialized and list is passed in the param.


    }
    private fun getItemsList(): ArrayList<DetailsModel> {
        val list = ArrayList<DetailsModel>()

        list.add(DetailsModel(R.drawable.deanh_enderson1))
        list.add(DetailsModel(R.drawable.deanh_enderson2))
        list.add(DetailsModel(R.drawable.deanh_enderson3))

        return list
    }

}