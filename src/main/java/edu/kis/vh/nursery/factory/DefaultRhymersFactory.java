package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements RhymersFactory {

	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}
	/*Publiczna metoda typu DefaultCountingOutRhymer zwracajaca DefaultCountingOutRhymer*/

	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}
	/*Publiczna metoda typu DefaultCountingOutRhymer zwracajaca DefaultCountingOutRhymer*/

	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}
	/*Publiczna metoda typu DefaultCountingOutRhymer zwracająca FIFORhymer()*/

	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}
	/*Publiczna metoda typu DefaultCountingOutRhymer zwracajaca HanoiRhymer()*/
}
