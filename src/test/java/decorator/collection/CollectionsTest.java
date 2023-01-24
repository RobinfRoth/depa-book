package decorator.collection;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CollectionsTest {
	private Collection<String> c1;
	private Collection<String> c2;

	@BeforeEach
	public void setUp() {
		c1 = new ArrayList<>();
		c1.add("one");
		c1.add("two");
		c1.add("three");

		c2 = new ArrayList<>();
		c2.add("zero");
		c2.add("one");
	}

	@Test
	public void testView1() {
		Collection<String> c = Collections.unmodifiableCollection(c1);
		assertTrue(c.size() == c1.size());
		assertArrayEquals(c.toArray(), c1.toArray());
		assertFalse(c.isEmpty());
		assertTrue(c.containsAll(c));
		assertTrue(c.containsAll(c1));
		assertFalse(c.containsAll(c2));

		c1.add("four");
		assertTrue(c.size() == c1.size());
		assertArrayEquals(c.toArray(), c1.toArray());
	}

	@Test
	public void testView2() {
		Collection<String> c = Collections.unmodifiableCollection(c1);
		Iterator<String> it = c.iterator();
		String s1 = it.next();
		assertEquals(s1, "one");
	}

	@Test
	public void testEx1() {
		Collection<String> c = Collections.unmodifiableCollection(c1);
		Assertions.assertThrows(UnsupportedOperationException.class, () -> c.add("four"));
	}

	@Test
	public void testEx2() {
		Collection<String> c = Collections.unmodifiableCollection(c1);
		Assertions.assertThrows(UnsupportedOperationException.class, () -> c.remove("one"));
	}

	@Test
	public void testEx3() {
		Collection<String> c = Collections.unmodifiableCollection(c1);
		Assertions.assertThrows(UnsupportedOperationException.class, () -> c.remove(""));
	}

	@Test
	public void testEx4() {
		Collection<String> c = Collections.unmodifiableCollection(c1);
		Iterator<String> it = c.iterator();
		it.next();
		Assertions.assertThrows(UnsupportedOperationException.class, () -> it.remove());
	}

	@Test
	public void testEx5() {
		Collection<String> c = Collections.unmodifiableCollection(c1);
		Assertions.assertThrows(UnsupportedOperationException.class, () -> c.clear());
	}

	@Test
	public void testEx6() {
		Collection<String> c = Collections.unmodifiableCollection(c1);
		Assertions.assertThrows(UnsupportedOperationException.class, () -> c.removeAll(c2));
	}

	@Test
	public void testEx7() {
		Collection<String> c = Collections.unmodifiableCollection(c1);
		Assertions.assertThrows(UnsupportedOperationException.class, () -> c.addAll(c2));
	}

	@Test
	public void testEx8() {
		Collection<String> c = Collections.unmodifiableCollection(c1);
		Assertions.assertThrows(UnsupportedOperationException.class, () -> c.retainAll(c2));
	}

	@Test
	public void testEquals() {
		Collection<String> c = Collections.unmodifiableCollection(c1);
		assertTrue(c.equals(c));
	}

}
