package lsp;

public class Skate extends TransportationDevice implements EnginePowered {
	private Engine engine;
	
	@Override
	public void startEngine() {
		System.out.println("Motorra piztuta dago");
	}


	@Override
	public Engine getEngine() {
		return engine;
	}
}
