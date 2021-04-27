package com.dioinnovation.livedio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class MenuItemAdapter: RecyclerView.Adapter<MenuItemAdapter.MenuItemAdapterViewHolder>() {

    private val list = mutableListOf<MenuItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false)
        return MenuItemAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuItemAdapterViewHolder, position: Int) {
        holder.startViews(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MenuItemAdapterViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView){

        fun startViews(item: MenuItemModel){

        }
    }
}