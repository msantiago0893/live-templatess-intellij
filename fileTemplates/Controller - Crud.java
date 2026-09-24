@RestController
@RequestMapping("/api/v1/Path_Recurso")
@RequiredArgsConstructor
public class ${NAME} {

    private final Service_a_inyectar service;

    @GetMapping
    public ResponseEntity<List<$Dto_response>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<$Dto_response> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<$Dto_response> create(
            @Valid @RequestBody $Dto_request request) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.save(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<$Dto_response> update(
            @PathVariable Long id,
            @Valid @RequestBody $Dto_request request) {

        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}