package com.example.footballtask1
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_details.view.*


class DetailAdapter(val context: Context,val items: ArrayList<DetailsModel>) :
    RecyclerView.Adapter<DetailAdapter.PageHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */

    class PageHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imageView:ImageView = view.imageView
        init {
            // Define click listener for the ViewHolder's View.
            imageView.setOnClickListener {
                Toast.makeText(view.context, "Item is clicked", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): PageHolder {
        // Create a new view, which defines the UI of the list item
        return  PageHolder(LayoutInflater.from(context).inflate(R.layout.row_details, viewGroup, false))
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(PageHolder: PageHolder, position: Int) {
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        val details: DetailsModel = items.get(position)
        //viewHolder. txtComment.text = country.imageName
        PageHolder.imageView.setImageResource( details.pimg)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int {
        return items.size
    }


}


