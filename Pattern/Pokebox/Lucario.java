public class Lucario extends Pokemon1 {
    public Lucario(String name) {
        this.name = name;
    }

    public void selectname(String name) {
        this.name = name;
    }

    public void type() {
        System.out.println("name"+" type:" + "Fighting / Steel");
    }

    public void weight() {
        System.out.println("name" + " weight: " + "48kg");
    }

    public void height() {
        System.out.println("name" + " height: " + "1.1m");
    }    
}