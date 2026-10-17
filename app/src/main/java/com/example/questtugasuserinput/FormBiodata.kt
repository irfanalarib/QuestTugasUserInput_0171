package com.example.questtugasuserinput

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

        Card(
            shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
            colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.card_background)),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .align(Alignment.BottomCenter)
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(dimensionResource(id = R.dimen.padding_medium)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ){
                Text(
                    text = stringResource(id = R.string.form_title),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.purple_title)
                )

                Text(
                    text = stringResource(id = R.string.form_subtitle),
                    fontSize = 12.sp,
                    color = colorResource(id = R.color.text_subtitle)
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    OutlinedTextField(
                        value = textNamaDepan,
                        onValueChange = { textNamaDepan = it },
                        label = { Text(stringResource(id = R.string.hint_nama_depan), fontSize = 13.sp) },
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.weight(1f),
                        singleLine = true
                    )
                    OutlinedTextField(
                        value = textNamaBelakang,
                        onValueChange = { textNamaBelakang = it },
                        label = { Text(stringResource(id = R.string.hint_nama_belakang), fontSize = 13.sp) },
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.weight(1f),
                        singleLine = true
                    )
                }
                OutlinedTextField(
                    value = textEmail,
                    onValueChange = { textEmail = it },
                    label = { Text(stringResource(id = R.string.hint_email), fontSize = 13.sp) },
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    OutlinedTextField(
                        value = textTglLahir,
                        onValueChange = { textTglLahir = it },
                        label = { Text(stringResource(id = R.string.hint_tgl_lahir), fontSize = 13.sp) },
                        shape = RoundedCornerShape(size = 12.dp),
                        modifier = Modifier.weight(1f),
                        singleLine = true,
                        trailingIcon = {
                            Icon(
                                imageVector = Icons.Default.DateRange,
                                contentDescription = null
                            )
                        }
                    )
                }
            }
        }
    }
}