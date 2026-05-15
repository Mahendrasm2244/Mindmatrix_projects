package com.pratham.chikitse.data.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.pratham.chikitse.data.model.Emergency;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class EmergencyDao_Impl implements EmergencyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Emergency> __insertionAdapterOfEmergency;

  public EmergencyDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEmergency = new EntityInsertionAdapter<Emergency>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `emergencies` (`id`,`nameEn`,`nameKn`,`category`,`colorHex`,`iconName`,`stepsEn`,`stepsKn`,`dosEn`,`dosKn`,`dontsEn`,`dontsKn`,`keywordsEn`,`keywordsKn`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Emergency entity) {
        statement.bindLong(1, entity.getId());
        statement.bindString(2, entity.getNameEn());
        statement.bindString(3, entity.getNameKn());
        statement.bindString(4, entity.getCategory());
        statement.bindString(5, entity.getColorHex());
        statement.bindString(6, entity.getIconName());
        statement.bindString(7, entity.getStepsEn());
        statement.bindString(8, entity.getStepsKn());
        statement.bindString(9, entity.getDosEn());
        statement.bindString(10, entity.getDosKn());
        statement.bindString(11, entity.getDontsEn());
        statement.bindString(12, entity.getDontsKn());
        statement.bindString(13, entity.getKeywordsEn());
        statement.bindString(14, entity.getKeywordsKn());
      }
    };
  }

  @Override
  public Object insertAll(final List<Emergency> emergencies,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfEmergency.insert(emergencies);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<Emergency>> getAllEmergencies() {
    final String _sql = "SELECT * FROM emergencies ORDER BY nameEn ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"emergencies"}, new Callable<List<Emergency>>() {
      @Override
      @NonNull
      public List<Emergency> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNameEn = CursorUtil.getColumnIndexOrThrow(_cursor, "nameEn");
          final int _cursorIndexOfNameKn = CursorUtil.getColumnIndexOrThrow(_cursor, "nameKn");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfColorHex = CursorUtil.getColumnIndexOrThrow(_cursor, "colorHex");
          final int _cursorIndexOfIconName = CursorUtil.getColumnIndexOrThrow(_cursor, "iconName");
          final int _cursorIndexOfStepsEn = CursorUtil.getColumnIndexOrThrow(_cursor, "stepsEn");
          final int _cursorIndexOfStepsKn = CursorUtil.getColumnIndexOrThrow(_cursor, "stepsKn");
          final int _cursorIndexOfDosEn = CursorUtil.getColumnIndexOrThrow(_cursor, "dosEn");
          final int _cursorIndexOfDosKn = CursorUtil.getColumnIndexOrThrow(_cursor, "dosKn");
          final int _cursorIndexOfDontsEn = CursorUtil.getColumnIndexOrThrow(_cursor, "dontsEn");
          final int _cursorIndexOfDontsKn = CursorUtil.getColumnIndexOrThrow(_cursor, "dontsKn");
          final int _cursorIndexOfKeywordsEn = CursorUtil.getColumnIndexOrThrow(_cursor, "keywordsEn");
          final int _cursorIndexOfKeywordsKn = CursorUtil.getColumnIndexOrThrow(_cursor, "keywordsKn");
          final List<Emergency> _result = new ArrayList<Emergency>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Emergency _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNameEn;
            _tmpNameEn = _cursor.getString(_cursorIndexOfNameEn);
            final String _tmpNameKn;
            _tmpNameKn = _cursor.getString(_cursorIndexOfNameKn);
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpColorHex;
            _tmpColorHex = _cursor.getString(_cursorIndexOfColorHex);
            final String _tmpIconName;
            _tmpIconName = _cursor.getString(_cursorIndexOfIconName);
            final String _tmpStepsEn;
            _tmpStepsEn = _cursor.getString(_cursorIndexOfStepsEn);
            final String _tmpStepsKn;
            _tmpStepsKn = _cursor.getString(_cursorIndexOfStepsKn);
            final String _tmpDosEn;
            _tmpDosEn = _cursor.getString(_cursorIndexOfDosEn);
            final String _tmpDosKn;
            _tmpDosKn = _cursor.getString(_cursorIndexOfDosKn);
            final String _tmpDontsEn;
            _tmpDontsEn = _cursor.getString(_cursorIndexOfDontsEn);
            final String _tmpDontsKn;
            _tmpDontsKn = _cursor.getString(_cursorIndexOfDontsKn);
            final String _tmpKeywordsEn;
            _tmpKeywordsEn = _cursor.getString(_cursorIndexOfKeywordsEn);
            final String _tmpKeywordsKn;
            _tmpKeywordsKn = _cursor.getString(_cursorIndexOfKeywordsKn);
            _item = new Emergency(_tmpId,_tmpNameEn,_tmpNameKn,_tmpCategory,_tmpColorHex,_tmpIconName,_tmpStepsEn,_tmpStepsKn,_tmpDosEn,_tmpDosKn,_tmpDontsEn,_tmpDontsKn,_tmpKeywordsEn,_tmpKeywordsKn);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getEmergencyById(final int id, final Continuation<? super Emergency> $completion) {
    final String _sql = "SELECT * FROM emergencies WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Emergency>() {
      @Override
      @Nullable
      public Emergency call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNameEn = CursorUtil.getColumnIndexOrThrow(_cursor, "nameEn");
          final int _cursorIndexOfNameKn = CursorUtil.getColumnIndexOrThrow(_cursor, "nameKn");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfColorHex = CursorUtil.getColumnIndexOrThrow(_cursor, "colorHex");
          final int _cursorIndexOfIconName = CursorUtil.getColumnIndexOrThrow(_cursor, "iconName");
          final int _cursorIndexOfStepsEn = CursorUtil.getColumnIndexOrThrow(_cursor, "stepsEn");
          final int _cursorIndexOfStepsKn = CursorUtil.getColumnIndexOrThrow(_cursor, "stepsKn");
          final int _cursorIndexOfDosEn = CursorUtil.getColumnIndexOrThrow(_cursor, "dosEn");
          final int _cursorIndexOfDosKn = CursorUtil.getColumnIndexOrThrow(_cursor, "dosKn");
          final int _cursorIndexOfDontsEn = CursorUtil.getColumnIndexOrThrow(_cursor, "dontsEn");
          final int _cursorIndexOfDontsKn = CursorUtil.getColumnIndexOrThrow(_cursor, "dontsKn");
          final int _cursorIndexOfKeywordsEn = CursorUtil.getColumnIndexOrThrow(_cursor, "keywordsEn");
          final int _cursorIndexOfKeywordsKn = CursorUtil.getColumnIndexOrThrow(_cursor, "keywordsKn");
          final Emergency _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNameEn;
            _tmpNameEn = _cursor.getString(_cursorIndexOfNameEn);
            final String _tmpNameKn;
            _tmpNameKn = _cursor.getString(_cursorIndexOfNameKn);
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpColorHex;
            _tmpColorHex = _cursor.getString(_cursorIndexOfColorHex);
            final String _tmpIconName;
            _tmpIconName = _cursor.getString(_cursorIndexOfIconName);
            final String _tmpStepsEn;
            _tmpStepsEn = _cursor.getString(_cursorIndexOfStepsEn);
            final String _tmpStepsKn;
            _tmpStepsKn = _cursor.getString(_cursorIndexOfStepsKn);
            final String _tmpDosEn;
            _tmpDosEn = _cursor.getString(_cursorIndexOfDosEn);
            final String _tmpDosKn;
            _tmpDosKn = _cursor.getString(_cursorIndexOfDosKn);
            final String _tmpDontsEn;
            _tmpDontsEn = _cursor.getString(_cursorIndexOfDontsEn);
            final String _tmpDontsKn;
            _tmpDontsKn = _cursor.getString(_cursorIndexOfDontsKn);
            final String _tmpKeywordsEn;
            _tmpKeywordsEn = _cursor.getString(_cursorIndexOfKeywordsEn);
            final String _tmpKeywordsKn;
            _tmpKeywordsKn = _cursor.getString(_cursorIndexOfKeywordsKn);
            _result = new Emergency(_tmpId,_tmpNameEn,_tmpNameKn,_tmpCategory,_tmpColorHex,_tmpIconName,_tmpStepsEn,_tmpStepsKn,_tmpDosEn,_tmpDosKn,_tmpDontsEn,_tmpDontsKn,_tmpKeywordsEn,_tmpKeywordsKn);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object searchEmergencies(final String query,
      final Continuation<? super List<Emergency>> $completion) {
    final String _sql = "SELECT * FROM emergencies WHERE\n"
            + "        lower(nameEn) LIKE '%' || lower(?) || '%' OR\n"
            + "        lower(nameKn) LIKE '%' || lower(?) || '%' OR\n"
            + "        lower(keywordsEn) LIKE '%' || lower(?) || '%' OR\n"
            + "        lower(keywordsKn) LIKE '%' || lower(?) || '%'\n"
            + "        ORDER BY nameEn ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    _statement.bindString(_argIndex, query);
    _argIndex = 2;
    _statement.bindString(_argIndex, query);
    _argIndex = 3;
    _statement.bindString(_argIndex, query);
    _argIndex = 4;
    _statement.bindString(_argIndex, query);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Emergency>>() {
      @Override
      @NonNull
      public List<Emergency> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNameEn = CursorUtil.getColumnIndexOrThrow(_cursor, "nameEn");
          final int _cursorIndexOfNameKn = CursorUtil.getColumnIndexOrThrow(_cursor, "nameKn");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfColorHex = CursorUtil.getColumnIndexOrThrow(_cursor, "colorHex");
          final int _cursorIndexOfIconName = CursorUtil.getColumnIndexOrThrow(_cursor, "iconName");
          final int _cursorIndexOfStepsEn = CursorUtil.getColumnIndexOrThrow(_cursor, "stepsEn");
          final int _cursorIndexOfStepsKn = CursorUtil.getColumnIndexOrThrow(_cursor, "stepsKn");
          final int _cursorIndexOfDosEn = CursorUtil.getColumnIndexOrThrow(_cursor, "dosEn");
          final int _cursorIndexOfDosKn = CursorUtil.getColumnIndexOrThrow(_cursor, "dosKn");
          final int _cursorIndexOfDontsEn = CursorUtil.getColumnIndexOrThrow(_cursor, "dontsEn");
          final int _cursorIndexOfDontsKn = CursorUtil.getColumnIndexOrThrow(_cursor, "dontsKn");
          final int _cursorIndexOfKeywordsEn = CursorUtil.getColumnIndexOrThrow(_cursor, "keywordsEn");
          final int _cursorIndexOfKeywordsKn = CursorUtil.getColumnIndexOrThrow(_cursor, "keywordsKn");
          final List<Emergency> _result = new ArrayList<Emergency>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Emergency _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNameEn;
            _tmpNameEn = _cursor.getString(_cursorIndexOfNameEn);
            final String _tmpNameKn;
            _tmpNameKn = _cursor.getString(_cursorIndexOfNameKn);
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpColorHex;
            _tmpColorHex = _cursor.getString(_cursorIndexOfColorHex);
            final String _tmpIconName;
            _tmpIconName = _cursor.getString(_cursorIndexOfIconName);
            final String _tmpStepsEn;
            _tmpStepsEn = _cursor.getString(_cursorIndexOfStepsEn);
            final String _tmpStepsKn;
            _tmpStepsKn = _cursor.getString(_cursorIndexOfStepsKn);
            final String _tmpDosEn;
            _tmpDosEn = _cursor.getString(_cursorIndexOfDosEn);
            final String _tmpDosKn;
            _tmpDosKn = _cursor.getString(_cursorIndexOfDosKn);
            final String _tmpDontsEn;
            _tmpDontsEn = _cursor.getString(_cursorIndexOfDontsEn);
            final String _tmpDontsKn;
            _tmpDontsKn = _cursor.getString(_cursorIndexOfDontsKn);
            final String _tmpKeywordsEn;
            _tmpKeywordsEn = _cursor.getString(_cursorIndexOfKeywordsEn);
            final String _tmpKeywordsKn;
            _tmpKeywordsKn = _cursor.getString(_cursorIndexOfKeywordsKn);
            _item = new Emergency(_tmpId,_tmpNameEn,_tmpNameKn,_tmpCategory,_tmpColorHex,_tmpIconName,_tmpStepsEn,_tmpStepsKn,_tmpDosEn,_tmpDosKn,_tmpDontsEn,_tmpDontsKn,_tmpKeywordsEn,_tmpKeywordsKn);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<Emergency>> getEmergenciesByCategory(final String category) {
    final String _sql = "SELECT * FROM emergencies WHERE category = ? ORDER BY nameEn ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindString(_argIndex, category);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"emergencies"}, new Callable<List<Emergency>>() {
      @Override
      @NonNull
      public List<Emergency> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNameEn = CursorUtil.getColumnIndexOrThrow(_cursor, "nameEn");
          final int _cursorIndexOfNameKn = CursorUtil.getColumnIndexOrThrow(_cursor, "nameKn");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfColorHex = CursorUtil.getColumnIndexOrThrow(_cursor, "colorHex");
          final int _cursorIndexOfIconName = CursorUtil.getColumnIndexOrThrow(_cursor, "iconName");
          final int _cursorIndexOfStepsEn = CursorUtil.getColumnIndexOrThrow(_cursor, "stepsEn");
          final int _cursorIndexOfStepsKn = CursorUtil.getColumnIndexOrThrow(_cursor, "stepsKn");
          final int _cursorIndexOfDosEn = CursorUtil.getColumnIndexOrThrow(_cursor, "dosEn");
          final int _cursorIndexOfDosKn = CursorUtil.getColumnIndexOrThrow(_cursor, "dosKn");
          final int _cursorIndexOfDontsEn = CursorUtil.getColumnIndexOrThrow(_cursor, "dontsEn");
          final int _cursorIndexOfDontsKn = CursorUtil.getColumnIndexOrThrow(_cursor, "dontsKn");
          final int _cursorIndexOfKeywordsEn = CursorUtil.getColumnIndexOrThrow(_cursor, "keywordsEn");
          final int _cursorIndexOfKeywordsKn = CursorUtil.getColumnIndexOrThrow(_cursor, "keywordsKn");
          final List<Emergency> _result = new ArrayList<Emergency>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Emergency _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNameEn;
            _tmpNameEn = _cursor.getString(_cursorIndexOfNameEn);
            final String _tmpNameKn;
            _tmpNameKn = _cursor.getString(_cursorIndexOfNameKn);
            final String _tmpCategory;
            _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            final String _tmpColorHex;
            _tmpColorHex = _cursor.getString(_cursorIndexOfColorHex);
            final String _tmpIconName;
            _tmpIconName = _cursor.getString(_cursorIndexOfIconName);
            final String _tmpStepsEn;
            _tmpStepsEn = _cursor.getString(_cursorIndexOfStepsEn);
            final String _tmpStepsKn;
            _tmpStepsKn = _cursor.getString(_cursorIndexOfStepsKn);
            final String _tmpDosEn;
            _tmpDosEn = _cursor.getString(_cursorIndexOfDosEn);
            final String _tmpDosKn;
            _tmpDosKn = _cursor.getString(_cursorIndexOfDosKn);
            final String _tmpDontsEn;
            _tmpDontsEn = _cursor.getString(_cursorIndexOfDontsEn);
            final String _tmpDontsKn;
            _tmpDontsKn = _cursor.getString(_cursorIndexOfDontsKn);
            final String _tmpKeywordsEn;
            _tmpKeywordsEn = _cursor.getString(_cursorIndexOfKeywordsEn);
            final String _tmpKeywordsKn;
            _tmpKeywordsKn = _cursor.getString(_cursorIndexOfKeywordsKn);
            _item = new Emergency(_tmpId,_tmpNameEn,_tmpNameKn,_tmpCategory,_tmpColorHex,_tmpIconName,_tmpStepsEn,_tmpStepsKn,_tmpDosEn,_tmpDosKn,_tmpDontsEn,_tmpDontsKn,_tmpKeywordsEn,_tmpKeywordsKn);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object count(final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM emergencies";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final int _tmp;
            _tmp = _cursor.getInt(0);
            _result = _tmp;
          } else {
            _result = 0;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
