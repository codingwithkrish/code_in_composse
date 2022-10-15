package com.example.ngo_compose

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [donation.newInstance] factory method to
 * create an instance of this fragment.
 */
class donation : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var adapter: DonationAdapter
    private  lateinit var recyclerView: RecyclerView
    private lateinit var arrayList: ArrayList<Dontion_model>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_donation, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment donation.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            donation().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataint()
        val layoutManager = LinearLayoutManager(context)

        recyclerView = view.findViewById(R.id.rec2)

        // this creates a vertical layout Manager
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = DonationAdapter(arrayList)
        recyclerView.adapter=adapter

    }
    private  fun dataint(){
        arrayList = arrayListOf<Dontion_model>()
        arrayList.add(Dontion_model(R.drawable.a,"snehalaya","We make a living by what we get, but we make a life by what we give"))
        arrayList.add(Dontion_model(R.drawable.b,"The Live Love Laugh Foundation","Good actions give strength to ourselves and inspire good actions in others"))
        arrayList.add(Dontion_model(R.drawable.c,"CRY (Child Rights and You)","An effort made for the happiness of others lifts us above ourselves"))
        arrayList.add(Dontion_model(R.drawable.d,"Smile Foundation","The best way to find yourself is to lose yourself in the service of others"))
        arrayList.add(Dontion_model(R.drawable.e,"Goonj","As one person I cannot change the world, but I can change the world of one person"))

    }
}