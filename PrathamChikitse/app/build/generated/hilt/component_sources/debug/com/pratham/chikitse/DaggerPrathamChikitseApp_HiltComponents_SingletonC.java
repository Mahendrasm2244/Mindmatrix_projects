package com.pratham.chikitse;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.pratham.chikitse.data.dao.EmergencyDao;
import com.pratham.chikitse.data.dao.HospitalDao;
import com.pratham.chikitse.data.database.AppDatabase;
import com.pratham.chikitse.data.repository.EmergencyRepository;
import com.pratham.chikitse.data.repository.HospitalRepository;
import com.pratham.chikitse.di.AppModule_ProvideContextFactory;
import com.pratham.chikitse.di.AppModule_ProvideDatabaseFactory;
import com.pratham.chikitse.di.AppModule_ProvideEmergencyDaoFactory;
import com.pratham.chikitse.di.AppModule_ProvideHospitalDaoFactory;
import com.pratham.chikitse.ui.ai.AiAssistantViewModel;
import com.pratham.chikitse.ui.ai.AiAssistantViewModel_HiltModules;
import com.pratham.chikitse.ui.emergency.EmergencyDetailViewModel;
import com.pratham.chikitse.ui.emergency.EmergencyDetailViewModel_HiltModules;
import com.pratham.chikitse.ui.home.HomeViewModel;
import com.pratham.chikitse.ui.home.HomeViewModel_HiltModules;
import com.pratham.chikitse.ui.hospital.HospitalViewModel;
import com.pratham.chikitse.ui.hospital.HospitalViewModel_HiltModules;
import com.pratham.chikitse.ui.search.SearchViewModel;
import com.pratham.chikitse.ui.search.SearchViewModel_HiltModules;
import com.pratham.chikitse.ui.settings.SettingsViewModel;
import com.pratham.chikitse.ui.settings.SettingsViewModel_HiltModules;
import com.pratham.chikitse.util.GeminiHelper;
import com.pratham.chikitse.util.PreferencesHelper;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.IdentifierNameString;
import dagger.internal.KeepFieldType;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

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
public final class DaggerPrathamChikitseApp_HiltComponents_SingletonC {
  private DaggerPrathamChikitseApp_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public PrathamChikitseApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements PrathamChikitseApp_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private SavedStateHandleHolder savedStateHandleHolder;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ActivityRetainedCBuilder savedStateHandleHolder(
        SavedStateHandleHolder savedStateHandleHolder) {
      this.savedStateHandleHolder = Preconditions.checkNotNull(savedStateHandleHolder);
      return this;
    }

