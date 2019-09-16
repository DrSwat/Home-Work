package WorkersOfUniversity;


import Workers.AssistantProfessor;
import Workers.CleaningLeady;
import Workers.Plumber;
import Workers.Professor;
import Workers.Teacher;

public class Start {

	public static void main(String[] args) {
		AssistantProfessor assistantProfessor = new AssistantProfessor();
		Professor professor = new Professor();
		Teacher teacher = new Teacher();
		Plumber plumber = new Plumber();
		CleaningLeady cleaningLeady = new CleaningLeady();
		Professor professorSmith = new Professor("Sam", "Smith", true, WorkersOfUniversity.Sex.male);
		AssistantProfessor assistantLiz = new AssistantProfessor("Elizabeth", "Scout", true, WorkersOfUniversity.Sex.female);
		Teacher teacherEdith = new Teacher("Edith", "Baker", true, WorkersOfUniversity.Sex.female);
		Plumber plumberAaron = new Plumber("Aaron", "Ball",false, WorkersOfUniversity.Sex.male);
		CleaningLeady cleaningAlma = new CleaningLeady("Alma", "Conor", false, WorkersOfUniversity.Sex.female);
				
		
		System.out.println(assistantLiz);
		System.out.println(professorSmith);
		System.out.println(teacherEdith);
		System.out.println(plumberAaron);
		System.out.println(cleaningAlma);
		assistantProfessor.heldClasses();
		professor.heldClasses();
		teacher.heldClasses();
		plumber.repairing();
		cleaningLeady.classClean();
		
		
	}

}
