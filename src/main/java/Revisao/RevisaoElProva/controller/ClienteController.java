package Revisao.RevisaoElProva.controller;


import Revisao.RevisaoElProva.entity.Cliente;

import java.util.Optional;

@RestController
public class ClienteController {
    @Autowired
    Repository resposity;

    @PostMapping
    public Cliente create(@RequestBody @Valid Cliente cliente) {

        Cliente clienteSaved = resposity.save(cliente);
        return clienteSaved;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Cliente> getClienteById(@PathVariable Long id) {
        Optional<Cliente> clienteReturned = resposity.findById(id);
        return clienteReturned;
    }

    @DeleteMapping("/{id}") //Deleta tal cliente atraves do id
    public String deleteClienteById(@PathVariable Long id) {
        Opcional<Cliente> clienteOpcional = clienteRe
        if (clienteOpcional.isPresent()){
            return "Cliente de id " + id + " foi deletado com sucesso!";
        }else
        {
            return "Cliente inexistente! ";
        }
    }
    @GetMapping //Puxa todos os cliente
    public List<Cliente> clienteList() {
        return resposity.findAll();
    }
    @PutMapping("update/{id}")
    public String Cliente updateClienteById(PathVariable Long id, String novoNome){
        Optional<Cliente> clienteOptional = clienteOptional = clienteRepository.findById(id);
        if (clienteOptional.isPresent()){
            Cliente c = clienteOptional.get();
            clienteRepository.save(c);
            return "Cliente de id " + id + " salve com sucesso !";
        }else
        {
            return "Cliente inexistente !";
        }
    }

}

