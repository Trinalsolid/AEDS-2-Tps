#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <time.h> 
#include <locale.h>

// DEFINE DE VARIAVEIS

#define TAM_STRING         100 
#define TAM_STRING_ARRAY   100

typedef struct {
    int day;
    int month;
    int year;
} Date;

typedef struct{

    char id[TAM_STRING];
    char name[TAM_STRING];
    int countnames;
    char alternate_names[TAM_STRING_ARRAY][30];
    char house[TAM_STRING];
    char ancestry[TAM_STRING];
    char species[TAM_STRING];
    char patronus[TAM_STRING];
    bool hogwartsStaff;
    char hogwartsStudent[TAM_STRING];
    char actorName[TAM_STRING];
    bool alive;
    Date dateOfBirth;
    int yearOfBirth;
    char eyeColour[TAM_STRING];
    char gender[TAM_STRING];
    char hairColour[TAM_STRING];
    bool wizard;

}Personagem;

//-------------------------------------------
void id(char id[]);
void name(char name[]);
void alternate_names(char alternatename[]);
void house(char house[]);
void ancestry(char ancestry[]);
void species(char species[]);
void patronus(char patronus[]);
void hogwartsStaff(bool hogwartsStaff);
void hogwartsStudent(char hogwartsStudent[]);
void actorName(char actorName[]);
void alive(bool alive);
void dateOfBirth(Date dateOfBirth);
void yearOfBirth(char yearOfBirth[]);
void eyeColour(char eyeColour[]);
void gender(char gender[]);
void hairColour(char hairColour[]);
void wizard(bool wizard);
//--------------------------------------------
void swap(int i, int j);
void SelecaoRec(int i, int n);
void LerPersonagem(char entradaID[]);
void TratarString(char entrada[]);
Personagem clone(Personagem *personagem);
void imprimir();

Personagem lista[1000];
int contPersonagem = 0;
int contador = 0;

int main(){
    clock_t t; 
    t = clock(); 

    char Ids[1000];
    scanf("%s",Ids);

    while(strcmp(Ids,"FIM") != 0 ){      
        LerPersonagem(Ids);
        contPersonagem++;
        scanf("%s",Ids);
    }
    //Ordenacao do array de jogadores
    SelecaoRec(0 , contPersonagem);
    imprimir();

    // arquivo de matricula========================================================
    t = clock() - t;  
    FILE *arq;
    arq = fopen("matrícula_selecaoRecursiva.txt", "a");
    fprintf(arq, "695161 \t %ld \t %d", t , contador);
    fclose(arq);
    //=============================================================================

    return 0;
}

// GETS E SETS

void id(char id[]) {
    strcpy(lista[contPersonagem].id, id);
}
void name(char name[]) {
    strcpy(lista[contPersonagem].name, name);
}
void alternate_names(char alternatename[]) {
    char* nomeAlt = strtok(alternatename, ",");
    int count = 0;
    while (nomeAlt != NULL && count < TAM_STRING_ARRAY) {
        strcpy(lista[contPersonagem].alternate_names[count], nomeAlt);
        count++;
        nomeAlt = strtok(NULL, ",");
    }
    lista[contPersonagem].countnames = count;
}
void house(char house[]) {
    strcpy(lista[contPersonagem].house, house);
}
void ancestry(char ancestry[]) {
    strcpy(lista[contPersonagem].ancestry, ancestry);
}
void species(char species[]) {
    strcpy(lista[contPersonagem].species, species);
}
void patronus(char patronus[]) {
    strcpy(lista[contPersonagem].patronus, patronus);
}
void hogwartsStaff(bool hogwartsStaff) {
    lista[contPersonagem].hogwartsStaff = hogwartsStaff;
}
void hogwartsStudent(char hogwartsStudent[]) {
    strcpy(lista[contPersonagem].hogwartsStudent, hogwartsStudent);
}
void actorName(char actorName[]) {
    strcpy(lista[contPersonagem].actorName, actorName);
}
void alive(bool alive) {
    lista[contPersonagem].alive = alive;
}
void dateOfBirth(Date dateOfBirth) {
    lista[contPersonagem].dateOfBirth = dateOfBirth;
}
void yearOfBirth(char yearOfBirth[]) {
    lista[contPersonagem].yearOfBirth = atoi(yearOfBirth);
}
void eyeColour(char eyeColour[]) {
    strcpy(lista[contPersonagem].eyeColour, eyeColour);
}
void gender(char gender[]) {
    strcpy(lista[contPersonagem].gender, gender);
}
void hairColour(char hairColour[]) {
    strcpy(lista[contPersonagem].hairColour, hairColour);
}
void wizard(bool wizard) {
    lista[contPersonagem].wizard = wizard;
}

// ORDENACAO PARA PESQUISA BINARIA

// Selection sort 

void SelecaoRec(int i, int n){
	int menor = i;
	for (int j = i + 1; j < n; j++){
		if (strcmp(lista[j].name,lista[menor].name) < 0 ){
			menor = j;
            contador++;	
        }
	}
	swap(menor, i);

	if (i + 1 < n) {
		SelecaoRec(i + 1, n);
        contador++;
	}
}

