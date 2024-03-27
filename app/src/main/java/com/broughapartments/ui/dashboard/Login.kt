package com.broughapartments.ui.dashboard

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.broughapartments.R
import com.broughapartments.components.MyText
import com.broughapartments.components.nunitoFamily

@Composable
fun Login() {
    var text by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxWidth()) {
        MyText(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 30.dp),
            text = "Boro Apartments",
            fontSize = 24.sp, fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            MyText(text = "Welcome back!", fontSize = 30.sp, fontWeight = FontWeight.Bold,)
            MyText(text = "Login into your account to continue", fontSize = 18.sp, modifier = Modifier.padding(0.dp, 10.dp))
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp, 0.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                modifier = Modifier
                    .padding(0.dp, 10.dp, 0.dp, 20.dp)
                    .fillMaxWidth(),
                value = text,
                onValueChange = { text = it },
                label = { MyText("Email/Username") }
            )

            OutlinedTextField(
                modifier = Modifier
                    .padding(0.dp, 0.dp, 0.dp, 20.dp)
                    .fillMaxWidth(),
                value = password,
                onValueChange = { text = it },
                label = { MyText("Password") },
                textStyle = TextStyle(fontFamily = nunitoFamily)
            )

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.primary_color)),
                onClick = {  }) {
                MyText("Login")
            }

            Row {
                MyText(
                    modifier = Modifier.padding(10.dp, 0.dp),
                    text = "Don't have account ?", fontSize = 16.sp)
                ClickableText(
                    style = TextStyle(color = colorResource(R.color.primary_color), fontFamily = nunitoFamily, fontSize = 18.sp),
                    text = AnnotatedString("Create"),
                    onClick = { offset ->
                        Log.d("ClickableText", "$offset -th character is clicked.")
                    }
                )
            }
        }
    }
}