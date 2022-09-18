package LeerDatosRGBImagenes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;

public class LeerDatosRGBImagenes {

    public static void main(String[] args) {

        try {
            String Auxliar = "";
            InputStream input = new FileInputStream("Decaration_00.png");

            ImageInputStream imageInput = ImageIO.createImageInputStream(input);
            BufferedImage imagenL = ImageIO.read(imageInput);

            int Alto = imagenL.getHeight();
            int Ancho = imagenL.getWidth();

            Auxliar = "                Ancho: " + Ancho + "\n                Alto: " + Alto + "\n\n";

            for (int y = 0; y < imagenL.getHeight(); y++) {
                for (int x = 0; x < imagenL.getWidth(); x++) {
                    int srcPixel = imagenL.getRGB(y, x);

                    Color c = new Color(srcPixel);

                    int valR = c.getRed();
                    int valG = c.getGreen();
                    int valB = c.getBlue();

                    Auxliar += "           R " + valR + " G " + valG + " B " + valB + "\n";
                }
                JTextArea areaSalida = new JTextArea(15, 10);
                JScrollPane scroller = new JScrollPane(areaSalida);
                areaSalida.setText("\n" + Auxliar);
                JOptionPane.showMessageDialog(null, scroller, "SALIDA", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        } catch (Exception e) {

        }
    }
}
