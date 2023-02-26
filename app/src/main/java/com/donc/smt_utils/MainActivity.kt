package com.donc.smt_utils

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.donc.smt_utils.ui.MenuScreen
import com.donc.smt_utils.ui.theme.SMTUtilsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SMTUtilsTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "menu")
                {
                    composable("menu") {
                        MenuScreen(navController)
                    }
                    //TODO: Otras rutas
                }
            }
        }
    }
}

