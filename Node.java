public class Node<T>{
    protected T valor;
    protected Node<T> filho_esq;
    protected Node<T> filho_dir;

    public Node(T novoValor){
        valor=novoValor;
    }

    public void setFilhoEsq(Node<T> novoNo){
        this.filho_esq = novoNo;
    }

    public Node<T> getFilho_esq() {
        return filho_esq;
    }

    public void setFilho_dir(Node<T> filho_dir) {
        this.filho_dir = filho_dir;
    }

    public Node<T> getFilho_dir() {
        return filho_dir;
    }

    public T getValor() {
        return valor;
    }





}
