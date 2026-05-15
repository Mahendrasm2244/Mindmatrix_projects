package com.pratham.chikitse.di;

import com.pratham.chikitse.data.dao.HospitalDao;
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
public final class AppModule_ProvideHospitalDaoFactory implements Factory<HospitalDao> {
  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideHospitalDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public HospitalDao get() {
    return provideHospitalDao(dbProvider.get());
  }

  public static AppModule_ProvideHospitalDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideHospitalDaoFactory(dbProvider);
  }

  public static HospitalDao provideHospitalDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideHospitalDao(db));
  }
}
