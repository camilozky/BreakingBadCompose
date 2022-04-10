package com.example.breakingbadcompose.presentation

import android.os.Bundle
import android.provider.ContactsContract
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.breakingbadcompose.domain.repository.CharacterRepository
import com.example.breakingbadcompose.domain.repository.ServerProvider
import com.example.breakingbadcompose.domain.usecase.ViewModelCharacter


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val serverProvider = ServerProvider()
        val viewModelCharacter = ViewModelCharacter(serverProvider)
        val listCharacters = viewModelCharacter.getCharacterUIData()
        setContent {
            RenderList(listCharacters)
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RenderList(listCharacters: List<String> = emptyList()) {
    Column(
        Modifier
            .background(Color(0xFF000000))
            .fillMaxSize(1f),
    ) {
        Title()
        LazyColumn {
            listCharacters.forEach {
                item {
                    Image(
                        painter = rememberAsyncImagePainter(it),
                        contentDescription = null,
                        modifier = Modifier.size(128.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun Title() {
    Text(
        text = "BrBa",
        style = MaterialTheme.typography.h1,
        fontWeight = FontWeight.SemiBold,
        color = Color(53, 117, 55, 255)
    )
}
