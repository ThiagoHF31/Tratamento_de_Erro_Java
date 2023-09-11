public class Main {
    public static void main(String[] args) {
        Carteira carteira = new Carteira(10);

        System.out.println("___________________");
        carteira.status();
        System.out.println();

        System.out.println("\033[33mTentativa de saque: \033[0m");
        System.out.println();
        try{

        carteira.sacar(200);

        }catch(Exception e){

            System.out.println("\033[31mNão deu pra sacar\033[0m");

        }
        carteira.status();
        System.out.println();

        System.out.println("Fazendo deposito!");
        carteira.deposito(1000);
        carteira.status();
        System.out.println();
    }
}
