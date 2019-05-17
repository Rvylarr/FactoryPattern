public class Blastoise extends Pokemon1 {
    public Blastoise(String name) {
        this.name = name;
    }

    public void selectname(String name) {
        this.name = name;
    }

    public void type() {
        System.out.println("name"+" type:" + "Water");
    }

    public void weight() {
        System.out.println("name" + " weight: " + "106kg");
    }

    public void height() {
        System.out.println("name" + " height: " + "1.8m");
    }
}