import java.util.ArrayList;
import java.util.List;

public class Service {
    private static Service instance;
    private static List<Produto> listadeProdutos;
    
    private Service(){
       listadeProdutos = new ArrayList<>();
    }
    public static Service getInstance(){
        if(instance == null){
            instance = new Service();

        }
        return instance;
    }
    public  Produto Cadastrar(Produto produtos){
        if(listadeProdutos.stream().anyMatch(p-> produtos.getId() == p.getId())){
            System.out.println("Produto já cadastrado!!");
            return null;
        }
        listadeProdutos.add(produtos);
        return produtos;
    }

    public List<Produto> listar(){
      
    return listadeProdutos;
    }
   
}
