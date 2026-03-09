package screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.app.R

@Composable
fun LoginScreen(navController: NavHostController, modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.Start
    ) {
        Image(
            painter = painterResource(id = R.drawable.principalimagen),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp),
            contentScale = ContentScale.Inside
        )

        Text(
            text = "Login",
            fontSize = 38.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 20.dp)
        )

        InputLabel("Name")
        TextField(
            value = name, onValueChange = { name = it },
            modifier = Modifier.fillMaxWidth().height(55.dp),
            placeholder = { Text("Enter your name") }
        )

        InputLabel("Email")
        TextField(
            value = email, onValueChange = { email = it },
            modifier = Modifier.fillMaxWidth().height(55.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            placeholder = { Text("example@mail.com") }
        )

        InputLabel("Password")
        TextField(
            value = password, onValueChange = { password = it },
            modifier = Modifier.fillMaxWidth().height(55.dp),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            placeholder = { Text("••••••••") }
        )

        Text(
            text = "Forgot password?",
            color = Color(0xFFBCBCBC),
            modifier = Modifier.padding(top = 8.dp)
        )

        Button(
            onClick = { navController.navigate("welcome") },
            modifier = Modifier
                .align(Alignment.End)
                .padding(top = 30.dp)
                .width(150.dp)
                .height(55.dp),
            shape = MaterialTheme.shapes.medium
        ) {
            Text("Sign Up", fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun InputLabel(text: String) {
    Text(
        text = text,
        modifier = Modifier.padding(top = 16.dp)
    )
}