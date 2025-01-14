package br.com.movie2you.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.com.movie2you.presentation.navigation.AppNavHost
import br.com.movie2you.presentation.ui.theme.Movie2YouTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Movie2YouTheme {
                AppNavHost()
            }
        }
    }
}