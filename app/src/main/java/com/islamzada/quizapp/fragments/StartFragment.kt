package com.islamzada.quizapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.islamzada.quizapp.R
import com.islamzada.quizapp.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartBinding.inflate(inflater, container, false)

        binding.startEasy.setOnClickListener {
            findNavController().navigate(R.id.toJunior)
        }

        binding.startMiddle.setOnClickListener {
            findNavController().navigate(R.id.toMiddle)
        }

        return binding.root
    }


}