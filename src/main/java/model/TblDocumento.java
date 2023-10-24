package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_documento database table.
 * 
 */
@Entity
@Table(name="tbl_documento")
@NamedQuery(name="TblDocumento.findAll", query="SELECT t FROM TblDocumento t")
public class TblDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int iddocument;

	private String descridocument;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String nrodocument;

	private String provedocument;

	private String rucdocument;

	//bi-directional many-to-one association to TblTipodocumento
	@ManyToOne
	@JoinColumn(name="idtipodocum")
	private TblTipodocumento tblTipodocumento;

	public TblDocumento() {
	}

	public int getIddocument() {
		return this.iddocument;
	}

	public void setIddocument(int iddocument) {
		this.iddocument = iddocument;
	}

	public String getDescridocument() {
		return this.descridocument;
	}

	public void setDescridocument(String descridocument) {
		this.descridocument = descridocument;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNrodocument() {
		return this.nrodocument;
	}

	public void setNrodocument(String nrodocument) {
		this.nrodocument = nrodocument;
	}

	public String getProvedocument() {
		return this.provedocument;
	}

	public void setProvedocument(String provedocument) {
		this.provedocument = provedocument;
	}

	public String getRucdocument() {
		return this.rucdocument;
	}

	public void setRucdocument(String rucdocument) {
		this.rucdocument = rucdocument;
	}

	public TblTipodocumento getTblTipodocumento() {
		return this.tblTipodocumento;
	}

	public void setTblTipodocumento(TblTipodocumento tblTipodocumento) {
		this.tblTipodocumento = tblTipodocumento;
	}

}