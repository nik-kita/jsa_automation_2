package main_package.engine.test_engine;

import main_package.api.clients.UserClient;
import main_package.api.models.User;

import main_package.engine.BaseClass;
import main_package.engine.Fly;
import main_package.engine.log_engine.OnixLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;

public class OnixApiTestRunner extends OnixTestRunner {
    protected UserClient userClient;
    protected User user;
    Logger logger;

    @BeforeClass
    public void beforeClass() {
        user = User.getValidApiUser();
        userClient = new UserClient(user);
        logger = new OnixLog(LoggerFactory.getLogger(this.getClass()));
    }


    @Override
    public BaseClass make(Fly fly) {
        return null;
    }
}
