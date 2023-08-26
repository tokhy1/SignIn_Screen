package com.example.testapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SignScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.top_background),
            contentDescription = "top background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .scale(2f, 4f)
        )
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .height(150.dp)
        )
        Text(
            text = "Welcome To our App",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xff7632a8)
        )
        var user by remember {
            mutableStateOf("Username")
        }
        var pass by remember {
            mutableStateOf("Password")
        }
        val passwordVisibility by rememberSaveable { mutableStateOf(false) }
        TextField(
            value = user,
            { text -> user = text },
            modifier = Modifier
                .fillMaxWidth()
                .height(66.dp)
                .padding(start = 66.dp, end = 66.dp, top = 8.dp, bottom = 8.dp)
                .border(1.dp, color = Color(0xFF7632a8), shape = RoundedCornerShape(50)),
            shape = RoundedCornerShape(50),
            textStyle = TextStyle(
                textAlign = TextAlign.Center,
                color = Color(0xFF7632a8),
                fontSize = 14.sp
            ),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        TextField(
            value = pass,
            { text -> pass = text },
            modifier = Modifier
                .fillMaxWidth()
                .height(66.dp)
                .padding(start = 66.dp, end = 66.dp, top = 8.dp, bottom = 8.dp)
                .border(1.dp, color = Color(0xFF7632a8), shape = RoundedCornerShape(50)),
            shape = RoundedCornerShape(50),
            textStyle = TextStyle(
                textAlign = TextAlign.Center,
                color = Color(0xFF7632a8),
                fontSize = 14.sp
            ),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(66.dp)
                .padding(start = 66.dp, end = 66.dp, top = 8.dp, bottom = 8.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFF7632a8)
            ),
            shape = RoundedCornerShape(50)

        ) {
            Text(
                text = "Login",
                fontSize = 18.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }

        Text(
            text = "Don't forget the password please!",
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
            color = Color(0xFF7632a8),
            fontSize = 14.sp
        )
        Row {
            Image(painter = painterResource(id = R.drawable.google), contentDescription = "google", modifier = Modifier.padding(8.dp))
            Image(painter = painterResource(id = R.drawable.facebook), contentDescription = "facebook", modifier = Modifier.padding(8.dp))
            Image(painter = painterResource(id = R.drawable.twitter), contentDescription = "twitter", modifier = Modifier.padding(8.dp))
        }
        Image(
            painter = painterResource(id = R.drawable.bottom_background),
            contentDescription = "bottom_background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.scale(2f, 2f)
        )

    }
}


@Preview(showBackground = true)
@Composable
fun MainPreview() {
    SignScreen()
}