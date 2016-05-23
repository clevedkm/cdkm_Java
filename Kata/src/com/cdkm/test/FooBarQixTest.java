package com.cdkm.test;

import static org.junit.Assert.*;

import java.util.TreeMap;

import org.junit.Test;

import com.cdkm.code.FooBarQix;

public class FooBarQixTest {
	
	FooBarQix kata;
	
	public void setUp(){
		kata = new FooBarQix();
	}
	
	@Test
	public void testAffichierNombreUseMap() {
		setUp();
		assertNotNull(kata);
		kata.affichierNombreUseMap(100);
		
	}
	
	@Test 
	public void testInitialisationDuMap(){
		setUp();
		assertNotNull(kata);
		TreeMap<Integer, String> fooBarQixMap = kata.initialisationDuMap();
		assertNotNull(fooBarQixMap);
	}


}
