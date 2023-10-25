package org.top.springsimpledbexample;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Репозиторий для выполнения операций с сущностями Product, которые являются отображением таблицы product_t
// Расширяет CrudRepository, для которого необходимо указать сущность, с которой работает репозиторий
// и тип первичного ключа
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
