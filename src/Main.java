import java.util.Scanner;

public class Main {
    static Service service =Service.getInstance();//Singleton(APENAS UMA INSTÂNCIA)
     public static void main(String[] args) {
        if(args.length>0 && args[0].equals("test")){
            Test();
            return;
        }
        int op ; 
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1-Cadastrar produto");
            System.out.println("2-Listar todos os produtos");
            System.out.println("3-Sair");
          
            System.out.print("Escolha sua opção:");
            op = sc.nextInt();
            switch (op) {
                case 1-> cadastrar(sc);
                case 2->listar();
                
                case 3->System.out.println("Programa encerrado");
                
                   default-> System.out.println("opção inválida"); 
                  
            }
        } while (op !=3);
        sc.close();
     }
     public static void cadastrar(Scanner sc){sc.nextLine();
        System.out.print("ID do produto:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome do produto:");
        String nome = sc.nextLine();
        System.out.print("Quantidade do produto:");
        int quantidade = sc.nextInt();
        Produto  produtos = Produto.builder().id(id).nome(nome).quantidade(quantidade).build();
        service.Cadastrar(produtos);
        
     }
     public static void listar(){
        for (Produto p: service.listar()) {
            System.out.println(p);
        }
     }
     public static void Test(){
         Produto  produtos = Produto.builder().id(1).nome("Uva").quantidade(25).build();
         service.Cadastrar(produtos);
          
         for (Produto p: service.listar()) {
            System.out.println(p);
        }
     }





}