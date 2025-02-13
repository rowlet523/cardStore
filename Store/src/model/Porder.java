package model;

public class Porder { 
	private Integer id;
	private String cardName;
	private Integer pikachu;
	private Integer mew;
	private Integer rowlet;
	private Integer gengar;
	private Integer snorlax;
	
	public Porder() {
		super();
	}

	public Porder(String cardName, Integer pikachu, Integer mew, Integer rowlet, Integer gengar, Integer snorlax) {
		super();
		this.cardName = cardName;
		this.pikachu = pikachu;
		this.mew = mew;
		this.rowlet = rowlet;
		this.gengar = gengar;
		this.snorlax = snorlax;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public Integer getPikachu() {
		return pikachu;
	}

	public void setPikachu(Integer pikachu) {
		this.pikachu = pikachu;
	}

	public Integer getMew() {
		return mew;
	}

	public void setMew(Integer mew) {
		this.mew = mew;
	}

	public Integer getRowlet() {
		return rowlet;
	}

	public void setRowlet(Integer rowlet) {
		this.rowlet = rowlet;
	}

	public Integer getGengar() {
		return gengar;
	}

	public void setGengar(Integer gengar) {
		this.gengar = gengar;
	}

	public Integer getSnorlax() {
		return snorlax;
	}

	public void setSnorlax(Integer snorlax) {
		this.snorlax = snorlax;
	}
	
	
	
	
	
	
	

}
