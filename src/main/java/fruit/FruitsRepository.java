package fruit;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface FruitsRepository extends PagingAndSortingRepository<Fruit, Long> {
}
