public class OpIndexStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ABCDE");
        sb.delete(1, 4);
        sb.insert(1, "xyz");
        sb.reverse();
        sb.replace(1, 4, "-");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}