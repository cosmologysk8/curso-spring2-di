package com.example.cursospring2di.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemFactura {

    private Producto producto;
    private Integer cantidad;

}
