class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {  
        System.out.println("Dog barks");
    }
}

class final_practical_2 {
    public static void main(String[] args) {
        Animal a = new Dog();  
        a.sound();  
    }
}
