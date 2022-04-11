package com.example.breakingbadcompose.domain.repository

import com.example.breakingbadcompose.domain.model.Characters

interface CharacterRepository {
    suspend fun getCharacters(): List<Characters>
}