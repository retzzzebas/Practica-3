public class RefsCompartidas {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Hola");
        StringBuilder b = a;
        StringBuilder c = new StringBuilder("Hola");
        a.append(" mundo");
        b.delete(0, 5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}