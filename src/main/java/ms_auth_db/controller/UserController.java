package ms_auth_db.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ms_auth_db.model.entities.User;
import ms_auth_db.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@Tag(name = "Usuarios - DB", description = "Operaciones directas a la base de datos de usuarios")
public class UserController {
    @Autowired
    UserService userService;

    @Operation(summary = "Obtener todos los usuarios", description = "Devuelve una lista con todos los usuarios registrados en la tabla 'users'.")
    @GetMapping("/users")
    public List<User> selectAllUser(){
        return userService.selectAllUser();
    }
}

