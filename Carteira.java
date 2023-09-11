public class Carteira{
    private double salario;

    public Carteira(double salario){
        this.salario = salario;
    }

    public Carteira(int salario){
        this.salario = salario;
    }

    public Carteira(String salario){
        double val = Double.parseDouble(salario);
        try{
            this.salario = val;
        }catch(NumberFormatException abc){
            abc.printStackTrace();
            this.salario = 0.0;
        }
    }

    public void deposito(double valor){
        this.salario += valor;
    }

    public void sacar(double valor){
        if(salario < valor){
            throw new SaldoIsuficienteException ("Saldo Insuficiente para operação");
        }else{
            this.salario -= valor;
        }
    }

    public void status(){
        System.out.println("Você tem isso na conta "+salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}