public class task3 {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName);
    }
}
