package com.corevm.culinariafacil.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.corevm.culinariafacil.databinding.ItemListFoodBinding
import com.corevm.culinariafacil.model.ExtendedIngredient
import com.corevm.culinariafacil.model.Recipe

class ListFoodAdapter(private val list: List<ExtendedIngredient>) : RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListFoodAdapter.ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemListFoodBinding.inflate(inflater, parent, false)
        return ListViewHolder(binding)
        
    }

    override fun onBindViewHolder(holder: ListFoodAdapter.ListViewHolder, position: Int) {
        val itewHolder = list[position]
        holder.bind(itewHolder)
    }

    override fun getItemCount() = list.size


    inner class ListViewHolder(binding: ItemListFoodBinding): RecyclerView.ViewHolder(binding.root) {

        val img = binding.imageListFood
        val textFood = binding.textListFood
        val duration = binding.durationListFood

        fun bind(item: ExtendedIngredient) {
            //Trocar os item
            textFood.text = item.name

        }
    }

}
