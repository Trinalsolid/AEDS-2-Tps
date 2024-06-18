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

class No {
	public int elemento; 
	public No esq, dir;
	public No2 outro;
	
	public No(int elemento) { 
	   this.elemento = elemento;
	   this.esq = this.dir = null;
	   this.outro = null;
	}
 
	public No(int elemento, No esq, No dir,No2 outro) {
	   this.elemento = elemento;
	   this.esq = esq;
	   this.dir = dir;
	   this.outro = outro;
	}
	
}
 
class No2 {
	public String elemento; 
	public No2 esq; 
	public No2 dir; 
 
	No2(String elemento) {
	   this.elemento = elemento;
	   this.esq = this.dir = null;
	}
 
	No2(String elemento, No2 esq, No2 dir) {
	   this.elemento = elemento;
	   this.esq = esq;
	   this.dir = dir;
	}
}
 
class ArvoreArvore {
	private No raiz; // Raiz da arvore.
 
	public ArvoreArvore() throws Exception {
	    raiz = null;
        // insercao na primeira arvore dos elementos 7, 3, 11, 1, 5, 9, 13, 0, 2, 4, 6, 8, 10, 12 e 14.
        inserir(7);
        inserir(3);
        inserir(11);
        inserir(1);
        inserir(5);
        inserir(9);
        inserir(12);
        inserir(0);
        inserir(2);
        inserir(4);
        inserir(6);
        inserir(8);
        inserir(10);
        inserir(13);
        inserir(14);
	}
	
    public void inserir(int x) throws Exception {
	   raiz = inserir(x, raiz);
	}
 
	private No inserir(int x, No i) throws Exception {
        if (i == null) {
            i = new No(x);  
        } else if (x <i.elemento ){
            i.esq = inserir(x, i.esq);
        }else if (x > i.elemento ){
            i.dir = inserir(x, i.dir);
        }else {
            throw new Exception("Erro ao inserir!");
        }
        return i;
	}
	
	public boolean pesquisar(String x){
        if(raiz != null){
            System.out.print(x + "=> raiz");
	    }
        return pesquisar(x,raiz);
	} 
    
	private boolean pesquisar(String x,No i){
        boolean resp= false;
        if(i != null){    
            resp=pesquisar2(x,i.outro);
            if(resp == false){ 
                System.out.print("-> esq");
                resp= pesquisar(x,i.esq);
            }
            if(resp == false){ 
                System.out.print("-> dir");
                resp=pesquisar(x,i.dir);
            }
        }
	    return resp;
	}
 
	private boolean pesquisar2(String x, No2 i) {
        boolean resp= false;
        if(i != null){
            if (x.compareTo(i.elemento)==0) {
                resp = true;
            } else{
                System.out.print(" ESQ");
                resp = pesquisar2(x, i.esq);
            
                if(resp == false){
                    System.out.print(" DIR");
                    resp = pesquisar2(x, i.dir);
                }
            }
        }
        return resp;
	}

	public void InserirArvore2(String entrada , int y) throws Exception {
	   inserir2(entrada ,y ,raiz);
	}

	private void inserir2(String entrada , int y, No i) throws Exception {
        if (i.elemento == y) {
            i.outro = inserir3(entrada,i.outro);
        } else if (y < i.elemento ){
            inserir2(entrada,y,i.esq);
        } else if (y > i.elemento ){
            inserir2(entrada,y,i.dir);
        } else {
            throw new Exception("Erro ao inserir!");
        }
	}
   
	private No2 inserir3(String entrada, No2 i)throws Exception{
        if(i == null ){
            i = new No2(entrada);
        }else if(entrada.compareTo(i.elemento)<0){
            i.esq=inserir3(entrada,i.esq);
        }else if(entrada.compareTo(i.elemento)>0)
            i.dir=inserir3(entrada,i.dir);
        else {
            throw new Exception("Erro ao inserir!");
        }

        return i;
	}
}

public class questao2{

