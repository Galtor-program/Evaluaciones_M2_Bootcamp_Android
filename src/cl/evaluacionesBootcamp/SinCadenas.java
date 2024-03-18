package cl.evaluacionesBootcamp;

/**
 * @author Felipe Toro G.
 */
public class SinCadenas {
    public static void main(String[] args) {
        String textoInicial = "Hola tu";
        String vocales[] = {"a", "e", "i", "o", "u"};
        int contadorDeVocales =0 ;
        //extraccion de la cuarta y quinta letra
        String ultimasLetras =textoInicial.substring(4);

        // se cuentan las vocales utilizanod solo substring y for.
        for (int i = 0; i < textoInicial.length(); i++) {
            String letra = textoInicial.substring(i, i+1);
            for (int j = 0; j < vocales.length; j++) {
                if (letra.equals(vocales[j])) {
                    contadorDeVocales ++;
                }
            }
        }
        System.out.println("Las ultimas letras son: " +ultimasLetras);
        System.out.println(textoInicial+ " Tiene " +contadorDeVocales+ " vocales");
    }
}
