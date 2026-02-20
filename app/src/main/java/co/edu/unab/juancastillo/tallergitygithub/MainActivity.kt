package co.edu.unab.juancastillo.tallergitygithub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import co.edu.unab.juancastillo.tallergitygithub.ui.theme.TallerGITYGIThubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TallerGITYGIThubTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TarjetaPerfil(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun TarjetaPerfil(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Imagen circular (placeholder por ahora)
                        Image(
                            painter = painterResource(id = R.drawable.ftperfil),
                            contentDescription = "Foto de perfil",
                            modifier = Modifier
                                .size(120.dp)
                                .clip(CircleShape),
                            contentScale = androidx.compose.ui.layout.ContentScale.Crop
                        )
            Spacer(modifier = Modifier.height(16.dp))

            // Nombre en negrita
            Text(
                text = "Juan Castillo",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            // Rol / cargo
            Text(
                text = "Tu Rol",
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.primary
            )

            Divider(modifier = Modifier.padding(vertical = 16.dp))

            // Edad · Correo · Ciudad
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = "EDAD", fontSize = 10.sp, color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.Bold)
                Text(text = "19 años", fontSize = 14.sp)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "CORREO", fontSize = 10.sp, color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.Bold)
                Text(text = "jcastillo483@unab.edu.co", fontSize = 14.sp)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "CIUDAD", fontSize = 10.sp, color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.Bold)
                Text(text = "Bucaramanga", fontSize = 14.sp)
            }

            Divider(modifier = Modifier.padding(vertical = 16.dp))

            // Sección descriptiva
            Text(
                text = "SOBRE MI MATERIA FAVORITA",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "me interesa la rama de ciberseguridad",
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Botón inferior
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Contactar conmigo")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaPerfilPreview() {
    TallerGITYGIThubTheme {
        TarjetaPerfil()
    }
}
