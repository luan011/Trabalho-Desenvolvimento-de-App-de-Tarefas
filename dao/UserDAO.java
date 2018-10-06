package hellojdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import hellojdbc.entity.User;

public class UserDAO {
	
	// Insere um Usuario
	public void insert(User user) {
		try {
			// Cria a conexao com o banco de dados
			Connection conn = (new ConnectionFactory()).getConnection();
			PreparedStatement p = 
					conn.prepareStatement("insert into user(name,password) values(?, ?) ");
			p.setString(1, user.getName());
			p.setString(2, user.getPassword());
			
			p.execute();
			p.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	// Exclui todos os registros da Tabela
	public void deleteAll() {
		try {
			// Cria a conex�o com o banco de dados
			Connection conn = (new ConnectionFactory()).getConnection();
			
			Statement stat = conn.createStatement();
			stat.execute("delete from user");
			// Fecha conex�o com o banco de dados
			stat.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
