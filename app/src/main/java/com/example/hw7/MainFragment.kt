package com.example.hw7

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw7.databinding.FragmentMainBinding


class MainFragment : Fragment(), OnClick {

    private val binding: FragmentMainBinding by lazy {
        FragmentMainBinding.inflate(layoutInflater)
    }
    private lateinit var adapter: CarouselAdapter
    private val list = arrayListOf(
        ContinentModel("Africa", "https://images.creativemarket.com/0.1.0/ps/84318/1920/1791/m1/fpnw/wm0/113-map-africa-continent-political-product-zoom-.jpg?1394786363&s=c8d44eea566bfb7b169a008337556160"),
        ContinentModel("Asia", "https://customflagsaustralia.com.au/wp-content/uploads/2022/06/wa-flag.jpg"),
        ContinentModel("Europe", "https://upload.wikimedia.org/wikipedia/commons/b/b7/Flag_of_Europe.svg"),
        ContinentModel("North America", "https://images.twinkl.co.uk/tw1n/image/private/t_630_eco/image_repo/b8/31/t-g-1647443099-flags-of-north-america-display-pack_ver_1.jpg"),
        ContinentModel("South America", "https://preview.redd.it/8acporgyjts61.png?width=1080&crop=smart&auto=webp&s=655adf1575529846b4eb9f2fb1aec0aa21fa03d6"),
        ContinentModel("Australia", "https://upload.wikimedia.org/wikipedia/commons/0/01/Flag_Map_of_Asia.png"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adaptetLoad()
    }

    private fun adaptetLoad() {
        adapter = CarouselAdapter(list, this)
        binding.rvC.adapter = adapter
    }

    override fun onClick(model: ContinentModel) {

        val secondFragment = SecondFragment()


        val bundle = Bundle()
        bundle.putSerializable("continent", model)
        secondFragment.arguments = bundle


        parentFragmentManager.beginTransaction()
            .replace(R.id.container, secondFragment)
            .addToBackStack(null)
            .commit()
    }


}