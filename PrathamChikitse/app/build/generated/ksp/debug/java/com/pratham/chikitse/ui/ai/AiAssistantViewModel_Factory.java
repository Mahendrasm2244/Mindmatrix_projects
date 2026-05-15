package com.pratham.chikitse.ui.ai;

import com.pratham.chikitse.util.GeminiHelper;
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
public final class AiAssistantViewModel_Factory implements Factory<AiAssistantViewModel> {
  private final Provider<GeminiHelper> geminiProvider;

  private final Provider<PreferencesHelper> prefsProvider;

  public AiAssistantViewModel_Factory(Provider<GeminiHelper> geminiProvider,
      Provider<PreferencesHelper> prefsProvider) {
    this.geminiProvider = geminiProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public AiAssistantViewModel get() {
    return newInstance(geminiProvider.get(), prefsProvider.get());
  }

  public static AiAssistantViewModel_Factory create(Provider<GeminiHelper> geminiProvider,
      Provider<PreferencesHelper> prefsProvider) {
    return new AiAssistantViewModel_Factory(geminiProvider, prefsProvider);
  }

  public static AiAssistantViewModel newInstance(GeminiHelper gemini, PreferencesHelper prefs) {
    return new AiAssistantViewModel(gemini, prefs);
  }
}
