package RicetteDalMondoBackEnd.RicetteDalMondoBk.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "recipes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Recipe {
    @Id
    private String id;
    private String title;
    private String country;
    private String ingredienti;
    private String tempoPreparazione;
    private String tempoCottura;
    private String porzioni;
    private String costoPerPersona;
    private String difficolta;
    private String preparazione;
    private String categoria;
    private String imageUrl;
}