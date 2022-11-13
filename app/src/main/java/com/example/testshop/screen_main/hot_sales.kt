package com.example.testshop.screen_main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aemerse.slider.ImageCarousel
import com.aemerse.slider.model.CarouselItem
import com.example.testshop.R
import com.example.testshop.databinding.FragmentHotSalesBinding



class hot_sales : Fragment() {

    private lateinit var binding: FragmentHotSalesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHotSalesBinding.inflate(inflater, container, false)
        val carousel: ImageCarousel = binding.carousel
        carousel.registerLifecycle(lifecycle)


        val list = mutableListOf<CarouselItem>()
        list.add(CarouselItem(
            imageDrawable = R.drawable.icone1_hot_sales,))

        carousel.setData(list)

        return binding.root
    }
    companion object {
        @JvmStatic
        fun fragment2() = hot_sales()
    }
}


