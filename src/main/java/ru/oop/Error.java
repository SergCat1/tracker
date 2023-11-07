package ru.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.message = message;
        this.status = status;

    }

    public void printInfo() {
        System.out.println("Состояние: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error mistake = new Error();
        mistake.printInfo();
        Error mistake2 = new Error(false, 0, "Ошибки нет");
        mistake2.printInfo();
        Error mistake3 = new Error(true, 1, "Ошибка!");
        mistake3.printInfo();

    }
}
