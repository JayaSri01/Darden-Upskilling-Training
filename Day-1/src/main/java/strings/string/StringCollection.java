package strings.string;

public class StringCollection {
    public static void main(String[] args) {
        String str="Java String pool refers to collection of Strings which are stored in heap memory";
        String lower=str.toLowerCase();
        System.out.println("LowerCase String is:" +lower);
        String upper=str.toUpperCase();
        System.out.println("UpperCase String is:"+upper);
        String replace=str.replaceAll("a", "\\$");
        System.out.println(replace);
        String substring="collection";
        System.out.println(str.contains(substring));
        String str1="java string pool refers to collection of strings which are stored in heap memory";
        System.out.println(str==str1);
        if(str==str1)
        {
            System.out.println("result ="+str);
        }
        else
        {
            System.out.println("Doesn't match");
        }

    }
}
