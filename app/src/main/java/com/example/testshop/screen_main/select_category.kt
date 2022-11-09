package com.example.testshop.screen_main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.testshop.R
import com.example.testshop.databinding.FragmentSelectCategoryBinding
import java.time.temporal.ValueRange


class select_category : Fragment() {


    var a = 10
    private lateinit var binding: FragmentSelectCategoryBinding
    var flag = true


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSelectCategoryBinding.inflate(inflater, container, false)

        binding.button1.setOnClickListener {
            if (flag) {
                binding.button1.setImageResource(R.drawable.ic_button_select_category)
                binding.button1.setBackgroundResource(R.drawable.button_select_category_on)
                flag = false
            } else {
                binding.button1.setImageResource(R.drawable.ic_button_select_category_on)
                binding.button1.setBackgroundResource(R.drawable.button_select_category_off)
                flag = true
            }
        }

        binding.button2.setOnClickListener {
            if (flag) {
                binding.button2.setImageResource(R.drawable.ic_button_select_category)
                binding.button2.setBackgroundResource(R.drawable.button_select_category_on)
                flag = false
            } else {
                binding.button2.setImageResource(R.drawable.ic_button_select_category_on)
                binding.button2.setBackgroundResource(R.drawable.button_select_category_off)
                flag = true
            }
        }

        binding.button3.setOnClickListener {
            if (flag) {
                binding.button3.setImageResource(R.drawable.ic_button_select_category)
                binding.button3.setBackgroundResource(R.drawable.button_select_category_on)
                flag = false
            } else {
                binding.button3.setImageResource(R.drawable.ic_button_select_category_on)
                binding.button3.setBackgroundResource(R.drawable.button_select_category_off)
                flag = true
            }
        }

        binding.button4.setOnClickListener {
            if (flag) {
                binding.button4.setImageResource(R.drawable.ic_button_select_category)
                binding.button4.setBackgroundResource(R.drawable.button_select_category_on)
                flag = false
            } else {
                binding.button4.setImageResource(R.drawable.ic_button_select_category_on)
                binding.button4.setBackgroundResource(R.drawable.button_select_category_off)
                flag = true

            }
        }
        return binding.root
    }
   /* var buttons = arrayOf(
        binding.button1,
        binding.button2,
        binding.button3,
        binding.button4)*/


    private fun buttonclick (){
        binding.button4.setImageResource(R.drawable.ic_button_select_category_on)
        binding.button4.setBackgroundResource(R.drawable.button_select_category_off)


    }

    companion object {
        @JvmStatic
        fun newInstance() = select_category()
    }


}



