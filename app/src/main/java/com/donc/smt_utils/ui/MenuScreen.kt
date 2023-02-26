package com.donc.smt_utils.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.donc.smt_utils.R

@Composable
fun MenuScreen(navController: NavController){
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxSize(1f)
                .padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            FilledIconButton(
                onClick = { navController.navigate(route = "apples_screen") },
                modifier = Modifier.fillMaxHeight().fillMaxWidth(1f)
            ) {
                Icon(
                    painter = painterResource(R.drawable.apple_svgrepo_com),
                    contentDescription = stringResource(id = R.string.description_apple)
                //SVG Icon from: https://www.svgrepo.com/svg/244783/apple
                )
            }
            FilledIconButton(
                onClick = { navController.navigate(route = "moonphase_screen") },
                modifier = Modifier.fillMaxHeight().fillMaxWidth(1f)
            ) {
                Icon(
                    painter = painterResource(R.drawable.moon_svgrepo_com),
                    contentDescription = stringResource(id = R.string.description_moon)
                    //SVG Icon from: https://www.svgrepo.com/svg/495522/moon
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxSize(1f)
                .padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            FilledIconButton(
                onClick = { navController.navigate(route = "expertise_screen") },
                modifier = Modifier.fillMaxHeight().fillMaxWidth(1f)
            ) {
                Icon(
                    painter = painterResource(R.drawable.book_1_svgrepo_com),
                    contentDescription = stringResource(id = R.string.description_book)
                    //SVG Icon from: https://www.svgrepo.com/svg/495068/book-1
                )
            }
            FilledIconButton(
                onClick = { navController.navigate(route = "demon-schedule_screen") },
                modifier = Modifier.fillMaxHeight().fillMaxWidth(1f)
            ) {
                Icon(
                    painter = painterResource(R.drawable.star_of_david_svgrepo_com),
                    contentDescription = stringResource(id = R.string.description_david)
                    //SVG Icon from: https://www.svgrepo.com/svg/352514/star-of-david
                )
            }
        }
    }
}