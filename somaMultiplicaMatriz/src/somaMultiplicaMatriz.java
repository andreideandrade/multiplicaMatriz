import java.security.SecureRandom;

public class somaMultiplicaMatriz {
    public static void main(String[] args) throws Exception {
        //linha e coluna da matrizA
        int linha = 2;
        int coluna = 3;
        //linha e coluna da matrizB
        int linhab = 3;
        int colunab = 2;
        //linha e coluna da matrizC
        int linhac = 2;
        int colunac = 2;
        // Matriz A
        int[][] A = new int[linha][coluna];
        // Matriz B
        int[][] B = new int[linhab][colunab];
        // Matriz C
        int[][] C = new int[linha][colunab];
        //Insere Dados da Matriz A
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                 A[i][j] = new SecureRandom().nextInt(1, 5);
            }
        }
        //Insere Dados da Matriz B
        for(int i = 0; i < linhab; i++){
            for(int j = 0; j < colunab; j++){
                B[i][j] = new SecureRandom().nextInt(1, 5);
            }
        }
        //Operação Multiplica
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < colunab; j++){
                for(int k = 0; k < linhab; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        //Imprime valores das Matrizes
        //Matriz A
        System.out.println();
        System.out.println("============== Matriz A ==============");
        System.out.println();
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){ 
                System.out.printf("%2d", A[i][j]);
            }
            System.out.println();
        }
        //Matriz B
        System.out.println();
        System.out.println("============== Matriz B ==============");
        System.out.println();
        for(int i = 0; i < linhab; i++){
            for(int j = 0; j < colunab; j++){
                System.out.printf("%2d", B[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("============== Resultado ==============");
        System.out.println();
        for(int i = 0; i < linhac; i++){
            for(int j = 0; j < colunac; j++){
                System.out.printf("%4d", C[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}