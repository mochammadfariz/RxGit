package com.example.rxgit.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rxgit.R
import com.example.rxgit.model.gitRepos
import kotlinx.android.synthetic.main.item_starred.view.*

class recyclerViewAdapter : RecyclerView.Adapter<recyclerViewAdapter.gitViewHolder>() {

    val data = ArrayList<gitRepos>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): gitViewHolder {
        return gitViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_starred, parent, false))
    }

    override fun getItemCount(): Int =  data.size //return


    override fun onBindViewHolder(holder1: gitViewHolder, position: Int) {
        holder1.fullnameVH.text = data[position].full_name
        holder1.starVH.text = data[position].stars
        holder1.descVH.text = data[position].description
        holder1.langVH.text = data[position].language
    }

    class gitViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val fullnameVH = view.fullName
        val descVH = view.desc
        val langVH = view.language
        val starVH = view.star
    }
}