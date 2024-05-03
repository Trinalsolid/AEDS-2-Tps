#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

// DEFINE DE VARIAVEIS

#define TAM_STRING         100 
#define TAM_STRING_ARRAY   100

// CONSTRUTORES

Personagem lista[1000];
int contPerso = 0;

typedef struct{
    int year,month;
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

// GETS E SETS

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

void id(char id[]){
    strcpy(lista[contPerso].id,id);
}
void name(char name[]){
    strcpy(lista[contPerso].name,name);
}
void alternate_names(char alternatename[]){
    lista[contPerso].alternate_names = atoi(altura);
}
void house(char house[]){
    strcpy(lista[contPerso].house,house);
}
void ancestry(char ancestry[]){
    strcpy(lista[contPerso].ancestry,ancestry);
}
void species(char species[]){
    strcpy(lista[contPerso].species,species);
}
void patronus(char patronus[]){
    strcpy(lista[contPerso].patronus,patronus);
}
void hogwartsStaff(char hogwartsStaff[]){
    lista[contPerso].hogwartsStaff = atoi(hogwartsStaff);
}
void hogwartsStaff(char hogwartsStaff[]){
    lista[contPerso].hogwartsStaff = atoi(hogwartsStaff);
}
void AnoNascimento(char anoNascimento[]){
    lista[contPerso].anoNascimento = atoi(anoNascimento);
}
void Universidade(char universidade[]){
    strcpy(lista[contPerso].universidade,universidade);
}
void CidadeNascimento(char cidadeNascimento[]){
    strcpy(lista[contPerso].cidadeNascimento,cidadeNascimento);
}
void EstadoNascimento(char estadoNascimento[]){
    strcpy(lista[contPerso].estadoNascimento,estadoNascimento);
}

// LEITURA

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