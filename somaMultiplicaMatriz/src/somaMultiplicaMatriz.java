package atividade01_matriz;

import java.util.Scanner;

public class Atividade01_matriz {
    
    public static void main(String[] args) throws Exception {

// ======================= linha e coluna da matrizA ===========================
        int linha = 1;
        int coluna = 1;
        
// ======================= linha e coluna da matrizB ===========================
        int linhab = 1;
        int colunab = 1;
        
// ======================= linha e coluna da matrizC ===========================
        int linhac = 2;
        int colunac = 2;
        
// ======================= Abre do scanner  ====================================
        Scanner sc = new Scanner(System.in);                              
        
        System.out.print("Matriz A\nDigite quantas linhas: ");
        linha = sc.nextInt();
        System.out.println();
        sc.reset();
        
        System.out.print("Matriz A\nDigite quantas colunas: ");
        coluna = sc.nextInt();
        System.out.println();
        sc.reset();
        
        System.out.print("Matriz B\nDigite quantas linhas: ");
        linhab = sc.nextInt();
        System.out.println();
        sc.reset();
        
        System.out.print("Matriz B\nDigite quantas colunas: ");
        colunab = sc.nextInt();
        System.out.println();
        sc.reset();
        
// ======================= Fecha o scanner  ====================================

//      Matriz A
        int[][] A = new int[linha][coluna];
        
//      Matriz B
        int[][] B = new int[linhab][colunab];
        
//      Matriz C
        int[][] C = new int[linhac][colunac];
        
// ======================= Insere Dados da Matriz A ============================
        for(int i = 0; i < linha; i++){
            
            for(int j = 0; j < coluna; j++){
                  
                 System.out.printf("Matriz A\nDigite Linha %2d, coluna: %2d: ", i , j);
                 A[i][j] = sc.nextInt();
                 System.out.println();
                 sc.reset();
            }
            
        }
// ======================= Insere Dados da Matriz B ============================
        for(int i = 0; i < linhab; i++){
            
            for(int j = 0; j < colunab; j++){
                                
                System.out.printf("Matriz B\nDigite Linha %2d, coluna: %2d: ", i , j);
                B[i][j] = sc.nextInt();
                System.out.println();
                sc.reset();
            }
            
        }
        sc.close();   
// ======================= Operação Multiplica =================================
        for(int i = 0; i < linha; i++){
            
            for(int j = 0; j < colunab; j++){
                
                for(int k = 0; k < linhab; k++){
                    
                    C[i][j] += A[i][k] * B[k][j];
                    
                }
                
            }
            
        }
// ======================= Imprime valores das Matrizes ========================
// ================================ Matriz A ===================================
        
        System.out.println("\n============== Matriz A ==============\n");
        
        
        for(int i = 0; i < linha; i++){
            
            for(int j = 0; j < coluna; j++){ 
                
                System.out.printf("%4d ", A[i][j]);
                
            }
            
            System.out.println();
            
        }
        
// ================================ Matriz B ===================================
        System.out.println("\n============== Matriz B ==============\n");
        
        for(int i = 0; i < linhab; i++){
        
            for(int j = 0; j < colunab; j++){
            
                System.out.printf("%4d ", B[i][j]);
                
            }
            
            System.out.println();
            
        }
        
        System.out.println("\n============== Resultado ==============\n");
        System.out.println("\nMatriz A x Matriz B = Matriz C\n");
        
        for(int i = 0; i < linhac; i++){
        
            for(int j = 0; j < colunac; j++){
            
                System.out.printf("%6d ", C[i][j]);
            }
            
            System.out.println();
            
        }
        
        System.out.println();
        
    }
    
}