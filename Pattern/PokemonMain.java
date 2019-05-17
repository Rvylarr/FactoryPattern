import Pattern.Pokebox;

public class PokemonMain {
    public static void main(String []args) {
        Pokemon pok = SelectPokemon.Select("Charizard", "Mewtwo");
        try {
            System.out.println(pok.name);
            pok.type();
            pok.weight();
            pok.height();
            System.out.println(type.weight.height);
        } catch(Exception e) {
            System.out.println("This pokemon isn`t on the list");
            }
        }
    }