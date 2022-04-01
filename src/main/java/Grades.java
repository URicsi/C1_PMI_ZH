import java.util.ArrayList;
import java.util.Scanner;

public class Grades {
    protected ArrayList<String> subject;
    protected ArrayList<Integer> grade;

    public void addSubject (ArrayList<String> subject) {
        Scanner be = new Scanner(System.in);
        int var = be.nextInt();
        for (int i = 0; i < var; i++) {
            while (true) {
                System.out.println("Kérem adja meg a tárgy nevét: ");
                subject.add(be.next());
                break;
            }
        }
    }
    public void dropSubject(ArrayList<String> subject){
        try{
            Scanner be = new Scanner(System.in);
            String var = be.next();
            int pos = subject.indexOf(var);
            subject.remove(var);
        }
        catch (Exception e) {
            System.out.print("Ön nem adott törlésre érvényes tárgyat.\n");
        }
    }
    public void getGrades(ArrayList<Integer> grade){
        for (int i = 0 ; i < subject.size(); i++) {
            System.out.printf("%s\t%s\n", subject.get(i), grade.get(i));
        }
    }
}
