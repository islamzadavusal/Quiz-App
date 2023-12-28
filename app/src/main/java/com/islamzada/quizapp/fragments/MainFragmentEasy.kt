package com.islamzada.quizapp.fragments

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import com.islamzada.quizapp.R
import com.islamzada.quizapp.databinding.FragmentMainEasyBinding
import com.islamzada.quizapp.model.QuestionModel
import com.islamzada.quizapp.repo.QuestionRepositoryEasy
import java.util.Locale
import java.util.concurrent.TimeUnit

class MainFragmentEasy : Fragment() {

    private lateinit var binding: FragmentMainEasyBinding

    lateinit var questionsList: ArrayList<QuestionModel>
    private var index: Int = 0
    lateinit var questionModel: QuestionModel

    private val questionRepositoryEasy = QuestionRepositoryEasy()

    private var correctAnswerCount: Int = 0
    private var wrongAnswerCount: Int = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainEasyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        questionsList = ArrayList()
        questionsList = questionRepositoryEasy.getQuestions()

        questionModel = questionsList[index]

        setAllQuestions()

        countdown()

        binding.option1.setOnClickListener {
            option1Clicked(view)
        }

        binding.option2.setOnClickListener {
            option2Clicked(view)
        }

        binding.option3.setOnClickListener {
            option3Clicked(view)
        }

        binding.option4.setOnClickListener {
            option4Clicked(view)
        }

    }

    fun countdown() {
        val duration: Long = TimeUnit.SECONDS.toMillis(11)

        object : CountDownTimer(duration, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val sDuration: String = String.format(
                    Locale.ENGLISH,
                    "%02d:%02d",
                    TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished),
                    TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished)
                    )
                )

                binding.countdown.text = sDuration
            }

            override fun onFinish() {
                index++
                if (index < questionsList.size) {
                    questionModel = questionsList[index]
                    setAllQuestions()
                    resetBackground()
                    enableButton()
                    countdown()
                } else {
                    gameResult()
                }
            }
        }.start()
    }

    private fun correctAns(option: Button) {
        option.background = ContextCompat.getDrawable(requireContext(), R.drawable.right_bg)
        correctAnswerCount++
    }

    private fun wrongAns(option: Button) {
        option.background = ContextCompat.getDrawable(requireContext(), R.drawable.wrong_bg)
        wrongAnswerCount++
    }

    private fun gameResult() {
        val resultFragment = ResultFragment()

        val bundle = Bundle()
        bundle.putString("correct", correctAnswerCount.toString())
        bundle.putString("total", questionsList.size.toString())

        resultFragment.arguments = bundle

        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, resultFragment)
            .commit()
    }


    private fun setAllQuestions() {
        binding.questions.text = questionModel.question
        binding.option1.text = questionModel.option1
        binding.option2.text = questionModel.option2
        binding.option3.text = questionModel.option3
        binding.option4.text = questionModel.option4
    }

    private fun enableButton() {
        binding.option1.isClickable = true
        binding.option2.isClickable = true
        binding.option3.isClickable = true
        binding.option4.isClickable = true
    }

    private fun disableButton() {
        binding.option1.isClickable = false
        binding.option2.isClickable = false
        binding.option3.isClickable = false
        binding.option4.isClickable = false
    }

    private fun resetBackground() {
        binding.apply {
            option1.background = ContextCompat.getDrawable(requireContext(), R.drawable.option_bg)
            option2.background = ContextCompat.getDrawable(requireContext(), R.drawable.option_bg)
            option3.background = ContextCompat.getDrawable(requireContext(), R.drawable.option_bg)
            option4.background = ContextCompat.getDrawable(requireContext(), R.drawable.option_bg)
        }
    }

    fun option1Clicked(view: View) {
        disableButton()

        if (questionModel.option1 == questionModel.answer) {
            binding.option1.background = ContextCompat.getDrawable(requireContext(),R.drawable.right_bg)
            correctAns(binding.option1)
        } else {
            wrongAns(binding.option1)
        }
    }


    fun option2Clicked(view: View) {
        disableButton()

        if (questionModel.option2 == questionModel.answer) {
            binding.option2.background = ContextCompat.getDrawable(requireContext(),R.drawable.right_bg)
            correctAns(binding.option2)
        } else {
            wrongAns(binding.option2)
        }
    }

    fun option3Clicked(view: View) {
        disableButton()

        if (questionModel.option3 == questionModel.answer) {
            binding.option3.background = ContextCompat.getDrawable(requireContext(),R.drawable.right_bg)
            correctAns(binding.option3)
        } else {
            wrongAns(binding.option3)
        }
    }

    fun option4Clicked(view: View) {
        disableButton()

        if (questionModel.option4 == questionModel.answer) {
            binding.option4.background = ContextCompat.getDrawable(requireContext(),R.drawable.right_bg)
            correctAns(binding.option4)
        } else {
            wrongAns(binding.option4)
        }
    }

}