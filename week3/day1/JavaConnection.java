package week3.day1;

public final class JavaConnection extends MySqlConnection{
	
	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeQuery();
		jc.executeUpdate();
	}

}
