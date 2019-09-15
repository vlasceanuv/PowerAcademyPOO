import java.util.Scanner;

public class Main {

    public static int max(int[] vec) {

        int maxim = vec[0];
        for (int i = 1; i < vec.length; i++)
            if (vec[i] > maxim)
                maxim = vec[i];
        return maxim;

    }

    public static int[] merge(int[] v1, int[] v2) {
        int[] v3;

        v3 = new int[100];
        int i = 0, j = 0, k = 0;

        while ((i < v1.length) && (j < v2.length)) {
            if (v1[i] < v2[j]) {
                v3[k] = v1[i];
                i++;
            } else if (v1[i] > v2[j]) {
                v3[k] = v2[j];
                j++;
            } else {
                v3[k] = v1[i];
                i++;
                j++;
            }
            k++;
        }

        if (i < v1.length)
            while (i < v1.length) {
                v3[k] = v1[i];
                i++;
                k++;
            }

        if (j < v2.length)
            while (j < v2.length) {
                v3[k] = v2[j];
                j++;
                k++;
            }


        return v3;
    }

    public static boolean duplicates(int[]v1){

        boolean aux = false;
        for (int i=0; i < v1.length-1; i++)
            for (int j = i+1; j < v1.length; j++)
                if (v1[i] == v1[j])
                {
                    aux = true;
                    break;
                }

        return aux;
    }

    public static void main(String[] args) {
        //int[] vec = {1, 10, 4, 25, 19, 6};
        int[] vec1 = {1, 1, 5, 10, 29};
        int[] vec2 = {2, 5, 11, 30, 35, 70};
        int[] vec3;

        Scanner in = new Scanner(System.in);
        String[] data = in.nextLine().split(" ");
        int[] vec = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            vec[i] = Integer.parseInt(data[i]);
        }
        System.out.print("Cel mai mare numar din sir este: ");
        System.out.println(max(vec));

        System.out.print("Sirul ordonat este: ");
        vec3 = merge(vec1,vec2);
        for (int i = 0; i < vec3.length; i++){
         if ((i > 0) && (vec3[i] == 0))
             break;
         else
             System.out.print(vec3[i]+ " ");
        }

        System.out.println();

        boolean aux;
        aux = duplicates (vec1);
        if ( aux == true)
        {
            System.out.println("Exista duplicate in sir");
        }
        else
        {
            System.out.println("Nu exista duplicate in sir");
        }

    }
}
