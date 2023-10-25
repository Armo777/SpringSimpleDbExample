package org.top.springsimpledbexample;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

// Контроллер - веб-интерфейс приложения
@RestController
public class ApplicationController {

    // репозиторий для работы с объектами (использование DI)
    private final ProductRepository productRepository;

    public ApplicationController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // дефолтные обработчики
    @GetMapping("")
    public String index() {
        return "Server is running";
    }

    @GetMapping("ping")
    public String ping() {
        return "pong";
    }

    // ОБРАБОТЧИКИ, ВЫЗЫВАЮЩИЕ ОПЕРАЦИИ ПО ВЗАИМОДЕЙСТВИЮ С БД
    // 1. получить все записи
    @GetMapping("product")
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    // 2. получить запись по id
    @GetMapping("product/{id}")
    public Optional<Product> findById(@PathVariable Integer id) {
        return productRepository.findById(id);
    }

    // 3. добавить новую запись
    @PostMapping("product/new")
    public Product addNew(@RequestBody Product product) {
        return productRepository.save(product);
    }

    // 4. удалить запись по id
    // 5. изменить запись
}
