package com.example.composelearning

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.composelearning.InfoCard

val Pink = Color(0xFFFFC0CB)
val BabyBlue = Color(0xFFB3E5FC)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleScreen() {
    val context = LocalContext.current
    val homeworkTitle = stringResource(id = R.string.homework_title)
    val fabText = stringResource(id = R.string.fab_add_diary)
    val heartDesc = stringResource(id = R.string.fab_heart_desc)
    val tipsText = stringResource(id = R.string.tips_text)

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Pink,
                    titleContentColor = Color.White
                ),
                title = { Text(homeworkTitle) }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { Toast.makeText(context, fabText, Toast.LENGTH_SHORT).show() },
                containerColor = Pink
            ) {
                Icon(Icons.Default.Favorite, contentDescription = heartDesc, tint = Color.White)
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text(text = tipsText, color = BabyBlue)

            Image(
                painter = painterResource(id = R.drawable.my_image),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )

            InfoCard(stringResource(R.string.note_1_title), stringResource(R.string.note_1_desc))
            InfoCard(stringResource(R.string.reminder_title), stringResource(R.string.reminder_desc))
            InfoCard(stringResource(R.string.tip_title), stringResource(R.string.tip_desc))

            Spacer(modifier = Modifier.height(16.dp))
            LoginForm()
        }
    }
}