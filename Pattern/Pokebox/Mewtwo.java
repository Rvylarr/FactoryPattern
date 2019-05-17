public class MewTwo extends Pokemon1 {
    public Mewtwo(String name) {
        this.name = name;
    }

    public void selectname(String name) {
        this.name = name;
    }

    public void type() {
        System.out.println("name" + " type:" + "Psyhic");
    }

    public void weight() {
        System.out.println("name" + " weight: " + "191kg");
    }

    public void height() {
        System.out.println("name" + " height: " + "2.4m");
    }
}