    public static Personagem[] personagens = new Personagem[1000];
    public static int tampersonagens = 0;
    public static int contador = 0;

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
        personagens[tampersonagens].setId(HPpersonagens[0]);
        // Nome do Personagem
        personagens[tampersonagens].setName(HPpersonagens[1]);
        // Alternate_names do Personagem
        int inicio = HPpersonagens[2].indexOf('[');
        int fim = HPpersonagens[2].indexOf(']');
        if (inicio != -1 && fim != -1 && fim > inicio) {
            String alternateNames = HPpersonagens[2].substring(inicio + 1, fim);
            alternateNames = alternateNames.replaceAll("'", "");
            personagens[tampersonagens].setAlternate_names(alternateNames.split(","));
        }
        // House do Personagem
        if (!HPpersonagens[3].equals("[]")) {
            personagens[tampersonagens].setHouse(HPpersonagens[3]);
        } else {
            personagens[tampersonagens].setHouse("");
        }
        // Ancestry do Personagem
        if (!HPpersonagens[4].equals("[]")) {
            personagens[tampersonagens].setAncestry(HPpersonagens[4]);
        } else {
            personagens[tampersonagens].setAncestry("");
        }
        // Species do Personagem
        if (!HPpersonagens[5].equals("[]")) {
            personagens[tampersonagens].setSpecies(HPpersonagens[5]);
        } else {
            personagens[tampersonagens].setSpecies("");
        }
        // Patronous do Personagem
        if (!HPpersonagens[6].equals("[]")) {
            personagens[tampersonagens].setPatronus(HPpersonagens[6]);
        } else {
            personagens[tampersonagens].setPatronus("");
        }
        // HogwartsStaff do Personagem
        boolean hogwartsStaff = Boolean.parseBoolean(HPpersonagens[7]);
        personagens[tampersonagens].setHogwartsStaff(hogwartsStaff);
        // Hogwartstudent do Personagem
        boolean hogwartsStudent = Boolean.parseBoolean(HPpersonagens[8]);
        personagens[tampersonagens].setHogwartsStudent(hogwartsStudent);
        // Ator do Personagem
        personagens[tampersonagens].setActorName(HPpersonagens[9]);
        // Personagem Alive
        boolean alive = Boolean.parseBoolean(HPpersonagens[10]);
        personagens[tampersonagens].setAlive(alive);
        // Date of birth do Personagem
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        if (!HPpersonagens[12].equals("[]")) {
            try {
                Date dataNascimento = sdf.parse(HPpersonagens[12]);
                personagens[tampersonagens].setDateOfBirth(dataNascimento);
            } catch (ParseException e) {
                personagens[tampersonagens].setDateOfBirth(new Date());
            }
        } else {
            personagens[tampersonagens].setDateOfBirth(new Date());
        }
        // Year of birth do Personagem
        int anonascimento = Integer.parseInt(HPpersonagens[13]);
        personagens[tampersonagens].setYearOfBirth(anonascimento);
        // Eye Colour do Personagem
        if (!HPpersonagens[14].equals("[]")) {
            personagens[tampersonagens].setEyeColour(HPpersonagens[14]);
        } else {
            personagens[tampersonagens].setEyeColour("");
        }
        // Gender do Personagem
        if (!HPpersonagens[15].equals("[]")) {
            personagens[tampersonagens].setGender(HPpersonagens[15]);
        } else {
            personagens[tampersonagens].setGender("");
        }
        // Hair Colour do Personagem
        if (!HPpersonagens[16].equals("[]")) {
            personagens[tampersonagens].setHairColour(HPpersonagens[16]);
        } else {
            personagens[tampersonagens].setHairColour("");
        }
        // Wizard do Personagem
        boolean wizard = HPpersonagens[17].equalsIgnoreCase("verdadeiro");
        personagens[tampersonagens].setWizard(wizard);
    }

    public static void main(String[] args) throws Exception {

        //tempo inicial do código
        long tempoInicial = System.currentTimeMillis();
        //----------------------------------------------//

        ArvoreArvore arvore = new ArvoreArvore();
        String IdsPersonagens = "";
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        IdsPersonagens = entrada.readLine();
        while(IdsPersonagens.equals("FIM") != true){
            personagens[tampersonagens] = new Personagem();
            TratarString(ler(IdsPersonagens));
            tampersonagens++;
            IdsPersonagens = entrada.readLine();
        }
        for(int i =0 ; i < tampersonagens ; i++){
            int valor = personagens[i].getYearOfBirth()%15;
            arvore.InserirArvore2(personagens[i].getName(), valor);
        }
        
        // SEGUNDA PARTE DA LEITURA
        String NomePersonagem = "";
        boolean saida = false;
        NomePersonagem = entrada.readLine();

        while(NomePersonagem.equals("FIM") != true){
            saida = arvore.pesquisar(NomePersonagem);
            if(saida == false){
                System.out.println(" NAO");
            }else{
                System.out.println(" SIM"); 
            }
            NomePersonagem = entrada.readLine();
        }

        //arquivo de Matricula sequencial 
        long tempoFinal = System.currentTimeMillis();
        Arq.openWrite("matrícula_arvoreBinaria.txt");
        Arq.println("695161" + "\t" + (tempoFinal - tempoInicial) + "\t" + contador);
        Arq.close();
    } 
}
