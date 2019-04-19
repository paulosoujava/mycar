package br.com.mycar.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import br.com.mycar.R
import br.com.mycar.model.contract.MainContract
import br.com.mycar.model.entity.Place

class PlaceAdapter(
    private val list: List<Place>,
    private val context: Context,
    private  val view: MainContract
) : RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val place = list[position]
        holder?.let {
            it.bindView(place)
            view.click(place)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_place, parent, false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(place: Place) {
            //val title = itemView.note_item_title
            //title.text = place.title

        }

    }


}