
public class Usuario {

	//atributos
		private String login;
		private int password; 
		
		
		//constructor/es
		public Usuario(String login, int password) {
			this.login = login;
			this.password = password;
		}

		//getters y setters
		public String getLogin() {
			return login;
		}


		public void setLogin(String login) {
			this.login = login;
		}


		public int getPassword() {
			return password;
		}


		public void setPassword(int password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Usuario [login=" + login + ", password=" + password + "]";
	}
}
