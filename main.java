public class main {
    public static void main(String[] arguments) {
        Person p = new Person("Rhushi",26,"Male");
        System.out.println(p.getname()+","+p.getage()+","+p.getgender());
        p.setage(24);
        p.display();

        Person p1 = new Person("yogi",21);
        p1.display();



    }
}