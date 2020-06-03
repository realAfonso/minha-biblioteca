package repositorio;

import classes.DBConnection;
import classes.Livro;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 * @author manoel.neto
 */
public class RepositorioLivros {
    
    private static Connection conexao = DBConnection.openConnection();
    private static PreparedStatement sql;
    
    public static boolean adicoinar(Livro livro){
        boolean retorno = false;
        try{
            sql = conexao.prepareStatement(
                    "INSERT INTO livros (titulo,ano,editora,autor,tem,edicao,serie) VALUES ("
                            + "'" + livro.getTitulo() + "', "
                            + "'" + livro.getAno()+ "', "
                            + "'" + livro.getEditora()+ "', "
                            + "'" + livro.getAutor()+ "', "
                            + "'" + livro.getTem()+ "', "
                            + "'" + livro.getEdicao()+ "', "
                            + "'" + livro.getSerie()+ "')"
            );
            
            sql.executeUpdate();
            
            retorno = true;
            
        }catch(Exception e){
            retorno = false;
        } finally {
            DBConnection.closeConnection(conexao);
        }
        
        return retorno;
    }
    
    public static ArrayList<Livro> listar(){
        ArrayList<Livro> livros = new ArrayList<Livro>();
        try{
            sql = conexao.prepareStatement("SELECT * FROM livros");
            
            ResultSet rs = sql.executeQuery();
            
            while(rs.next()){
                livros.add(new Livro(
                        rs.getString("titulo"),
                        rs.getInt("ano"),
                        rs.getString("autor"),
                        rs.getString("editora"),
                        rs.getString("serie"),
                        rs.getString("edicao"),
                        rs.getInt("tem")
                ));
            }
            
        }catch(Exception e){
            livros = null;
        } finally {
            DBConnection.closeConnection(conexao);
        }
        
        return livros;
    }
}
