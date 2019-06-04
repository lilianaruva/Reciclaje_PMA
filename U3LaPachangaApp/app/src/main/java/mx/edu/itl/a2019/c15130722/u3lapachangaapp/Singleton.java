package mx.edu.itl.a2019.c15130722.u3lapachangaapp;


public class Singleton
{
	private static Singleton instance = null;
	private String user;
	private String password;
	private  int   code;

	private Singleton() {}

	public static Singleton getInstance()
	{
		if (instance == null)
			instance = new Singleton();
		return instance;
	}

	public void setUser(String user)
	{
		this.user = user;
	}

	public String getUser(){
		return user;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setCode(int code) { this.code = code; }

	public int getCode() { return code; }
}