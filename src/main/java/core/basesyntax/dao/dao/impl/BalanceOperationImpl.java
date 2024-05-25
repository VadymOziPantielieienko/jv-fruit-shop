package core.basesyntax.dao.dao.impl;

import core.basesyntax.dao.AdditionOperationHandler;
import core.basesyntax.dao.StorageDao;
import core.basesyntax.model.FruitModel;

public class BalanceOperationImpl implements AdditionOperationHandler {
    private final StorageDao storageDao = new StorageDaoImpl();

    @Override
    public String addToStorage(FruitModel fruitModel, int amount) {
        return storageDao.addFruit(fruitModel, amount);
    }
}
