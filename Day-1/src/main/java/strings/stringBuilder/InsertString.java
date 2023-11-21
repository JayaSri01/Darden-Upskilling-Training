package strings.stringBuilder;

public class InsertString {
    public static void main(String[] args) {
        StringBuilder add=new StringBuilder("It is used to at the specified index position");
        add.insert(13," insert text");
        System.out.println(add);

    }
}
