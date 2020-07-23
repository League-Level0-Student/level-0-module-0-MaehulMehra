package _03_print_and_popups._4_quiz_game;

import javax.lang.model.element.VariableElement;
import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
	    int a = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
	    		String math = JOptionPane.showInputDialog("What is 17.6 x 3.3?");
				// 3.  Use an if statement to check if their answer is correct
				if (math.equals ("58.08")) {
					a ++;
				}
				// 4.  if the user's answer was correct, add one to their score 
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String soccer = JOptionPane.showInputDialog("What number does Luka Modric wear?");
		if (soccer.equals ("10")){
			a ++;
		}
		String coding = JOptionPane.showInputDialog ("What website do we learn coding from?");
		if (coding.equals ("Git Hub")) {
			a++;
		}
		String science = JOptionPane.showInputDialog ("How far is the Earth away from the Sun");
		if (science.equals ("94 million miles")) {
			a++;
		}
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog (null, a + " points");
	}
}
