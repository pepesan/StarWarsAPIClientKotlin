package com.example.starwarsapiclientkotlin

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {
    private val starWarsViewModel: StarWarsViewModel by viewModels {
        StarWarsViewModelFactory((activity?.application as StarWarsApplication).service)
    }


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("app","haciendo la llamada")
        starWarsViewModel.getPeopleById(1)
        starWarsViewModel.selectedItem?.observe(requireActivity()){
            Log.d("app", "Observed item: $it")
            view.findViewById<TextView>(R.id.textview_name).text=it?.name
        }
    }
}