package Test2;

interface Flyer {
    String getName();
}

public class Bird implements Flyer {

    public String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Eagle extends Bird {

    public Eagle(String name) {
        super(name);
    }
}

class TestBird {

    public static void main(String[] args) {

        Flyer f = new Eagle("American Bald Eagle");

        System.out.println(f.getName());              // This will print Eagle name.
        System.out.println(((Eagle)f).name);          // This will print Eagle name.
        System.out.println(((Bird)f).getName());      // This will print Eagle name.

//        System.out.println(Eagle.name);         // Name is not a static field in the class Eagle so this will not compile.
//
    }
}