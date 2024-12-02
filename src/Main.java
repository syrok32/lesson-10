public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastname = "Ivanov";
        String fullName = String.join(" ", firstName, lastname, middleName);
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println(fullName.toUpperCase());

        fullName = "Иванов Семён Семёнович";

        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);


    }
}