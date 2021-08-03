package fruit;

public interface FruitService {

    Iterable<Fruit> findAll();

    Fruit save(Fruit fruit);

    void deleteById(Long id);

    Fruit update(Fruit fruit);
}
