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
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ElevatedCard
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
import androidx.compose.ui.graphics.Color
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
            painter = painterResource(id = R.drawable.gedungumy),
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
                    OutlinedTextField(
                        value = textExperience,
                        onValueChange = { textExperience = it },
                        label = { Text(stringResource(id = R.string.hint_experience), fontSize = 13.sp) },
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.weight(1f),
                        singleLine = true,
                        trailingIcon = {
                            Icon(
                                imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = null
                            )
                        }
                    )
                }

                Spacer(modifier = Modifier.height(2.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Text(
                        text = stringResource(id = R.string.label_pilih_skill),
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                        color = Color.Black
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = textAndroidChecked,
                            onCheckedChange = { textAndroidChecked = it }
                        )
                        Text(text = stringResource(id = R.string.skill_android), fontSize = 11.sp)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = textUiUxChecked,
                            onCheckedChange = { textUiUxChecked = it }
                        )
                        Text(text = stringResource(id = R.string.skill_ui_ux), fontSize = 11.sp)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = textWebChecked,
                            onCheckedChange = { textWebChecked = it }
                        )
                        Text(text = stringResource(id = R.string.skill_web), fontSize = 11.sp)
                    }
                }
                Spacer(modifier = Modifier.height(4.dp))

                Button(
                    onClick = {
                        submittedNamaDepan = textNamaDepan
                        submittedNamaBelakang = textNamaBelakang
                        submittedEmail = textEmail
                        submittedTglLahir = textTglLahir
                        submittedExperience = textExperience

                        val listSkill = mutableListOf<String>()
                        if (textAndroidChecked) listSkill.add("Android")
                        if (textUiUxChecked) listSkill.add("UI/UX")
                        if (textWebChecked) listSkill.add("Web")
                        submittedSkills = listSkill.joinToString(", ")
                    },
                    shape = RoundedCornerShape(12.dp),
                    enabled = textNamaDepan.isNotEmpty() && textEmail.isNotEmpty(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.purple_title),
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                ) {
                    Text(
                        text = stringResource(id = R.string.btn_proceed),
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )
                }
                if (submittedNamaDepan.isNotEmpty()) {
                    ElevatedCard(
                        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.Black),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(110.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(8.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(text = "Nama: $submittedNamaDepan $submittedNamaBelakang", color = Color.White, fontSize = 12.sp)
                            Text(text = "Email: $submittedEmail", color = Color.White, fontSize = 12.sp)
                            Text(text = "Tgl Lahir: $submittedTglLahir | Exp: $submittedExperience", color = Color.White, fontSize = 12.sp)
                            Text(text = "Skill: $submittedSkills", color = Color.White, fontSize = 12.sp)
                        }
                    }
                }
            }
        }
    }
}