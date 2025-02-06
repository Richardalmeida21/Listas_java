import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {
        String curso1 = "Java: tire o proveito dos novos recursos da linguagem!";
        String curso2 = "Apache Camel";
        String curso3 = "Certificação Java SE programmer";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        System.out.println(cursos);

        cursos.forEach(curso -> {
            System.out.println("Curso " + curso);
        });
    }
}
