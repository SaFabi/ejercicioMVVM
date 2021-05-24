package com.example.practicaarquitectura.domain

import com.example.practicaarquitectura.Data.LibrosDataSet
import com.example.practicaarquitectura.UI.model.Libros

class LibrosUseCase {
    private val librosDataSet = LibrosDataSet()

    fun obtenerListaLibros(): List<Libros>{
        return librosDataSet.createListOfLibros()
    }
}