/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author ACER
 */
@Entity
@Table(name = "nasabah")
@NamedQueries({
    @NamedQuery(name = "Nasabah_1.findAll", query = "SELECT n FROM Nasabah_1 n"),
    @NamedQuery(name = "Nasabah_1.findByIdnasabah", query = "SELECT n FROM Nasabah_1 n WHERE n.idnasabah = :idnasabah"),
    @NamedQuery(name = "Nasabah_1.findByNama", query = "SELECT n FROM Nasabah_1 n WHERE n.nama = :nama"),
    @NamedQuery(name = "Nasabah_1.findByAlamat", query = "SELECT n FROM Nasabah_1 n WHERE n.alamat = :alamat"),
    @NamedQuery(name = "Nasabah_1.findBySaldo", query = "SELECT n FROM Nasabah_1 n WHERE n.saldo = :saldo")})
public class Nasabah_1 implements Serializable {

    @OneToMany(mappedBy = "idnasabah")
    private Collection<Transaksi> transaksiCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idnasabah")
    private String idnasabah;
    @Column(name = "nama")
    private String nama;
    @Column(name = "alamat")
    private String alamat;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saldo")
    private BigDecimal saldo;

    public Nasabah_1() {
    }

    public Nasabah_1(String idnasabah) {
        this.idnasabah = idnasabah;
    }

    public String getIdnasabah() {
        return idnasabah;
    }

    public void setIdnasabah(String idnasabah) {
        this.idnasabah = idnasabah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnasabah != null ? idnasabah.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nasabah_1)) {
            return false;
        }
        Nasabah_1 other = (Nasabah_1) object;
        if ((this.idnasabah == null && other.idnasabah != null) || (this.idnasabah != null && !this.idnasabah.equals(other.idnasabah))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bank.Nasabah_1[ idnasabah=" + idnasabah + " ]";
    }

    public Collection<Transaksi> getTransaksiCollection() {
        return transaksiCollection;
    }

    public void setTransaksiCollection(Collection<Transaksi> transaksiCollection) {
        this.transaksiCollection = transaksiCollection;
    }
    
}
