package com.pratham.chikitse.ui.search;

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
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<EmergencyRepository> repoProvider;

  private final Provider<PreferencesHelper> prefsProvider;

  public SearchViewModel_Factory(Provider<EmergencyRepository> repoProvider,
      Provider<PreferencesHelper> prefsProvider) {
    this.repoProvider = repoProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public SearchViewModel get() {
    return newInstance(repoProvider.get(), prefsProvider.get());
  }

  public static SearchViewModel_Factory create(Provider<EmergencyRepository> repoProvider,
      Provider<PreferencesHelper> prefsProvider) {
    return new SearchViewModel_Factory(repoProvider, prefsProvider);
  }

  public static SearchViewModel newInstance(EmergencyRepository repo, PreferencesHelper prefs) {
    return new SearchViewModel(repo, prefs);
  }
}
