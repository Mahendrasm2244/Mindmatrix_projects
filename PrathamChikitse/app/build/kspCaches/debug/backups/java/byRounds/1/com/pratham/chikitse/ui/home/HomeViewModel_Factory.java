package com.pratham.chikitse.ui.home;

import com.pratham.chikitse.data.repository.EmergencyRepository;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<EmergencyRepository> emergencyRepoProvider;

  private final Provider<PreferencesHelper> prefsProvider;

  public HomeViewModel_Factory(Provider<EmergencyRepository> emergencyRepoProvider,
      Provider<PreferencesHelper> prefsProvider) {
    this.emergencyRepoProvider = emergencyRepoProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(emergencyRepoProvider.get(), prefsProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<EmergencyRepository> emergencyRepoProvider,
      Provider<PreferencesHelper> prefsProvider) {
    return new HomeViewModel_Factory(emergencyRepoProvider, prefsProvider);
  }

  public static HomeViewModel newInstance(EmergencyRepository emergencyRepo,
      PreferencesHelper prefs) {
    return new HomeViewModel(emergencyRepo, prefs);
  }
}
