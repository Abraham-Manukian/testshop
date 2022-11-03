package com.example.testshop.screen_main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testshop.R
import com.example.testshop.databinding.FragmentSelectCategoryBinding

class select_category : Fragment() {
    private lateinit var binding: FragmentSelectCategoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSelectCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = select_category()
    }
}