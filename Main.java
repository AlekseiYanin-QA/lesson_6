public class Main {
    public static void main(String[] args) {
        Student vasya = new Student();
        vasya.name = "Василий";
        vasya.department = "Програмирования";
        vasya.subject = "язык Java";
        vasya.target = "обучиться новой профессии";
        vasya.age = 41;

        Professor nikolayPertovich = new Professor();
        nikolayPertovich.age = 56;
        nikolayPertovich.name = "Николай Претович";
        nikolayPertovich.department = "Програмирования";
        nikolayPertovich.subject = "язык Java";
        nikolayPertovich.target = "передать вам мои зания";

        vasya.sayHi();
        nikolayPertovich.sayHi();

        nikolayPertovich.learningGoal();
        vasya.learningGoal();
    }


}
