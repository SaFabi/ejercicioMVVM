package com.example.practicaarquitectura.UI.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practicaarquitectura.R
import com.example.practicaarquitectura.UI.Adapters.recyclerAdapter
import com.example.practicaarquitectura.UI.model.Libros
import com.example.practicaarquitectura.ViewModel.viewModelColl1

class FragmentHome : Fragment(){

    private lateinit var viewModel  : viewModelColl1
    private var edtSearch  : EditText? = null
    private var rcvColl1   : RecyclerView? = null
    private var rcvColl2   : RecyclerView? = null



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.home_layout,container,false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        viewModel = ViewModelProviders.of(this).get(viewModelColl1::class.java)

        val librosObserver = Observer<List<Libros>>{
            rcvColl1?.adapter = recyclerAdapter(it,requireContext());
            rcvColl2?.adapter = recyclerAdapter(it,requireContext());
        }
        viewModel.getListaLibrosLiveData().observe(this,librosObserver)

        edtSearch = view.findViewById<EditText>(R.id.edtSearch)
        rcvColl1 = view.findViewById<RecyclerView>(R.id.rcvLista1)
        rcvColl2 = view.findViewById<RecyclerView>(R.id.rcvList2)


       rcvColl1?.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        rcvColl2?.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)


    }
}