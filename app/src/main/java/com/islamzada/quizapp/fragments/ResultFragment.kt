package com.islamzada.quizapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.islamzada.quizapp.R
import com.islamzada.quizapp.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    private lateinit var binding: FragmentResultBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResultBinding.inflate(inflater, container, false)

        binding.buttonRestart.setOnClickListener {
            findNavController().navigate(R.id.toStart)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val correctAnsNo = arguments?.getString("correct")
        val totalAnsNo = arguments?.getString("total")

        binding.correctAns.text = correctAnsNo
        binding.totalAns.text = totalAnsNo

        val percentage = calculatePercentage(correctAnsNo, totalAnsNo)

        updateUI(percentage)
    }

    private fun calculatePercentage(correct: String?, total: String?): Float {
        return if (correct != null && total != null && total.toFloat() != 0f) {
            (correct.toFloat() / total.toFloat()) * 100
        } else {
            0f
        }
    }

    private fun updateUI(percentage: Float) {
        when {
            50 <= percentage && percentage <= 99 -> {
                binding.performance.text = "İYİ"
                binding.output.background = requireContext().resources.getDrawable(R.drawable.option_bg)
            }
            percentage >= 100 -> {
                binding.performance.text = "HARİKA"
                binding.output.background = requireContext().resources.getDrawable(R.drawable.right_bg)
            }
            percentage < 50 -> {
                binding.performance.text = "ZAYIF"
                binding.output.background = requireContext().resources.getDrawable(R.drawable.wrong_bg)
            }
        }
    }

}
