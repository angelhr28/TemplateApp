package com.angelhr28.data.room.db

import android.content.Context
import androidx.room.Room
import com.angelhr28.data.room.dao.RecipeDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {
    private const val DATABASE_NAME = "App.db"

    @Singleton
    @Provides
    fun provideDataBase(@ApplicationContext context: Context): AppDataBase {
        return Room.databaseBuilder(
            context = context,
            klass = AppDataBase::class.java,
            name = DATABASE_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun provideRecipeDao(db: AppDataBase): RecipeDao = db.recipeDao()
}
