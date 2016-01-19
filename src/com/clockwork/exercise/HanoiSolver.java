package com.clockwork.exercise;

import java.util.ArrayList;
import java.util.List;

public class HanoiSolver {

	public static int calculateHelpPeg(Step step) {
		return 6 - step.getFromPeg() - step.getToPeg();
	}
	
	public static Step getHelpStep(Step step) {
		return new Step(step.getFromPeg(), calculateHelpPeg(step));
	}
	
	public static List<Step> hanoi(int numberOfDiscs, Step step) {
		List<Step> result = new ArrayList<Step>();
		if (numberOfDiscs == 1) {
			result.add(step);
		} else {
			Step helpStep = getHelpStep(step);
			result.addAll(hanoi(numberOfDiscs - 1, helpStep));	
			result.add(step);
			result.addAll(hanoi(numberOfDiscs - 1, new Step(helpStep.getToPeg(), step.getToPeg())));
		}
		
		return result;
	}
	
	private static int parseNumberOfDiscs(String[] args) {
		return Integer.parseInt(args[0]);
	}
	
	private static void printStep(Step step) {
		System.out.println(String.format("from: %s to: %s", step.getFromPeg(), step.getToPeg()));
	}
	
	private static void printSteps(List<Step> steps) {
		steps.forEach(s -> printStep(s));
	}
	
	public static void main(String[] args) {
		int discs = 3;
		if (args.length == 1) {
			discs = parseNumberOfDiscs(args);
		}
		List<Step> steps = hanoi(discs, new Step(1, 3));
		printSteps(steps);
	}
	
}
