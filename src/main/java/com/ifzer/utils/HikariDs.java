/**
 * Project Name:tools4java
 * File Name:HikariDs.java <p>function description: </p>
 * Package Name:com.ifzer.utils
 * Date:Dec 17, 20146:17:24 PM
 * Copyright (c) 2014, 020lilin@gmail.com All Rights Reserved.
 */
package com.ifzer.utils;

import javax.sql.DataSource;

import org.apache.commons.dbutils.DbUtils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * ClassName:HikariDs <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date: Dec 17, 2014 6:17:24 PM <br/>
 *
 * @author ybs Email 020lilin@gmail.com
 * @version 1.0
 * @since JDK 1.6
 * @see
 */
public class HikariDs {

	private static DataSource ds;

	/**
	 *
	 * configMysql:(描述方法的作用). <br/>
	 * TODO(描述方法适用条件 – 可选).<br/>
	 *
	 * @author ybs
	 * @return
	 * @since JDK 1.6
	 */
	public static DataSource getMysqlDs() {

		if (ds == null) {
			DbUtils.loadDriver("com.mysql.jdbc.Driver");
			HikariConfig config = new HikariConfig();
			config.setDriverClassName("com.mysql.jdbc.Driver");
			config.setJdbcUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8");
			config.setUsername("test");
			config.setPassword("");
			config.addDataSourceProperty("cachePrepStmts", "true");
			config.addDataSourceProperty("prepStmtCacheSize", "250");
			config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
			config.addDataSourceProperty("useServerPrepStmts", "true");

			// 增加以下两行代码,以防止乱码
			config.addDataSourceProperty("useUnicode", "true");
			config.addDataSourceProperty("characterEncoding", "utf8");

			ds = new HikariDataSource(config);
		}
		return ds;
	}

}
