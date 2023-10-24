package Interfaces;

import model.TblDocumento;
import java.util.List;
public interface IDocumentoable {

	public void RegistrarDocumento(TblDocumento tbdocum);
	public void ActualizarDocumento(TblDocumento tbldocum);
	public void EliminarDocumento(TblDocumento tbldocum);
	public List<TblDocumento>ListarDocumentos();
	public TblDocumento BuscarDocumento(TblDocumento tbldocum);
	
	
	
}
