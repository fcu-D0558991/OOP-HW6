package fcu.iecs.oop.pokemon;

public class GYM {
	static int level = 1;

	public static Player fight(Player... players) {
		int m = 0;
		int n = 0;
		for (int i = 0; i < players.length; i++) {
			for (int j = 0; j < 3; j++) {
				if (players[i].getPokemons()[j].getType() == players[i + 1].getPokemons()[j].getType()) 
				{
					
				} 
				else 
				{
					if ((players[i].getPokemons()[j].getType() == PokemonType.FIRE && players[i + 1].getPokemons()[j].getType() == PokemonType.GRASS)
							|| players[i].getPokemons()[j].getType() == PokemonType.GRASS&& players[i + 1].getPokemons()[j].getType() == PokemonType.WATER
							|| players[i].getPokemons()[j].getType() == PokemonType.WATER&& players[i + 1].getPokemons()[j].getType() == PokemonType.FIRE) 
					{
						m++;
					} 
					else 
					{
						n++;
					}
				}
				if (m == n) 
				{
					m = n = 0;
					for (j = 0; j < 3; j++) 
					{
						if (players[i].getPokemons()[j].getCp() == players[i + 1].getPokemons()[j].getCp()) 
						{
							continue;
						} 
						else if (players[i].getPokemons()[j].getCp() > players[i + 1].getPokemons()[j].getCp()) 
							{
								m++;
							} 
							else 
							{
								n++;
							}
					}
					if (m == n) 
					{
						double aa = Math.random();
						if (aa <= 0.5) 
						{
							int p = players[i].getLevel();
							players[i].setLevel(p + 1);
							System.out.println("Winner is"
									+ players[i].getPlayerName());
						} 
						else 
						{
							int p = players[i + 1].getLevel();
							players[i + 1].setLevel(p + 1);
							System.out.println("Winner is"
									+ players[i + 1].getPlayerName());
						}
					}
					else
					{
						if(m>n)
						{
							int p = players[i].getLevel();
							players[i].setLevel(p + 1);
							System.out.println("Winner is"
									+ players[i].getPlayerName());
						}
						else
						{
							int p = players[i + 1].getLevel();
							players[i + 1].setLevel(p + 1);
							System.out.println("Winner is"
									+ players[i + 1].getPlayerName());
						}
					}
				}
				
				
			
			
			else if(m>n)
				{
						int p = players[i].getLevel();
					players[i].setLevel(p + 1);
					System.out.println("Winner is"
						+ players[i].getPlayerName());

				}
				else
				{
					int p = players[i + 1].getLevel();
					players[i + 1].setLevel(p + 1);
					System.out.println("Winner is"
						+ players[i + 1].getPlayerName());
				}
		}
		}
		return null;// 这个就是你要返回的player对象
	}
}
