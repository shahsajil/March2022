import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class JavaBasics {
	final int ZERO = 0;
	final int ONE = 1;
	final int TWO = 2;
	final boolean TRUE = true;
	final boolean FALSE = false;

	@Test
	public void comparesValueTypesUsingIsEqualToOperator() {

		boolean isContentTheSame = ONE == TWO;

		assertFalse(isContentTheSame, "content of variables should not be equal.");
	}

	@Test
	public void comparesReferenceTypesUsingIsEqualToOperator() {

		String one = new String("Louis Johnson");
		String two = new String("Louis Johnson");

		boolean doesPointToSameLocationInMemory = one == two;

		assertFalse(doesPointToSameLocationInMemory, "memory location of variables should not be the same.");
	}

	@Test
	public void comparesReferenceTypesUsingEqualsMethod() {

		String one = new String("Nathan East");
		String two = new String("Nathan East");

		boolean doesHaveEqualValues = one.equals(two);

		assertTrue(doesHaveEqualValues, "content of variables should be the same.");
	}

	@Test
	public void comparesBooleansUsingLogicalAndOperator() {

		boolean resultOfTrueAndTrue = TRUE && TRUE;
		boolean resultOfFalseAndFalse = FALSE && FALSE;
		boolean resultOfTrueAndFalse = TRUE && FALSE;

		assertTrue(resultOfTrueAndTrue, "true && true values should be true.");
		assertFalse(resultOfFalseAndFalse, "true && false values should be false.");
		assertFalse(resultOfTrueAndFalse, "true && false values should be false.");
	}

	@Test
	public void comparesBooleansUsingLogicalOrOperator() {

		boolean resultOfTrueOrTrue = TRUE || TRUE;
		boolean resultOfTrueOrFalse = TRUE || FALSE;
		boolean resultOfFalseOrFalse = FALSE || FALSE;

		assertTrue(resultOfTrueOrTrue, "true || true values should be true.");
		assertTrue(resultOfTrueOrFalse, "true || false values should be true.");
		assertFalse(resultOfFalseOrFalse, "false || false values should be false.");
	}

	@Test
	public void numbersArePostIncrementedUsingUnaryOperator() {

		int one = 1;
		int expectedValue = 1;

		int result = one++;

		assertEquals(result, expectedValue, "the number should be incremented after getting the value.");
	}

	@Test
	public void numbersArePreDecrementedUsingUnaryOperator() {

		int one = 1;
		int expectedValue = 0;

		int result = --one;

		assertEquals(result, expectedValue, "the number should be decremented before getting the value.");
	}

	@Test
	public void booleanCanBeInversedUsingExclaimationOperator() {

		boolean isTrue = true;

		boolean result = !isTrue;

		assertEquals(result, FALSE, "the boolean should be inversed.");
	}

	@Test
	public void canUseMultipleIfStatements() {

		boolean isTrue = true;
		boolean isFalse = false;
		boolean didFirstDecisionExecute = false;
		boolean didSecondDecisionExecute = false;

		if(isTrue) {
			didFirstDecisionExecute = true;
		}
		if(isFalse) {
			didSecondDecisionExecute = true;
		}

		assertTrue(didFirstDecisionExecute, "the first decision statement should be executed.");
		assertFalse(didSecondDecisionExecute, "the second decision statement should not be executed.");
	}

	@Test
	public void canUseIfElseStatements() {

		boolean didFirstDecisionExecute = false;
		boolean didSecondDecisionExecute = false;

		if(FALSE) {
			didFirstDecisionExecute = true;
		}
		else {
			didSecondDecisionExecute = true;
		}

		assertFalse(didFirstDecisionExecute, "the first decision statement should be executed.");
		assertTrue(didSecondDecisionExecute, "the second decision statement should not be executed.");
	}

	@Test
	public void canUseNestedForLoop() {

		int loopCounter = 0;
		int loopLimit = 10;
		int nestedLoopCounter = 0;
		int nestedLoopLimit = 20;

		int expectedLoopCount = loopLimit;
		int expectedNestedLoopCount = loopLimit * nestedLoopLimit;

		for(int i = 0; i < loopLimit; i++) {
			loopCounter++;

			for(int j = 0; j < nestedLoopLimit; j++) {
				nestedLoopCounter++;
			}
		}

		assertEquals(loopCounter, expectedLoopCount, "outer loop should iterate up to the limit.");
		assertEquals(nestedLoopCounter, expectedNestedLoopCount, "nested loop should iterate to the nested loop limit for each outer loop iteration.");
	}

	@Test
	public void canCatchException() {

		boolean doesThrowException = false;

		try {
			throw new UnsupportedOperationException();
		}
		catch (UnsupportedOperationException ex) {
			doesThrowException = true;
		}

		assertTrue(doesThrowException, "the exception should be caught.");
	}

	@Test
	public void canIterateThroughCollectionUsingForEach() {

		List<String> airplanesInHangar = new ArrayList<String>();
		List<String> airplanes = new ArrayList<String>();
		airplanes.add("Cessna");
		airplanes.add("Piper");
		airplanes.add("Beech");
		airplanes.add("Cirrus");

		for (String airplane:airplanes) {
			airplanesInHangar.add(airplane);
		}

		assertEquals(airplanesInHangar, airplanes, "should iterate through each item in the collection.");
	}
}
