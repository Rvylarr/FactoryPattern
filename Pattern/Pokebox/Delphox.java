public class Delphox extends Pokemon1 {
    public Delphox(String name) {
        this.name = name;
    }

    public void selectname(String name) {
        this.name = name;
    }

    public void type() {
        System.out.println("name"+" type:" + "Fire / Psyhic");
    }

    public void weight() {
        System.out.println("name" + " weight: " + "39kg");
    }

    public void height() {
        System.out.println("name" + " height: " + "1.5m");
    }
}