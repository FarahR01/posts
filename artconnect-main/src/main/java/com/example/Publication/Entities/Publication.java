package com.example.Publication.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@Table
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Publication implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Getter
    @NonNull
    @Column
    private String type;
    @Getter
    @NonNull
    @Column
    private String titre;
    @NonNull
    @Column
    private String lien;
    @NonNull
    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date date;
    @Getter
    @NonNull
    @Column
    private String sourcepdf;

    public void setType(@NonNull String type) {
        this.type = type;
    }

    public void setTitre(@NonNull String titre) {
        this.titre = titre;
    }

    public @NonNull String getLien() {
        return lien;
    }

    public void setLien(@NonNull String lien) {
        this.lien = lien;
    }

    public @NonNull Date getDate() {
        return date;
    }

    public void setDate(@NonNull Date date) {
        this.date = date;
    }

    public void setSourcepdf(@NonNull String sourcepdf) {
        this.sourcepdf = sourcepdf;
    }
}