package com.hpe.dataArchive.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangshe on 5/5/2017.
 */
@Controller
@RequestMapping("dataBase")
public class DataBaseController {

	/*@RequestMapping(value = "/find.do", method = RequestMethod.POST)
	public String searchDataBase(HttpServletRequest req, HttpServletResponse res) {
		String databaseName=req.getParameter("databaseName");
		String tableName=req.getParameter("tableName");
		System.out.println(databaseName+"  "+tableName);
		return "indexdataBase";
	}*/
	@RequestMapping(value = "/find.do", method = RequestMethod.POST)
	public String searchDataBase(@RequestParam("databaseName") String databaseName, @RequestParam("tableName") String tableName) {
		System.out.println(databaseName+"  "+tableName);
		return "indexdataBase";
	}
}