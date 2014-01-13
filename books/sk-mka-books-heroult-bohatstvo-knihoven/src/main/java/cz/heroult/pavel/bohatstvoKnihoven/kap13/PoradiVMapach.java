package cz.heroult.pavel.bohatstvoKnihoven.kap13;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PoradiVMapach {
	private static String[] pole = { "1", "6", "2", "5", "4", "3" };

	static void nastaveniATisk(final Map<String, String> m) {
		for (int i = 0; i < pole.length; i++) {
			m.put(pole[i], "A");
		}
		System.out.println(m.getClass().getName() + ":\t" + m);
	}

	public static void main(final String[] args) {

		nastaveniATisk(new HashMap<String, String>());
		nastaveniATisk(new TreeMap<String, String>());
		nastaveniATisk(new LinkedHashMap<String, String>());
	}
}
