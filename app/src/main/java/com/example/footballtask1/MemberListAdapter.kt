package com.example.footballtask1
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class MemberListAdapter(val items: ArrayList<footballModel>) :
    RecyclerView.Adapter<MemberListAdapter.ViewHolder>() {


    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtName: TextView = view.findViewById(R.id.memberName)
       // val txtComment: TextView = view.findViewById(R.id.memberComment)
        val img : ImageView = view.findViewById(R.id.imgAvatar)

        init {
            // Define click listener for the ViewHolder's View.
            itemView.setOnClickListener { val intent = Intent(view.context,PlayerDetails::class.java)
                intent.putExtra("playerName",txtName.text)

                view.context.startActivity(intent)

               // Toast.makeText(view.context, "Item is clicked : ${txtName.text} ", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.row_members, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        // Get element from your dataset at this position and replace the
        // contents of the view with that element

        val country: footballModel = items.get(position)
        // Set item views based on your views and data model
        viewHolder. txtName.text = country.name
        viewHolder.img.setImageResource( country.imageName)

    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int {
        return items.size
    }


}

