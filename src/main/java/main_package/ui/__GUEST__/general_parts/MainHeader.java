
package main_package.ui.__GUEST__.general_parts;

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import org.openqa.selenium.By;

public interface MainHeader extends OnixPart {

    //TODO

    enum MainHeaderLtr implements OnixLocator {
        JSA_LOGO(By.cssSelector("a[href='/'] img")),
        //TODO books
        PRICING_HEADER_BUTTON(By.cssSelector(".nav a[href='/pricing/']")),
        TRANSFORMATIONS_HEADER_BUTTON(By.cssSelector(".nav a[href='/transformations/']")),
        CHALLENGE_HEADER_BUTTON(By.cssSelector(".nav a[href='/challenge/about/']")),
        MY_PODCAST_HEADER_BUTTON(By.cssSelector(".nav a[href='/podcasts/']")),
        LOGIN_HEADER_BUTTON(By.cssSelector(".nav a[href='/users/login/']")),
        JOIN_NOW_HEADER_BUTTON(By.cssSelector(".nav a[href='/users/register/']")),
        ;
        private By path;
        private S[] actions;
        MainHeaderLtr(By path) {
            this.path = path;
        }
        MainHeaderLtr(By path, S... actions) {
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

    enum MainHeaderLtrs implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        MainHeaderLtrs(By path) {
            this.path = path;
        }
        MainHeaderLtrs(By path, S... actions) {
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

    