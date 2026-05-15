package com.pratham.chikitse.data.repository

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.pratham.chikitse.data.dao.EmergencyDao
import com.pratham.chikitse.data.dao.HospitalDao
import com.pratham.chikitse.data.model.Emergency
import com.pratham.chikitse.data.model.Hospital
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import java.io.InputStreamReader
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class EmergencyRepository @Inject constructor(
    private val emergencyDao: EmergencyDao,
    private val context: Context
) {
    fun getAllEmergencies(): Flow<List<Emergency>> = emergencyDao.getAllEmergencies()

    suspend fun getEmergencyById(id: Int): Emergency? = emergencyDao.getEmergencyById(id)

    suspend fun searchEmergencies(query: String): List<Emergency> =
        emergencyDao.searchEmergencies(query)

    fun getEmergenciesByCategory(category: String): Flow<List<Emergency>> =
        emergencyDao.getEmergenciesByCategory(category)

    /** Seeds the DB from assets if empty - Optimized with streaming to prevent ANR */
    suspend fun seedIfNeeded() = withContext(Dispatchers.IO) {
        if (emergencyDao.count() == 0) {
            try {
                context.assets.open("emergencies.json").use { inputStream ->
                    JsonReader(InputStreamReader(inputStream)).use { reader ->
                        val type = object : TypeToken<List<Emergency>>() {}.type
                        val list: List<Emergency> = Gson().fromJson(reader, type)
                        emergencyDao.insertAll(list)
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}

@Singleton
class HospitalRepository @Inject constructor(
    private val hospitalDao: HospitalDao,
    private val context: Context
) {
    fun getAllHospitals(): Flow<List<Hospital>> = hospitalDao.getAllHospitals()

    suspend fun getNearestHospitals(): List<Hospital> = hospitalDao.getNearestHospitals()

    /** Seeds the DB from assets if empty - Optimized with streaming to prevent ANR */
    suspend fun seedIfNeeded() = withContext(Dispatchers.IO) {
        if (hospitalDao.count() == 0) {
            try {
                context.assets.open("hospitals.json").use { inputStream ->
                    JsonReader(InputStreamReader(inputStream)).use { reader ->
                        val type = object : TypeToken<List<Hospital>>() {}.type
                        val list: List<Hospital> = Gson().fromJson(reader, type)
                        hospitalDao.insertAll(list)
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
