public class NomeCompleto {
    public static void main (String[] args) {

        String primeiroNome = "Xereca";
        String segundoNome = "Peluda";
        String ultimoNome = "Silva";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome,ultimoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome, String ultimoNome) {
        return primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(ultimoNome);
    }

}
