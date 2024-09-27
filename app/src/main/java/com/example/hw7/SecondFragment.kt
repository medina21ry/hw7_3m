package com.example.hw7

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw7.databinding.FragmentSecondBinding


class SecondFragment : Fragment(), OnClick {


    private val binding: FragmentSecondBinding by lazy {
        FragmentSecondBinding.inflate(layoutInflater)
    }
    private lateinit var adapter: SecondAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val continentModel = arguments?.getSerializable("continent") as? ContinentModel


        continentModel?.let {
            county(it.name)
        }
    }

    private fun county(name: String) {
        when (name) {
            "Africa" -> {
                addData(
                    list = listOf(
                        ContinentModel(
                            "Tanzania ",
                            "https://t3.ftcdn.net/jpg/03/90/09/10/360_F_390091061_alwqOJkgDefoNRh2BX082gwwSrmUE46e.jpg"
                        ),
                        ContinentModel(
                            "Nigeria ",
                            "https://t4.ftcdn.net/jpg/05/20/69/95/360_F_520699581_ZAv4yROlYy2OrEXPcSeQKrkWHPTR03YC.jpg"
                        ),
                        ContinentModel(
                            "Algeria",
                            "https://media.istockphoto.com/id/977371988/photo/algerian-flag-background.jpg?s=612x612&w=0&k=20&c=1NTrZ7o0MtLYJS2Vbm8ZPk2H37xjU03BhrSEfBol7sA="
                        ),
                        ContinentModel(
                            "Guinea",
                            "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Flag_of_Guinea-Bissau.svg/640px-Flag_of_Guinea-Bissau.svg.png"
                        ),
                        ContinentModel(
                            "Madagascar",
                            "https://preview.redd.it/5nfx6agpxs671.jpg?width=640&crop=smart&auto=webp&s=f9624fe63d736e91a6077199d585332b8a21f4ab"
                        )
                    )
                )
            }

            "Asia" -> {
                addData(
                    list = listOf(
                        ContinentModel(
                            "Kyrgyzstan",
                            "https://upload.wikimedia.org/wikipedia/commons/c/c7/Flag_of_Kyrgyzstan.svg"
                        ),
                        ContinentModel(
                            "Kazakhstan",
                            "https://www.advantour.com/img/kazakhstan/symbols/kazakhstan-flag.jpg"
                        ),
                        ContinentModel(
                            "Uzbekistan ",
                            "https://www.advantour.com/img/uzbekistan/symbolics/uzbekistan-flag.jpg"
                        ),
                        ContinentModel(
                            "Turkmenistan",
                            "https://hampshireflag.co.uk/wp-content/uploads/2023/03/HFC20Turkmenistan20Flag-416x234.png"
                        ),
                        ContinentModel(
                            "Tadjikistan",
                            "https://koryogroup.com/ckeditor_assets/pictures/870/content_tajikistan_flag_1.jpg"
                        ),
                        ContinentModel(
                            "Шри Ланка",
                            "https://mir.pravo.by/webroot/delivery/images/Sri-Lanka/Flag.jpg"
                        ),
                        ContinentModel(
                            "Мальдивы",
                            "https://img.freepik.com/premium-vector/maldives-vector-flag-maldives-flag-independence-day-grunge-maldives-flag-maldives-flag_471203-287.jpg"
                        ),
                    )
                )
            }

            "Europe" -> {
                addData(
                    list = listOf(
                        ContinentModel(
                            "Италия",
                            "https://evroflag.by/wp-content/uploads/2021/02/%D0%B8%D1%82%D0%B0%D0%BB%D0%B8%D1%8F.jpg"
                        ),
                        ContinentModel(
                            "Shvecaria ",
                            "https://flagof.ru/wp-content/uploads/2018/10/schweiz-flagge.jpg"
                        ),
                        ContinentModel(
                            "Belarus",
                            "https://evroflag.by/wp-content/uploads/2021/02/%D0%B1%D0%B5%D0%BB%D0%B0%D1%80%D1%83%D1%81%D1%8C.jpg"
                        ),
                        ContinentModel(
                            "Monako",
                            "https://img.freepik.com/premium-vector/national-flag-monaco-europe_788692-118.jpg"
                        ),
                        ContinentModel(
                            "Bulgaria",
                            "https://img.goodfon.ru/wallpaper/big/9/af/bolgariya-flag-respublika.webp"
                        ),
                        ContinentModel(
                            "Czech",
                            "https://www.megatour.cz/news/wp-content/uploads/2013/10/Kak-nuzhno-vesti-sebya-v-CHehii.jpg"
                        ),
                        ContinentModel(
                            "Albania",
                            "https://cdn.britannica.com/00/6200-004-42B7690E/Flag-Albania.jpg"
                        ),
                    )
                )
            }

            "North America" -> {
                addData(
                    list = listOf(
                        ContinentModel(
                            "USA",
                            "https://www.ruskniga.com/media/catalog/product/cache/5e44578c7bcfaf8897aa535acf055f26/1/3/132511.jpg"
                        ),
                        ContinentModel(
                            "Canada",
                            "https://flagfs.ru/content/flagi-stran/kanada.jpg"
                        ),
                        ContinentModel(
                            "Mexico",
                            "https://static.wikia.nocookie.net/kaiserreich/images/b/b1/Mexico_Flag.png/revision/latest?cb=20200215132529&path-prefix=ru"
                        ),
                        ContinentModel(
                            "Cuba",
                            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Flag_of_Cuba.svg/800px-Flag_of_Cuba.svg.png"
                        ),
                        ContinentModel(
                            "England",
                            "https://images.emojiterra.com/google/noto-emoji/unicode-15.1/color/1024px/1f1ec-1f1e7.png"
                        ),
                        ContinentModel(
                            "Greenland",
                            "https://i2.wp.com/national-travel.ru/images/flag.jpeg"
                        ),
                        ContinentModel(
                            "Costa Rika",
                            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_Costa_Rica_%28state%29.svg/800px-Flag_of_Costa_Rica_%28state%29.svg.png"
                        ),
                    )
                )
            }

            "South America" -> {
                addData(
                    list = listOf(
                        ContinentModel(
                            "Braziliya",
                            "https://i.ebayimg.com/thumbs/images/g/am4AAOSwkidkfliG/s-l1200.jpg"
                        ),
                        ContinentModel(
                            "Аргентина",
                            "https://visasam.ru/wp-content/uploads/2018/10/flag-argentiny.jpg"
                        ),
                        ContinentModel(
                            "Колумбия",
                            "https://cdn.pixabay.com/photo/2016/06/16/01/23/colombia-1460312_640.jpg"
                        ),
                        ContinentModel(
                            "Венесуэла",
                            "https://s9.travelask.ru/system/images/files/000/007/188/wysiwyg_jpg/venezuela.jpg?1486364850"
                        ),
                        ContinentModel(
                            "Эквадор",
                            "https://img.goodfon.ru/wallpaper/big/d/72/ecuador-ekvador-flag.webp"
                        ),
                        ContinentModel(
                            "Чили",
                            "https://s9.travelask.ru/system/images/files/000/006/971/wysiwyg_jpg/chile_flag.jpg?1486364747"
                        ),
                        ContinentModel(
                            "Перу",
                            "https://img.freepik.com/premium-photo/flag-peru-silk-close-up_406939-899.jpg"
                        ),
                    )
                )
            }

            else -> {
                "Australia"
                addData(
                    list = listOf(
                        ContinentModel("", ""),
                        ContinentModel("", ""),
                        ContinentModel("", ""),
                        ContinentModel("", ""),
                        ContinentModel("", ""),
                        ContinentModel("", ""),
                        ContinentModel("", ""),
                    )
                )
            }
        }
    }

    private fun addData(list: List<ContinentModel>) {
        adapter = SecondAdapter(list, this)
        binding.rvDetail.adapter = adapter
    }

    override fun onClick(model: ContinentModel) {
        val detailFragment = DetailFragment()


        val bundle = Bundle()
        bundle.putSerializable("key", model)
        detailFragment.arguments = bundle


        parentFragmentManager.beginTransaction()
            .replace(R.id.container, detailFragment)
            .addToBackStack(null)
            .commit()
    }

}