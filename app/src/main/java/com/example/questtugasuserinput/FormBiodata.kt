package com.example.questtugasuserinput

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun FormBiodataScreen(modifier: Modifier){

    var textNamaDepan by remember { mutableStateOf("") }
    var textNamaBelakang by remember { mutableStateOf("") }
    var textEmail by remember { mutableStateOf("") }
    var textTglLahir by remember { mutableStateOf("") }
    var textExperience by remember { mutableStateOf("") }

    var textAndroidChecked by remember { mutableStateOf(false) }
    var textUiUxChecked by remember { mutableStateOf(false) }
    var textWebChecked by remember { mutableStateOf(false) }

    var submittedNamaDepan by remember { mutableStateOf("") }
    var submittedNamaBelakang by remember { mutableStateOf("") }
    var submittedEmail by remember { mutableStateOf("") }
    var submittedTglLahir by remember { mutableStateOf("") }
    var submittedExperience by remember { mutableStateOf("") }
    var submittedSkills by remember { mutableStateOf("") }

    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.graybackground),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
                .align(Alignment.TopCenter)
        )
    }
}