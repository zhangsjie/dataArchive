package com.hpe.dataArchive.Dao;

import java.util.List;

import com.hpe.dataArchive.entity.DataBase;

/**
 * Created by zhangshe on 5/5/2017.
 */
public interface DataBaseDao {
  

	public List<String> queryAll(String tableName);
}
