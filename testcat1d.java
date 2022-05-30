
import java.io.*;

class Main {
    public static void main(String[] args) {
        System.out.println(Code.removeNumberUppercase("Hello World"));
        System.out.println(Code.removeNumberUppercase("6133"));
        System.out.println(Code.removeNumberUppercase("Gatchalian"));
        System.out.println(Code.removeNumberUppercase("Gabriel Gatchalian"));
        System.out.println(Code.removeNumberUppercase("Thor 4"));

        System.out.println(Code.removeNumberLowercase("Hello World"));
        System.out.println(Code.removeNumberLowercase("6133"));
        System.out.println(Code.removeNumberLowercase("Gatchalian"));
        System.out.println(Code.removeNumberLowercase("Gabriel Gatchalian"));
        System.out.println(Code.removeNumberLowercase("Thor 4"));
    }

}