package com.example.simpleapp

import android.icu.text.CaseMap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.simpleapp.ui.theme.SimpleAppTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Surface
import androidx.compose.ui.unit.dp
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.font.FontWeight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleAppTheme {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        StudentCredentialCard(
                            mainTitle="WELCOME TO OUR MAP CLASS",
                            title="Student Credentials",
                            name = "David Mujabi",
                            regNo = "C026-01-0802/2024",
                            school = "School of Computing",
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
}

@Composable
fun StudentCredentialCard(
    mainTitle: String = "WELCOME TO OUR MAP CLASS",
    title:String = "Student Credentials",
    name: String,
    regNo: String,
    school: String,
    modifier: Modifier = Modifier
) {
    ElevatedCard(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(25.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text=mainTitle,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text=title,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.secondary
            )
            HorizontalDivider(modifier = Modifier.padding(vertical = 4.dp))

            Text(
                text = "Name:",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Text(
                text = name,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(4.dp))

            // Registration Number
            Text(
                text = "Registration Number:",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Text(
                text = regNo,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold
            )
            //school
            Text(
                text = "School:",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Text(
                text = school,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}

//NOTED

@Preview(showBackground = true)
@Composable
fun StudentCredentialsPreview() {
    SimpleAppTheme {
        StudentCredentialsCard(
            mainTitle = "WELCOME TO OUR MAP CLASS",
            title = "Student Credentials",
            name = "Mujabi Jitu",
            regNo = "C026-01-0802/2024",
            school = "School of Computing"
        )
    }
}

@Composable
fun StudentCredentialsCard(mainTitle: String, title: String, name: String, regNo: String, school: String) {
    TODO("Not yet implemented")
}

