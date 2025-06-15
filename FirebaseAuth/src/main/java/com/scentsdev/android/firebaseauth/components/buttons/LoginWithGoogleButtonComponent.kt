package com.scentsdev.android.firebaseauth.components.buttons

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.scentsdev.android.firebaseauth.components.buttons.content.LoginWithGoogleContentComponent

@Composable
fun LoginWithGoogleButtonComponent() {
    Box {
        Button(onClick = {} ) {
            LoginWithGoogleContentComponent()
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginWithGoogleButtonComponent()
}

