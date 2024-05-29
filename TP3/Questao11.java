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

class CelulaDupla {
	public Personagem elemento;
	public CelulaDupla ant;
	public CelulaDupla prox;

	/**
	 * Construtor da classe.
	 */
	public CelulaDupla() {
	}


	/**
	 * Construtor da classe.
	 * @param elemento int inserido na celula.
	 */
	public CelulaDupla(Personagem elemento) {
		this.elemento = elemento;
		this.ant = this.prox = null;
	}
}

class ListaDupla {
	private CelulaDupla primeiro;
	private CelulaDupla ultimo;


	/**
	 * Construtor da classe que cria uma lista dupla sem elementos (somente no cabeca).
	 */
	public ListaDupla() {
		primeiro = new CelulaDupla();
		ultimo = primeiro;
	}


	/**
	 * Insere um elemento na primeira posicao da lista.
    * @param x int elemento a ser inserido.
	 */
	public void inserirInicio(Personagem x) {
		CelulaDupla tmp = new CelulaDupla(x);

        tmp.ant = primeiro;
        tmp.prox = primeiro.prox;
        primeiro.prox = tmp;
        if(primeiro == ultimo){
            ultimo = tmp;
        }else{
            tmp.prox.ant = tmp;
        }
        tmp = null;
	}


	/**
	 * Insere um elemento na ultima posicao da lista.
    * @param x int elemento a ser inserido.
	 */
	public void inserirFim(Personagem x) {
		ultimo.prox = new CelulaDupla(x);
        ultimo.prox.ant = ultimo;
		ultimo = ultimo.prox;
	}


	/**
	 * Remove um elemento da primeira posicao da lista.
    * @return resp int elemento a ser removido.
	 * @throws Exception Se a lista nao contiver elementos.
	 */
	public Personagem removerInicio() throws Exception {
		if (primeiro == ultimo) {
			throw new Exception("Erro ao remover (vazia)!");
		}

        CelulaDupla tmp = primeiro;
		primeiro = primeiro.prox;
		Personagem resp = primeiro.elemento;
        tmp.prox = primeiro.ant = null;
        tmp = null;
		return resp;
	}


	/**
	 * Remove um elemento da ultima posicao da lista.
    * @return resp int elemento a ser removido.
	 * @throws Exception Se a lista nao contiver elementos.
	 */
	public Personagem removerFim() throws Exception {
		if (primeiro == ultimo) {
			throw new Exception("Erro ao remover (vazia)!");
		} 
        Personagem resp = ultimo.elemento;
        ultimo = ultimo.ant;
        ultimo.prox.ant = null;
        ultimo.prox = null;
		return resp;
	}


	/**
    * Insere um elemento em uma posicao especifica considerando que o 
    * primeiro elemento valido esta na posicao 0.
    * @param x int elemento a ser inserido.
	 * @param pos int posicao da insercao.
	 * @throws Exception Se <code>posicao</code> invalida.
	 */
    public void inserir(Personagem x, int pos) throws Exception {

        int tamanho = tamanho();

        if(pos < 0 || pos > tamanho){
            throw new Exception("Erro ao inserir posicao (" + pos + " / tamanho = " + tamanho + ") invalida!");
        } else if (pos == 0){
            inserirInicio(x);
        } else if (pos == tamanho){
            inserirFim(x);
        } else {
            // Caminhar ate a posicao anterior a insercao
            CelulaDupla i = primeiro;
            for(int j = 0; j < pos; j++, i = i.prox);
            
            CelulaDupla tmp = new CelulaDupla(x);
            tmp.ant = i;
            tmp.prox = i.prox;
            tmp.ant.prox = tmp.prox.ant = tmp;
            tmp = i = null;
        }
    }


