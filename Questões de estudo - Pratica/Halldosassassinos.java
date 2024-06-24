import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Assassinos{
    public String assassino;
    public String vitma;
    public int quantidade;

    public Assassinos(String assassino,String vitma,int quantidade){
        this.assassino = assassino;
        this.vitma = vitma;
        this.quantidade = quantidade;
    }
}

public class Halldosassassinos {

    public static void main(String[] args)throws Exception {

        Scanner entrada = new Scanner(System.in);
        String nomes;
        ArrayList<Assassinos> assassinos = new ArrayList<>();
        ArrayList<String> assassinados = new ArrayList<>();
        
        while (entrada.hasNext()) {
            nomes = entrada.nextLine();
            String[] separar = nomes.split(" ");
            assassinos.add(new Assassinos( separar[0] , separar[1] , 0+1));
            assassinados.add(separar[1]);
        }

        for(int i = 0 ; i < assassinados.size(); i++){
            for(int j = 0 ; j < assassinos.size(); j++){
                if (assassinados.get(i).equals(assassinos.get(j).assassino)) {
                    assassinos.remove(j);
                }
            }
        }

        for(int i = 0 ; i < assassinos.size(); i++){
            for(int j = i+1 ; j < assassinos.size(); j++){
                if (assassinos.get(i).assassino.equals(assassinos.get(j).assassino)) {
                    assassinos.get(i).quantidade++;
                    assassinos.remove(j);
                }
            }
        }

        Collections.sort(assassinos, new Comparator<Assassinos>() {
            public int compare(Assassinos a1, Assassinos a2) {
                return a1.assassino.compareTo(a2.assassino);
            }
        });

        System.out.println("HALL OF MURDERERS");
        for (Assassinos assassino : assassinos) {
            System.out.println(assassino.assassino +" " + assassino.quantidade );
        }
        
    }
}
