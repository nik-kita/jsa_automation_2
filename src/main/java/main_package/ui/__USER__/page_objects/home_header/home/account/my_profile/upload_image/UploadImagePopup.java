
package main_package.ui.__USER__.page_objects.home_header.home.account.my_profile.upload_image;

import main_package.data.S;
import main_package.engine.ui_engine.OnixLocator;
import main_package.engine.ui_engine.OnixPart;
import main_package.engine.ui_engine.OnixWebDriver;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_profile.MyProfile;
import org.openqa.selenium.By;

public interface UploadImagePopup extends OnixPart {

    default MyProfile close() {
        OnixWebDriver driver = getDriver();
        driver.waitToClick(UploadImagePopupLtr.CLOSE).click();
        getLog().info("click [{}] close button in [{}] popup", "x", "Upload Image");
        return new MyProfile(driver);
    }

    enum UploadImagePopupLtr implements OnixLocator {
        CLOSE(By.cssSelector(".uploadcare--dialog__close")),
        ;
        private By path;
        private S[] actions;
        UploadImagePopupLtr(By path) {
            this.path = path;
        }
        UploadImagePopupLtr(By path, S... actions) {
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

    enum UploadImagePopupLtrs implements OnixLocator {
        //TODO
        ;
        private By path;
        private S[] actions;
        UploadImagePopupLtrs(By path) {
            this.path = path;
        }
        UploadImagePopupLtrs(By path, S... actions) {
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

    