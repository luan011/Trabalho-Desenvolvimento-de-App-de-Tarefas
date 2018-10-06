package hellojdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;

// F�brica de conex�o com o Banco de dados
public class ConnectionFactory {
	
	private static final  String stringConexao = "jdbc:mysql://localhost:3306/banco_hellojdbc?useTimezone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";
	private static final String usuarioBD = "root";
	private static final String senhaBD = "luan";
	
	// Obt�m uma nova Conex�o
	public Connection getConnection() {
		try {
			return DriverManager
					.getConnection(stringConexao
							, usuarioBD, senhaBD);
		}catch (Exception e) {
			throw new RuntimeException();
		}
	}

}
