package com.nens.myfriendsapp.ui.myfamily

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.nens.myfriendsapp.databinding.FragmentMyfamilyBinding

class MyFamilyFragment : Fragment() {

    private var binding: FragmentMyfamilyBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val myFamilyViewModel =
            ViewModelProvider(this).get(MyFamilyViewModel::class.java)

        binding = FragmentMyfamilyBinding.inflate(inflater, container, false)

        return binding!!.root
    }

}