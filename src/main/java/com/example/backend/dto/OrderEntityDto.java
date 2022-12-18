package com.example.backend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
public class OrderEntityDto {

    private long id;

    private Boolean status;

    private Date date;

    public OrderEntityDto(Builder builder) {
        this.id=builder.id;
        this.date= builder.date;
        this.status= builder.status;
    }

    public static class Builder
    {
        private long id;

        private Boolean status;

        private Date date;

        public Builder(){}

        public static Builder orderEntityBuilderWith(){return new Builder();}

        public Builder id(Long id){this.id=id; return this;}
        public Builder status(Boolean status){this.status = status; return this;}
        public Builder date(Date date){this.date=date; return this;}

        public OrderEntityDto build(){return new OrderEntityDto(this);}

    }


}
