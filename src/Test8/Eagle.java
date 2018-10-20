package Test8;

class Bird {

    public Bird() {             // Constructor in superclass cannot be declared private because then the subclass will not be able to access it. public, protected and default access modifiers are allowed here.

    }
}

class Eagle extends Bird {

    public String name;

    public Eagle(String name) {

        this.name = name;
    }

    public static void main(String[] args) {

        System.out.println(new Eagle("Bald Eagle").name);
    }


}
