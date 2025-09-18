public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria(14);

        int[] valores = {15, 4, 9, 7, 18, 3, 16, 20, 17, 5};

        for (int valor : valores) {
            arvore.inserir(arvore.raiz, valor);
        }

        System.out.println("pre");
        arvore.preOrdem(arvore.raiz);

        System.out.println("\nin");
        arvore.inOrdem(arvore.raiz);

        System.out.println("\npos");
        arvore.posOrdem(arvore.raiz);

        arvore.removerMaior(arvore.raiz);
        System.out.println("\nin");
        arvore.inOrdem(arvore.raiz);

        arvore.removerMenor(arvore.raiz);
        System.out.println("\nin");
        arvore.inOrdem(arvore.raiz);

        arvore.removerElemento(arvore.raiz, 18);
        System.out.println("\nin");
        arvore.inOrdem(arvore.raiz);
    }
}