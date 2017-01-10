package br.edu.utfpr.biblioteca.salas.model.entity;

import br.edu.utfpr.biblioteca.salas.model.entity.ReservaPO;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-09T06:21:46")
@StaticMetamodel(EstudantePO.class)
public class EstudantePO_ { 

    public static volatile SingularAttribute<EstudantePO, String> senha;
    public static volatile ListAttribute<EstudantePO, ReservaPO> reservas;
    public static volatile SingularAttribute<EstudantePO, String> nome;
    public static volatile SingularAttribute<EstudantePO, String> email;
    public static volatile SingularAttribute<EstudantePO, String> ra;

}