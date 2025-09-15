package arvore;

public class Arvore {

    private class Node {
        private int info;
        private Node esquerda;
        private Node direita;

        Node(int valor) {
            this.info = valor;
        }
    }

    public class ArvoreBinaria {
        private Node raiz;

        ArvoreBinaria(int valor) {
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
            System.out.println(raiz.info);
            preOrdem(raiz.esquerda);
            preOrdem(raiz.direita);
        }
    }
    
    public void inOrdem(Node raiz){
        if(raiz != null){
            inOrdem(raiz.esquerda);
            System.out.println(raiz.info);
            inOrdem(raiz.direita);
        }
    }
    
    public void posOrdem(Node raiz){
        if(raiz != null){
            posOrdem(raiz.esquerda);
            posOrdem(raiz.direita);
            System.out.println(raiz.info);
        }
    }
    

    public void removerMaior(Node raiz) {

    }

    public void removerMenor(Node raiz) {

    }

    public void removerElemento(Node raiz, Node elemento) {

    }
    }

    

    public static void main(String[] args) {
        Arvore arv = new Arvore();
        Arvore.ArvoreBinaria arvore = arv.new ArvoreBinaria(14);

        arvore.raiz = arvore.inserir(arvore.raiz, 15);
        arvore.raiz = arvore.inserir(arvore.raiz, 4);
        arvore.raiz = arvore.inserir(arvore.raiz, 1);




        System.out.println("pre");
        arvore.preOrdem(arvore.raiz);

        System.out.println("in");
        arvore.inOrdem(arvore.raiz);

        System.out.println("pos");
        arvore.posOrdem(arvore.raiz);
    }

}