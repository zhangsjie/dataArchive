package com.hpe.dataArchive.service;

import java.util.List;

import com.hpe.dataArchive.entity.DataBase;

public interface DataBaseService {
	public List<String> getFieldByDataBase(String tableName);
}
