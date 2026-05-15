package com.pratham.chikitse.ui.settings;

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
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<PreferencesHelper> prefsProvider;

  public SettingsViewModel_Factory(Provider<PreferencesHelper> prefsProvider) {
    this.prefsProvider = prefsProvider;
  }

  @Override
  public SettingsViewModel get() {
    return newInstance(prefsProvider.get());
  }

  public static SettingsViewModel_Factory create(Provider<PreferencesHelper> prefsProvider) {
    return new SettingsViewModel_Factory(prefsProvider);
  }

  public static SettingsViewModel newInstance(PreferencesHelper prefs) {
    return new SettingsViewModel(prefs);
  }
}
