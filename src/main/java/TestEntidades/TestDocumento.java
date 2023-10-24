package TestEntidades;


import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TblDocumento;
import model.TblTipodocumento;



public class TestDocumento {

	public static void main(String[] args) {
		//establecemo conexion con la unidad de persistencia...
				EntityManagerFactory fabri=Persistence.createEntityManagerFactory("BDAutoJPA");
				//permite gestionar entidades..
				EntityManager eman=fabri.createEntityManager();
				//iniciar transaccion...
				eman.getTransaction().begin();
				//instanciar las respectivas entidades...
				TblTipodocumento tipodocu=new TblTipodocumento();
				TblDocumento docum=new TblDocumento();
				
				
/**********************************registrar****************************************************/
		/*		//ingresamos nuevos valores..
				tipodocu.setNomdocum("factura");
				tipodocu.setDescripdocum("comprobante de pago");
				eman.persist(tipodocu);
				docum.setNrodocument("011113");
				docum.setProvedocument("ULTIMATE NITRICION");
				docum.setRucdocument("15446444");
				Date fecha=new Date();
				Date fechasql=new Date();
				docum.setFecha(fechasql);
				docum.setDescridocument("10 Potes de creatuna UN");
				docum.setTblTipodocumento(tipodocu);
				eman.persist(docum);
				//emitimos un mensaje por consola
				System.out.println("Dato registrado");
				//confirmamos
				eman.getTransaction().commit();
				//cerramos
				eman.close();*/
		
		
/**********************************Actualizar****************************************************/

			/*	tipodocu.setIdtipodocum(3);
				tipodocu.setNomdocum("otros");
				tipodocu.setDescripdocum("para llevar solo control de ingreso");
				eman.merge(tipodocu);
				docum.setIddocument(3);
				docum.setNrodocument("555444");
				docum.setProvedocument("distribuidora Champiñones");
				docum.setRucdocument("202457895");
				Date fecha=new Date();
				Date fechaact=new Date(fecha.getTime());
				docum.setFecha(fechaact);
				docum.setDescridocument("comprobante de control");
				docum.setTblTipodocumento(tipodocu);
				eman.merge(docum);
				//emitimos mensaje por pantalla
				System.out.println("dato actualizado");
				//confirmamos
				eman.getTransaction().commit();
				//cerramos 
				eman.close();*/
		
/**********************************Listado****************************************************/

			/*	List<TblDocumento> listado=eman.createQuery("select docu from TblDocumento docu",TblDocumento.class).getResultList();
				//aplicamos un bucle for...
				for(TblDocumento lis:listado){
					//imprimimos por pantalla
					System.out.println("codigo "+lis.getIddocument()+" nro de documento "+lis.getNrodocument()
					+" nombre proveedor "+lis.getProvedocument()+" ruc de docum "+lis.getRucdocument()+
					" fecha "+lis.getFecha()+" descrip document "+lis.getDescridocument()+" codigo tipo documento "+
					lis.getTblTipodocumento().getIdtipodocum()+" nombre documento "+lis.getTblTipodocumento().getNomdocum()
					+"descrip tipo documento "+lis.getTblTipodocumento().getDescripdocum());

				}*/  //fin del bucle for.
				
				
/**********************************Buscar por Codigo****************************************************/
				
				TblDocumento buscarcodigo=eman.find(TblDocumento.class,3);
				//imprimimos mensaje por pantalla....
				System.out.println("codigo documento "+buscarcodigo.getIddocument()+
						" nro de documento "+buscarcodigo.getNrodocument()+" nombre proveedor "
						+buscarcodigo.getProvedocument()+" ruc de documento "+buscarcodigo.getRucdocument()+
						" fecha documento "+buscarcodigo.getFecha()+" descrip.. documento "
						+buscarcodigo.getDescridocument()+" codigo tipo documento "
						+buscarcodigo.getTblTipodocumento().getIdtipodocum()+" nombre tipo de documento "
						+buscarcodigo.getTblTipodocumento().getNomdocum()+" descripcion tipo de documento "
						+buscarcodigo.getTblTipodocumento().getDescripdocum());
	
/**********************************Eliminar****************************************************/
			
				
				
				
				
	
	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}/*fin del metodo principal*/

}/*din del documento*/
