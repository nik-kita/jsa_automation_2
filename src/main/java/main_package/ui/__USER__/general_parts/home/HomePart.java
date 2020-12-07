
package main_package.ui.__USER__.general_parts.home;

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import org.openqa.selenium.By;

public interface HomePart extends OnixPart {

    //TODO

    enum HomePartLtr implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        HomePartLtr(By path) {
            this.path = path;
        }
        HomePartLtr(By path, S... actions) {
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

    enum HomePartLtrs implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        HomePartLtrs(By path) {
            this.path = path;
        }
        HomePartLtrs(By path, S... actions) {
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

    