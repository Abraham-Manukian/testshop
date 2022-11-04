package com.example.testshop.screen_main

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.testshop.databinding.FragmentSelectCategoryBinding


class select_category : Fragment() {



    private lateinit var binding: FragmentSelectCategoryBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSelectCategoryBinding.inflate(inflater, container, false)

        binding.button1.setOnClickListener{
            binding.button1.background.setTint(Color.GREEN)
        }
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = select_category()
    }


}