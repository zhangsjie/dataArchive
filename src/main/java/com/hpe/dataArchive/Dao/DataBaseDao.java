package com.hpe.dataArchive.Dao;

import java.util.List;

/**
 * Created by zhangshe on 5/5/2017.
 */
public interface DataBaseDao {
    List<String> queryAll(String dataBaseName);
}
