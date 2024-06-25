#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int comparar(const void *a, const void *b){
    const char *str1 = *(const char **)a;
    const char *str2 = *(const char **)b;

    return strlen(str1) - strlen(str2) ;
}

int main(){
    
    int quantidade = 0;
    scanf("%d", &quantidade);
    int cont = 0;
    
    while(cont < quantidade){

        char string[100];
        fgets(string , 100 , stdin);

        char *ArraydePalavras[100];
        int palavra = 0;
    
        char *delimitador = strtok(string , " \n");
        while (delimitador != NULL){
            ArraydePalavras[palavra++] = delimitador;
            delimitador = strtok(NULL , " \n");
        }
        
        qsort(ArraydePalavras , palavra , sizeof(char *), comparar);
    
        for (int i = palavra; i > 0; i--){
            printf("%s " , ArraydePalavras[i]);
        }
        printf("\n");
        cont++;
    }

}