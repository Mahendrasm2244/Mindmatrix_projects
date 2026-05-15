package com.pratham.chikitse.data.repository;

import android.content.Context;
import com.pratham.chikitse.data.dao.HospitalDao;
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
public final class HospitalRepository_Factory implements Factory<HospitalRepository> {
  private final Provider<HospitalDao> hospitalDaoProvider;

  private final Provider<Context> contextProvider;

  public HospitalRepository_Factory(Provider<HospitalDao> hospitalDaoProvider,
      Provider<Context> contextProvider) {
    this.hospitalDaoProvider = hospitalDaoProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public HospitalRepository get() {
    return newInstance(hospitalDaoProvider.get(), contextProvider.get());
  }

  public static HospitalRepository_Factory create(Provider<HospitalDao> hospitalDaoProvider,
      Provider<Context> contextProvider) {
    return new HospitalRepository_Factory(hospitalDaoProvider, contextProvider);
  }

  public static HospitalRepository newInstance(HospitalDao hospitalDao, Context context) {
    return new HospitalRepository(hospitalDao, context);
  }
}
