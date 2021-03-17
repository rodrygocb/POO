
/**
 *
 * @author Rordrigo Costa
 */
public class aVALIACAO {
    int id, nota;
    String avaliador, comentario;
    
    public aVALIACAO(int id, String avaliador, int nota, String comentario){
        this.id = id;
        this.avaliador = avaliador;
        this.nota = nota;
        this.comentario = comentario;
    }
    
    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public void setName(String avaliador) {
        this.avaliador = avaliador;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public int getNota() {
        return this.nota;
    }
    
    public String getAvaliador() {
        return this.avaliador;
    }
    
    
}
