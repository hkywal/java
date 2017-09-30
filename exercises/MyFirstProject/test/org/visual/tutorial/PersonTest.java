package org.visual.tutorial;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		Person	p1 = new Person();
		assertEquals("Oi nome", p1.getNome());
		assertEquals(3, p1.getMaxBooks());
	}

	public void testSetNome() {
		Person p2 = new Person();
		p2.setNome("Jason Bourne");
		assertEquals("Jason Bourne", p2.getNome());
	}

	public void testSetMaxBooks() {
		Person p3 = new Person();
		p3.setMaxBooks(10);
		assertEquals(10, p3.getMaxBooks());
	}

}
