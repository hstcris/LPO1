AULA LP1 POO SLIDE 1:
1. Altere seu programa para imprimir uma mensagem diferente.
   public class Main {
    public static void main(String[] args) {
        System.out.println("Estou imprimindo uma mensagem!");
   }
   }
   
   
2. Altere seu programa para imprimir duas linhas de texto usando
duas linhas de código System.out.
    public class Main {
    public static void main(String[] args) {
        System.out.println("Estou imprimindo uma mensagem!");
        System.out.println("Estou imprimindo uma segunda mensagem!");
   }
   }
   
3. Sabendo que os caracteres \n representam uma quebra de linhas,
imprima duas linhas de texto usando uma única linha de código
System.out
   public class Main {
    public static void main(String[] args) {
      System.out.print("Estou imprimindo a mensagem 1!\nA mensagem 2 está sendo impressa!");
   }
   }
   ATIVIDADE SLIDE 2:
   
1. Na empresa em que trabalhamos, há tabelas com o gasto de cada
mês. Para fechar o balanço do primeiro trimestre, precisamos
somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil
reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um
programa que calcule e imprima a despesa total no trimestre e a
média mensal de gastos.
  public class Main {
    public static void main(String[] args) {
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

        int soma = janeiro + fevereiro + marco;
        double media = (janeiro + fevereiro + marco) / 3;

        System.out.println("A soma das despesas é igual a "+soma+"\nA média mensal de gastos é igual a "+media);
      }
      }

 2. Programa que leia as notas e calcule a média de LP1 deste
semestre, referente a um determinado aluno.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cubo = new Scanner(System.in);



        System.out.println("Insira a P1: ");
        double p1 = cubo.nextDouble();

        System.out.println("Insira a E1: ");
        double e1 = cubo.nextDouble();

        System.out.println("Insira a E2: ");
        double e2 = cubo.nextDouble();

        System.out.println("Insira a API: ");
        double api = cubo.nextDouble();

        System.out.println("Insira o X: ");
        double x = cubo.nextDouble();


        double parte1 = (p1*0.6 +((e1+e2)/2)*0.4);
        double media = (p1*0.6 +((e1+e2)/2)*0.4)*0.5+(Math.max(parte1 -5.9,0)/((p1*0.6+(e1+e2)/2)*0.4)-5.9)*(api*0.5)+x;

        if (parte1 > 5.9) {
            System.out.println("A média é: "+media);

        } else if (media < 6 && media > 3.9) {
            System.out.println("Não atingiu a nota!");
        }


    }
}
    
