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
    public Personagem elemento; // Conteudo do no.
    public No esq, dir;  // Filhos da esq e dir.

    /**
     * Construtor da classe.
     * @param elemento Conteudo do no.
     */
    public No(Personagem elemento) {
        this(elemento, null, null);
    }

    /**
     * Construtor da classe.
     * @param elemento Conteudo do no.
     * @param esq No da esquerda.
     * @param dir No da direita.
     */
    public No(Personagem elemento, No esq, No dir) {
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
    }
}

class ArvoreBinaria {
	private No raiz; // Raiz da arvore.

	/**
	 * Construtor da classe.
	 */
	public ArvoreBinaria() {
		raiz = null;
	}

	/**
	 * Metodo publico iterativo para pesquisar elemento.
	 * @param x Elemento que sera procurado.
	 * @return <code>true</code> se o elemento existir,
	 * <code>false</code> em caso contrario.
	 */
	public boolean pesquisar(String x) {
        System.out.print(x +" => raiz ");
		return pesquisar(x, raiz);
	}

	/**
	 * Metodo privado recursivo para pesquisar elemento.
	 * @param x Elemento que sera procurado.
	 * @param i No em analise.
	 * @return <code>true</code> se o elemento existir,
	 * <code>false</code> em caso contrario.
	 */
	private boolean pesquisar(String x, No i) {
        boolean resp;
        if (i == null) {
            questao1.contador++;
            resp = false;
        }else if (x.compareTo(i.elemento.getName()) == 0) {
            questao1.contador++;
            resp = true;
        }else if ( x.compareTo(i.elemento.getName()) < 0 ) {
            questao1.contador++;
            MyIO.print("esq "); 
            resp = pesquisar(x, i.esq);
        }else {
            questao1.contador++;
            MyIO.print("dir "); 
            resp = pesquisar(x, i.dir);
        }
        return resp;
	}

	/**
	 * Metodo publico iterativo para exibir elementos.
	 */
	public void caminharCentral() {
		System.out.print("[ ");
		caminharCentral(raiz);
		System.out.println("]");
	}

	/**
	 * Metodo privado recursivo para exibir elementos.
	 * @param i No em analise.
	 */
	private void caminharCentral(No i) {
		if (i != null) {
			caminharCentral(i.esq); // Elementos da esquerda.
			System.out.print(i.elemento+ " "); // Conteudo do no.
			caminharCentral(i.dir); // Elementos da direita.
		}
	}

	/**
	 * Metodo publico iterativo para exibir elementos.
	 */
	public void caminharPre() {
		System.out.print("[ ");
		caminharPre(raiz);
		System.out.println("]");
	}

	/**
	 * Metodo privado recursivo para exibir elementos.
	 * @param i No em analise.
	 */
	private void caminharPre(No i) {
		if (i != null) {
			System.out.print(i.elemento + " "); // Conteudo do no.
			caminharPre(i.esq); // Elementos da esquerda.
			caminharPre(i.dir); // Elementos da direita.
		}
	}

	/**
	 * Metodo publico iterativo para exibir elementos.
	 */
	public void caminharPos() {
		System.out.print("[ ");
		caminharPos(raiz);
		System.out.println("]");
	}

	/**
	 * Metodo privado recursivo para exibir elementos.
	 * @param i No em analise.
	 */
	private void caminharPos(No i) {
		if (i != null) {
			caminharPos(i.esq); // Elementos da esquerda.
			caminharPos(i.dir); // Elementos da direita.
			System.out.print(i.elemento + " "); // Conteudo do no.
		}
	}


	/**
	 * Metodo publico iterativo para inserir elemento.
	 * @param x Elemento a ser inserido.
	 * @throws Exception Se o elemento existir.
	 */
	public void inserir(Personagem x) throws Exception{
		raiz = inserir(x, raiz);
	}

	/**
	 * Metodo privado recursivo para inserir elemento.
	 * @param x Elemento a ser inserido.
	 * @param i No em analise.
	 * @return No em analise, alterado ou nao.
	 * @throws Exception Se o elemento existir.
	 */
	private No inserir(Personagem x, No i) throws Exception{
		if (i == null) {
            i = new No(x);
        }else if (x.getName().compareTo(i.elemento.getName()) < 0) {
            i.esq = inserir(x, i.esq);
        }else if (x.getName().compareTo(i.elemento.getName()) > 0) {
            i.dir = inserir(x, i.dir);
        }else {
            throw new Exception("Erro ao inserir!");
        }

        return i;
	}

	/**
	 * Metodo publico iterativo para remover elemento.
	 * @param x Elemento a ser removido.
	 * @throws Exception Se nao encontrar elemento.
	 */
	public void remover(String x) throws Exception {
		raiz = remover(x, raiz);
	}

