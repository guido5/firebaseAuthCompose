package com.scentsdev.android.firebaseauth.components.buttons.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.scentsdev.android.firebaseauth.R

@Composable
fun LoginWithGoogleContentComponent() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.google_g_logo), // Carga la imagen desde drawable
            contentDescription = "Google logo", // Descripción para accesibilidad
            modifier = Modifier.size(24.dp), // Ajusta el tamaño de la imagen según tus necesidades
        )
        Spacer(modifier = Modifier.size(8.dp))
        Text(text = "Login with Google")
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginWithGoogleContentComponent()
}