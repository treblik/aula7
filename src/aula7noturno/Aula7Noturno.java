
package aula7noturno;

import java.util.Scanner;

/**
 *Método Main
 * Métodos de Classe 
 * Variáveis de Classe 
 * Parâmetros :passagem de valores na chamada de método
 * Retorno :passagem de valor no término de um método
 * Instanciação de Objetos New 
 * @author Killbert
 */
public class Aula7Noturno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Usuario user = new Usuario();
       user.senha = "1234";
      String contraSenha;
        
        System.out.println("Digite seu nome:");
             user.nome(sc.nextLine());  
        System.out.println("Digite seu email:");
            user.email(sc.nextLine());
        System.out.println("Digite sua senha:");
            user.senha(sc.nextLine());
            System.out.println("Digite a senha novamente");
            contraSenha = sc.nextLine();
     
            if(user.senha .equals(contraSenha)){
                System.out.println("Voçê está logado");
            }else{
              user.contraSenha();
            }
       
       
       
        
       
    }
    
}
