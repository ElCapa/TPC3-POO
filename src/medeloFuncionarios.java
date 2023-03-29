public class medeloFuncionarios {
    public static class Funcionario {
        String nome;
        String departamento;
        double salario;
        Data  dataEntradaBanco = new Data();
        String RG;

        static class Data {
           static int dia;
           static int mes;
           static int ano;
        }

        public void recebeAumento(double aumento) {
            this.salario += aumento;
        }

        public double calculaGanhoAnual() {
            return this.salario * 12;
        }

        void mostra() {
            System.out.println("Nome: " + this.nome);
            System.out.println("Departamento: " + this.departamento);
            System.out.println("Salário: " + this.salario);
            System.out.println("Data de entrada: " + this.dataEntradaBanco.dia + "/" + this.dataEntradaBanco.mes + "/" + this.dataEntradaBanco.ano);
            System.out.println("RG: " + this.RG);
            System.out.println("Ganho anual: " + this.calculaGanhoAnual());
        }
    }
}
