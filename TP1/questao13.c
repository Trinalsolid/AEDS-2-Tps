#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_TAM_STRING 1000

// Função para verificar se a string é "FIM"
int isFim(char *s) {
  	return (s[0] == 'F' && s[1] == 'I' && s[2] == 'M');
}

// Função para trocar as letras da string
char *trocarLetras(char *s, int seed) {
	char resp[MAX_TAM_STRING];
	char letra1, letra2;
	int i;

	// Gerar letras aleatórias com base na seed
	srand(seed);
	letra1 = 'a' + (rand() % 26);
	letra2 = 'a' + (rand() % 26);

	// Percorrer a string e trocar os caracteres
	for (i = 0; s[i] != '\0'; i++) {
		if (s[i] == letra2) {
		resp[i] = letra1;
		} else {
		resp[i] = s[i];
		}
	}

	resp[i] = '\0'; // Adicionar caractere nulo ao final da string

	return resp;
}

int main() {
	char entrada[MAX_TAM_STRING][MAX_TAM_STRING];
	int numEntrada = 0;

	// Leitura da entrada padrão
	while (!isFim(gets(entrada[numEntrada]))) {
		numEntrada++;
	}

	// Gerar string de saída para cada entrada
	for (int i = 0; i < numEntrada; i++) {
		printf("%s\n", trocarLetras(entrada[i], 4 + i));
	}

	return 0;
}