package fcu.iecs.oop.pokemon;

public class Pokemon {
	public enum PokemonType {
		FIRE,WATER,GRASS
	}
	private  String name;
	private  fcu.iecs.oop.pokemon.PokemonType type;
	private int cp;
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getName() {
		return name;
	}
	public fcu.iecs.oop.pokemon.PokemonType getType() {
		return type;
	}
	public Pokemon(String name, fcu.iecs.oop.pokemon.PokemonType fire, int cp) {
		this.name = name;
		this.type =fire;
		this.cp = cp;
	}

}
