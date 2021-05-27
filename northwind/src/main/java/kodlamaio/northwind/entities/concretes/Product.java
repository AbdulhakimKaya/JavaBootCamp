package kodlamaio.northwind.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data                       // getter ve setter ları olusturur
@NoArgsConstructor          // parametresiz constructor olsuturur
@AllArgsConstructor         // butun parametlerin oldugu constructor olsuturur
@Entity                     // hangi katmana ait oldugunu gosterir
@Table(name = "products")   // datadaki tablo adiyla tanimlanir
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="product_id")
    private int id;

    @Column(name = "product_name")
    private String productName;

//   @Column(name = "category_id")
//   private int categoryId;

    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;

    @Column(name = "unit_price")
    private int unitPrice;

    @Column(name = "units_in_stock")
    private int unitsInStock;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;

}
