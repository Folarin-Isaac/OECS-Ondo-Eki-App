package com.example.oecs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class OnboardingFragment1: Fragment() {
    private lateinit var nextButton:Button
    private lateinit var mView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_onboarding1, container, false)
        nextButton = mView.findViewById(R.id.next_fragment_button)


        return mView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nextButton.setOnClickListener {
            fragmentManager!!.beginTransaction().replace(R.id.frame_container, OnboardingFragment2()).commit()
        }


    }
}