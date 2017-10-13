/*
 * Problem Solving and Decision Making Exercise
 * Created for PSYC at Sheridan College
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class testMaker {

	public static void main(String args[]) {
		
		String q0 = "My program at Sheridan is: _____________________________________\n";
		String q1 = "Psychology is the study of:									 \n"
				  + "A) Science of the mind\n"
				  + "B) Science of human thoughts\n"
				  + "C) Science of behaviour and mental processes\n"
				  + "D) Science of all things health\n";
		String q2 = "Do not complete any questions. Sit quietly until the end of the quiz.\n"
					+ "Feel free to scribble on this line: ___________________________\n ";
		
			
		for(int x = 0; x < 40; x++) {
			ArrayList<String> questions = prepQuestions(q0, q1, q2);
			printQuestions(questions);
		}
		
	}
	
	private static ArrayList<String> prepQuestions(String q0, String q1, String q2) {
		ArrayList<String> questions = new ArrayList<String>();
		questions.add("What is " + ThreadLocalRandom.current().nextInt(1, 9999) + " - " +
				   ThreadLocalRandom.current().nextInt(1, 9999) + ":_______\n");
		questions.add("Was 'The Dress' from 2015:\n"
		+ "A) Black and Blue               B) White and Gold\n");
		questions.add("What ore is the primary source of Aluminium?\n"
		+ "A) Bauxite           B) Neither, Aluminium is an Alloy\n"
		+ "C) Manganese			D) Tin\n");
		questions.add("A single piece of coiled DNA is known as a Chromosome.\n"
		+ "A) True              B) False\n");
		questions.add("What belongs to you but others use it more than you do? ____________\n");
		questions.add("An old lady forgets her drivers licence at home. She travels down a\n"
		+ " one way street the wrong way. She does not stop at stop signs, or\n"
		+ " stop for people crossing the road. A cop is watching her do this and\n"
		+ " he does not give her a ticket. Why didn't he give her a ticket?\n");
		questions.add("Which is NOT an ingredient in Gun Powder?\n"
		+ "A) Charcoal                    B) Sulfur\n"
		+ "C) Saltpeter                   D) Hydrochloric Acid\n");
		questions.add("What is the process of splitting atoms called?\n"
		+ "A) Fusion                      B) Fission\n");
		questions.add("What part of the body does a Rhinologist specialize in?\n"
		+ "A) The knees                   B) The rear\n"
		+ "C) The nose                    D) The neck\n");
		questions.add("What are baby koalas called? _____________________________\n");
		questions.add("Sociophobia is the fear of: ______________________________\n");
		questions.add("What material are fingernails made of? ___________________\n");
		questions.add("Which of the following is measured in Newtons?\n"
		+ "A) Elasticity                  B) Pressure\n"
		+ "C) Force                       D) Power\n");
		questions.add("By Greek mythology, who is the god/goddess of war strategy?\n"
		+ "A) Artemis                     B) Zeus\n"
		+ "C) Ares                        D) Athena\n");
		questions.add("What percent of jellyfish is water? ______________________\n");
		questions.add("What is the largest sized mammal in the world? ___________\n");
		Collections.shuffle(questions);
		questions.set(0, q0);
		questions.set(1, q1);
		questions.set(14, q2);
		return questions;
	}
	
	private static void printQuestions(ArrayList<String> q) {
		System.out.println("=====HEURISTICS PRE-ASSESSMENT=====");
		System.out.println("Read all questions before answering.");
		System.out.println("====================================");
		System.out.println(" ");
		for(String question: q) {
			System.out.println(question);
			//System.out.println(" ");
		}
		System.out.println("$pagebreak\n");
	}
	
}
