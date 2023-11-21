package strings.stringBuffer;

public class InsertString {

        public static void main(String[] args) {
            StringBuffer string=new StringBuffer("It is used to at the specified index position");
            string.insert(13," insert text");
            System.out.println(string);

        }
}
