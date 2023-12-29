package com.android.together

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment

class MyPageDialog(val onClick: (String) -> Unit): DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.dialog_mypage, container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editText = view.findViewById<EditText>(R.id.mypage_dialog_edit)
        val confirmButton = view.findViewById<Button>(R.id.mypage_dialog_button)
        confirmButton.setOnClickListener {
            onClick(editText.text.toString())
            dismiss()
        }

    }

}