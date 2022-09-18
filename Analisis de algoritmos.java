package siu;

public class siu {

    private int dpares(int x){
        int f=0;
        int d=x;
        while (x > 0) {
            d=x%10;
            if(d%2==0){
                f++;
            }x=x/10;
        }
        return f;
    }

    private boolean reverseCadena(String p){
        StringBuffer r=new StringBuffer(p);
        String o=r.reverse().toString();
        if(o.equals(p))
            return true;
        else
            return false;
    }

    private boolean numCapicua(int c){
        String y=String.valueOf(c);
        StringBuffer r=new StringBuffer(c);
        String o=r.reverse().toString();
        if(o.equals(y))
            return true;
        else
            return false;
    }

    private int fVeces(float [] f, float z){
        int c=0;
        for(int i=0; i<f.length; i++){
            if(f[i]==z)
                c++;
        }
        return c;
    }

    private int [] Orden(int [] a){
        int [] ar=new int[a.length];
        int k=0;
        for(int i=0; i<a.length; i++) {
                if (a[i] == 1) {
                    ar[k] = a[i];
                    k++;
            }
        }

        for(int i=0; i<a.length; i++) {
            if (a[i] ==2) {
                ar[k] = a[i];
                k++;
            }
        }

        for(int i=0; i<a.length; i++) {
            if (a[i] == 3) {
                ar[k] = a[i];
                k++;
            }
        }

        for(int i=0; i<a.length; i++) {
            if (a[i] == 4) {
                ar[k] = a[i];
                k++;
            }
        }

        for(int i=0; i<a.length; i++) {
            if (a[i] == 5) {
                ar[k] = a[i];
                k++;
            }
        }
        return ar;
    }

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
}
