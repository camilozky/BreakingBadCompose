package com.example.breakingbadcompose.domain.usecase

import com.example.breakingbadcompose.domain.repository.CharacterRepository

class ViewModelCharacter(private val characterRepo: CharacterRepository) {
    fun getCharacterUIData(): List<String> = characterRepo.getCharacters().map {
        it.img
    }
}