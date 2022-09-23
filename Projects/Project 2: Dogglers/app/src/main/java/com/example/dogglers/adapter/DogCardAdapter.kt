package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.const.Layout.GRID
import com.example.dogglers.data.DataSource

class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {


    private val dogList = DataSource.dogs

    class DogCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {

        val dogImageView: ImageView? = view!!.findViewById(R.id.dog_image)
        val dogNameTextView: TextView? = view!!.findViewById(R.id.dog_name)
        val dogAgeTextView: TextView? = view!!.findViewById(R.id.dog_age)
        val dogHobbyTextView: TextView? = view!!.findViewById(R.id.dog_hobby)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val adapterLayout = when (layout) {
            GRID -> LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false)
            else -> LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item, parent, false)
        }
        return DogCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return dogList.size
    }

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {

        val dogData = dogList[position]

        holder.dogImageView?.setImageResource(dogData.imageResourceId)

        holder.dogNameTextView?.text = dogData.name

        val resources = context?.resources
        holder.dogAgeTextView?.text = resources?.getString(R.string.dog_age, dogData.age)
        holder.dogHobbyTextView?.text = resources?.getString(R.string.dog_hobbies, dogData.hobbies)
    }
}