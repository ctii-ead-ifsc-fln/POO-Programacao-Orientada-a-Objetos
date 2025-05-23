public class MainApp {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(1, "Alice");
        Funcionario funcionario2 = new Funcionario(2, "Bob");

        Departamento departamento = new Departamento("TI");
        departamento.adicionarFuncionario(funcionario1);
        departamento.adicionarFuncionario(funcionario2);

        System.out.println("Departamento: " + departamento.getNome());
        System.out.println("Funcionários: " + departamento.getFuncionarios().size());
        for (Funcionario f : departamento.getFuncionarios()) {
            System.out.println(f.getMatricula() + " - " + f.getNome());
        }
        System.out.println();
        
        //destruicao do departamento...
        departamento = null;
        
        //os funcionarios continuam existindo...
        System.out.println("Funcionario " + funcionario1.getMatricula() + " - " + funcionario1.getNome());
        System.out.println("Funcionario " + funcionario2.getMatricula() + " - " + funcionario2.getNome());
    }
}
