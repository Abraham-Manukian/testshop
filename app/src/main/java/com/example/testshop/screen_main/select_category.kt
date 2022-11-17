package com.example.testshop.screen_main

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.testshop.R
import com.example.testshop.databinding.FragmentSelectCategoryBinding


class select_category : Fragment() {

    private lateinit var binding: FragmentSelectCategoryBinding


    @SuppressLint("ResourceAsColor")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectCategoryBinding.inflate(inflater, container, false)

        binding.button1.setOnClickListener {
            buttonclick()
            binding.button1.setImageResource(R.drawable.ic_button_select_category_phone_on)
            binding.button1.setBackgroundResource(R.drawable.button_select_category)
            binding.phones.setTextColor(R.color.textOn)
        }

        binding.button2.setOnClickListener {
            buttonclick()
            binding.button2.setImageResource(R.drawable.ic_button_select_category_comp_on)
            binding.button2.setBackgroundResource(R.drawable.button_select_category)
            binding.computer.setTextColor(R.color.textOn)
        }

        binding.button3.setOnClickListener {
            buttonclick()
            binding.button3.setImageResource(R.drawable.ic_button_select_category_health_on)
            binding.button3.setBackgroundResource(R.drawable.button_select_category)
            binding.health.setTextColor(R.color.textOn)
        }

        binding.button4.setOnClickListener {
            buttonclick()
            binding.button4.setImageResource(R.drawable.ic_button_select_category_book_on)
            binding.button4.setBackgroundResource(R.drawable.button_select_category)
            binding.books.setTextColor(R.color.textOn)
        }
        return binding.root
    }

    @SuppressLint("ResourceAsColor")
    private fun buttonclick (){
        binding.button1.setImageResource(R.drawable.ic_button_select_category_phone_off)
        binding.button1.setBackgroundResource(R.drawable.button_select_category_off)
        binding.phones.setTextColor(R.color.textOff)

        binding.button2.setImageResource(R.drawable.ic_button_select_category_comp_off)
        binding.button2.setBackgroundResource(R.drawable.button_select_category_off)
        binding.computer.setTextColor(R.color.textOff)

        binding.button3.setImageResource(R.drawable.ic_button_select_category_health_off)
        binding.button3.setBackgroundResource(R.drawable.button_select_category_off)
        binding.health.setTextColor(R.color.textOff)

        binding.button4.setImageResource(R.drawable.ic_button_select_category_book_off)
        binding.button4.setBackgroundResource(R.drawable.button_select_category_off)
        binding.books.setTextColor(R.color.textOff)


    }

    companion object {
        @JvmStatic
        fun fragment1() = select_category()
    }


}



