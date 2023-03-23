/**
 * ÁrvoreBinária
 * @authors Ludmila Dias e Isabella Sampaio
 */

public class ArvoreBinaria<T> {
    protected Node<T> raiz;
    // protected Comparator<T> comparador;

    public ArvoreBinaria(Node<T> raiz){
        this.raiz=raiz;
    }
// ----------------------------------------
    public void setNovoNo(Node<T> novoNo){
        setNovoNo(this.raiz, novoNo);
    }
    private void setNovoNo(Node<T> r, Node<T> novoNo){

    }
// -----------------------------------------
    public void caminhaEmOrdem(){
        caminhaEmOrdem(this.raiz);
    }

    private void caminhaEmOrdem(Node<T> r){

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
    
}