package com.corevm.culinariafacil.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.corevm.culinariafacil.R
import com.corevm.culinariafacil.databinding.ItemListFoodBinding
import com.corevm.culinariafacil.data.model.ExtendedIngredient
import com.corevm.culinariafacil.utils.Onclicklister
import com.corevm.culinariafacil.data.model.Recipe
import com.squareup.picasso.Picasso

class ListFoodAdapter(
    private val oneItemClickListener: Onclicklister
) : RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {

    private var list = listOf<Recipe>()
    private var listImage = listOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemListFoodBinding.inflate(inflater, parent, false)
        return ListViewHolder(binding)
        
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val itewHolder = list[position]
        val itemImage = listImage.getOrNull(position) ?: ""

        run { //Acessando a classe ExtendedIngredients atraves do objeto principal
            val ingredients = itewHolder.extendedIngredients


            ingredients.map { holder.bind(it, itemImage) }
        }

    }

    override fun getItemCount() = list.size

    fun addList(lista: List<Recipe> ) {
        list = lista
        notifyDataSetChanged()
    }

    fun addurls(urls: List<String> ) {
        listImage = urls
        notifyDataSetChanged()
    }



    inner class ListViewHolder(private val binding: ItemListFoodBinding): RecyclerView.ViewHolder(binding.root) {

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

//            duration.text =

            //val action = ListFoodFragmentDirections.actionNavAllToNavItem()

            binding.root.setOnClickListener {
                oneItemClickListener.onItemClick(item.id)
            }
        }
    }

}
