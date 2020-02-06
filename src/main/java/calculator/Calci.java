package calculator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Calci {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		int a = Integer.parseInt(JOptionPane.showInputDialog(f, "Enter first number : "));
		int b = Integer.parseInt(JOptionPane.showInputDialog(f, "Enter second number : "));
		String op = JOptionPane.showInputDialog(f, "Enter operator : ");
		if(op.equals("+")) {
			add(a, b);
		}
		else if(op.equals("-")) {
			sub(a, b);
		}
		else if(op.equals("*")) {
			mul(a, b);
		}
		else if(op.equals("/")) {
			div(a, b);
		}
		System.out.println();
		// TODO Auto-generated method stub

	}

	public static void div(int a, int b) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(new JFrame(), a/b);
	}

	public static void mul(int a, int b) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(new JFrame(), a*b);
	}

	public static void sub(int a, int b) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(new JFrame(), a-b);
	}

	public static void add(int a, int b) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(new JFrame(), a+b);
	}
}
