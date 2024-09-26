public class  Professor extends AcademicEnvironment {

    public void sayHi() {
        System.out.println(STR."Доброе утро! Меня зовут \{name} мне \{age} лет и я преподователь данного вуза");
    }

    public void learningGoal() {
        System.out.println("Цель обучения на кафедре " + department + " вам освоить " + subject + ", а мне " + target);
    }
}
