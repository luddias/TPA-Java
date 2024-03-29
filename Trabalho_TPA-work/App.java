import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
public class App {

    public static void main(String[] args) throws InterruptedException, IOException{

        //Menu 
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        Menu menu = new Menu(scan, opcao);


        // Ler arquivos e montar árvores
    
        ArrayList<Aluno> alunos = menu.lerArq();
        ArvoreBinaria<Aluno> arvNome = new ArvoreBinaria<Aluno>(new ComparadorPorNome());
        ArvoreBinaria<Aluno> arvMat = new ArvoreBinaria<Aluno>(new ComparadorPorMatricula());
      
        
        while(opcao != 5){
            menu.menu();
            opcao = menu.lerOpcaoMenu();
            menu.escolheMenu(opcao);       
        }     
        
        
        for(int j = 0; j < menu.getAlunos().size(); j++){
            alunos.add(menu.getAlunos().get(j));
        }


        for(int i=0; i< alunos.size(); i++){
            arvNome.setNovoNo(alunos.get(i));
            arvMat.setNovoNo(alunos.get(i));
        }

        arvNome.retornaValorArv();
        menu.addNoArq(menu.getAlunos(), "entrada123.txt");

        System.out.println(arvMat.minVal());
        System.out.println(arvMat.maxVal());

        
        // ArrayList<Aluno> listaArvNome = arvNome.caminhaEmOrdem();

        // for(int i=0; i<listaArvNome.size(); i++){
        //     System.out.println((listaArvNome.get(i)).getNome());
        // }

        // ArrayList<Aluno> listaArvMat = arvMat.caminhaEmOrdem();
        
        // for(int i=0; i<listaArvMat.size(); i++){
        //     System.out.println((listaArvMat.get(i)).getMatricula());
        // }

        // ArrayList<Aluno> listaMatEmNivel = arvMat.caminhaEmNivel();
        
        // System.out.println("_________________________________________");
        // for(int i=0; i<listaMatEmNivel.size(); i++){
        //     System.out.println((listaMatEmNivel.get(i)).getMatricula());
        // }

    }

}