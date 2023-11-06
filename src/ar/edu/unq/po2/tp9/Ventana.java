package ar.edu.unq.po2.tp9;

import javax.swing.*;
import java.util.List;
import java.awt.Rectangle;

public class Ventana extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ventana(DefaultListModel<String> listModel) {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setBounds(new Rectangle(180, 180));
        this.setVisible(true);
        JLabel label = new JLabel("Lista de palabras");
        label.setBounds(new Rectangle(40, 40));
        this.add(label);

        ListaDePalabrasOrdenadas listaDePalabras = new ListaDePalabrasOrdenadas();
        listaDePalabras.agregarPalabra("casa");
        listaDePalabras.agregarPalabra("arbol");
        listaDePalabras.agregarPalabra("perro");
        listaDePalabras.agregarPalabra("telefono");
        listaDePalabras.agregarPalabra("brazo");
        List<String> palabrasOrdenadas = listaDePalabras.getPalabras();

        for (String palabra : palabrasOrdenadas) {
            listModel.addElement(palabra);
        }

        JList<String> lista = new JList<>(listModel);
        lista.setBounds(new Rectangle(110, 160));
        this.add(lista);
    }

    public static void main(String[] args) {
        new Ventana(new DefaultListModel<>());
    }
}

