/*Write a Program to implement  all string handling functions.(length, concatenation, character extraction, string comparison, string index, substring, replace, lower and uppercase, trim)

 */ 



public class StringFunctionsDemo {

    public static void main(String[] args) {

        String s1 = "  Hello World  ";
        String s2 = "Java";

        // 1. length()
        System.out.println("Length of s1 = " + s1.length());

        // 2. concatenation
        String s3 = s1.concat(s2);
        System.out.println("Concatenation: " + s3);

        // 3. character extraction (charAt)
        System.out.println("Character at index 2 of s1 = " + s1.charAt(2));

        // 4. string comparison (equals + compareTo)
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));

        // 5. string index (indexOf)
        System.out.println("Index of 'o' in s1: " + s1.indexOf('o'));

        // 6. substring
        System.out.println("Substring of s1 (2 to 7): " + s1.substring(2, 7));

        // 7. replace
        System.out.println("Replace 'l' with 'x': " + s1.replace('l', 'x'));

        // 8. lowercase + uppercase
        System.out.println("Lowercase: " + s1.toLowerCase());
        System.out.println("Uppercase: " + s1.toUpperCase());

        // 9. trim
        System.out.println("Trimmed string: '" + s1.trim() + "'");
    }
}
