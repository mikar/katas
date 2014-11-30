package codingbat.ap;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class AP1Test {

	@Test
	public void testScoresIncreasing() {
		assertThat(AP1.scoresIncreasing(new int[] { 1, 3, 4 }), is(true));
		assertThat(AP1.scoresIncreasing(new int[] { 1, 3, 2 }), is(true));
		assertThat(AP1.scoresIncreasing(new int[] { 1, 1, 4 }), is(true));
	}

	@Test
	public void testScores100() {
		assertThat(AP1.scores100(new int[] { 1, 100, 100 }), is(true));
		assertThat(AP1.scores100(new int[] { 1, 100, 99, 100 }), is(false));
		assertThat(AP1.scores100(new int[] { 100, 1, 100, 100 }), is(true));
	}

	@Test
	public void testScoresClump() {
		assertThat(AP1.scoresClump(new int[] { 3, 4, 5 }), is(true));
		assertThat(AP1.scoresClump(new int[] { 3, 4, 6 }), is(false));
		assertThat(AP1.scoresClump(new int[] { 1, 3, 5, 5 }), is(true));
	}

	@Test
	public void testScoresAverage() {
		assertThat(AP1.scoresAverage(new int[] { 2, 2, 4, 4 }), is(4));
		assertThat(AP1.scoresAverage(new int[] { 4, 4, 4, 2, 2, 2 }), is(4));
		assertThat(AP1.scoresAverage(new int[] { 3, 4, 5, 1, 2, 3 }), is(4));
	}

	@Test
	public void testWordsCount() {
		assertThat(AP1.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 1),
				is(2));
		assertThat(AP1.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 3),
				is(1));
		assertThat(AP1.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 4),
				is(0));

	}

	@Test
	public void testWordsFront() {
		assertThat(AP1.wordsFront(new String[] { "a", "b", "c", "d" }, 1),
				is(new String[] { "a" }));
		assertThat(AP1.wordsFront(new String[] { "a", "b", "c", "d" }, 2),
				is(new String[] { "a", "b" }));
		assertThat(AP1.wordsFront(new String[] { "a", "b", "c", "d" }, 3),
				is(new String[] { "a", "b", "c" }));
	}

	@Test
	public void testWordsWithoutList() {
		assertThat(
				AP1.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 1),
				is(Arrays.asList("bb", "ccc")));
		assertThat(
				AP1.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 3),
				is(Arrays.asList("a", "bb", "b")));
		assertThat(
				AP1.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 4),
				is(Arrays.asList("a", "bb", "b", "ccc")));
	}

	@Test
	public void testHasOne() {
		assertThat(AP1.hasOne(10), is(true));
		assertThat(AP1.hasOne(22), is(false));
		assertThat(AP1.hasOne(220), is(false));
	}
	
	@Test
	public void testDividesSelf() {
		assertThat(AP1.dividesSelf(128), is(true));
		assertThat(AP1.dividesSelf(12), is(true));
		assertThat(AP1.dividesSelf(120), is(false));
	}
}
