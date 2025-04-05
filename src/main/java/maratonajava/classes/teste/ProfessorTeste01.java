package maratonajava.classes.teste;

import maratonajava.classes.model.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Paulo Lopes";
        professor.idade = 30;
        professor.sexo = 'M';

        System.out.println(professor.name + " " + professor.idade + " " + professor.sexo);
    }
}
