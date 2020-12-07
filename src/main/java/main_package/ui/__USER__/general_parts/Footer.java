
package main_package.ui.__USER__.general_parts;

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import org.openqa.selenium.By;

public interface Footer extends OnixPart {

    //TODO

    enum FooterLtr implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        FooterLtr(By path) {
            this.path = path;
        }
        FooterLtr(By path, S... actions) {
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

    enum FooterLtrs implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        FooterLtrs(By path) {
            this.path = path;
        }
        FooterLtrs(By path, S... actions) {
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

    