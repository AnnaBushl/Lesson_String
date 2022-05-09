import java.util.Locale;

public class task2 {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.toUpperCase();
        System.out.println(fullName);

    }
}
