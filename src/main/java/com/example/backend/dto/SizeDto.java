package com.example.backend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Statement;

@Getter
@Setter
@NoArgsConstructor
public class SizeDto {

    private int id;

    private String sizeName;

    public SizeDto(Builder builder) {
        this.id=builder.id;
        this.sizeName = builder.sizeName;

    }

    public static class Builder
    {
        private int id;

        private String sizeName;

        public Builder(){}

        public static Builder sizeDtoBuilderWith(){return new Builder();}

        public Builder id(Integer id){this.id = id; return this;}
        public Builder sizeName(String sizeName){this.sizeName = sizeName; return this;}

        public SizeDto build(){
            return new SizeDto(this);
        }
    }

}
