package com.ControledeAcesso.Controle.de.acesso.Model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Getter //Lombok cria todos os gets sem precisar criar o metodo
@Setter //Lombok cria todos os sets sem precisar criar o metodo
@AllArgsConstructor //Lombok cria todos os argumentos de construtores
@NoArgsConstructor //Lombok cria o argumento de construtor vazio
@EqualsAndHashCode //lombok implementa o hash code para melhora de buscas
@Builder //facilita processo de testes
@Entity//indica que essa classe se refere a uma tabela no banco de dados
@Audited
public class WorkingDay {
    @Id//apresenta o id de referencia da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY)//gera o id
    private Long id;
    @Column//informa que isso é uma coluna da tabela
    private String description;
}
