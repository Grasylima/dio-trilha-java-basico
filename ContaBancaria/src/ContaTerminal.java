public class ContaTerminal {
    public static void main(String[] args) {
        
        String agencia = args [0];
        String nomeCliente = args [1];
        int  numeroConta = Integer.parseInt(args[2]);
        double saldo = Double.parseDouble(args[3]);

        System.out.println (" Meu nome é " + nomeCliente);
        System.out.println (" Minha agencia é " + agencia + " " );
        System.out.println (" Numero da Conta é " + numeroConta + " " );
        System.out.println (" Meu saldo é " + saldo + " ");


    }
}
