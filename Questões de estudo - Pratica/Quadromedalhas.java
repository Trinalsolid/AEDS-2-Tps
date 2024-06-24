import java.util.*;

class Pais {
    String nome;
    int ouro, prata, bronze;
    
    public Pais(String nome, int ouro, int prata, int bronze) {
        this.nome = nome;
        this.ouro = ouro;
        this.prata = prata;
        this.bronze = bronze;
    }
}

class MedalhasComparator implements Comparator<Pais> {
    public int compare(Pais a, Pais b) {
        if (a.ouro != b.ouro) {
            return b.ouro - a.ouro;
        } else if (a.prata != b.prata) {
            return b.prata - a.prata;
        } else if (a.bronze != b.bronze) {
            return b.bronze - a.bronze;
        } else {
            return a.nome.compareTo(b.nome);
        }
    }
}

public class Quadromedalhas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        List<Pais> paises = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();
            String[] partes = linha.split(" ");
            String nome = partes[0];
            int ouro = Integer.parseInt(partes[1]);
            int prata = Integer.parseInt(partes[2]);
            int bronze = Integer.parseInt(partes[3]);
            paises.add(new Pais(nome, ouro, prata, bronze));
        }
        
        Collections.sort(paises, new MedalhasComparator());
        
        for (int i = 0; i < paises.size(); i++) {
            Pais pais = paises.get(i);
            System.out.println(pais.nome + " " + pais.ouro + " " + pais.prata + " " + pais.bronze);
        }
        
        scanner.close();
    }
}