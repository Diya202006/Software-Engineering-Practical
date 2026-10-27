
class SingletonPattern {
 
    private static SingletonPattern instance;
 
    private SingletonPattern() {
        System.out.println("Singleton object created");
    }
 
    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
 
    public static void main(String[] args) {
        SingletonPattern obj1 = SingletonPattern.getInstance();
        SingletonPattern obj2 = SingletonPattern.getInstance();

        if (obj1 == obj2) {
            System.out.println("Both objects are the same");
        }
    }
}
