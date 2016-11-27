public class WheyProteinSong {
	public static void main (String[] args) {
		int wheyNum = 99;
		String word = "jars";

		while (wheyNum > 0) {

			if (wheyNum == 1) {
				word = "jar"; //singular, as in ONE pack
			}

			System.out.println (wheyNum + " " + word + " of Whey on the wall");
			System.out.println (wheyNum + " " + word + " of Whey");
			System.out.println ("Take one down.");
			System.out.println ("Pass it around.");
			wheyNum = wheyNum - 1;

			if (wheyNum > 0) {
				System.out.println (wheyNum + " " + word + " of Whey on the wall");
				
			} else {
				System.out.println ("No more jars of Whey on the wall.");
				System.out.println ("Im back!");
			} //end else
		} // end while loop
	} //end main method
} // end class