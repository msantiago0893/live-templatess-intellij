@Service
@RequiredArgsConstructor
public class ${NAME} {

  private final Repository repository;

  // Buscar un elemento por su id
  public ${Dto_response} findById(Long id) {
    return toResponse(getById(id));
  }

  // Recuperar todos los elementos
  public List<${Dto_response}> findAll() {
    return repository.findAll()
      .stream()
      .map(this::toResponse)
      .toList();
  }

  // Crear un elemento
  @Transactional
  public ${Dto_response} save(${Dto_request} request) {
    MyEntity entity = new MyEntity();
    // setear campos
    entity.setName(request.name());

    return toResponse(repository.save(entity));
  }

  // Actualizar un elemento por su id
  @Transactional
  public ${Dto_response} update(Long id, ${Dto_request} request) {
    // Buscar si existe el elemento a actualizar. Si existe se recupera el Entity
    MyEntity entity = getById(id);
    // actualizar campos
    entity.setName(request.name());

    return toResponse(repository.save(entity));
  }

  // Eliminar un elemento por su id
  @Transactional
  public void delete(Long id) {
    repository.delete(getById(id));
  }
  
  // Buscar un elemento por su id
  private Entity getById(Long id) {
    return repository.findById(id)
      .orElseThrow(() ->
        new ResourceNotFoundException("Entity no encontrado: " + id));
  }

  //Mapear Entity a DtoResponse
  private ${Dto_response} toResponse(MyEntity entity) {
    return new ${Dto_response}(
      entity.getId()
    );
  }
}