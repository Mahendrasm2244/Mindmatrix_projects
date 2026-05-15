package com.pratham.chikitse.di;

import com.pratham.chikitse.data.dao.EmergencyDao;
import com.pratham.chikitse.data.database.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class AppModule_ProvideEmergencyDaoFactory implements Factory<EmergencyDao> {
  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideEmergencyDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public EmergencyDao get() {
    return provideEmergencyDao(dbProvider.get());
  }

  public static AppModule_ProvideEmergencyDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideEmergencyDaoFactory(dbProvider);
  }

  public static EmergencyDao provideEmergencyDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideEmergencyDao(db));
  }
}
