
package main_package.ui.__USER__.general_parts.home.account;

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import org.openqa.selenium.By;

public interface AccountHeader extends OnixPart {

    //TODO

    enum AccountHeaderLtr implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        AccountHeaderLtr(By path) {
            this.path = path;
        }
        AccountHeaderLtr(By path, S... actions) {
            this.path = path;
            this.actions = actions;
        }
        @Override
        public By getPath() {
            return path;
        }
        @Override
        public S[] specialActions() {
            return actions;
        }
    }

    enum AccountHeaderLtrs implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        AccountHeaderLtrs(By path) {
            this.path = path;
        }
        AccountHeaderLtrs(By path, S... actions) {
            this.path = path;
            this.actions = actions;
        }
        @Override
        public By getPath() {
            return path;
        }
        @Override
        public S[] specialActions() {
            return actions;
        }
    }
}

    