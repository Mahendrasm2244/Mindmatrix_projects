package com.pratham.chikitse.data.repository;

import android.content.Context;
import com.pratham.chikitse.data.dao.EmergencyDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class EmergencyRepository_Factory implements Factory<EmergencyRepository> {
  private final Provider<EmergencyDao> emergencyDaoProvider;

  private final Provider<Context> contextProvider;

  public EmergencyRepository_Factory(Provider<EmergencyDao> emergencyDaoProvider,
      Provider<Context> contextProvider) {
    this.emergencyDaoProvider = emergencyDaoProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public EmergencyRepository get() {
    return newInstance(emergencyDaoProvider.get(), contextProvider.get());
  }

  public static EmergencyRepository_Factory create(Provider<EmergencyDao> emergencyDaoProvider,
      Provider<Context> contextProvider) {
    return new EmergencyRepository_Factory(emergencyDaoProvider, contextProvider);
  }

  public static EmergencyRepository newInstance(EmergencyDao emergencyDao, Context context) {
    return new EmergencyRepository(emergencyDao, context);
  }
}
