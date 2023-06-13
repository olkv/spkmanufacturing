package com.example.spkmanufacturing.present.login

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LogInDialog() {

    Text(
        text = "Login in programm...",
        color = Color.Black
    )

}










@Preview(showBackground = true)
@Composable
fun LogInDialogPreviw() {
    LogInDialog()
}