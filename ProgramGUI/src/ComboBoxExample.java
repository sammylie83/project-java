/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Backend Dev
 */
import javax.swing.*;    

public class ComboBoxExample {
    JFrame f;
	ComboBoxExample(){
		f = new JFrame("ComboBox Example");
		String country[]={"Apple", "Guava", "Grapes", "Mango", "Orange"};
		JComboBox cb=new JComboBox(country);
		cb.setBounds(50, 50,90,20);
		f.add(cb);
		f.setLayout(null);
		f.setSize(400,500);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new ComboBoxExample();
	}
}
