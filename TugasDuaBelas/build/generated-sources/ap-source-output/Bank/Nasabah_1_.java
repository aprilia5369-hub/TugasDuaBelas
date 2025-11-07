package Bank;

import Bank.Transaksi;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-06T19:40:12", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Nasabah_1.class)
public class Nasabah_1_ { 

    public static volatile SingularAttribute<Nasabah_1, String> idnasabah;
    public static volatile CollectionAttribute<Nasabah_1, Transaksi> transaksiCollection;
    public static volatile SingularAttribute<Nasabah_1, String> nama;
    public static volatile SingularAttribute<Nasabah_1, BigDecimal> saldo;
    public static volatile SingularAttribute<Nasabah_1, String> alamat;

}