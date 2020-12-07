
package main_package.ui.__USER__.general_parts.home;

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import org.openqa.selenium.By;

public interface HomeHeader extends OnixPart {

    //TODO

    enum HomeHeaderLtr implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        HomeHeaderLtr(By path) {
            this.path = path;
        }
        HomeHeaderLtr(By path, S... actions) {
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

    enum HomeHeaderLtrs implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        HomeHeaderLtrs(By path) {
            this.path = path;
        }
        HomeHeaderLtrs(By path, S... actions) {
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

    