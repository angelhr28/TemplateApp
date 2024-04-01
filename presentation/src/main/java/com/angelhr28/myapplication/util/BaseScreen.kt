package com.angelhr28.myapplication.util

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.angelhr28.myapplication.ui.theme.AppTheme

@Composable
fun BaseScreen(content: @Composable () -> Unit) {
    AppTheme {
        val surfaceModifier = Modifier.fillMaxSize()
        Surface(modifier = surfaceModifier) {
            content()
        }
    }
}
