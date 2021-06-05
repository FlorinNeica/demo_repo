package automation.enums;

public enum Browser {

	CHROME, //
	FIREFOX("123.123"), //
	IE, //
	OPERA;

	private String version;

	Browser() { // se introduce un constructor gol ca sa nu dea erori. Dupa cum l-am creat prima data String atunci trebuie
				// sa fac in enums CHROME("version"),
	}

	Browser(String version) {
		this.version = version;
	}

	public String getVersion() {
		return version;
	}
}
