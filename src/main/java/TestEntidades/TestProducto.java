package TestEntidades;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TblCategoria;
import model.TblProducto;
public class TestProducto {

	public static void main(String[] args) {
		//establecer conexion con la unidad de persistencia..
				EntityManagerFactory facto=Persistence.createEntityManagerFactory("BDAutoJPA");
				//manejador de entidades...
				EntityManager eman=facto.createEntityManager();
				//procesos : registrar ,actualizar,listar,etc...
				//iniciamos transaccion...
				eman.getTransaction().begin();
				//instanciamos las respectivas entidades..
				TblCategoria tblcat=new TblCategoria();
				TblProducto tblprod=new TblProducto();
				
				//***************registrar....
				/*tblcat.setNomcateg("Proteinas Ganadoras ");
				tblcat.setDescrip("producto para masa muscular");
				
				//****ingresamos datos a la tabla producto...
				tblprod.setNomprod("BIGM");
				tblprod.setPrecio(120);
				Date fech=new Date();
				Date fechasql=new Date(fech.getTime());
				tblprod.setFechavencimiento(fechasql);
				tblprod.setCodbarras("7772");
				tblprod.setNrLote("L3333");
				//asignamos el objeto tblcat
				tblprod.setTblCategoria(tblcat);
				eman.persist(tblprod);
				//emitimos mensaje por pantalla
				System.out.println("Dato Registrado");
				//confirmamos
				eman.getTransaction().commit();
				//cerramos
				eman.close();*/
/******************************************************************************************************************/	
		//******************actualizar

				tblcat.setIdcategoria(1);
				tblcat.setNomcateg("Proteinas Ganadoras");
				tblcat.setDescrip("producto para masa muscular");
				tblprod.setIdproducto(1);
				tblprod.setNomprod("Whey Pro");
				tblprod.setPrecio(80);
				Date fech=new Date();
				Date fechasql=new Date(fech.getTime());
				tblprod.setFechavencimiento(fechasql);
				tblprod.setCodbarras("77557");
				tblprod.setNrLote("L33333");
				tblprod.setTblCategoria(tblcat);
				eman.merge(tblprod);
				System.out.println("Dato Actualizado");
				//confirmamos
				eman.getTransaction().commit();
				//cerramos
				eman.close();
				
				
				

		
		
		
		
	}/*fin del metodo*/

}/*fin de la clase*/
