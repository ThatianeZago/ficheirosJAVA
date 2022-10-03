
package manipulaficheiros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


class Ficheiro {

    static void criarFicheiro() {
       String nome;
       System.out.println("Insira o nome do ficheiro para criar: ");
       nome = ManipulaFicheiros.ler.nextLine();
       nome = ManipulaFicheiros.ler.next();
       File ficheiro = new File(nome);
       if(!ficheiro.exists()){
            try {
                ficheiro.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
       }
    }

    static void verificaSeExiste() {
       String nome;
       System.out.println("Insira o nome do ficheiro para verificar: ");
       nome = ManipulaFicheiros.ler.nextLine();
       nome = ManipulaFicheiros.ler.next();
       File ficheiro = new File(nome);
       if(!ficheiro.exists()){
           System.out.println("O ficheiro não existe. Tente novamente.");
       }else{
          System.out.println("O ficheiro existe!!!"); 
       }
    }

    static void escreveNoFinalFicheiro() {
       String nome;
       System.out.println("Insira o nome do ficheiro: ");
       nome = ManipulaFicheiros.ler.nextLine();
       nome = ManipulaFicheiros.ler.next();
       File ficheiro = new File(nome);
       
           try {
               if(!ficheiro.exists()){
                   ficheiro.createNewFile();
               }
                FileWriter fw = new FileWriter(ficheiro, true); 
                BufferedWriter bw = new BufferedWriter (fw); 
                String texto; 
                System.out.println("Insira o conteudo"); 
                texto = ManipulaFicheiros.ler.nextLine(); 
                texto = ManipulaFicheiros.ler.nextLine(); 
                bw.write(texto); 
                bw.newLine(); 
                bw.close(); 
                fw.close();  
           } catch (IOException ex) {
               ex.getStackTrace();
              }
       }
       
       
       
    
   static void escreveFicheiroNOvo() {
    }

    static void mostraConteudoFicheiro() {
     }

    static void mostraListaFicheiros() {
        File ficheiro = new File("C:\\Users\\TLeite\\Desktop\\FicheiroJAVA\\ficheirosJAVA");
        File [] lista = ficheiro.listFiles();
        System.out.println("»»»» Lista de Ficheiros ««««");
        for(int x=0;x<lista.length;x++){
            System.out.println(lista[x].getName());
        }
    }
    
}
