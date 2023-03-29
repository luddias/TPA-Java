import java.util.ArrayList;
import java.util.Comparator;


/**
 * ÁrvoreBinária
 * @authors Ludmila Dias e Isabella Sampaio
 */

public class ArvoreBinaria<T> {
    protected Node<T> raiz;
    protected Comparator<T> comparador;


    public ArvoreBinaria(Comparator<T> comp){
        comparador = comp;
    }
// ----------------------------------------
    public void setNovoNo(T novo){
        Node<T> novoNo= new Node<T>(novo);
        if(this.raiz==null)
            this.raiz = novoNo;
        else
            setNovoNo(this.raiz, novoNo);
    }

    private void setNovoNo(Node<T> r, Node<T> novo){
        if(comparador.compare(novo.getValor(), r.getValor())<0){
            if(r.getFilho_esq()==null){
                r.setFilhoEsq(novo);
            }else{
                setNovoNo(r.getFilho_esq(), novo);
            }
        }
        if(comparador.compare(novo.getValor(), r.getValor())>0){
            if(r.getFilho_dir()==null){
                r.setFilho_dir(novo);
            }else{
                setNovoNo(r.getFilho_dir(), novo);
            }
        }

    }
// -----------------------------------------


public int getAltura(){
    if(this.raiz!=null){
        return getAltura(this.raiz);
    }
    else{
        return 0;
    }

}

private int getAltura(Node<T> r){

    int h_dir = 0;
    int h_esq = 0;

    if(r.getFilho_esq()!=null){
        h_esq=getAltura(r.getFilho_esq());
    }
        
    if(r.getFilho_dir()!= null){
        h_dir = getAltura(r.getFilho_dir());
    }

    if(h_esq > h_dir){
        return h_esq +1;
    }
    else{
        return h_dir+1;
    }
    
    
}
// ----------------------------------------------
    public ArrayList<T> caminhaEmOrdem(){
        ArrayList<T> lista = new ArrayList<T>();
        if(this.raiz!=null){
            caminhaEmOrdemRec(this.raiz, lista);
            lista.add(this.raiz.getValor());
           
        }

        return lista;
    }

    private ArrayList<T> caminhaEmOrdemRec(Node<T> r, ArrayList<T> lista){
        if(r.getFilho_esq()!=null){
            caminhaEmOrdemRec(r.getFilho_esq(), lista);
            lista.add(r.getFilho_esq().getValor()); 
        }
            
        if(r.getFilho_dir()!= null){
            caminhaEmOrdemRec(r.getFilho_dir(), lista);
            lista.add(r.getFilho_dir().getValor());
        }
        
        return lista;
        
    }
// ----------------------------------------------

public ArrayList<T> caminhaEmNivel(){
    ArrayList<T> lista = new ArrayList<T>();
    ArrayList<Node<T>> fila = new ArrayList<Node<T>>();
    if(this.raiz !=null){
        fila.add(this.raiz);
        lista = caminhaEmNivelRec(fila, lista);
    }

    return lista;
}

private ArrayList<T>  caminhaEmNivelRec(ArrayList<Node<T>> fila, ArrayList<T> lista){
    Node<T> r = fila.get(0);
    lista.add(r.getValor());
    if(r.getFilho_esq()!=null){
        fila.add(r.getFilho_esq()); 
    }
    if(r.getFilho_dir()!= null){
        fila.add(r.getFilho_dir());
    }

    fila.remove(0);
    if(!fila.isEmpty()){
        lista = caminhaEmNivelRec(fila, lista);
    }
    
    return lista;
}

// ----------------------------------------------

    public int quantElem(){
        return quantElem(this.raiz);
    }

    private int quantElem(Node<T> r){
        if(r==null)
            return 0;
        else{
            return quantElem(r.getFilho_esq())+quantElem(r.getFilho_dir())+1;
        }
        
    }
    
    public Node<T> getRaiz() {
        return raiz;
    }



// -------------------------------------------------------------


} // fecha classe



