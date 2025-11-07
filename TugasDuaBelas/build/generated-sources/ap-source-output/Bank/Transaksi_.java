package Bank;

import Bank.Nasabah_1;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-06T19:40:12", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Transaksi.class)
public class Transaksi_ { 

    public static volatile SingularAttribute<Transaksi, Nasabah_1> idnasabah;
    public static volatile SingularAttribute<Transaksi, BigDecimal> jumlah;
    public static volatile SingularAttribute<Transaksi, Date> tanggalTransaksi;
    public static volatile SingularAttribute<Transaksi, String> kodeTransaksi;
    public static volatile SingularAttribute<Transaksi, String> jenisTransaksi;

}