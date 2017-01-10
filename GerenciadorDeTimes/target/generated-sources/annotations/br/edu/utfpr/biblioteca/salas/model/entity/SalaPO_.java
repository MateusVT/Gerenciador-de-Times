package br.edu.utfpr.biblioteca.salas.model.entity;

import br.edu.utfpr.biblioteca.salas.model.entity.ReservaPO;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-09T06:21:46")
@StaticMetamodel(SalaPO.class)
public class SalaPO_ { 

    public static volatile SingularAttribute<SalaPO, Boolean> ar;
    public static volatile ListAttribute<SalaPO, ReservaPO> reservas;
    public static volatile SingularAttribute<SalaPO, Integer> id;

}