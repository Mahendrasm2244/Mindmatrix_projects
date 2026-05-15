package com.pratham.chikitse.ui.emergency;

import androidx.lifecycle.SavedStateHandle;
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
public final class EmergencyDetailViewModel_Factory implements Factory<EmergencyDetailViewModel> {
  private final Provider<EmergencyRepository> repoProvider;

  private final Provider<PreferencesHelper> prefsProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public EmergencyDetailViewModel_Factory(Provider<EmergencyRepository> repoProvider,
      Provider<PreferencesHelper> prefsProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.repoProvider = repoProvider;
    this.prefsProvider = prefsProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public EmergencyDetailViewModel get() {
    return newInstance(repoProvider.get(), prefsProvider.get(), savedStateHandleProvider.get());
  }

  public static EmergencyDetailViewModel_Factory create(Provider<EmergencyRepository> repoProvider,
      Provider<PreferencesHelper> prefsProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new EmergencyDetailViewModel_Factory(repoProvider, prefsProvider, savedStateHandleProvider);
  }

  public static EmergencyDetailViewModel newInstance(EmergencyRepository repo,
      PreferencesHelper prefs, SavedStateHandle savedStateHandle) {
    return new EmergencyDetailViewModel(repo, prefs, savedStateHandle);
  }
}
