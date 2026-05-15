package com.pratham.chikitse.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.pratham.chikitse.data.dao.EmergencyDao;
import com.pratham.chikitse.data.dao.EmergencyDao_Impl;
import com.pratham.chikitse.data.dao.HospitalDao;
import com.pratham.chikitse.data.dao.HospitalDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile EmergencyDao _emergencyDao;

  private volatile HospitalDao _hospitalDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `emergencies` (`id` INTEGER NOT NULL, `nameEn` TEXT NOT NULL, `nameKn` TEXT NOT NULL, `category` TEXT NOT NULL, `colorHex` TEXT NOT NULL, `iconName` TEXT NOT NULL, `stepsEn` TEXT NOT NULL, `stepsKn` TEXT NOT NULL, `dosEn` TEXT NOT NULL, `dosKn` TEXT NOT NULL, `dontsEn` TEXT NOT NULL, `dontsKn` TEXT NOT NULL, `keywordsEn` TEXT NOT NULL, `keywordsKn` TEXT NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `hospitals` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `address` TEXT NOT NULL, `phone` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `districtKn` TEXT NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '883c17a3949a5c60f98fff9afda7e7d9')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `emergencies`");
        db.execSQL("DROP TABLE IF EXISTS `hospitals`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsEmergencies = new HashMap<String, TableInfo.Column>(14);
        _columnsEmergencies.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmergencies.put("nameEn", new TableInfo.Column("nameEn", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmergencies.put("nameKn", new TableInfo.Column("nameKn", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmergencies.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmergencies.put("colorHex", new TableInfo.Column("colorHex", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmergencies.put("iconName", new TableInfo.Column("iconName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmergencies.put("stepsEn", new TableInfo.Column("stepsEn", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmergencies.put("stepsKn", new TableInfo.Column("stepsKn", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmergencies.put("dosEn", new TableInfo.Column("dosEn", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmergencies.put("dosKn", new TableInfo.Column("dosKn", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmergencies.put("dontsEn", new TableInfo.Column("dontsEn", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmergencies.put("dontsKn", new TableInfo.Column("dontsKn", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmergencies.put("keywordsEn", new TableInfo.Column("keywordsEn", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmergencies.put("keywordsKn", new TableInfo.Column("keywordsKn", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEmergencies = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesEmergencies = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEmergencies = new TableInfo("emergencies", _columnsEmergencies, _foreignKeysEmergencies, _indicesEmergencies);
        final TableInfo _existingEmergencies = TableInfo.read(db, "emergencies");
        if (!_infoEmergencies.equals(_existingEmergencies)) {
          return new RoomOpenHelper.ValidationResult(false, "emergencies(com.pratham.chikitse.data.model.Emergency).\n"
                  + " Expected:\n" + _infoEmergencies + "\n"
                  + " Found:\n" + _existingEmergencies);
        }
        final HashMap<String, TableInfo.Column> _columnsHospitals = new HashMap<String, TableInfo.Column>(8);
        _columnsHospitals.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHospitals.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHospitals.put("address", new TableInfo.Column("address", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHospitals.put("phone", new TableInfo.Column("phone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHospitals.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHospitals.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHospitals.put("districtKn", new TableInfo.Column("districtKn", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHospitals.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHospitals = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHospitals = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHospitals = new TableInfo("hospitals", _columnsHospitals, _foreignKeysHospitals, _indicesHospitals);
        final TableInfo _existingHospitals = TableInfo.read(db, "hospitals");
        if (!_infoHospitals.equals(_existingHospitals)) {
          return new RoomOpenHelper.ValidationResult(false, "hospitals(com.pratham.chikitse.data.model.Hospital).\n"
                  + " Expected:\n" + _infoHospitals + "\n"
                  + " Found:\n" + _existingHospitals);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "883c17a3949a5c60f98fff9afda7e7d9", "957072a4e8c187a3612d19ee20dc303d");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "emergencies","hospitals");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `emergencies`");
      _db.execSQL("DELETE FROM `hospitals`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(EmergencyDao.class, EmergencyDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(HospitalDao.class, HospitalDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public EmergencyDao emergencyDao() {
    if (_emergencyDao != null) {
      return _emergencyDao;
    } else {
      synchronized(this) {
        if(_emergencyDao == null) {
          _emergencyDao = new EmergencyDao_Impl(this);
        }
        return _emergencyDao;
      }
    }
  }

  @Override
  public HospitalDao hospitalDao() {
    if (_hospitalDao != null) {
      return _hospitalDao;
    } else {
      synchronized(this) {
        if(_hospitalDao == null) {
          _hospitalDao = new HospitalDao_Impl(this);
        }
        return _hospitalDao;
      }
    }
  }
}
