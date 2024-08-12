//package com.corevm.culinariafacil.model
//
//class Sponde : ArrayList<SpondeItem>()
//
//data class SpondeItem(
//    val aggregateLikes: Int,
//    val analyzedInstructions: List<Any>,
//    val approved: Int,
//    val cheap: Boolean,
//    val cookingMinutes: Int,
//    val creditsText: String,
//    val cuisines: List<Any>,
//    val dairyFree: Boolean,
//    val diets: List<String>,
//    val dishTypes: List<String>,
//    val extendedIngredients: List<ExtendedIngredient>,
//
//    val gaps: String,
//    val glutenFree: Boolean,
//    val healthScore: Int,
//    val id: Int,
//    val image: String,
//    val imageType: String,
//    val instructions: String,
//    val license: String,
//    val lowFodmap: Boolean,
//    val occasions: List<String>,
//    val openLicense: Int,
//    val originalId: Any,
//    val preparationMinutes: Int,
//    val pricePerServing: Double,
//    val readyInMinutes: Int,
//    val report: Any,
//    val servings: Int,
//    val sourceName: String,
//    val sourceUrl: String,
//    val spoonacularScore: Double,
//    val spoonacularSourceUrl: String,
//    val summary: String,
//    val suspiciousDataScore: Double,
//    val sustainable: Boolean,
//    val tips: Tips,
//    val title: String,
//    val unknownIngredients: List<Any>,
//    val userTags: List<Any>,
//    val vegan: Boolean,
//    val vegetarian: Boolean,
//    val veryHealthy: Boolean,
//    val veryPopular: Boolean,
//    val weightWatcherSmartPoints: Int,
//    val winePairing: WinePairing
//)
//
//data class ExtendedIngredient(
//    val aisle: String,
//    val amount: Double,
//    val consistency: String,
//    val id: Int,
//    val image: String,
//    val measures: Measures,
//    val meta: List<String>,
//    val name: String,
//    val nameClean: String,
//    val original: String,
//    val originalName: String,
//    val unit: String
//)
//
//data class Tips(
//    val cooking: List<String>,
//    val green: List<Any>,
//    val health: List<String>,
//    val price: List<String>
//)
//
//data class WinePairing(
//    val pairedWines: List<String>,
//    val pairingText: String,
//    val productMatches: List<ProductMatche>
//)
//
//data class Measures(
//    val metric: Metric,
//    val us: Us
//)
//
//data class Metric(
//    val amount: Double,
//    val unitLong: String,
//    val unitShort: String
//)
//
//data class Us(
//    val amount: Double,
//    val unitLong: String,
//    val unitShort: String
//)
//
//data class ProductMatche(
//    val averageRating: Double,
//    val description: String,
//    val id: Int,
//    val imageUrl: String,
//    val link: String,
//    val price: String,
//    val ratingCount: Double,
//    val score: Double,
//    val title: String
//)