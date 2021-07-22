package Languages.Java.Advanced;

public class Singleton {
	private static final Singleton singleton = new Singleton();
	public String str;

	private Singleton() {
	}

	public static Singleton getSingleInstance() {
		return singleton;
	}

}
