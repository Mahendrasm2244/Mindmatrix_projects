package com.pratham.chikitse.util;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class GeminiHelper_Factory implements Factory<GeminiHelper> {
  @Override
  public GeminiHelper get() {
    return newInstance();
  }

  public static GeminiHelper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GeminiHelper newInstance() {
    return new GeminiHelper();
  }

  private static final class InstanceHolder {
    private static final GeminiHelper_Factory INSTANCE = new GeminiHelper_Factory();
  }
}
