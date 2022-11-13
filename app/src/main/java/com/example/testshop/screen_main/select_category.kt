package com.example.testshop.screen_main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.testshop.R
import com.example.testshop.databinding.FragmentSelectCategoryBinding


class select_category : Fragment() {

    private lateinit var binding: FragmentSelectCategoryBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectCategoryBinding.inflate(inflater, container, false)

        binding.button1.setOnClickListener {
            buttonclick()
                binding.button1.setImageResource(R.drawable.ic_button_select_category_phone_on)
                binding.button1.setBackgroundResource(R.drawable.button_select_category)
        }

        binding.button2.setOnClickListener {
                buttonclick()
                binding.button2.setImageResource(R.drawable.ic_button_select_category_comp_on)
                binding.button2.setBackgroundResource(R.drawable.button_select_category)
        }

        binding.button3.setOnClickListener {
                buttonclick()
                binding.button3.setImageResource(R.drawable.ic_button_select_category_health_on)
                binding.button3.setBackgroundResource(R.drawable.button_select_category)
        }

        binding.button4.setOnClickListener {
            buttonclick()
                binding.button4.setImageResource(R.drawable.ic_button_select_category_book_on)
                binding.button4.setBackgroundResource(R.drawable.button_select_category)
        }
        return binding.root
    }

    private fun buttonclick (){
        binding.button1.setImageResource(R.drawable.ic_button_select_category_phone_off)
        binding.button1.setBackgroundResource(R.drawable.button_select_category_off)

        binding.button2.setImageResource(R.drawable.ic_button_select_category_comp_off)
        binding.button2.setBackgroundResource(R.drawable.button_select_category_off)

        binding.button3.setImageResource(R.drawable.ic_button_select_category_health_off)
        binding.button3.setBackgroundResource(R.drawable.button_select_category_off)

        binding.button4.setImageResource(R.drawable.ic_button_select_category_book_off)
        binding.button4.setBackgroundResource(R.drawable.button_select_category_off)


    }

    companion object {
        @JvmStatic
        fun fragment1() = select_category()
    }


}



