package com.example.springDataJPA.springrelationship.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
@AttributeOverrides( {
        @AttributeOverride(
                name = "guardianName",
                column = @Column(name = "guardian_name")
        ),
        @AttributeOverride(
                name = "guardianMobile",
                column = @Column(name = "guardian_mobile")

        )
})
@Builder
public class Guardian {
    private String guardianName;
    private String guardianMobile;
}
