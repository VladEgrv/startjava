public class Person {
    char gender = 'M';
    String name = "Иван";
    float height = 183f;
    float weight = 84.4f;
    int age = 30;
    
    public void walk() {
        System.out.println(name + " идет");
    }
    
    public void run() {
        System.out.println(name + " бежит");
    }
    
    public void sit() {
        System.out.println(name + " сидит");
    }
    
    public void talk() {
        System.out.println(name + " говорит");
    }
    
    public void learnJava() {
        System.out.println(name + " учит");
    }
}
