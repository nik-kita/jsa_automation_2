
package main_package.ui.__USER__.general_parts.home.account;

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import org.openqa.selenium.By;

public interface AccountSidebar extends OnixPart {

    //TODO

    enum AccountSidebarLtr implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        AccountSidebarLtr(By path) {
            this.path = path;
        }
        AccountSidebarLtr(By path, S... actions) {
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

    enum AccountSidebarLtrs implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        AccountSidebarLtrs(By path) {
            this.path = path;
        }
        AccountSidebarLtrs(By path, S... actions) {
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

    