	/**
	 * Metodo privado recursivo para remover elemento.
	 * @param x Elemento a ser removido.
	 * @param i No em analise.
	 * @return No em analise, alterado ou nao.
	 * @throws Exception Se nao encontrar elemento.
	 */
	private No remover(String x, No i) throws Exception {

		if (i == null) {
            throw new Exception("Erro ao remover!");
        } else if ( x.compareTo(i.elemento.getName()) < 0) {
            i.esq = remover(x, i.esq);
        } else if ( x.compareTo(i.elemento.getName()) > 0) {
            i.dir = remover(x, i.dir);
        // Sem no a direita.
        } else if (i.dir == null) {
            i = i.esq;
        // Sem no a esquerda.
        } else if (i.esq == null) {
            i = i.dir;
        // No a esquerda e no a direita.
        } else {
            i.esq = maiorEsq(i, i.esq);
        }

		return i;
	}

	/**
	 * Metodo para trocar o elemento "removido" pelo maior da esquerda.
	 * @param i No que teve o elemento removido.
	 * @param j No da subarvore esquerda.
	 * @return No em analise, alterado ou nao.
	 */
	private No maiorEsq(No i, No j) {
      // Encontrou o maximo da subarvore esquerda.
		if (j.dir == null) {
			i.elemento = j.elemento; // Substitui i por j.
			j = j.esq; // Substitui j por j.ESQ.
            // Existe no a direita.
		} else {
         // Caminha para direita.
			j.dir = maiorEsq(i, j.dir);
		}
		return j;
	}

	/**
	 * Metodo que retorna a altura da árvore
	 * @return int altura da árvore
	 */
    public int getAltura(){
        return getAltura(raiz, 0);
    }

	/**
	 * Metodo que retorna a altura da árvore
	 * @return int altura da árvore
	 */
   public int getAltura(No i, int altura){
      if(i == null){
         altura--;
      } else {
         int alturaEsq = getAltura(i.esq, altura + 1);
         int alturaDir = getAltura(i.dir, altura + 1);
         altura = (alturaEsq > alturaDir) ? alturaEsq : alturaDir;
      }
      return altura;
   }


	/**
	 * Metodo publico iterativo para remover elemento.
	 * @param x Elemento a ser removido.
	 * @throws Exception Se nao encontrar elemento.
	 */
	public void remover2(Personagem x) throws Exception {
        if (raiz == null) {
            throw new Exception("Erro ao remover2!");
        } else if(x.getName().compareTo(raiz.elemento.getName()) < 0){
            remover2(x, raiz.esq, raiz);
        } else if (x.getName().compareTo(raiz.elemento.getName()) > 0){
            remover2(x, raiz.dir, raiz);
        } else if (raiz.dir == null) {
            raiz = raiz.esq;
        } else if (raiz.esq == null) {
            raiz = raiz.dir;
        } else {
            raiz.esq = maiorEsq(raiz, raiz.esq);
        }
    }

	/**
	 * Metodo privado recursivo para remover elemento.
	 * @param x Elemento a ser removido.
	 * @param i No em analise.
	 * @param pai do No em analise.
	 * @throws Exception Se nao encontrar elemento.
	 */
	private void remover2(Personagem x, No i, No pai) throws Exception {
		if (i == null) {
            throw new Exception("Erro ao remover2!");
        } else if (x.getName().compareTo(i.elemento.getName()) < 0) {
            remover2(x, i.esq, i);
        } else if (x.getName().compareTo(i.elemento.getName()) > 0) {
            remover2(x, i.dir, i);
        } else if (i.dir == null) {
            pai = i.esq;
        } else if (i.esq == null) {
            pai = i.dir;
        } else {
            i.esq = maiorEsq(i, i.esq);
		}
	}

    public Personagem getRaiz() throws Exception {
        return raiz.elemento;
    }

    public static boolean igual (ArvoreBinaria a1, ArvoreBinaria a2){
        return igual(a1.raiz, a2.raiz);
    }

    private static boolean igual (No i1, No i2){
        boolean resp;
        if(i1 != null && i2 != null){
            resp = (i1.elemento == i2.elemento) && igual(i1.esq, i2.esq) && igual(i1.dir, i2.dir);
        } else if(i1 == null && i2 == null){
            resp = true;
        } else {
            resp = false; 
        }
        return resp;
    }
}

public class questao1{

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

        ArvoreBinaria arvoreB = new ArvoreBinaria();
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
            arvoreB.inserir(personagens[i]);
        }

        // SEGUNDA PARTE DA ENTRADA

        String NomePersonagem = "";
        boolean saida = false;
        NomePersonagem = entrada.readLine();

        while(NomePersonagem.equals("FIM") != true){
            saida = arvoreB.pesquisar(NomePersonagem);
            if(saida == false){
                System.out.println("NAO");
            }else{
                System.out.println("SIM"); 
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
