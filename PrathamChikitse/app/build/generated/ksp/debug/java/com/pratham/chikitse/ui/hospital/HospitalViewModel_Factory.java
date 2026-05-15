package com.pratham.chikitse.ui.hospital;

import com.pratham.chikitse.data.repository.HospitalRepository;
import com.pratham.chikitse.util.PreferencesHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class HospitalViewModel_Factory implements Factory<HospitalViewModel> {
  private final Provider<HospitalRepository> hospitalRepoProvider;

  private final Provider<PreferencesHelper> prefsProvider;

  public HospitalViewModel_Factory(Provider<HospitalRepository> hospitalRepoProvider,
      Provider<PreferencesHelper> prefsProvider) {
    this.hospitalRepoProvider = hospitalRepoProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public HospitalViewModel get() {
    return newInstance(hospitalRepoProvider.get(), prefsProvider.get());
  }

  public static HospitalViewModel_Factory create(Provider<HospitalRepository> hospitalRepoProvider,
      Provider<PreferencesHelper> prefsProvider) {
    return new HospitalViewModel_Factory(hospitalRepoProvider, prefsProvider);
  }

  public static HospitalViewModel newInstance(HospitalRepository hospitalRepo,
      PreferencesHelper prefs) {
    return new HospitalViewModel(hospitalRepo, prefs);
  }
}
