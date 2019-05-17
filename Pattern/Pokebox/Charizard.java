public class Charizard extends Pokemon1 {
    public Charizard(String name) {
        this.name = name;
    }

    public void selectname(String name) {
        this.name = name;
    }

    public void type() {
        System.out.println("name" + " type:" + "Fire / Flying");
    }

    public void weight() {
        System.out.println("name" + " weight: " + "152kg");
    }

    public void height() {
        System.out.println("name" + " height: " + "2.14m");
    }
}