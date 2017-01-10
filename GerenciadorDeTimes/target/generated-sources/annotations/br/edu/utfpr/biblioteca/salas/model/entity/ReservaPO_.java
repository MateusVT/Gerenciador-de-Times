package br.edu.utfpr.biblioteca.salas.model.entity;

import br.edu.utfpr.biblioteca.salas.model.entity.EstudantePO;
import br.edu.utfpr.biblioteca.salas.model.entity.SalaPO;
import br.edu.utfpr.biblioteca.salas.model.entity.StatusPO;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-09T06:21:46")
@StaticMetamodel(ReservaPO.class)
public class ReservaPO_ { 

    public static volatile SingularAttribute<ReservaPO, Integer> quantidadeAlunos;
    public static volatile SingularAttribute<ReservaPO, SalaPO> sala;
    public static volatile SingularAttribute<ReservaPO, Integer> id;
    public static volatile SingularAttribute<ReservaPO, Date> dataInicial;
    public static volatile SingularAttribute<ReservaPO, EstudantePO> estudante;
    public static volatile SingularAttribute<ReservaPO, Date> dataFinal;
    public static volatile SingularAttribute<ReservaPO, StatusPO> status;

}