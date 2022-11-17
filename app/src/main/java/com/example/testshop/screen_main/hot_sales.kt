package com.example.testshop.screen_main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aemerse.slider.ImageCarousel
import com.aemerse.slider.model.CarouselItem
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.testshop.MainViewModel
import com.example.testshop.R
import com.example.testshop.apimain
import com.example.testshop.databinding.FragmentHotSalesBinding
import org.json.JSONObject


class hot_sales : Fragment() {

    private lateinit var binding: FragmentHotSalesBinding
   // private val model: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHotSalesBinding.inflate(inflater, container, false)
        val carousel: ImageCarousel = binding.carousel
        carousel.registerLifecycle(lifecycle)


        val list = mutableListOf<CarouselItem>()
        list.add(CarouselItem(
            imageUrl = "https://img.ibxk.com.br/2020/09/23/23104013057475.jpg?w=1120&h=420&mode=crop&scale=both",
            caption = "Iphone 10, Súper. Mega. Rápido."
        ))
        list.add(CarouselItem(
            imageUrl = "https://cdn-2.tstatic.net/kupang/foto/bank/images/pre-order-samsung-galaxy-a71-laris-manis-inilah-rekomendasi-ponsel-harga-rp-6-jutaan.jpg",
            caption = "Samsung Galaxy A71, Súper. Mega. Rápido."
        ))
        list.add(CarouselItem(
            imageUrl = "https://static.digit.in/default/942998b8b4d3554a6259aeb1a0124384dbe0d4d5.jpeg",
            caption = "Xiaomi Mi 11, Súper. Mega. Rápido."
        ))
        carousel.setData(list)
        return binding.root
    }
/*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requestWeatherData(1)
    }
    private fun requestWeatherData(id: Int) {
        val url = "https://run.mocky.io/v3/654bd15e-b121-49ba-a588-960956b15175"
        val queue = Volley.newRequestQueue (context)
        val request = StringRequest(
            Request.Method.GET,
            url,
            {
                result -> parseData(result)
            },
            {
                error -> Log.d("MyLog", "Error: $error")
            }
        )
        queue.add(request)
    }
    private fun parseData(result: String){
        val mainObjects = JSONObject(result)
        val item = apimain(
            mainObjects.getJSONObject("home_store").getInt("id"),
            mainObjects.getJSONObject("home_store").getBoolean("is_new"),
            mainObjects.getJSONObject("home_store").getString("title"),
            mainObjects.getJSONObject("home_store").getString("subtitle"),
            mainObjects.getJSONObject("home_store").getString("picture"),
            mainObjects.getJSONObject("home_store").getBoolean("is_buy")
        )
       // val list = apphot(mainObjects)
        Log.d("MyLog", "id: ${item.id}")
        Log.d("MyLog", "buy: ${item.is_buy}")

    }

   private fun apphot(mainObjects: JSONObject): List<apimain>{
        val list = ArrayList<apimain>()
        val apiselect = mainObjects.getJSONObject("").getJSONArray("home_store")
        for (i in 0 until apiselect.length()){
            val listcarusel = apiselect[i] as JSONObject
            val item = apimain(
                listcarusel.getJSONObject("home_store").getInt("id"),
                listcarusel.getJSONObject("home_store").getBoolean("is_new"),
                listcarusel.getJSONObject("home_store").getString("title"),
                listcarusel.getJSONObject("home_store").getString("subtitle"),
                listcarusel.getJSONObject("home_store").getString("picture"),
                listcarusel.getJSONObject("home_store").getBoolean("is_buy")
            )
            list.add(item)
        }
        return list
    }*/

        companion object {
        @JvmStatic
        fun fragment2() = hot_sales()
    }
}


