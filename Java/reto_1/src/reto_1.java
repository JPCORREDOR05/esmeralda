import java.util.Arrays;
public class reto_1 {
    public static void main(String[] args) {
        int reporte[] = {1,2,3,4,5,10,25};

        int length = reporte.length;
        for (int i = 0; i < length; i++ ){
        }
        int mayor, minor;
        mayor = minor = reporte[0];
        for (int i = 0; i<reporte.length; i++){
            if(reporte [i] >mayor) {
                mayor = reporte[i];
            }
            if(reporte [i] <minor) {
                minor = reporte[i];
            }
        }
        int j[] = {20};
        int w[] = {reporte.length,minor,mayor};

        System.out.println(Arrays.toString(w));
    }
}
