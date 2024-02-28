# LPO1
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

  public class Main {
    public static void main(String[] args) {
    
    
 
      

   
