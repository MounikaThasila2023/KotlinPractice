package com.example.kotlinpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment

class CustomAlertDialog: DialogFragment()  {


        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//            getDialog()!!.getWindow()?.setBackgroundDrawableResource(R.drawable.round_corner);
            return inflater.inflate(R.layout.alertdialoge, container, false)
        }

        override fun onStart() {
            super.onStart()
            val width = (resources.displayMetrics.widthPixels * 0.85).toInt()
            val height = (resources.displayMetrics.heightPixels * 0.40).toInt()
            dialog!!.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
            dialog!!.window?.setLayout(height, ViewGroup.LayoutParams.WRAP_CONTENT)
        }



    }
