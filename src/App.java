public class App {
    public static void main(String[] args) throws Exception {
        // Corpo_Humano c1 = new Corpo_Humano();
        // c1.setMassa(80);
        // c1.setVolume(10);
        // c1.calculardensidade();
        // System.out.println(c1.getDensidade());

        ContaBancaria cb=new ContaBancaria();

        cb.setTitular("chico");

        cb.depositar(500);
        System.out.println("O saldo ë: "+cb.getSaldo());
        
        cb.depositar(500);
        System.out.println("O saldo ë: "+cb.getSaldo());
    }
}
