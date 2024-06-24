#include <stdlib.h>
#include <stdio.h>
#include <string.h>

struct Camisetas{
    char nome[100];
    char cor[10];
    char tamanho[10];
};

int comparacao(const void *a , const void *b){
    struct Camisetas *camisa1 = (struct Camisetas *)a;
    struct Camisetas *camisa2 = (struct Camisetas *)b;

    if(strcmp(camisa1->cor , camisa2->cor) == 0){
        if(strcmp(camisa1->tamanho , camisa2->tamanho) == 0){
            return strcmp(camisa1->nome , camisa2->nome);
        }
        return -strcmp(camisa1->tamanho , camisa2->tamanho);
    }
    return strcmp(camisa1->cor , camisa2->cor);
}

int main(){
    int N, first;
    struct Camisetas camiseta[60];

    first = 1;
    while (scanf("%d\n", &N))
    {
        if (!N)
            break;

        if (first)
            first = 0;
        else
            printf("\n");

        for (int i = 0; i < N; ++i)
        {
            scanf("%[^\n]\n", &(camiseta[i].nome));
            scanf("%s %s\n", &(camiseta[i].cor), &(camiseta[i].tamanho));
        }

        qsort(camiseta, N, sizeof(struct Camisetas), comparacao);

        for (int i = 0; i < N; ++i)
        {
            printf("%s %s %s\n", camiseta[i].cor, camiseta[i].tamanho, camiseta[i].nome);
        }
    }
    return 0;

}