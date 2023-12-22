package com.polatechno.jetnews.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.polatechno.jetnews.ui.navigation.AppNavigationGraph
import com.polatechno.jetnews.ui.theme.JetNewsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            JetNewsTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                ) {
                    JetNewsEntryPoint()
                }
            }
        }
    }
}

@Composable
fun JetNewsEntryPoint() {

    AppNavigationGraph()
}

