public class TesteFuncionario {
    public static void main(String[] args) {
        medeloFuncionarios.Funcionario f1 = new medeloFuncionarios.Funcionario();

        f1.nome = "El Capa";
        f1.departamento = "Garena";
        f1.salario = 2000.0;
        f1.dataEntradaBanco = new medeloFuncionarios.Funcionario.Data();
        f1.dataEntradaBanco.dia = 1;
        f1.dataEntradaBanco.mes = 1;
        f1.dataEntradaBanco.ano = 2022;
        f1.RG = "123456789";



        f1.recebeAumento(500.0);

        f1.mostra();

        medeloFuncionarios.Funcionario f2 = new medeloFuncionarios.Funcionario();
        f2.nome = "Danilo";
        f2.salario = 100;

        medeloFuncionarios.Funcionario f3 = new medeloFuncionarios.Funcionario();
        f3.nome = "Danilo";
        f3.salario = 100;

        if (f2 == f3) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

        medeloFuncionarios.Funcionario f4 = new medeloFuncionarios.Funcionario();
        f4.nome = "Hugo";
        f4.salario = 100;
        medeloFuncionarios.Funcionario f5 = f4;


    }
}
