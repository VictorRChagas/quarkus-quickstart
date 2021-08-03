package fruit;

import org.slf4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class FruitServiceImpl implements FruitService {

    @Inject
    FruitsRepository fruitsRepository;

    @Inject
    Logger logger;


    @Override
    public Iterable<Fruit> findAll() {
        logger.info("Fetching all fruits");
        return fruitsRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        logger.info("Deleting fruit by id: {}", id);
        fruitsRepository.deleteById(id);
    }

    @Override
    public Fruit update(Fruit fruit) {
        logger.info("Updating fruit");
        return fruitsRepository.save(fruit);
    }

    @Override
    public Fruit save(Fruit fruit) {
        logger.info("Saving new fruit");
        return fruitsRepository.save(fruit);
    }
}
