abstract class Teacher {
    private String name;
    private  int age ;

    abstract void teach();


}
public class TestTeacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher() {
            @Override
            void teach(){
                System.out.println("Teacher is teaching");
            }

        };
    }
}