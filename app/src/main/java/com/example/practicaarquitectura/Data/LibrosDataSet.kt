package com.example.practicaarquitectura.Data

import com.example.practicaarquitectura.UI.model.Libros

class LibrosDataSet {

    fun createListOfLibros():List<Libros>{
        return listOf(
            Libros("book_1.png"),
            Libros("book_2.png"),
            Libros("book_3.png"),
            Libros("book_4.png"),
            Libros("book_5.png"),
        )

    }

}