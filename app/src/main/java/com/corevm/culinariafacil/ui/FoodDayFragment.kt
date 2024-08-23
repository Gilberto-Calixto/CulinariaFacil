package com.corevm.culinariafacil.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.corevm.culinariafacil.R

class FoodDayFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_food_day, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


    }

}