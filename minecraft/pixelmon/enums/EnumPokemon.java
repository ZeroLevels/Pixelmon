package pixelmon.enums;

import pixelmon.config.PixelmonEntityList.ClassType;

public enum EnumPokemon {
	Abra("Abra"),
	Aerodactyl("Aerodactyl"),
	Alakazam("Alakazam"),
	Anorith("Anorith"),
	Arbok("Arbok"),
	Arcanine("Arcanine"),
	Archen("Archen"),
	Beedrill("Beedrill"),
	Bellsprout("Bellsprout"),
	Blastoise("Blastoise"),
	Bulbasaur("Bulbasaur"),
	Butterfree("Butterfree"),
	Camerupt("Camerupt"),
	Caterpie("Caterpie"),
	Chansey("Chansey"),
	Charizard("Charizard"),
	Charmander("Charmander"),
	Charmeleon("Charmeleon"),
	Clefable("Clefable"),
	Clefairy("Clefairy"),
	Cranidos("Cranidos"),
	Cubone("Cubone"),
	Diglett("Diglett"),
	Dodrio("Dodrio"),
	Doduo("Doduo"),
	Dragonair("Dragonair"),
	Dragonite("Dragonite"),
	Dratini("Dratini"),
	Drowzee("Drowzee"),
	Dugtrio("Dugtrio"),
	Eevee("Eevee"),
	Ekans("Ekans"),
	Electrode("Electrode"),
	Espeon("Espeon"),
	Farfetchd("Farfetchd"),
	Fearow("Fearow"),
	Flareon("Flareon"),
	Flygon("Flygon"),
	Gastly("Gastly"),
	Gengar("Gengar"),
	Geodude("Geodude"),
	Gloom("Gloom"),
	Golbat("Golbat"),
	Golem("Golem"),
	Goldeen("Goldeen"),
	Growlithe("Growlithe"),
	Gyarados("Gyarados"),
	Haunter("Haunter"),
	Horsea("Horsea"),
	Ivysaur("Ivysaur"),
	Jigglypuff("Jigglypuff"),
	Jolteon("Jolteon"),
	Kabuto("Kabuto"),
	Kadabra("Kadabra"),
	Kabutops("Kabutops"),
	Kakuna("Kakuna"),
	Kingler("Kingler"),
	Koffing("Koffing"),
	Krabby("Krabby"),
	Krokorok("Krokorok"),
	Lapras("Lapras"),
	Lunatone("Lunatone"),
	Magikarp("Magikarp"),
	Magnemite("Magnemite"),
	Magneton("Magneton"),
	Mankey("Mankey"),
	Mareep("Mareep"),
	Meowth("Meowth"),
	Metapod("Metapod"),
	Mew("Mew"),
	Miltank("Miltank"),
	Nidoranfemale("Nidoranfemale"),
	//NidoranMale("NidoranMale"),
	Ninetales("Ninetales"),
	Numel("Numel"),
	Oddish("Oddish"),
	Omanyte("Omanyte"),
	Omastar("Omastar"),
	Paras("Paras"),
	Persian("Persian"),
	Pidgey("Pidgey"),
	Pikachu("Pikachu"),
	Pidgeotto("Pidgeotto"),
	Pidgeot("Pidgeot"),
	Piloswine("Piloswine"),
	Poliwag("Poliwag"),
	Ponyta("Ponyta"),
	Primeape("Primeape"),
	Psyduck("Psyduck"),
	Rapidash("Rapidash"),
	Raichu("Raichu"),
	Raticate("Raticate"),
	Rattata("Rattata"),
	Sandile("Sandile"),
	Sandshrew("Sandshrew"),
	Sandslash("Sandslash"),
	Scyther("Scyther"),
	Seaking("Seaking"),
	Shellder("Shellder"),
	Shieldon("Shieldon"),
	Slowbro("Slowbro"),
	Slowpoke("Slowpoke"),
	Snorlax("Snorlax"),
	Solrock("Solrock"),
	Spearow("Spearow"),
	Squirtle("Squirtle"),
	Staryu("Staryu"),
	Starmie("Starmie"),
	Swinub("Swinub"),
	Tangela("Tangela"),
	Tentacool("Tentacool"),
	Trapinch("Trapinch"),
	Umbreon("Umbreon"),
	Venomoth("Venomoth"),
	Venonat("Venonat"),
	Venusaur("Venusaur"),
	Vaporeon("Vaporeon"),
	Vibrava("Vibrava"),
	Vileplume("Vileplume"),
	Voltorb("Voltorb"),
	Vulpix("Vulpix"),
	Wartortle("Wartortle"),
	Weedle("Weedle"),
	Weezing("Weezing"),
	Wigglytuff("Wigglytuff"),
	Zubat("Zubat");

	private EnumPokemon(String name){
		this.name = name;
	}
	public String name;
	public static boolean hasPokemon(String evolveTo) {
		for (EnumPokemon e: values()){
			if (e.name.equalsIgnoreCase(evolveTo)) return true;
		}
		return false;
	}
	public static EnumPokemon get(String name) {
		for (EnumPokemon e: values()){
			if (e.name.equalsIgnoreCase(name)) return e;
		}
		return null;
	}
}