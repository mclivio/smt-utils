package com.donc.smt_utils.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.donc.smt_utils.R

@Composable
fun MenuScreen(navController: NavController) {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp)
                        .background(
                            MaterialTheme.colorScheme.primary,
                            shape = RoundedCornerShape(6.dp)
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    IconButton(
                        onClick = { navController.navigate(route = "apples_screen") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.7f)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.apple_svgrepo_com),
                            contentDescription = stringResource(id = R.string.description_apple),
                            tint = MaterialTheme.colorScheme.onPrimary
                            //SVG Icon from: https://www.svgrepo.com/svg/244783/apple
                        )
                    }
                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = stringResource(id = R.string.button_applescreen),
                            color = MaterialTheme.colorScheme.onPrimary,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp)
                        .background(
                            MaterialTheme.colorScheme.primary,
                            shape = RoundedCornerShape(6.dp)
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    IconButton(
                        onClick = { navController.navigate(route = "moonphase_screen") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.7f)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.moon_svgrepo_com),
                            contentDescription = stringResource(id = R.string.description_moon),
                            tint = MaterialTheme.colorScheme.onPrimary
                            //SVG Icon from: https://www.svgrepo.com/svg/495522/moon
                        )
                    }
                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = stringResource(id = R.string.button_moonphasescreen),
                            color = MaterialTheme.colorScheme.onPrimary,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp)
                        .background(
                            MaterialTheme.colorScheme.primary,
                            shape = RoundedCornerShape(6.dp)
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    IconButton(
                        onClick = { navController.navigate(route = "expertise_screen") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.7f)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.book_1_svgrepo_com),
                            contentDescription = stringResource(id = R.string.description_book),
                            tint = MaterialTheme.colorScheme.onPrimary
                            //SVG Icon from: https://www.svgrepo.com/svg/495068/book-1
                        )
                    }
                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = stringResource(id = R.string.button_expertisescreen),
                            color = MaterialTheme.colorScheme.onPrimary,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp)
                        .background(
                            MaterialTheme.colorScheme.primary,
                            shape = RoundedCornerShape(6.dp)
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    IconButton(
                        onClick = { navController.navigate(route = "demon-schedule_screen") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.7f)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.star_of_david_svgrepo_com),
                            contentDescription = stringResource(id = R.string.description_david),
                            tint = MaterialTheme.colorScheme.onPrimary
                            //SVG Icon from: https://www.svgrepo.com/svg/352514/star-of-david
                        )
                    }
                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = stringResource(id = R.string.button_demonschedule),
                            color = MaterialTheme.colorScheme.onPrimary,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp)
                        .background(
                            MaterialTheme.colorScheme.primary,
                            shape = RoundedCornerShape(6.dp)
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    IconButton(
                        onClick = { navController.navigate(route = "menu_screen") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.7f)
                    ) {
                        Icon(
                            Icons.Default.Close,
                            contentDescription = stringResource(id = R.string.description_construction),
                            tint = MaterialTheme.colorScheme.onPrimary
                            //TODO: Under Construction, may be implemented in the future.
                        )
                    }
                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = stringResource(id = R.string.button_tbcscreen),
                            color = MaterialTheme.colorScheme.onPrimary,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp)
                        .background(
                            MaterialTheme.colorScheme.primary,
                            shape = RoundedCornerShape(6.dp)
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    IconButton(
                        onClick = { navController.navigate(route = "menu_screen") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.7f)
                    ) {
                        Icon(
                            Icons.Default.Close,
                            contentDescription = stringResource(id = R.string.description_construction),
                            tint = MaterialTheme.colorScheme.onPrimary
                            //TODO: Under Construction, may be implemented in the future.
                        )
                    }
                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = stringResource(id = R.string.button_tbcscreen),
                            color = MaterialTheme.colorScheme.onPrimary,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}