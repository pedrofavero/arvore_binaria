
public class ArvoreBinaria {
    public Node raiz;

    public ArvoreBinaria(int valor) {
        this.raiz = new Node(valor);
    }

    public Node inserir(Node raiz, int valor) {

        if(raiz == null){
            return new Node(valor);
        }
        if (raiz.info > valor) {
            if (raiz.esquerda != null) {
                inserir(raiz.esquerda, valor);
            } else {
                raiz.esquerda = new Node(valor);
            }
        } else {
            if (raiz.direita != null) {
                inserir(raiz.direita, valor);
            } else {
                raiz.direita = new Node(valor);
            }
        }
        return raiz;

    }

    public void preOrdem(Node raiz){
        if(raiz != null){
            System.out.print(raiz.info + " ");
            preOrdem(raiz.esquerda);
            preOrdem(raiz.direita);
        }
    }

    public void inOrdem(Node raiz){
        if(raiz != null){
            inOrdem(raiz.esquerda);
            System.out.print(raiz.info + " ");
            inOrdem(raiz.direita);
        }
    }

    public void posOrdem(Node raiz){
        if(raiz != null){
            posOrdem(raiz.esquerda);
            posOrdem(raiz.direita);
            System.out.print(raiz.info + " ");
        }
    }


    public Node removerMaior(Node raiz) {
        if (raiz.direita == null) {
            return raiz.esquerda;
        }
        else {
            raiz.direita = removerMaior(raiz.direita);
            return raiz;
        }
    }

    public Node removerMenor(Node raiz) {
        if (raiz.esquerda == null) {
            return raiz.direita;
        }
        else{
            raiz.esquerda = removerMenor(raiz.esquerda);
            return raiz;
        }
    }

    public Node removerElemento(Node raiz, int elemento) {
        if (raiz == null) {
            System.out.println("O elemento " + elemento + " não existe");
            return null;
        }

        if (elemento > raiz.info) {
            raiz.direita = removerElemento(raiz.direita, elemento);
        }
        else if (elemento < raiz.info) {
            raiz.esquerda = removerElemento(raiz.esquerda, elemento);
        }

        else {
            if (raiz.esquerda == null && raiz.direita == null) {
                return null;
            }

            else if (raiz.esquerda == null) {
                return raiz.direita;
            } else if (raiz.direita == null) {
                return raiz.esquerda;
            }

            else {
                Node aux = buscarMaior(raiz.esquerda);
                raiz.info = aux.info;
                raiz.esquerda = removerElemento(raiz.esquerda, aux.info);
            }
        }
        return raiz;
    }

    public Node buscarMaior(Node raiz){
        if(raiz.direita == null){
            return raiz;
        }
        else{
            return buscarMaior(raiz.direita);
        }
    }
}
