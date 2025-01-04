package week3.day1;

public abstract class MySqlConnection implements DatabaseConnection {
	
	public void connect() {
		System.out.println("Connect to database");
	}
	public void disconnect() {
		System.out.println("Disconnect to database");
	}
	public void executeQuery() {
		System.out.println("Execute the query");
	}

	public void executeUpdate() {
		System.out.println("Update of the execution");
	}


}
