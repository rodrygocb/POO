
/**
 *
 * @author Rodrigo Costa
*/

public class fILME {
    private int id;
    private String name, description;
    
    public fILME(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
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