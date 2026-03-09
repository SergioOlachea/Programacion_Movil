package screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
fun SignupScreen(navController: NavHostController, modifier: Modifier = Modifier) {
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
                .size(120.dp)
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp),
            contentScale = ContentScale.Fit
        )

        Text(text = "Create Account", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color(0xFF222222), modifier = Modifier.padding(top = 16.dp))
        Text(text = "Join Little Drop and start organized", fontSize = 16.sp, color = Color(0xFF757575))

        InputLabel("Full Name")
        TextField(value = name, onValueChange = { name = it }, modifier = Modifier.fillMaxWidth(), placeholder = { Text("John Doe") })

        InputLabel("Email Address")
        TextField(value = email, onValueChange = { email = it }, modifier = Modifier.fillMaxWidth(), keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email), placeholder = { Text("name@example.com") })

        InputLabel("Password")
        TextField(value = password, onValueChange = { password = it }, modifier = Modifier.fillMaxWidth(), visualTransformation = PasswordVisualTransformation(), keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password), placeholder = { Text("••••••••") })

        Button(
            onClick = { navController.navigate("welcome") },
            modifier = Modifier.fillMaxWidth().padding(top = 40.dp).height(55.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4C49A2))
        ) {
            Text("Register", color = Color.White, fontWeight = FontWeight.Bold)
        }

        Row(modifier = Modifier.padding(top = 20.dp).align(Alignment.CenterHorizontally)) {
            Text(text = "Already have an account? ", color = Color(0xFF757575))
            Text(
                text = "Login",
                color = Color(0xFF4C49A2),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable { navController.navigate("login") }
            )
        }
    }
}