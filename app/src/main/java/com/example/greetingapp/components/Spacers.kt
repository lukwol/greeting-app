package com.example.greetingapp.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

object Spacers {
    @Composable
    fun xs() {
        Spacer(Modifier.size(4.dp))
    }

    @Composable
    fun s() {
        Spacer(Modifier.size(8.dp))
    }

    @Composable
    fun m() {
        Spacer(Modifier.size(16.dp))
    }

    @Composable
    fun l() {
        Spacer(Modifier.size(24.dp))
    }

    @Composable
    fun xl() {
        Spacer(Modifier.size(32.dp))
    }
}
