
/**
 *
 * @author Rodrigo Costa
*/
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class fILME_extra {
    private int id;
    private String name, description;
    
    public fILME(int id, String name, String description){
    Scanner ler = new Scanner(System.in);
        int n;
        this.id = id;
        this.name = name;
        this.description = description;
    
    FileWriter arq = new FileWriter("c:\\filmes.txt");
    PrintWriter gravarArq = new PrintWriter(arq);

    gravarArq.printf("Id: %d", id);
    gravarArq.printf("Nome: %s", name);
    gravarArq.printf("Descrição: %s", description);

    
    arq.close();
    
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setDescription(String description){
        this.name = description;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
}