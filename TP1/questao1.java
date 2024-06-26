class questao1{
    public static boolean isFim(String s){
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    static boolean isPalindromo(String s){
        
        int length = s.length();

        if (length < 2){
            return true;
        }else {
            if(s.charAt(0) != s.charAt(length - 1)){
                return false;
            }else{
                return isPalindromo(s.substring(1, length - 1));
            }
        }
    }

    public static void main(String[] args) {

        String[] entrada = new String[1000];

        do{
            entrada[0] = MyIO.readLine();
            if(isPalindromo(entrada[0])){
                System.out.println("SIM");
            }else{
                System.out.println("NAO");
            }
        } while (isFim(entrada[0]) == false);
 
    }
}
