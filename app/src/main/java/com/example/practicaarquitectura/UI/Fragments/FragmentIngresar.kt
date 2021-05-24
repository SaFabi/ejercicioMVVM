package com.example.practicaarquitectura.UI.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.practicaarquitectura.R

class FragmentIngresar: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.login_layout,container,false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val edtCorreo = view.findViewById<EditText>(R.id.edtCorreo);
        val edtPass = view.findViewById<EditText>(R.id.edtpass);
        val btnIngresar = view.findViewById<Button>(R.id.btnIngresar);

    }



}