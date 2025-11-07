/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "transaksi")
@NamedQueries({
    @NamedQuery(name = "Transaksi.findAll", query = "SELECT t FROM Transaksi t"),
    @NamedQuery(name = "Transaksi.findByKodeTransaksi", query = "SELECT t FROM Transaksi t WHERE t.kodeTransaksi = :kodeTransaksi"),
    @NamedQuery(name = "Transaksi.findByTanggalTransaksi", query = "SELECT t FROM Transaksi t WHERE t.tanggalTransaksi = :tanggalTransaksi"),
    @NamedQuery(name = "Transaksi.findByJenisTransaksi", query = "SELECT t FROM Transaksi t WHERE t.jenisTransaksi = :jenisTransaksi"),
    @NamedQuery(name = "Transaksi.findByJumlah", query = "SELECT t FROM Transaksi t WHERE t.jumlah = :jumlah")})
public class Transaksi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_transaksi")
    private String kodeTransaksi;
    @Basic(optional = false)
    @Column(name = "tanggal_transaksi")
    @Temporal(TemporalType.DATE)
    private Date tanggalTransaksi;
    @Column(name = "jenis_transaksi")
    private String jenisTransaksi;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "jumlah")
    private BigDecimal jumlah;
    @JoinColumn(name = "idnasabah", referencedColumnName = "idnasabah")
    @ManyToOne
    private Nasabah_1 idnasabah;

    public Transaksi() {
    }

    public Transaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    public Transaksi(String kodeTransaksi, Date tanggalTransaksi, BigDecimal jumlah) {
        this.kodeTransaksi = kodeTransaksi;
        this.tanggalTransaksi = tanggalTransaksi;
        this.jumlah = jumlah;
    }

    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(Date tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public String getJenisTransaksi() {
        return jenisTransaksi;
    }

    public void setJenisTransaksi(String jenisTransaksi) {
        this.jenisTransaksi = jenisTransaksi;
    }

    public BigDecimal getJumlah() {
        return jumlah;
    }

    public void setJumlah(BigDecimal jumlah) {
        this.jumlah = jumlah;
    }

    public Nasabah_1 getIdnasabah() {
        return idnasabah;
    }

    public void setIdnasabah(Nasabah_1 idnasabah) {
        this.idnasabah = idnasabah;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeTransaksi != null ? kodeTransaksi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaksi)) {
            return false;
        }
        Transaksi other = (Transaksi) object;
        if ((this.kodeTransaksi == null && other.kodeTransaksi != null) || (this.kodeTransaksi != null && !this.kodeTransaksi.equals(other.kodeTransaksi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bank.Transaksi[ kodeTransaksi=" + kodeTransaksi + " ]";
    }
    
}
