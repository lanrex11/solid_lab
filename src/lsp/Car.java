package lsp;

class Car extends TransportationDevice implements EnginePowered, Registrable {
	private Engine engine;
	private String plate;
	
	@Override
	public void startEngine() {
		System.out.println("Motorra piztuta dago");
	}

	@Override
	public boolean registerPlate(String plate) {
		this.plate = plate;
		return true;
	}

	@Override
	public String getPlate() {
		return plate;
	}

	@Override
	public Engine getEngine() {
		return engine;
	}
}