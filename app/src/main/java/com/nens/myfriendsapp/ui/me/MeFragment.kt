package com.nens.myfriendsapp.ui.me

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.nens.myfriendsapp.databinding.FragmentMeBinding

class MeFragment : Fragment() {

    private var binding: FragmentMeBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val meViewModel =
            ViewModelProvider(this).get(MeViewModel::class.java)

        binding = FragmentMeBinding.inflate(inflater, container, false)

        return binding!!.root
    }


}