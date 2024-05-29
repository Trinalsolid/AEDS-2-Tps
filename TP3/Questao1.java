import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Personagem{
    public static Personagem[] personagens = new Personagem[1000];
    public static int tampersonagens = 0;

    private String id;
    private String name;
    private String[] alternate_names;
    private String house;
    private String ancestry;
    private String species;
    private String patronus;
    private Boolean hogwartsStaff;
    private Boolean hogwartsStudent;
    private String actorName;
    private Boolean alive;
    private Date dateOfBirth;
    private int yearOfBirth;
    private String eyeColour;
    private String gender;
    private String hairColour;
    private Boolean wizard;

    // CONSTRUTORES

    public Personagem(){
        id = "";
        name = "";
        alternate_names = new String[1];
        house = "";
        ancestry = "";
        species = "";
        patronus = "";
        hogwartsStaff = false;
        hogwartsStudent = false;
        actorName = "";
        alive = false;
        dateOfBirth = new Date(0);
        yearOfBirth = 0;
        eyeColour = "";
        gender = "";
        hairColour = "";
        wizard = false;
    }

    public Personagem(String id,String name,String[] alternate_names,String house,String ancestry,String species,String patronus,
    Boolean hogwartsStaff,Boolean hogwartsStudent,String actorName,Boolean alive,Date dateOfBirth,int yearOfBirth,String eyeColour,
    String gender,String hairColour,Boolean wizard){
        
        this.id = id ;
        this.name = name;
        this.alternate_names =alternate_names;
        this.house = house;
        this.ancestry = ancestry;
        this.species = species;
        this.patronus = patronus;
        this.hogwartsStaff = hogwartsStaff;
        this.hogwartsStudent = hogwartsStudent;
        this.actorName = actorName;
        this.alive = alive;
        this.dateOfBirth = dateOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.eyeColour = eyeColour;
        this.gender = gender;
        this.hairColour = hairColour;
        this.wizard = wizard;
        
    }

    // GETS E SETS
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String[] getAlternate_names() {
        return alternate_names;
    }
    public String getHouse() {
        return house;
    }
    public String getAncestry() {
        return ancestry;
    }
    public String getSpecies() {
        return species;
    }
    public String getPatronus() {
        return patronus;
    }
    public Boolean getHogwartsStaff() {
        return hogwartsStaff;
    }
    public Boolean getHogwartsStudent() {
        return hogwartsStudent;
    }
    public String getActorName() {
        return actorName;
    }
    public Boolean getAlive() {
        return alive;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public String getEyeColour() {
        return eyeColour;
    }
    public String getGender() {
        return gender;
    }
    public String getHairColour() {
        return hairColour;
    }
    public Boolean getWizard() {
        return wizard;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAlternate_names(String[] alternate_names) {
        this.alternate_names = alternate_names;
    }
    public void setHouse(String house) {
        this.house = house;
    }
    public void setAncestry(String ancestry) {
        this.ancestry = ancestry;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }
    public void setHogwartsStaff(Boolean hogwartsStaff) {
        this.hogwartsStaff = hogwartsStaff;
    }
    public void setHogwartsStudent(Boolean hogwartsStudent) {
        this.hogwartsStudent = hogwartsStudent;
    }
    public void setActorName(String actorName) {
        this.actorName = actorName;
    }
    public void setAlive(Boolean alive) {
        this.alive = alive;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }
    public void setWizard(Boolean wizard) {
        this.wizard = wizard;
    }

    // CLONE

    public Personagem Clone(){
        Personagem clone = new Personagem();

        clone.id = id ;
        clone.name = name;
        clone.alternate_names =alternate_names;
        clone.house = house;
        clone.ancestry = ancestry;
        clone.species = species;
        clone.patronus = patronus;
        clone.hogwartsStaff = hogwartsStaff;
        clone.hogwartsStudent = hogwartsStudent;
        clone.actorName = actorName;
        clone.alive = alive;
        clone.dateOfBirth = dateOfBirth;
        clone.yearOfBirth = yearOfBirth;
        clone.eyeColour = eyeColour;
        clone.gender = gender;
        clone.hairColour = hairColour;
        clone.wizard = wizard;

        return clone;
    }

    // IMPRIMIR
    public void imprimir(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        System.out.print(getId()+" ## "+getName()+" ## ");
        String[] alternateNames = getAlternate_names();
        System.out.print("{");
        for (int j = 0; j < alternateNames.length; j++) {
            System.out.print(alternateNames[j]);
            if (j < alternateNames.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("} ## "+getHouse()+
        " ## "+ getAncestry()+" ## "+ getSpecies()+" ## "+getPatronus()+
        " ## " +getHogwartsStaff()+" ## " +getHogwartsStudent()+" ## " +getActorName()+
        " ## " +getAlive()+" ## " + sdf.format(getDateOfBirth())+" ## " +getYearOfBirth()+
        " ## " +getEyeColour()+" ## " +getGender()+" ## " +getHairColour()+
        " ## " +getWizard()+"]\n");
    }
}

class Lista {
    private Personagem[] array;
    private int n;


    /**
    * Construtor da classe.
    */
    public Lista () {
        this(1000);
    }


    /**
    * Construtor da classe.
    * @param tamanho Tamanho da lista.
    */
    public Lista (int tamanho){
        array = new Personagem[tamanho];
        n = 0;
    }


    /**
    * Insere um elemento na primeira posicao da lista e move os demais
    * elementos para o fim da lista.
    * @param x int elemento a ser inserido.
    * @throws Exception Se a lista estiver cheia.
    */
    public void inserirInicio(Personagem x) throws Exception {

        //validar insercao
        if(n >= array.length){
            throw new Exception("Erro ao inserir!");
        } 

        //levar elementos para o fim do array
        for(int i = n; i > 0; i--){
            array[i] = array[i-1];
        }

        array[0] = x;
        n++;
    }


    /**
    * Insere um elemento na ultima posicao da lista.
    * @param x int elemento a ser inserido.
    * @throws Exception Se a lista estiver cheia.
    */
    public void inserirFim(Personagem x) throws Exception {

        //validar insercao
        if(n >= array.length){
            throw new Exception("Erro ao inserir!");
        }

        array[n] = x;
        n++;
    }


    /**
    * Insere um elemento em uma posicao especifica e move os demais
    * elementos para o fim da lista.
    * @param x int elemento a ser inserido.
    * @param pos Posicao de insercao.
    * @throws Exception Se a lista estiver cheia ou a posicao invalida.
    */
    public void inserir(Personagem x, int pos) throws Exception {

        //validar insercao
        if(n >= array.length || pos < 0 || pos > n){
            throw new Exception("Erro ao inserir!");
        }

        //levar elementos para o fim do array
        for(int i = n; i > pos; i--){
            array[i] = array[i-1];
        }

        array[pos] = x;
        n++;
    }


    /**
    * Remove um elemento da primeira posicao da lista e movimenta 
    * os demais elementos para o inicio da mesma.
    * @return resp int elemento a ser removido.
    * @throws Exception Se a lista estiver vazia.
    */
    public Personagem removerInicio() throws Exception {

        //validar remocao
        if (n == 0) {
            throw new Exception("Erro ao remover!");
        }

        Personagem resp = array[0];
        n--;

        for(int i = 0; i < n; i++){
            array[i] = array[i+1];
        }

        return resp;
    }


    /**
    * Remove um elemento da ultima posicao da lista.
    * @return resp int elemento a ser removido.
    * @throws Exception Se a lista estiver vazia.
    */
    public Personagem removerFim() throws Exception {

        //validar remocao
        if (n == 0) {
            throw new Exception("Erro ao remover!");
        }

        return array[--n];
    }


    /**
    * Remove um elemento de uma posicao especifica da lista e 
    * movimenta os demais elementos para o inicio da mesma.
    * @param pos Posicao de remocao.
    * @return resp int elemento a ser removido.
    * @throws Exception Se a lista estiver vazia ou a posicao for invalida.
    */
    public Personagem remover(int pos) throws Exception {

        //validar remocao
        if (n == 0 || pos < 0 || pos >= n) {
            throw new Exception("Erro ao remover!");
        }

        Personagem resp = array[pos];
        n--;

        for(int i = pos; i < n; i++){
            array[i] = array[i+1];
        }

        return resp;
    }


    /**
    * Mostra os elementos da lista separados por espacos.
    */
    public void mostrar (){
        for(int i = 0; i < n; i++){
            System.out.print("["+ i +" ## ");
            array[i].imprimir();           
        }  
    }

}

public class Questao1{
    public static Lista lista = new Lista();
    public static Personagem personagens = new Personagem();
    public static int tampersonagens = 0;

    // LEITURA

    public static String ler(String entradaid) throws Exception {
        String entrada = "";
        BufferedReader arq = new BufferedReader(new InputStreamReader(new FileInputStream("/tmp/characters.csv")));
        //C:\\Users\\WazX\\Desktop\\aeds2-master\\tps\\entrada e saida\\tp02\\characters.csv    /tmp/characters.csv

        entrada = arq.readLine();
        while(entrada != null){
            String[] Ids = entrada.split(";");
            if(Ids[0].equals(entradaid) == true){
                return entrada;
            }
            entrada = arq.readLine();
        }
        String saida = "";

        return saida;
    }

    public static void TratarString(String entrada)throws Exception{
        int tam = entrada.length();
        if (entrada.charAt(tam - 1) == ';') {
            entrada = entrada + "";
        }
        entrada = entrada.replaceAll(";;", ";;");
        String[] HPpersonagens = entrada.split(";");

        // ID do Personagem
        personagens.setId(HPpersonagens[0]);
        // Nome do Personagem
        personagens.setName(HPpersonagens[1]);
        // Alternate_names do Personagem
        int inicio = HPpersonagens[2].indexOf('[');
        int fim = HPpersonagens[2].indexOf(']');
        if (inicio != -1 && fim != -1 && fim > inicio) {
            String alternateNames = HPpersonagens[2].substring(inicio + 1, fim);
            alternateNames = alternateNames.replaceAll("'", "");
            personagens.setAlternate_names(alternateNames.split(","));
        }
        // House do Personagem
        if (!HPpersonagens[3].equals("[]")) {
            personagens.setHouse(HPpersonagens[3]);
        } else {
            personagens.setHouse("");
        }
        // Ancestry do Personagem
        if (!HPpersonagens[4].equals("[]")) {
            personagens.setAncestry(HPpersonagens[4]);
        } else {
            personagens.setAncestry("");
        }
        // Species do Personagem
        if (!HPpersonagens[5].equals("[]")) {
            personagens.setSpecies(HPpersonagens[5]);
        } else {
            personagens.setSpecies("");
        }
        // Patronous do Personagem
        if (!HPpersonagens[6].equals("[]")) {
            personagens.setPatronus(HPpersonagens[6]);
        } else {
            personagens.setPatronus("");
        }
        // HogwartsStaff do Personagem
        boolean hogwartsStaff = HPpersonagens[7].equalsIgnoreCase("verdadeiro");
        personagens.setHogwartsStaff(hogwartsStaff);
        // Hogwartstudent do Personagem
        boolean hogwartsStudent = HPpersonagens[8].equalsIgnoreCase("verdadeiro");
        personagens.setHogwartsStudent(hogwartsStudent);
        // Ator do Personagem
        personagens.setActorName(HPpersonagens[9]);
        // Personagem Alive
        boolean alive = HPpersonagens[10].equalsIgnoreCase("verdadeiro");
        personagens.setAlive(alive);
        // Date of birth do Personagem
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        if (!HPpersonagens[12].equals("[]")) {
            try {
                Date dataNascimento = sdf.parse(HPpersonagens[12]);
                personagens.setDateOfBirth(dataNascimento);
            } catch (ParseException e) {
                personagens.setDateOfBirth(new Date());
            }
        } else {
            personagens.setDateOfBirth(new Date());
        }
        // Year of birth do Personagem
        int anonascimento = Integer.parseInt(HPpersonagens[13]);
        personagens.setYearOfBirth(anonascimento);
        // Eye Colour do Personagem
        if (!HPpersonagens[14].equals("[]")) {
            personagens.setEyeColour(HPpersonagens[14]);
        } else {
            personagens.setEyeColour("");
        }
        // Gender do Personagem
        if (!HPpersonagens[15].equals("[]")) {
            personagens.setGender(HPpersonagens[15]);
        } else {
            personagens.setGender("");
        }
        // Hair Colour do Personagem
        if (!HPpersonagens[16].equals("[]")) {
            personagens.setHairColour(HPpersonagens[16]);
        } else {
            personagens.setHairColour("");
        }
        // Wizard do Personagem
        boolean wizard = HPpersonagens[17].equalsIgnoreCase("verdadeiro");
        personagens.setWizard(wizard);
    }

    public static void OpCode(BufferedReader ids)throws Exception{
        int contador = 0;
        String entrada = "";
        String opcode = ids.readLine();

        while(contador < Integer.parseInt(opcode)){
            entrada = ids.readLine();

            String[] caso = entrada.split(" ");
            // INSERCOES NA LISTA
            if(caso[0].charAt(0)=='I'){
                if(caso[0].charAt(1)=='I'){
                    // Insere Inicio
                    personagens = new Personagem();
                    TratarString(ler(caso[1]));

                    lista.inserirInicio(personagens);
                }else if(caso[0].charAt(1)=='F'){
                    // Insere fim
                    personagens = new Personagem();
                    TratarString(ler(caso[1]));

                    lista.inserirFim(personagens);
                }else{
                    // Insere posicao
                    personagens = new Personagem();
                    TratarString(ler(caso[2]));

                    lista.inserir(personagens, Integer.parseInt(caso[1]));
                }
            }
            // REMOCEOS NA LISTA
            if(caso[0].charAt(0)=='R'){
                if(caso[0].charAt(1)=='I'){
                    // Remove inicio
                    Personagem tmp = lista.removerInicio();
                    System.out.println("(R) "+ tmp.getName());

                }else if(caso[0].charAt(1)=='F'){
                    // Remove fim
                    Personagem tmp = lista.removerFim();
                    System.out.println("(R) "+ tmp.getName());

                }else{
                    // Remove posicao
                    Personagem tmp = lista.remover(Integer.parseInt(caso[1]));
                    System.out.println("(R) "+ tmp.getName());

                }
            }
            contador++;
        }
    }

    public static void main(String[] args) throws Exception {

        String IdsPersonagens = "";
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        IdsPersonagens = entrada.readLine();
        while(IdsPersonagens.equals("FIM") != true){
            personagens = new Personagem();
            TratarString(ler(IdsPersonagens));
            lista.inserirFim(personagens);
            IdsPersonagens = entrada.readLine();
        }
        
        // SEGUNDA PARTE DE ENTRADA COM OPCODE
        OpCode(entrada);
        lista.mostrar();
    }
}
