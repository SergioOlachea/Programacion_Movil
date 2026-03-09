package screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.app.R
import androidx.compose.material3.MaterialTheme

@Composable
fun WelcomeScreen(navController: NavHostController, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.principalimagen),
            contentDescription = null,
            modifier = Modifier.height(211.dp),
            contentScale = ContentScale.Fit
        )

        Text(
            text = "Hello",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF2D2D2D)
        )

        Text(
            text = "Welcome To Little Drop, where\nyou manage you daily tasks",
            fontSize = 16.sp,
            color = Color(0xFF757575),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 12.dp)
        )

        Button(
            onClick = { navController.navigate("login") },
            modifier = Modifier.fillMaxWidth().padding(top = 40.dp).height(55.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4C49A2))
        ) {
            Text("Login", color = Color.White)
        }

        Button(
            onClick = { navController.navigate("signup") },
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp).height(55.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text("Sign Up", color = Color.White)
        }

        Text(
            text = "Sign up using",
            modifier = Modifier.padding(top = 32.dp),
            color = Color(0xFF757575)
        )

        Row(
            modifier = Modifier.padding(top = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Box(modifier = Modifier.size(40.dp).background(Color(0xFF00008B)))
            Box(modifier = Modifier.size(40.dp).background(Color(0xFF8B0000)))
            Box(modifier = Modifier.size(40.dp).background(Color(0xFFADD8E6)))
        }
    }
}


