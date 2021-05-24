package com.example.practicaarquitectura.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.practicaarquitectura.UI.model.Libros
import com.example.practicaarquitectura.domain.LibrosUseCase

class viewModelColl1 : ViewModel() {

    val librosuseCase = LibrosUseCase()
    private val listdata = MutableLiveData<List<Libros>>()

    //UNA VEZ QUE SE INICIALICE LA INSTANCIA, SE EJECUTA ESTE METODO
    init {
        getListaLibros()
    }

    fun setListData(listaLibros : List<Libros>){
        listdata.value = listaLibros;
    }

    fun getListaLibros(){
        setListData(librosuseCase.obtenerListaLibros())
    }

    fun getListaLibrosLiveData(): LiveData<List<Libros>>{
        return listdata;
    }


}