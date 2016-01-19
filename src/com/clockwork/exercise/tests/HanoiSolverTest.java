package com.clockwork.exercise.tests;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Assert.*;

import org.junit.Test;

import com.clockwork.exercise.HanoiSolver;
import com.clockwork.exercise.Step;

public class HanoiSolverTest {

	@Test
	public void hanoiOf1DiscShouldReturnTheTargetStep() {
		List<Step> result = HanoiSolver.hanoi(1, new Step(1, 3));
		Assert.assertEquals(1,  result.size());
		Assert.assertEquals(new Step(1, 3), result.get(0));
	}
	
	@Test
	public void hanoiOf2DiscsShouldReturnThreeSteps() {
		List<Step> expected = Arrays.asList(new Step(1,2),
											new Step(1,3),
											new Step(2,3));
		List<Step> result = HanoiSolver.hanoi(2, new Step(1, 3));
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void hanoiOf3DiscsShouldReturnTheCorrectSteps() {
		List<Step> expected = Arrays.asList(new Step(1,3),
											new Step(1,2),
											new Step(3,2),
											new Step(1,3),
											new Step(2,1),
											new Step(2,3),
											new Step(1,3));
		List<Step> result = HanoiSolver.hanoi(3, new Step(1, 3));
		Assert.assertEquals(expected, result);
	}
	
}
