package wallet.domain;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

import pro.upchain.wallet.domain.ETHWallet;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig eTHWalletDaoConfig;

    private final ETHWalletDao eTHWalletDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        eTHWalletDaoConfig = daoConfigMap.get(ETHWalletDao.class).clone();
        eTHWalletDaoConfig.initIdentityScope(type);

        eTHWalletDao = new ETHWalletDao(eTHWalletDaoConfig, this);

        registerDao(ETHWallet.class, eTHWalletDao);
    }
    
    public void clear() {
        eTHWalletDaoConfig.clearIdentityScope();
    }

    public ETHWalletDao getETHWalletDao() {
        return eTHWalletDao;
    }

}
