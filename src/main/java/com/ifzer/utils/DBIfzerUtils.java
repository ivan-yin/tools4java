/**
 * Project Name:tools4java
 * File Name:DBUtils.java <p>function description: </p>
 * Package Name:com.ifzer.utils
 * Date:Dec 17, 20144:05:11 PM
 * Copyright (c) 2014, 020lilin@gmail.com All Rights Reserved.
 */
package com.ifzer.utils;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

/**
 * ClassName:DBUtils <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date: Dec 17, 2014 4:05:11 PM <br/>
 *
 * @author ybs Email 020lilin@gmail.com
 * @version 1.0
 * @since JDK 1.6
 * @see
 */
public class DBIfzerUtils {

	public void query() {
		DataSource ds = HikariDs.getMysqlDs();
		QueryRunner qr = new QueryRunner(ds);
		try {
			List<Object[]> query = qr.query("select * from json_tb",
					new ArrayListHandler());

			for (Object[] objects : query) {
				System.out.println(objects[0] + "    ===   " + objects[1]);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
		}
	}

}
