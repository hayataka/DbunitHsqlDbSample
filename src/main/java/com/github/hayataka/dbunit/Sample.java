package com.github.hayataka.dbunit;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSession;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;

public class Sample {

	public void test() throws Exception {

		// mybatisから素のコネクションを取得する
		SqlSession a = null;
		//素のコネクション
		Connection connection = a.getConnection();
		// http://genesis-tdsg.blogspot.jp/2013/08/dbunit-db.html
		IDatabaseConnection icon= new DatabaseConnection(connection);
		
		
	}

	
}
