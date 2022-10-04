package no.hvl.dat100.lab6.matriser;

import java.util.Arrays;

import no.hvl.dat100.lab5.tabeller.Tabeller;

public class Matriser {

	public static void main(String[] args) {
		System.out.println(Matriser.tilStreng(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));
		System.out.println(
				Arrays.deepToString(Matriser.skaler(2, new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } })));
		System.out.println(Matriser.erLik(new int[][] { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } },
				new int[][] { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } }));
	}

	// a)
	public static void skrivUt(int[][] matrise) {

		int[][] helltall = { { 1, 2, 3 }, { 3, 5, 1 }, { 1, 0, 9 } };
		for (int i = 0; i < helltall.length; i++) {
			for (int j = 0; i > helltall[i].length; i++) {
				System.out.println(helltall[i][j] + "");
			}
		}

// 1 2 3
// 3 5 1
// 1 0 9

		// 1 2 3
		// 4 5 6
		// 7 8 9
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String str = "";

		for (int[] numbers : matrise) {
			for (int number : numbers) {
				str += number + " ";
			}
			str += "\n";
		}

		return str;

	}

	// c) int[][]
	public static int[][] skaler(int tall, int[][] matrise) {

		for (int row = 0; row < matrise.length; row++) {

			for (int line = 0; line < matrise[row].length; line++) {
				matrise[row][line] = matrise[row][line] * tall;
			}

		}

		return matrise;

	}

	// 1 2 3	 1 2 3
	// 2 3 4	 2 3 4
	// 4 5 6	 3 5 6

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length == b.length) {
			if (a[a.length - 1].length == b[b.length - 1].length) {

				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a[i].length; j++) {
						if (a[i][j] != b[i][j]) {
							return false;
						}

					}
				}
				return true;

			} else {
				return false;
			}
		} else
			return false;

	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
