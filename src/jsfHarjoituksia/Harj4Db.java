package jsfHarjoituksia;

import java.sql.*;

public class Harj4Db {

	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String DB_URL = "jdbc:h2:tcp://localhost:9092/mem:jpatest";

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		Connection conn = null;
		Statement stmt = null;

		// STEP 2: Register JDBC driver
		Class.forName("org.h2.Driver");

		// STEP 3: Open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL);
		System.out.println("Yhteys muodostettu");

		/*
		 * //STEP 4: create new table oppilas
		 * System.out.println("Creating statement..."); stmt =
		 * conn.createStatement(); String sql; sql =
		 * "CREATE TABLE oppilas (id integer NOT NULL, nimi char(64) NOT NULL default '', demopisteet integer(4) NOT NULL,"
		 * + "koepisteet integer(4) NOT NULL default '',PRIMARY KEY (Id))";
		 * stmt.execute(sql); System.out.println("Taulu oppilas luotu");
		 */

		stmt = conn.createStatement();
		String s = "INSERT INTO oppilas (id,nimi,demopisteet,koepisteet) VALUES (1,'Aku',10,20),";
		String ss = "INSERT INTO oppilas (id,nimi,demopisteet,koepisteet) VALUES (2,'Hessu',12,22)";
		String sss = "INSERT INTO oppilas (id,nimi,demopisteet,koepisteet) VALUES (3,'Mikki',4,19)";
		// stmt.execute(s);
		// stmt.execute(ss);
		// stmt.execute(sss);
		System.out.println("Oppilaita lisätty");

		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from oppilas");
		System.out.println("Oppilaat:");
		// System.out.println(rs.getString("nimi"));
		while (rs.next()) {
			int id = rs.getInt("Id");
			String nimi = rs.getString("nimi");
			int dp = rs.getInt("demopisteet");
			int kp = rs.getInt("koepisteet");
			System.out.println("Id: " + id + ", nimi: " + nimi
					+ ", demopisteet: " + dp + ", koepisteet: " + kp);

		}

		stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE);

		rs = stmt.executeQuery("select * from oppilas");
		// Goto the first item in the result set
		rs.first();
		// Update: Add plus one point in the first student
		rs.updateInt("demopisteet", rs.getInt("demopisteet") + 1);
		rs.updateRow();

		System.out.println();
		System.out.println("Id: " + rs.getInt("id") + ", nimi: "
				+ rs.getString("nimi") + ", demopisteet: "
				+ rs.getInt("demopisteet") + ", koepisteet: "
				+ rs.getInt("koepisteet"));
		System.out.println();

	}

}