void swap(int i, int j){
   Personagem tmp = lista[i];
   lista[i] = lista[j];
   lista[j] = tmp;
}

// LEITURA

void LerPersonagem(char entradaID[]){

    char entradas[1000];
    char *stringsep;
    char *virgula;
    FILE *caminho = fopen("/tmp/characters.csv","r");
    //C:\\Users\\WazX\\Desktop\\aeds2-master\\tps\\entrada e saida\\tp02\\characters.csv    /tmp/characters.csv

    do{
        fgets(entradas,1000,caminho);
        stringsep = strdup(entradas);
        virgula = strtok(stringsep,";");
        if (strcmp(virgula,entradaID) == 0 ){
            TratarString(entradas);
        }  
    }while(!feof(caminho) && strcmp(virgula,entradaID) != 0);
    fclose(caminho);

}

void TratarString(char entrada[]){
    //ID
    strcpy(entrada, strtok(entrada, ";")); 
    id(entrada);    
    //Name
    strcpy(entrada, strtok(NULL, ";"));
    name(entrada);
    //Alternate_Names
    //strcpy(entrada, strtok(NULL, ";"));
    //Alternate_Names(entrada);  
    //house
    strcpy(entrada, strtok(NULL, ";"));
    house(entrada);
    //patronous
    strcpy(entrada, strtok(NULL, ";"));
    patronus(entrada);   
    //hogwartsStaff
    strcpy(entrada, strtok(NULL, ";"));
    hogwartsStaff(entrada);
    //hogwartsStudent
    strcpy(entrada, strtok(NULL, ";"));
    hogwartsStudent(entrada);
    //actorName
    strcpy(entrada, strtok(NULL, ";"));
    actorName(entrada);
    //alive
    strcpy(entrada, strtok(NULL, ";"));
    alive(entrada);
    //dateOfBirth
    Date data;
    sscanf(entrada, "%d-%d-%d", &data.year, &data.month, &data.day);
    dateOfBirth(data);
    //yearOfBirth
    strcpy(entrada, strtok(NULL, ";"));
    yearOfBirth(entrada);
    //eyeColour
    strcpy(entrada, strtok(NULL, ";"));
    eyeColour(entrada);
    //gender
    strcpy(entrada, strtok(NULL, ";"));
    gender(entrada);
    //hairColour
    strcpy(entrada, strtok(NULL, ";"));
    hairColour(entrada);
    //wizard
    strcpy(entrada, strtok(NULL, ";"));
    wizard(entrada);
}

// CLONE

Personagem clone(Personagem *personagem){

    Personagem clone;

    strcpy(clone.id , personagem -> id);
    strcpy(clone.name , personagem -> name);
    for(int i = 0; i < personagem -> countnames; i++){
        strcpy(clone.alternate_names[i], personagem -> alternate_names[i]);
    } 
    strcpy(clone.house , personagem -> house);
    strcpy(clone.ancestry , personagem -> ancestry);
    strcpy(clone.species , personagem -> species);
    strcpy(clone.patronus , personagem -> patronus);
    clone.hogwartsStaff = personagem -> hogwartsStaff;
    strcpy(clone.hogwartsStudent , personagem -> hogwartsStudent);
    strcpy(clone.actorName , personagem -> actorName);
    clone.alive = personagem -> alive;
    clone.dateOfBirth = personagem -> dateOfBirth ;
    clone.yearOfBirth = personagem -> yearOfBirth ;
    strcpy(clone.eyeColour , personagem -> eyeColour);
    strcpy(clone.gender , personagem -> gender);
    strcpy(clone.hairColour , personagem -> hairColour);

    return clone;
}
// IMPRIMIR

void imprimir(){
    for (int i = 0; i < contPersonagem; i++) {
        printf("[%s", lista[i].id);
        printf("%s"," ## ");
        printf("%s", lista[i].name);
        printf("%s"," ## {");
        for (int j = 0; j < lista[i].countnames; j++) {
            printf("%s%s", lista[i].alternate_names[j], (j < lista[i].countnames - 1) ? ", " : "");
        }
        printf("%s", lista[i].house);
        printf("%s", lista[i].ancestry);
        printf("%s", lista[i].species);
        printf("%s", lista[i].patronus);
        printf("%s"," ## ");
        printf("%s", lista[i].hogwartsStaff ? "true" : "false");
        printf("%s"," ## ");
        printf("%s", lista[i].hogwartsStudent);
        printf("%s"," ## ");
        printf("%s", lista[i].actorName);
        printf("%s"," ## ");
        printf("%02d-%02d-%02d", lista[i].dateOfBirth.day, lista[i].dateOfBirth.month, lista[i].dateOfBirth.year);
        printf("%s"," ## ");
        printf("%d", lista[i].yearOfBirth);
        printf("%s"," ## ");
        printf("%s", lista[i].eyeColour);
        printf("%s"," ## ");
        printf("%s", lista[i].gender);
        printf("%s"," ## ");
        printf("%s", lista[i].hairColour);
        printf("%s"," ## ");
        printf("%s", lista[i].wizard ? "true" : "false");
        printf("%s","]\n");
    }
}