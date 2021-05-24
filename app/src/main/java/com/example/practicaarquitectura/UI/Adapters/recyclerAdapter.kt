package com.example.practicaarquitectura.UI.Adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.practicaarquitectura.R
import com.example.practicaarquitectura.UI.model.Libros


class recyclerAdapter(val list: List<Libros>, val context:Context) :
    RecyclerView.Adapter<recyclerAdapter.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageview: ImageView

        init {
            imageview = view.findViewById(R.id.imgLibro)
        }
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_adapter, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        var nombreArchivo = list.get(position).nombreLibro;

        when (nombreArchivo) {
            "book_1.png" -> viewHolder.imageview.setImageResource(R.drawable.book_1)
            "book_2.png" -> viewHolder.imageview.setImageResource(R.drawable.book_2)
            "book_3.png" -> viewHolder.imageview.setImageResource(R.drawable.book_3)
            "book_4.png" -> viewHolder.imageview.setImageResource(R.drawable.book_4)
            "book_5.png" -> viewHolder.imageview.setImageResource(R.drawable.book_5)

            else -> { // Note the block
                print("Resource not found")
            }
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = list.size

}





