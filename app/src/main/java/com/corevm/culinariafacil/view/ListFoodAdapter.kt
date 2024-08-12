package com.corevm.culinariafacil.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.corevm.culinariafacil.R
import com.corevm.culinariafacil.databinding.ItemListFoodBinding
import com.corevm.culinariafacil.model.ExtendedIngredient
import com.corevm.culinariafacil.model.Recipe
import com.squareup.picasso.Picasso

class ListFoodAdapter(
    private val list: List<Recipe>,
    private val listImage: List<String>,
    private val oneItemClickListener: (Int) -> Unit
) : RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListFoodAdapter.ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemListFoodBinding.inflate(inflater, parent, false)
        return ListViewHolder(binding)
        
    }

    override fun onBindViewHolder(holder: ListFoodAdapter.ListViewHolder, position: Int) {
        val itewHolder = list[position]
        val itemImage = listImage.getOrNull(position) ?: ""

        run { //Acessando a classe ExtendedIngredients atraves do objeto principal
            val ingredients = itewHolder.extendedIngredients

//        for (ingredient in ingredients) {
//            holder.bind(ingredient, itemImage)
//        }
//
//        ingredients.map { ing ->
//            holder.bind(ing, itemImage)
//        }

            ingredients.map { holder.bind(it, itemImage) }
        }

        //holder.bind(itewHolder, itemImage)
    }

    override fun getItemCount() = list.size


    inner class ListViewHolder(binding: ItemListFoodBinding): RecyclerView.ViewHolder(binding.root) {

        val img = binding.imageListFood
        val textFood = binding.textListFood
        val duration = binding.durationListFood

        fun bind(item: ExtendedIngredient, imag: String) {
            //Trocar os item
            textFood.text = item.name
            Picasso.get()
                .load(imag)
                .placeholder(R.drawable.ic_launcher_background)
                .into(img)

            oneItemClickListener.invoke(item.id)
        }
    }

}
