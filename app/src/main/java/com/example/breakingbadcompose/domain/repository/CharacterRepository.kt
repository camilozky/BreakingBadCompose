package com.example.breakingbadcompose.domain.repository

import com.example.breakingbadcompose.domain.model.Character

interface CharacterRepository {
    fun getCharacters(): List<Character>
}