package com.pratham.chikitse.util

import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.content
import com.pratham.chikitse.BuildConfig
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GeminiHelper @Inject constructor() {

    private val model by lazy {
        GenerativeModel(
            modelName = "gemini-1.5-flash",
            apiKey = BuildConfig.GEMINI_API_KEY
        )
    }

    private val systemPrompt = """
        You are Pratham Chikitse AI, a first-aid assistant for rural Karnataka, India.
        You provide clear, simple, life-saving first-aid advice in both English and Kannada.
        Always:
        1. Start with the most critical action.
        2. Keep steps numbered and simple.
        3. Always recommend calling 108 (ambulance) for serious emergencies.
        4. Do NOT replace medical professionals — always advise seeing a doctor.
        5. If the user writes in Kannada, respond primarily in Kannada with English alongside.
        6. Be concise — users are in emergencies and need fast answers.
    """.trimIndent()

    /** Returns a streaming response as a concatenated string */
    suspend fun askFirstAid(userQuestion: String): String {
        return try {
            val chat = model.startChat(
                history = listOf(
                    content("user") { text(systemPrompt) },
                    content("model") { text("Understood. I am ready to provide first-aid guidance.") }
                )
            )
            val response = chat.sendMessage(userQuestion)
            response.text ?: "Sorry, I could not generate a response. Please try again."
        } catch (e: Exception) {
            "Error: ${e.localizedMessage ?: "Unknown error occurred. Check your API key and internet connection."}"
        }
    }
}
