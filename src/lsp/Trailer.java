package lsp;

public class Trailer extends TransportationDevice implements Registrable {

	private String plate;
	
	@Override
	public boolean registerPlate(String plate) {
		this.plate = plate;
		return true;
	}

	@Override
	public String getPlate() {
		return plate;
	}

}
