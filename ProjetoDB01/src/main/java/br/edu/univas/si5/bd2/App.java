package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.entities.TipoCargo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        Cargo cargo = new Cargo();
        
        cargo.setCodigo(1);
        cargo.setNome("Tester");
        cargo.setSalario(5000f);
        cargo.setType(TipoCargo.CLT);
        
        EntityManager em;
        em = HibernateUtil.getEntityManager();
        
        // QUando inserir informação no banco, usar esses comandos para persistir o objeto
        em.getTransaction().begin();//inicia a transação
        em.persist(cargo);
        em.getTransaction().commit();//finaliza a transação
    }
    
    
}
