package com.example.breakingbadcompose.domain.usecase

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.breakingbadcompose.domain.repository.CharacterRepository
import kotlinx.coroutines.launch

class ViewModelCharacter(private val characterRepository: CharacterRepository) : ViewModel() {
    private val _responseLiveData = MutableLiveData<List<String>>()
    val responseLiveData: LiveData<List<String>> = _responseLiveData
    fun getCharacterUIData() {
        viewModelScope.launch {
            val response = characterRepository
                .getCharacters()
                .map {
                    "ID ${it.char_id} Name ${it.name} nickname ${it.nickname} portrayed ${it.portrayed} Status ${it.status} URL image # ${it.img}"
                }
            _responseLiveData.value = response
        }
    }
}