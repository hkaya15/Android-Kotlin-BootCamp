package com.example.bootcamp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class ConstraintLayoutProject : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout_project)


        val textInputEditTexUsername: TextInputEditText =
            findViewById(R.id.textInputEditTextUsername)
        val textInputEditTextPassword: TextInputEditText =
            findViewById(R.id.textInputEditTextPassword)
        val buttonLogin: MaterialButton = findViewById(R.id.buttonLogin)

        buttonLogin.setOnClickListener{
            Toast.makeText(this,"${textInputEditTexUsername.text}- ${textInputEditTextPassword.text}",Toast.LENGTH_LONG).show()
            findNavController(R.id.action_navigationHomeFragment_to_navigationDetailFragment)
        }
    }
}