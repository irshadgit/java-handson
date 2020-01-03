public class ClassLoader {

    public static void main(String[] args) {
        System.out.println(ClassLoader.class.getClassLoader().toString());
        System.out.println(System.class.getClassLoader());
    }
}
