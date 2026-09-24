@Entity
@Table(name = "${Nombre_tabla}")
@Getter
@Setter
@AllArgsConstructor
public class ${NAME} {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

}