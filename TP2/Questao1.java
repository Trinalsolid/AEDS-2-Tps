import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
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
    private String hogwartsStudent;
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
        hogwartsStudent = "";
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
    Boolean hogwartsStaff,String hogwartsStudent,String actorName,Boolean alive,Date dateOfBirth,int yearOfBirth,String eyeColour,
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
        String aux = "";
        if (alternate_names.length > 1) {
            for (int i = 0; i < alternate_names.length; i++) {
                aux = aux + alternate_names[i];
                if (i != alternate_names.length - 1) {
                    aux = aux + ',';
                }
            }
        } else {
            aux = alternate_names[0];
        }
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
    public String getHogwartsStudent() {
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
    public void setHogwartsStudent(String hogwartsStudent) {
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

    // LEITURA

    public static String ler(String entradaid) throws Exception {
        String entrada = "";
        BufferedReader arq = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\WazX\\Desktop\\aeds2-master\\tps\\entrada e saida\\tp02\\characters.csv")));
        //C:\\Users\WazX\\Desktop\\aeds2-master\\tps\\entrada e saida\tp02\\characters.csv    /tmp/characters.csv

        entrada = arq.readLine();
        while(entrada != null){
            String[] Ids = entrada.split(",");
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
        if(entrada.charAt(tam-1) == ','){
            entrada = entrada + "nao informado";
        }
        entrada = entrada.replaceAll(",,", ",nao informado,");
        String[] HPpersonagens = entrada.split(",");

        // ID do jogador
        personagens[tampersonagens].setId(HPpersonagens[0]);
        // Nome do jogador
        personagens[tampersonagens].setName(HPpersonagens[1]);
        // Altura do jogador
        //personagens[tampersonagens].setAlternate_names(HPpersonagens[2]);
        // Peso do jogador
        personagens[tampersonagens].setHouse(HPpersonagens[3]);
        // Universidade do jogador
        personagens[tampersonagens].setAncestry(HPpersonagens[4]);
        // Ano de nascimento do jogador
        personagens[tampersonagens].setSpecies(HPpersonagens[5]);
        // Cidade do  jogador
        personagens[tampersonagens].setPatronus(HPpersonagens[6]);
        // Estado do jogador
        boolean hogwartsStaff = Boolean.parseBoolean(HPpersonagens[7]);
        personagens[tampersonagens].setHogwartsStaff(hogwartsStaff);
        //
        personagens[tampersonagens].setHogwartsStudent(HPpersonagens[8]);
        //
        personagens[tampersonagens].setActorName(HPpersonagens[8]);
        //
        boolean alive = Boolean.parseBoolean(HPpersonagens[9]);
        personagens[tampersonagens].setAlive(alive);
        //
        //data 11
        //
        int anonascimento = Integer.parseInt(HPpersonagens[12]);
        personagens[tampersonagens].setYearOfBirth(anonascimento);
        //
        personagens[tampersonagens].setEyeColour(HPpersonagens[13]);
        //
        personagens[tampersonagens].setGender(HPpersonagens[14]);
        //
        personagens[tampersonagens].setHairColour(HPpersonagens[15]);
        //
        boolean wizard = Boolean.parseBoolean(HPpersonagens[16]);
        personagens[tampersonagens].setWizard(wizard);
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
    public static void imprimir(){
        System.out.println("["+
        personagens[tampersonagens].getId()+" ## "+
        personagens[tampersonagens].getName()+" ## "+
        personagens[tampersonagens].getAlternate_names()+" ## "+
        personagens[tampersonagens].getHouse()+" ## "+ 
        personagens[tampersonagens].getAncestry()+" ## "+ 
        personagens[tampersonagens].getPatronus()+" ## "+
        personagens[tampersonagens].getHogwartsStaff()+" ## " +
        personagens[tampersonagens].getHogwartsStudent()+
        personagens[tampersonagens].getHogwartsStaff()+" ## "+
        personagens[tampersonagens].getActorName()+" ## " +
        personagens[tampersonagens].getAlive()+" ## " +
        personagens[tampersonagens].getDateOfBirth()+" ## " +
        personagens[tampersonagens].getYearOfBirth()+" ## " +
        personagens[tampersonagens].getEyeColour()+" ## " +
        personagens[tampersonagens].getGender()+" ## " +
        personagens[tampersonagens].getHairColour()+" ## " +
        personagens[tampersonagens].getWizard()+
        "]");
    }
}

public class Questao1 extends Personagem{

    public static void main(String[] args) throws Exception {
        
        String IdsPersonagens = "";
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        IdsPersonagens = entrada.readLine();
        System.out.println(IdsPersonagens);
        while(IdsPersonagens.equals("FIM") != true){
            personagens[tampersonagens] = new Personagem();
            TratarString(ler(IdsPersonagens));
            imprimir();
            tampersonagens += 1;
            IdsPersonagens = entrada.readLine();
        }
    }
}