	/**
    * Remove um elemento de uma posicao especifica da lista
    * considerando que o primeiro elemento valido esta na posicao 0.
	 * @param posicao Meio da remocao.
    * @return resp int elemento a ser removido.
	 * @throws Exception Se <code>posicao</code> invalida.
	 */
	public Personagem remover(int pos) throws Exception {
        Personagem resp;
        int tamanho = tamanho();

        if (primeiro == ultimo){
            throw new Exception("Erro ao remover (vazia)!");

        } else if(pos < 0 || pos >= tamanho){
            throw new Exception("Erro ao remover (posicao " + pos + " / " + tamanho + " invalida!");
        } else if (pos == 0){
            resp = removerInicio();
        } else if (pos == tamanho - 1){
            resp = removerFim();
        } else {
            // Caminhar ate a posicao anterior a insercao
            CelulaDupla i = primeiro.prox;
            for(int j = 0; j < pos; j++, i = i.prox);
            
            i.ant.prox = i.prox;
            i.prox.ant = i.ant;
            resp = i.elemento;
            i.prox = i.ant = null;
            i = null;
        }

		return resp;
	}


	/**
	 * Mostra os elementos da lista separados por espacos.
	 */
	public void mostrar() {	
        for (CelulaDupla i = primeiro.prox; i != null; i = i.prox) {
            System.out.print("["); // Comeca a mostrar.
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
		
	}

	/**
	 * Mostra os elementos da lista de forma invertida 
    * e separados por espacos.
	 */
	public void mostrarInverso() {
		System.out.print("[ ");
		for (CelulaDupla i = ultimo; i != primeiro; i = i.ant){
			System.out.print(i.elemento + " ");
        }
		System.out.println("] "); // Termina de mostrar.
	}

    public int tamanho() {
      int tamanho = 0; 
      for(CelulaDupla i = primeiro; i != ultimo; i = i.prox, tamanho++);
      return tamanho;
    }

    public void quickSort() {
        quicksort(0, tamanho()-1);
    }

    public CelulaDupla getPosCelula(int pos){
        int tmp = 0;
        CelulaDupla i;
        for( i = primeiro.prox; tmp < pos ; i = i.prox, tmp++);
        return i;
    }

    private void quicksort(int esq, int dir) {
        int i = esq, j = dir;
        Personagem pivo = getPosCelula((esq + dir)/2 ).elemento;
        while (i <= j) {
            CelulaDupla aux = getPosCelula(i);
            while ((aux.elemento.getHouse().compareTo(pivo.getHouse()) < 0) || ((aux.elemento.getHouse().compareTo(pivo.getHouse()) == 0) 
                && (aux.elemento.getName().compareTo(pivo.getName()) < 0))){
                i++;
                aux = aux.prox;
            }
            CelulaDupla temp = getPosCelula(j);
            while ((temp.elemento.getHouse().compareTo(pivo.getHouse()) > 0) || ((temp.elemento.getHouse().compareTo(pivo.getHouse()) == 0) 
                && (temp.elemento.getName().compareTo(pivo.getName()) > 0))){
                j--;
                temp = temp.ant;
            }

            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (esq < j) {
            quicksort(esq, j);
        }
        if (i < dir) {
            quicksort(i, dir);
        }

    }

    public void swap(int i, int primeiro) {
        Personagem aux = getPosCelula(i).elemento;
        getPosCelula(i).elemento = getPosCelula(primeiro).elemento;
        getPosCelula(primeiro).elemento = aux;
    }

}

public class Questao11{
    public static ListaDupla listadupla = new ListaDupla();
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

    public static void main(String[] args) throws Exception {

        String IdsPersonagens = "";
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        IdsPersonagens = entrada.readLine();
        while(IdsPersonagens.equals("FIM") != true){
            personagens = new Personagem();
            TratarString(ler(IdsPersonagens));
            listadupla.inserirFim(personagens);
            IdsPersonagens = entrada.readLine();
        }
        
        // SEGUNDA PARTE DE ENTRADA COM OPCODE
        listadupla.quickSort();
        listadupla.mostrar();
    }
}