    @Override
    public PrathamChikitseApp_HiltComponents.ActivityRetainedC build() {
      Preconditions.checkBuilderRequirement(savedStateHandleHolder, SavedStateHandleHolder.class);
      return new ActivityRetainedCImpl(singletonCImpl, savedStateHandleHolder);
    }
  }

  private static final class ActivityCBuilder implements PrathamChikitseApp_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public PrathamChikitseApp_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements PrathamChikitseApp_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public PrathamChikitseApp_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements PrathamChikitseApp_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public PrathamChikitseApp_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements PrathamChikitseApp_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public PrathamChikitseApp_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements PrathamChikitseApp_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public PrathamChikitseApp_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements PrathamChikitseApp_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public PrathamChikitseApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends PrathamChikitseApp_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends PrathamChikitseApp_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends PrathamChikitseApp_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends PrathamChikitseApp_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Map<Class<?>, Boolean> getViewModelKeys() {
      return LazyClassKeyMap.<Boolean>of(MapBuilder.<String, Boolean>newMapBuilder(6).put(LazyClassKeyProvider.com_pratham_chikitse_ui_ai_AiAssistantViewModel, AiAssistantViewModel_HiltModules.KeyModule.provide()).put(LazyClassKeyProvider.com_pratham_chikitse_ui_emergency_EmergencyDetailViewModel, EmergencyDetailViewModel_HiltModules.KeyModule.provide()).put(LazyClassKeyProvider.com_pratham_chikitse_ui_home_HomeViewModel, HomeViewModel_HiltModules.KeyModule.provide()).put(LazyClassKeyProvider.com_pratham_chikitse_ui_hospital_HospitalViewModel, HospitalViewModel_HiltModules.KeyModule.provide()).put(LazyClassKeyProvider.com_pratham_chikitse_ui_search_SearchViewModel, SearchViewModel_HiltModules.KeyModule.provide()).put(LazyClassKeyProvider.com_pratham_chikitse_ui_settings_SettingsViewModel, SettingsViewModel_HiltModules.KeyModule.provide()).build());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @IdentifierNameString
    private static final class LazyClassKeyProvider {
      static String com_pratham_chikitse_ui_hospital_HospitalViewModel = "com.pratham.chikitse.ui.hospital.HospitalViewModel";

      static String com_pratham_chikitse_ui_home_HomeViewModel = "com.pratham.chikitse.ui.home.HomeViewModel";

      static String com_pratham_chikitse_ui_search_SearchViewModel = "com.pratham.chikitse.ui.search.SearchViewModel";

      static String com_pratham_chikitse_ui_settings_SettingsViewModel = "com.pratham.chikitse.ui.settings.SettingsViewModel";

      static String com_pratham_chikitse_ui_emergency_EmergencyDetailViewModel = "com.pratham.chikitse.ui.emergency.EmergencyDetailViewModel";

      static String com_pratham_chikitse_ui_ai_AiAssistantViewModel = "com.pratham.chikitse.ui.ai.AiAssistantViewModel";

      @KeepFieldType
      HospitalViewModel com_pratham_chikitse_ui_hospital_HospitalViewModel2;

      @KeepFieldType
      HomeViewModel com_pratham_chikitse_ui_home_HomeViewModel2;

      @KeepFieldType
      SearchViewModel com_pratham_chikitse_ui_search_SearchViewModel2;

      @KeepFieldType
      SettingsViewModel com_pratham_chikitse_ui_settings_SettingsViewModel2;

      @KeepFieldType
      EmergencyDetailViewModel com_pratham_chikitse_ui_emergency_EmergencyDetailViewModel2;

      @KeepFieldType
      AiAssistantViewModel com_pratham_chikitse_ui_ai_AiAssistantViewModel2;
    }
  }

  private static final class ViewModelCImpl extends PrathamChikitseApp_HiltComponents.ViewModelC {
    private final SavedStateHandle savedStateHandle;

    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<AiAssistantViewModel> aiAssistantViewModelProvider;

    private Provider<EmergencyDetailViewModel> emergencyDetailViewModelProvider;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<HospitalViewModel> hospitalViewModelProvider;

    private Provider<SearchViewModel> searchViewModelProvider;

    private Provider<SettingsViewModel> settingsViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.savedStateHandle = savedStateHandleParam;
      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.aiAssistantViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.emergencyDetailViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.homeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.hospitalViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.searchViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.settingsViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
    }

    @Override
    public Map<Class<?>, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
      return LazyClassKeyMap.<javax.inject.Provider<ViewModel>>of(MapBuilder.<String, javax.inject.Provider<ViewModel>>newMapBuilder(6).put(LazyClassKeyProvider.com_pratham_chikitse_ui_ai_AiAssistantViewModel, ((Provider) aiAssistantViewModelProvider)).put(LazyClassKeyProvider.com_pratham_chikitse_ui_emergency_EmergencyDetailViewModel, ((Provider) emergencyDetailViewModelProvider)).put(LazyClassKeyProvider.com_pratham_chikitse_ui_home_HomeViewModel, ((Provider) homeViewModelProvider)).put(LazyClassKeyProvider.com_pratham_chikitse_ui_hospital_HospitalViewModel, ((Provider) hospitalViewModelProvider)).put(LazyClassKeyProvider.com_pratham_chikitse_ui_search_SearchViewModel, ((Provider) searchViewModelProvider)).put(LazyClassKeyProvider.com_pratham_chikitse_ui_settings_SettingsViewModel, ((Provider) settingsViewModelProvider)).build());
    }

    @Override
    public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
      return Collections.<Class<?>, Object>emptyMap();
    }

    @IdentifierNameString
    private static final class LazyClassKeyProvider {
      static String com_pratham_chikitse_ui_home_HomeViewModel = "com.pratham.chikitse.ui.home.HomeViewModel";

      static String com_pratham_chikitse_ui_hospital_HospitalViewModel = "com.pratham.chikitse.ui.hospital.HospitalViewModel";

      static String com_pratham_chikitse_ui_emergency_EmergencyDetailViewModel = "com.pratham.chikitse.ui.emergency.EmergencyDetailViewModel";

      static String com_pratham_chikitse_ui_settings_SettingsViewModel = "com.pratham.chikitse.ui.settings.SettingsViewModel";

      static String com_pratham_chikitse_ui_search_SearchViewModel = "com.pratham.chikitse.ui.search.SearchViewModel";

      static String com_pratham_chikitse_ui_ai_AiAssistantViewModel = "com.pratham.chikitse.ui.ai.AiAssistantViewModel";

      @KeepFieldType
      HomeViewModel com_pratham_chikitse_ui_home_HomeViewModel2;

      @KeepFieldType
      HospitalViewModel com_pratham_chikitse_ui_hospital_HospitalViewModel2;

      @KeepFieldType
      EmergencyDetailViewModel com_pratham_chikitse_ui_emergency_EmergencyDetailViewModel2;

      @KeepFieldType
      SettingsViewModel com_pratham_chikitse_ui_settings_SettingsViewModel2;

      @KeepFieldType
      SearchViewModel com_pratham_chikitse_ui_search_SearchViewModel2;

      @KeepFieldType
      AiAssistantViewModel com_pratham_chikitse_ui_ai_AiAssistantViewModel2;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.pratham.chikitse.ui.ai.AiAssistantViewModel 
          return (T) new AiAssistantViewModel(singletonCImpl.geminiHelperProvider.get(), singletonCImpl.preferencesHelperProvider.get());

          case 1: // com.pratham.chikitse.ui.emergency.EmergencyDetailViewModel 
          return (T) new EmergencyDetailViewModel(singletonCImpl.emergencyRepositoryProvider.get(), singletonCImpl.preferencesHelperProvider.get(), viewModelCImpl.savedStateHandle);

          case 2: // com.pratham.chikitse.ui.home.HomeViewModel 
          return (T) new HomeViewModel(singletonCImpl.emergencyRepositoryProvider.get(), singletonCImpl.preferencesHelperProvider.get());

          case 3: // com.pratham.chikitse.ui.hospital.HospitalViewModel 
          return (T) new HospitalViewModel(singletonCImpl.hospitalRepositoryProvider.get(), singletonCImpl.preferencesHelperProvider.get());

          case 4: // com.pratham.chikitse.ui.search.SearchViewModel 
          return (T) new SearchViewModel(singletonCImpl.emergencyRepositoryProvider.get(), singletonCImpl.preferencesHelperProvider.get());

          case 5: // com.pratham.chikitse.ui.settings.SettingsViewModel 
          return (T) new SettingsViewModel(singletonCImpl.preferencesHelperProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends PrathamChikitseApp_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl,
        SavedStateHandleHolder savedStateHandleHolderParam) {
      this.singletonCImpl = singletonCImpl;

      initialize(savedStateHandleHolderParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends PrathamChikitseApp_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends PrathamChikitseApp_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<GeminiHelper> geminiHelperProvider;

    private Provider<PreferencesHelper> preferencesHelperProvider;

    private Provider<AppDatabase> provideDatabaseProvider;

    private Provider<Context> provideContextProvider;

    private Provider<EmergencyRepository> emergencyRepositoryProvider;

    private Provider<HospitalRepository> hospitalRepositoryProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    private EmergencyDao emergencyDao() {
      return AppModule_ProvideEmergencyDaoFactory.provideEmergencyDao(provideDatabaseProvider.get());
    }

    private HospitalDao hospitalDao() {
      return AppModule_ProvideHospitalDaoFactory.provideHospitalDao(provideDatabaseProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.geminiHelperProvider = DoubleCheck.provider(new SwitchingProvider<GeminiHelper>(singletonCImpl, 0));
      this.preferencesHelperProvider = DoubleCheck.provider(new SwitchingProvider<PreferencesHelper>(singletonCImpl, 1));
      this.provideDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<AppDatabase>(singletonCImpl, 3));
      this.provideContextProvider = DoubleCheck.provider(new SwitchingProvider<Context>(singletonCImpl, 4));
      this.emergencyRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<EmergencyRepository>(singletonCImpl, 2));
      this.hospitalRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<HospitalRepository>(singletonCImpl, 5));
    }

    @Override
    public void injectPrathamChikitseApp(PrathamChikitseApp prathamChikitseApp) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.pratham.chikitse.util.GeminiHelper 
          return (T) new GeminiHelper();

          case 1: // com.pratham.chikitse.util.PreferencesHelper 
          return (T) new PreferencesHelper(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 2: // com.pratham.chikitse.data.repository.EmergencyRepository 
          return (T) new EmergencyRepository(singletonCImpl.emergencyDao(), singletonCImpl.provideContextProvider.get());

          case 3: // com.pratham.chikitse.data.database.AppDatabase 
          return (T) AppModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 4: // android.content.Context 
          return (T) AppModule_ProvideContextFactory.provideContext(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 5: // com.pratham.chikitse.data.repository.HospitalRepository 
          return (T) new HospitalRepository(singletonCImpl.hospitalDao(), singletonCImpl.provideContextProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
