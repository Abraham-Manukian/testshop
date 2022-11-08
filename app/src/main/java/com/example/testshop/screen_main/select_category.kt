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


        binding.button2.setOnClickListener {
            /*if (flag) {
                binding.button2.setImageResource(R.drawable.ic_button_select_category)
                flag = false
            } else {
                binding.button2.setImageResource(R.drawable.ic_button_select_category_on)
                flag = true

            }*/
            buttonclick(1)
        }
        binding.button1.setOnClickListener{buttonclick(0)}
        binding.button3.setOnClickListener{buttonclick(2)}
        binding.button4.setOnClickListener{buttonclick(3)}
        return binding.root
    }
    var buttons = arrayOf(
        binding.button1,
        binding.button2,
        binding.button3,
        binding.button4)


    private fun buttonclick(x: Int) {
        if (flag){
            buttons[x].setImageResource(R.drawable.ic_button_select_category_on)
            buttons[x].setBackgroundResource(R.drawable.button_select_category_off)
            flag = false
        }
        else{
            buttons[x].setImageResource(R.drawable.ic_button_select_category)
            buttons[x].setBackgroundResource(R.drawable.button_select_category_on)
            flag = true
        }


    }

    companion object {
        @JvmStatic
        fun newInstance() = select_category()
    }


}



