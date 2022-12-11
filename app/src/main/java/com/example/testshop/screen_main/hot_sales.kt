package com.example.testshop.screen_main

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.aemerse.slider.ImageCarousel
import com.aemerse.slider.model.CarouselItem
import com.android.volley.NetworkResponse
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.HttpHeaderParser
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.testshop.MainViewModel
import com.example.testshop.apimain
import com.example.testshop.databinding.FragmentHotSalesBinding
import com.google.gson.JsonArray
import org.json.JSONObject
import java.nio.charset.Charset

var img2 : String = "123412sdfasdfassdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdtwertwergsdfgsdfgsdfgsdfgfgdfasfasdfasdfasdfasfasdfasdf3666666666666666666666666666666666666"

class hot_sales : Fragment() {

    private lateinit var binding: FragmentHotSalesBinding
    private  lateinit var text_api: EditText
    private val model: MainViewModel by activityViewModels()

    object GlobalVariable {
        var img : String = "123412sdfasdfassdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdtwertwergsdfgsdfgsdfgsdfgfgdfasfasdfasdfasdfasfasdfasdf3666666666666666666666666666666666666"
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHotSalesBinding.inflate(inflater, container, false)
        updateCurrentCard()
        //connectionapi.butapi(binding.textView)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        butapi("v3")
        updateCurrentCard()
        model.liveDataCurrent.observe(viewLifecycleOwner){

        }

    }

    fun corusel(image: String){
        val carousel: ImageCarousel = binding.carousel
        carousel.registerLifecycle(lifecycle)
        var text = binding.textView
        val list = mutableListOf<CarouselItem>()
        list.add(CarouselItem(
            imageUrl = image,
            caption = "asd"

        ))
        list.add(CarouselItem(
            imageUrl = image,

            caption = "Samsung Galaxy A71, Súper. Mega. Rápido."
        ))
        list.add(CarouselItem(
            imageUrl = image,
            caption = "Xiaomi Mi 11, Súper. Mega. Rápido."
        ))
        carousel.setData(list)
    }

    private fun getList(item: apimain): List<apimain> {
        val idArray = JsonArray()
        val list = ArrayList<apimain>()

    }

    //подключение
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    fun butapi(string: String) {
        val queue = Volley.newRequestQueue(getActivity()?.getApplicationContext());
        val url = "https://run.mocky.io/$string/654bd15e-b121-49ba-a588-960956b15175"
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            {
                response -> parseWeatherData(response)
            },
            {

            })
        queue.add(stringRequest)
    }

    private fun updateCurrentCard() = with(binding){
        // наш опсервер
        var image: String
        model.liveDataCurrent.observe(viewLifecycleOwner){
            corusel(image = it.picture)

        }

    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private fun parseWeatherData (response: String){
        val mainObject = JSONObject(response)
        val list = apphot(mainObject)
        parseCurrentData(mainObject, list[0])
    }

    //инициализация массива
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private fun apphot(mainObjects: JSONObject): List<apimain>{
        val list = ArrayList<apimain>()
        val apiselect = mainObjects.getJSONArray("home_store")
        for (i in 0 until apiselect.length()){
            val listcarusel = apiselect[i] as JSONObject
            if (listcarusel.isNull("is_new")) { listcarusel.append("is_new","") }
            val item = apimain(
                listcarusel.getString("id"),
                listcarusel.getString("is_new"),
                listcarusel.getString("title"),
                listcarusel.getString("subtitle"),
                listcarusel.getString("picture"),
                listcarusel.getString("is_buy")
            )

            list.add(item)
        }
        return list
    }

    //карточка объекта
    private fun parseCurrentData (mainObject: JSONObject, weatherItem: apimain) {
        val item = apimain(
            weatherItem.id,
            weatherItem.is_new,
            weatherItem.title,
            weatherItem.subtitle,
            weatherItem.picture,
            weatherItem.is_buy
        )
        model.liveDataCurrent.value = item
    }
    companion object {
        @JvmStatic
        fun fragment2() = hot_sales()
    }
}


