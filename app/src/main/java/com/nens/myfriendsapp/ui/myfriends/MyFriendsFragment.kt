package com.nens.myfriendsapp.ui.myfriends

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.nens.myfriendsapp.databinding.FragmentMyfriendsBinding

class MyFriendsFragment : Fragment() {

    private var binding: FragmentMyfriendsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val myFriendsViewModel =
            ViewModelProvider(this).get(MyFriendsViewModel::class.java)

        binding = FragmentMyfriendsBinding.inflate(inflater, container, false)

        return binding!!.root
    }

}