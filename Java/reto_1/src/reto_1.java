import java.util.Arrays;
public class reto_1 {
    public static void main(String[] args) {
        int reultados[] = {1,2,3,4,5,10,25};

        int length = reultados.length;
        for (int i = 0; i < length; i++ ){
        }
        int mayor, minor;
        mayor = minor = reultados[0];
        for (int i = 0; i<reultados.length; i++){
            if(reultados [i] >mayor) {
                mayor = reultados[i];
            }
            if(reultados [i] <minor) {
                minor = reultados[i];
            }
        }
        int j[] = {20};
        int w[] = {reultados.length,minor,mayor};

        System.out.println(Arrays.toString(w));
    }
}
