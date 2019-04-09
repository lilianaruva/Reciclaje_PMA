package c15130700.a2019.itl.myapplication;

public class Singleton {
	private static Singleton instance = null;
	private boolean response;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}

	public void setResponse(boolean response) {
		this.response = response;
	}

	public boolean getResponse() { return response; }
}
