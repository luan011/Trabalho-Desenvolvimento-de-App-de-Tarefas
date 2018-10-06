package hellojdbc;
import java.io.IOException;


import hellojdbc.dao.UserDAO;
import hellojdbc.entity.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
		// Atribui o título da Janela
		primaryStage.setTitle("Today's Tasks");
		// Atribui o tamanho da Janela
		primaryStage.setScene(new Scene(root));
		// Exibe a Janela
		primaryStage.show();
	}


	public static void main(String[] args) {
		launch(args);

		

		User user = new User();
		user.setName("root");
		user.setPassword("luan");
		
		UserDAO userDAO = new UserDAO();
		//userDAO.deleteAll();
		userDAO.insert(user);
		
		/*
		try {
			Connection conn = DriverManager
					.getConnection(stringConexao
							, usuarioBD, senhaBD);
			Statement stat = conn.createStatement();
			stat.execute("delete from user");
			stat.close();
			
			PreparedStatement p = 
					conn.prepareStatement("insert into user(name,password) values(?, ?) ");
			p.setString(1, "Tom");
			p.setString(2, "Senha123");
			
			p.execute();
			p.close();
			
			Statement query = conn.createStatement();
			
			ResultSet result = query.executeQuery("select user_id, name, password from user ");
			// Para cada registro do conjunto de resultado
			while(result.next()) {
				// Pega os valores de cada coluna
				long userId = result.getLong(1);
				String name = result.getString(2);
				String password = result.getString(3);
				System.out.println(userId+" "+name+" "+password);
			}
			result.close();
			query.close();
			
			//Fecha a conex�o de bancos de dados
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		*/

	}

}
