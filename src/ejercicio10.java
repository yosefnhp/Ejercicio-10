import java.util.Scanner;

void main (){
    Scanner sc = new Scanner(System.in);

    int[] a = new int[5];
    int[] b = new int[5];
    int[] resultat = new int[5];

    for (int i = 0; i < 5; i++) {
        a[i] = sc.nextInt();
    }

    for (int i = 0; i < 5; i++) {
        b[i] = sc.nextInt();
    }

    for (int i = 0; i < 5; i++) {
        resultat[i] = a[i] + b[i];
    }

    System.out.println("Array a: " + java.util.Arrays.toString(a));
    System.out.println("Array b: " + java.util.Arrays.toString(b));
    System.out.println("Resultat: " + java.util.Arrays.toString(resultat));

}


