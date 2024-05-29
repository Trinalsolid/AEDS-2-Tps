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

class Celula {
	public Personagem elemento; // Elemento inserido na celula.
	public Celula prox; // Aponta a celula prox.


	/**
	 * Construtor da classe.
	 */
	public Celula() {
		
	}

	/**
	 * Construtor da classe.
	 * @param elemento Personagem inserido na celula.
	 */
	public Celula(Personagem elemento) {
      this.elemento = elemento;
      this.prox = null;
	}
}

class Pilha {
	private Celula topo;

	public Pilha() {
		topo = null;
	}

	public void inserir(Personagem x) {
		Celula tmp = new Celula(x);
		tmp.prox = topo;
		topo = tmp;
		tmp = null;
	}

	public Personagem remover() throws Exception {
		if (topo == null) {
			throw new Exception("Erro ao remover!");
		}
		Personagem resp = topo.elemento;
		Celula tmp = topo;
		topo = topo.prox;
		tmp.prox = null;
		tmp = null;
		return resp;
	}

	public void mostrar() {
        int k=0;
        System.out.print("[ " + "Top" + " ]\n");
        for (Celula i = topo; i != null; i = i.prox , k++) {
            System.out.print("[" + k + " ## ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

            System.out.print(i.elemento.getId()+" ## "+i.elemento.getName()+" ## ");
            String[] alternateNames = i.elemento.getAlternate_names();
            System.out.print("{");
            for (int j = 0; j < alternateNames.length; j++) {
                System.out.print(alternateNames[j]);
                if (j < alternateNames.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("} ## "+i.elemento.getHouse()+
            " ## "+ i.elemento.getAncestry()+" ## "+ i.elemento.getSpecies()+" ## "+i.elemento.getPatronus()+
            " ## " +i.elemento.getHogwartsStaff()+" ## " +i.elemento.getHogwartsStudent()+" ## " +i.elemento.getActorName()+
            " ## " +i.elemento.getAlive()+" ## " + sdf.format(i.elemento.getDateOfBirth())+" ## " +i.elemento.getYearOfBirth()+
            " ## " +i.elemento.getEyeColour()+" ## " +i.elemento.getGender()+" ## " +i.elemento.getHairColour()+
            " ## " +i.elemento.getWizard()+"]\n");
		}
        System.out.print("[ " + "Bottom " + " ]");
	}

	public void mostraPilha() {
		mostraPilha(topo);
	}

	private void mostraPilha(Celula i) {
		if (i != null) {
			mostraPilha(i.prox);
			System.out.println("" + i.elemento);
		}
	}

}

public class Questao6{
    public static Pilha pilha = new Pilha();
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
        int cont = 0;
        String entrada = "";
        String opcode = ids.readLine();

        while(cont < Integer.parseInt(opcode)){
            entrada = ids.readLine();

            String[] caso = entrada.split(" ");
            // INSERCOES NA PILHA
            if(caso[0].charAt(0)=='I'){
                // Insere fim OU empilha 
                personagens = new Personagem();
                TratarString(ler(caso[1]));

                pilha.inserir(personagens);
            }
            // REMOCEOS NA PILHA
            if(caso[0].charAt(0)=='R'){
                // Remove fim OU desempilha
                Personagem tmp = pilha.remover();
                System.out.println("(R) "+ tmp.getName());
            }
            cont++;
        }
    }

    public static void main(String[] args) throws Exception {

        String IdsPersonagens = "";
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        IdsPersonagens = entrada.readLine();
        while(IdsPersonagens.equals("FIM") != true){
            personagens = new Personagem();
            TratarString(ler(IdsPersonagens));
            pilha.inserir(personagens);
            IdsPersonagens = entrada.readLine();
        }
        
        // SEGUNDA PARTE DE ENTRADA COM OPCODE
        OpCode(entrada);
        pilha.mostrar();
    }
}
