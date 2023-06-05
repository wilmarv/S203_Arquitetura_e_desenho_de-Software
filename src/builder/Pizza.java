package builder;

public class Pizza {
	
	private Integer size = 0;
	
	private Boolean flagCheese = false;
	
	private Boolean flagPepperone = false;


	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Boolean getFlagCheese() {
		return flagCheese;
	}

	public void addFlagCheese(Boolean flagCheese) {
		this.flagCheese = flagCheese;
	}

	public Boolean getFlagPepperone() {
		return flagPepperone;
	}

	public void addFlagPepperone(Boolean flagPepperone) {
		this.flagPepperone = flagPepperone;
	}

}
