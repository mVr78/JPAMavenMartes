package TestEntidades;
import java.util.Date;
import java.util.List;
import Dao.ClassCrudEmpleadoImp;
import model.TblEmpleado;

public class TestEmpleado {

	public static void main(String[] args) {
		
		
/*************************************************************************************************************************/	
		  
		/*METODO REGISTRAR*/
		
		//realizamos las respectivas instancias...
				TblEmpleado tblemp=new TblEmpleado();	
				ClassCrudEmpleadoImp crud=new ClassCrudEmpleadoImp();
			/*	//ingresamos valores
				tblemp.setNombre("Olegario Bruno");
				tblemp.setApellido("Cueva Cueva");
				tblemp.setSexo("M");
				tblemp.setEmail("OlegarioBruno@gmail.com");
				tblemp.setDni("104057755");
				tblemp.setTelefono("38794755");
				//convertimos la fecha a javasql...
				Date fecha=new Date();
				Date fechasql=new Date(fecha.getTime());
				tblemp.setFechanac(fechasql);
				//invocamos al metodo registrar..
				crud.RegistrarEmpleado(tblemp);
				//emitimos un mensaje por consoal..
				System.out.println("dato registrado en BD");*/
		
		
/*****************************************************************************************************************************/		
		/*METODO ACTUALIZAR*/
		
		/*tblemp.setIdempleado(2);
		tblemp.setNombre("nilson alenxander");
		tblemp.setApellido("silva silva");
		tblemp.setSexo("M");
		tblemp.setEmail("nilson@gmail.com");
		tblemp.setDni("1045757869");
		tblemp.setTelefono("3814579");
		//convertimos la fecha a javasql...
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		tblemp.setFechanac(fechasql);
		//invocamos el metodo actualizar...
		crud.ActualizarEmpleado(tblemp);
		//emitimos un mensaje por consoal..
		System.out.println("dato Actualizado en BD");*/
	
		
		
/*********************************************************************************************************************************/		
		
		/*METODO ELIMINAR*/
				
				
		/*tblemp.setIdempleado(4);
		//invocamos el metodo eliminar...
		crud.EliminarEmpleado(tblemp); */
				
/*********************************************************************************************************************************/	
		/*METODO LISTAR*/
				
				
				
			/*List<TblEmpleado> listar=crud.ListadoEmpleado();
				//aplicamos un bucle...
				for(TblEmpleado lis:listar){
					
					//imprimimos por pantalla
					System.out.println(" codigo "+lis.getIdempleado()+" nombre "+lis.getNombre()+" apellido "
					+lis.getApellido()+" sexo "+lis.getSexo()+" email "+lis.getEmail()+
					" dni "+lis.getDni()+" telf. "+lis.getTelefono()+" fechanac "+lis.getFechanac());
					
				}    //fin del bucle for... */
				
/*********************************************************************************************************************************/	
		
		/*METODO BUSCAR*/
				
				tblemp.setIdempleado(3);
				TblEmpleado buscod=crud.BuscarEmpleadoCodigo(tblemp);
				//imprimimos por pantalla....
				System.out.println("codigo "+buscod.getIdempleado()+" nombre: "+buscod.getNombre()+
						" apellido: "+buscod.getApellido()+" sexo: "+buscod.getSexo()+
						" email: "+buscod.getEmail()+" dni: "+buscod.getDni()+
						" telefono: "+buscod.getTelefono()+" fechanac: "+buscod.getFechanac());
		
/*********************************************************************************************************************************/	

	}/*fin del metodo principal*/

}/*fin de la clasetestEmpelado*/
