package com.corevm.culinariafacil.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.corevm.culinariafacil.data.model.Recipe
import com.corevm.culinariafacil.repository.ListFoodRepository
import kotlinx.coroutines.launch

class ListFoodViewModel: ViewModel() {

    private val repository = ListFoodRepository()

    private val _imgsUrls = MutableLiveData<List<String>>()
    val allImgsUrls: LiveData<List<String>> get() = _imgsUrls

    private val _allRecipes = MutableLiveData<List<Recipe>>()
    val allRecipes: LiveData<List<Recipe>> get() = _allRecipes

    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String> get() = _errorMessage

    fun getListFood() = viewModelScope.launch {

        try {

            val listFoods = repository.getListFood()
            _allRecipes.value = listFoods
            _imgsUrls.value = listFoods.map { it.image }

        } catch(e: Exception) {

            _errorMessage.value = e.message ?: "Not Found"

        }
    }
}