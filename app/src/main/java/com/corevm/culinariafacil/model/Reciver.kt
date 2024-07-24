package com.corevm.culinariafacil.model

import com.google.gson.annotations.SerializedName

data class ListReceives(
    @SerializedName("preparationMinutes") val duration: String,
    @SerializedName("extendedIngredients") val receita: List<Reciver>
)

data class Reciver(
    val name: String,
    val image: String
)
