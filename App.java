import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         double imposto;     
        Scanner sc = new Scanner (System.in);

        double sal;
        System.out.println("Informe o salario: ");
        sal = sc.nextDouble();

        if(sal <= 2000.0){
            System.out.println("Isento!!");
        }
        else if ( sal <= 3000.0){
            imposto = (sal - 2000) * 0.08;
            System.out.println("Você irá pagar "+imposto+" R$" );
        }
        else if( sal <= 4500.0){
            imposto = (sal - 3000) * 0.18 + 1000 * 0.08;
            System.out.println("Você irá pagar "+imposto+" R$" );
        }
        else if( sal > 4500){
            imposto = (sal - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            System.out.println("Você irá pagar "+imposto+" R$" );
        }

        sc.close();

    }
}
