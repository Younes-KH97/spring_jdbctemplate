package cloud.data;

import cloud.TacoOrder;

import java.util.Optional;

public interface OrderRepository {
    TacoOrder save (TacoOrder order);
    Optional<TacoOrder> findById(Long id);
}
