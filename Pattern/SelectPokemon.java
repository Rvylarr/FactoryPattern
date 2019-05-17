import Pattern.*;

class SelectPokemon {
    static Pokemon Select(String name, String p) {
        switch (p) {
            case("Charizard"):
                System.out.print("It is ");
                return new Charizard(name);
            case("Blastoise"):
                System.out.print("It is");
                return new Blastoise(name);
            case("Venusaur"):
                System.out.print("It is");
                return new Venusaur(name);
            case("Lucario"):
                System.out.print("It is");
                return new Lucario(name);
            case("Delphox"):
                System.out.print("It is");
                return new Delphox(name);
            case("Mewtwo"):
                System.out.print("It is");
                return new Mewtwo(name);
        }
        return null;
    }
}