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



        int[] extras1 = {1, 2, 6, 8, 10, 11, 12, 13, 19, 21};
        for (int v : extras1) {
            arvore.inserir(arvore.raiz, v);
        }

        System.out.println("\npre");
        arvore.preOrdem(arvore.raiz);

        System.out.println("\nin");
        arvore.inOrdem(arvore.raiz);

         arvore.removerElemento(arvore.raiz, 1);
        System.out.println("\nremov4folha 1, in");
        arvore.inOrdem(arvore.raiz);

         arvore.removerElemento(arvore.raiz, 16);
        System.out.println("\nremovi, in");
        arvore.inOrdem(arvore.raiz);

         int[] extras2 = {18, 20};
        for (int v : extras2) {
            arvore.inserir(arvore.raiz, v);
        }

        System.out.println("\npre");
        arvore.preOrdem(arvore.raiz);

        System.out.println("\nin");
        arvore.inOrdem(arvore.raiz);

         arvore.removerElemento(arvore.raiz, 19);
        System.out.println("\nremovi no com 2, in");
        arvore.inOrdem(arvore.raiz);

         arvore.removerMaior(arvore.raiz);
        arvore.removerMenor(arvore.raiz);
        System.out.println("\nin, remover maior e menor novamente");
        arvore.inOrdem(arvore.raiz);

        System.out.println("\npos");
        arvore.posOrdem(arvore.raiz);
    }
}