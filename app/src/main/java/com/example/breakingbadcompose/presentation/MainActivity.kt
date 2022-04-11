package com.example.breakingbadcompose.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.breakingbadcompose.domain.model.Characters
import com.example.breakingbadcompose.domain.repository.CharacterRepository
import com.example.breakingbadcompose.domain.usecase.ViewModelCharacter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

data class CharacterResponse(
    val char_id: Int,
    val name: String,
    val img: String,
    val status: String,
    val nickname: String,
    val portrayed: String
)

interface APIService {
    @GET("characters")
    suspend fun getCharacters(): List<CharacterResponse>
}


class CharactersRepositoryImpl : CharacterRepository {
    private val apiCharacterRetrofit = Retrofit.Builder()
        .baseUrl("https://breakingbadapi.com/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(APIService::class.java)

    override suspend fun getCharacters(): List<Characters> {
        val response = apiCharacterRetrofit.getCharacters()
        val charactersResult = response.map {
            Characters(it.char_id, it.name, it.img, it.status, it.nickname, it.portrayed)
        }
        return charactersResult
    }
}

class MainActivity : ComponentActivity() {
    //    val serverProvider = ServerProvider()
    private val serverProvider = CharactersRepositoryImpl()
    private val viewModelCharacter = ViewModelCharacter(serverProvider)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModelCharacter.getCharacterUIData()
        viewModelCharacter.responseLiveData.observe(this) {
            Log.i("Camilo", it.toString())
        }
        setContent {
            val shopListState by viewModelCharacter.responseLiveData.observeAsState()
            shopListState?.let {
                RenderList(it)
            }
        }
    }

}

@Composable
fun RenderList(listShops: List<String> = emptyList()) {
    Column(
        Modifier
            .background(Color(0xFF000000))
            .fillMaxSize(1f),
    ) {
        LazyColumn {
            listShops.forEach {
                item {
                    Text(
                        text = "$it",
                        color = Color(53, 117, 55, 255)
                    )
                }
            }
        }
    }
}



//@OptIn(ExperimentalFoundationApi::class)
//@Composable
//fun RenderList(listCharacters: List<String> = emptyList()) {
//    Column(
//        Modifier
//            .background(Color(0xFF000000))
//            .fillMaxSize(1f),
//    ) {
//        Title()
//        LazyColumn {
//            listCharacters.forEach {
//                item {
//                    Image(
//                        painter = rememberAsyncImagePainter(it),
//                        contentDescription = null,
//                        modifier = Modifier.size(128.dp)
//                    )
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Title() {
//    Text(
//        text = "BrBa",
//        style = MaterialTheme.typography.h1,
//        fontWeight = FontWeight.SemiBold,
//        color = Color(53, 117, 55, 255)
//    )
//}
