package ntu_63133567;

import javax.swing.SwingUtilities;

public class main_bmi {
		public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new bmicalculator();
	            }
	        });
		}
}
