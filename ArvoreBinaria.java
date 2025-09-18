
public class ArvoreBinaria {
    public Node raiz;

    public ArvoreBinaria(int valor) {
        this.raiz = new Node(valor);
    }

    public Node inserir(Node raiz, int valor) {

        if(raiz == null){ // ENCONTROU A POSICAO (CASO BASE)
            return new Node(valor);
        }
        if (raiz.info > valor) { // VALOR MENOR CAMINHA PARA A ESQUERDA
            if (raiz.esquerda != null) {
                inserir(raiz.esquerda, valor); // CHAMA A RECURSAO
            } else { // ECONTROU A POSICAO
                raiz.esquerda = new Node(valor);
            }
        } else { // VALOR MAIOR CAMINHA PARA A DIREITA
            if (raiz.direita != null) {
                inserir(raiz.direita, valor); // CHAMA A RECURSAO
            } else { // ENCONTROU A POSICAO
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
        if (raiz.direita == null) { // ENCONTROU O MAIOR (CASO BASE)
            return raiz.esquerda;
        }
        else { // CAMINHA PARA A DIREITA PARA ACHAR O MAIOR
            raiz.direita = removerMaior(raiz.direita);
            return raiz;
        }
    }

    public Node removerMenor(Node raiz) {
        if (raiz.esquerda == null) { // ECONTROU O MENOR
            return raiz.direita;
        }
        else{ // CAMINHA PARA A ESQUERDA PARA ACHAR O MENOR
            raiz.esquerda = removerMenor(raiz.esquerda);
            return raiz;
        }
    }

    public Node removerElemento(Node raiz, int elemento) {
        if (raiz == null) { // NAO ENCONTROU O ELEMENTO
            System.out.println("O elemento " + elemento + " não existe");
            return null;
        }

        if (elemento > raiz.info) { // ELEMENTO MAIOR, CAMINHA PARA A DIREITA
            raiz.direita = removerElemento(raiz.direita, elemento); // CHAMA A RECURSAO
        }
        else if (elemento < raiz.info) { // ELEMENTO MENOR
            raiz.esquerda = removerElemento(raiz.esquerda, elemento); // CHAMA A RECURSÃO
        }

        else { // ENCONTROU O ELEMENTO
            if (raiz.esquerda == null && raiz.direita == null) { // CASO O ELEMENTO NAO TENHA FILHOS
                return null;
            }

            else if (raiz.esquerda == null) { // CASO TENHA SOMENTE O FILHO DA DIREITA
                return raiz.direita;
            } else if (raiz.direita == null) { // CASO TENHA SOMENTE O FILHO DA ESQUERDA
                return raiz.esquerda;
            }

            else { // CASO TENHA DOIS FILHOS
                Node aux = buscarMaior(raiz.esquerda); // BUSCA O MAIOR ELEMENTO DA ESQUERDA
                raiz.info = aux.info; // ALTERA A INFORMAÇÃO DO ELEMENTO A SER REMOVIDO
                raiz.esquerda = removerElemento(raiz.esquerda, aux.info); // REMOVE O MAIOR DA ESQUERDA
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
