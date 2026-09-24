public interface I${NAME}Service {

  ${Tipo_dto_response} findById(Long id);

  List<${Tipo_dto_response}> findAll();

  ${Tipo_dto_response} save(${Tipo_dto_request} request);

  ${Tipo_dto_response} update(Long id, ${Tipo_dto_request} request);

  void delete(Long id);
}