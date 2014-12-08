package com.arkaitzgarro.rest.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DB {
	private static Connection oconn;

	private static DB db;
	private String url = "jdbc:mysql://127.0.0.1/sakila";
	private String user = "sakila";
	private String pass = "sakila";

	private DB() throws SQLException {
		oconn = DriverManager.getConnection(url, user, pass);
	}

	public static final Connection getConnection() throws SQLException {
		if (db == null) {
			db = new DB();
		}

		return oconn;
	}

}
