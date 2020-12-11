package test_package.business;


import io.qameta.allure.Allure;
import main_package.data.User;
import main_package.engine.test_engine.OnixUiTestRunner;
import main_package.engine.ui_engine.OnixLocator;
import main_package.ui.__GUEST__.page_objects.main.Main;
import main_package.ui.__GUEST__.page_objects.main.login.Login;
import main_package.ui.__USER__.page_objects.home_header.home.Challenges;
import main_package.ui.__USER__.page_objects.home_header.home.Home;
import main_package.ui.__USER__.page_objects.home_header.home.PersonalTrainer;
import main_package.ui.__USER__.page_objects.home_header.home.account.PairedDevices;
import main_package.ui.__USER__.page_objects.home_header.home.account.Units;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_plan.ConfirmCancelPopup;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_plan.MyPlan;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_plan.UpdateCardPopup;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_profile.EmailPreferences;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_profile.MyProfile;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_profile.ResetPasswordFromMyProfile;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_profile.upload_image.LocalFiles;
import main_package.ui.__USER__.page_objects.home_header.home.account.my_profile.upload_image.UploadImagePopup;
import main_package.ui.__USER__.page_objects.home_header.home.my_goal.MyGoal;
import main_package.ui.__USER__.page_objects.home_header.home.my_progress.MyProgress;
import main_package.ui.__USER__.page_objects.home_header.home.steps.Steps;
import main_package.ui.__USER__.page_objects.home_header.learn.*;
import main_package.ui.__USER__.page_objects.home_header.learn.single_learn_video.SingleLearnVideo;
import main_package.ui.__USER__.page_objects.home_header.nutrition.Meals;
import main_package.ui.__USER__.page_objects.home_header.nutrition.Recipes;
import main_package.ui.__USER__.page_objects.home_header.nutrition.ShoppingLists;
import main_package.ui.__USER__.page_objects.home_header.workouts.Browse;
import main_package.ui.__USER__.page_objects.home_header.workouts.MyWorkouts;
import main_package.ui.__USER__.page_objects.home_header.workouts.Personalised;
import main_package.ui.__USER__.page_objects.main.pricing.pricingplans.PricingPlans;
import main_package.ui.__related_sites__.FacebookGroupPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WSAccount extends OnixUiTestRunner {
    Main main;

    @BeforeClass
    public void startFromMainPage() {
        main = openSite();
        log.info("open site");
    }

    @Test
    public void home() {
        Allure.link("Full test case information", "https://docs.google.com/spreadsheets/d/1gudjZ7fh4aUsozP7aPIovLnI4qGdbUFpIHJ6AbTlbC4/edit?ts=5f7593b0#gid=1204697450&range=B2");
        log.debug("Main page");
        for (OnixLocator l : Main.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        Login login = main.clickHeaderLogin();
        log.debug("Login page");
        for (OnixLocator l : Login.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        Home home = login.login(User.getValidUser());
        log.debug("Home page");
        for (OnixLocator l : Home.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        MyGoal myGoal = home.clickMyGoalLink();
        for (OnixLocator l : MyGoal.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.debug("MyGoal page");
        log.debug("Remove all weekly goals if present");
        myGoal.removeAllWeeklyGoals();
        String goal_1 = "Make this world little better by test_package.automation all tests in the world!";
        String goal_2 = "If not in all world so on this site...";
        log.debug("Create two new weekly goals");
        myGoal = myGoal
                .clickNewGoalButton()
                .save(goal_1)
                .clickNewGoalButton()
                .save(goal_2);
        onixUiAssert.softCheckCountOfElementByLocator(MyGoal.Locators.WEEKLY_GOAL, 2);
        myGoal.clickDeleteWeeklyGoal(goal_1);
        onixUiAssert.softCheckCountOfElementByLocator(MyGoal.Locators.WEEKLY_GOAL, 1);
        log.debug("Remove one goal, check alert presence");
        onixUiAssert.softCheckCountOfElementByLocator(MyGoal.Locators.DONE_GRAY, 1);
        myGoal.clickAcceptWeeklyGoal(goal_2);
        onixUiAssert.softCheckCountOfElementByLocator(MyGoal.Locators.DONE_ACTIVE, 1);
        log.debug("Check activation checklist item");
        Steps steps = myGoal.clickBackArrow().clickStepsLink();
        log.debug("Steps page is open");
        for (OnixLocator l : Steps.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        MyProgress myProgress = steps.clickHomeTab().clickMyProgressLink();
        log.debug("MyProgress page is open");
        for (OnixLocator l : MyProgress.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        Challenges challenges = myProgress.clickBackArrow().clickChallenges();
        log.debug("Challenges page is open");
        for (OnixLocator l : Challenges.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.debug("Click 'Join Now' button");
        FacebookGroupPage facebookGroupPage = challenges.clickBackArrow().clickJoinNow();
        for (OnixLocator l : FacebookGroupPage.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.debug("'FacebookGroup' page is open in another tab");
        log.debug("close 'FacebookGroup' tab and leave jsa tab");
        PersonalTrainer personalTrainer = new Home(facebookGroupPage.closeAndBackToJsaTab()).clickSupportButton();
        for (OnixLocator l : PersonalTrainer.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        main = personalTrainer.clickClose().openUserDropDown().logout().clickHeaderJsaLogo();
        log.debug("Logout");
        onixUiAssert.assertAll();
    }

    @Test
    public void workouts() {
        Allure.link("Full test case information", "https://docs.google.com/spreadsheets/d/1gudjZ7fh4aUsozP7aPIovLnI4qGdbUFpIHJ6AbTlbC4/edit?ts=5f7593b0#gid=1204697450&range=B18");
        log.debug("1. Open https://www.jamessmithacademy.com/");
        Main main = openSite();
        for (OnixLocator l : Main.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("JSA home page is open");
        log.debug("2. Click on \"Login\" and pass an authorization");
        Home home = main.clickHeaderLogin().login(User.getValidUser());
        for (OnixLocator l : Home.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Home page is open");
        log.debug("3. Click on \"Workouts\"");
        Personalised personalised = home.clickWorkoutsTab();
        for (OnixLocator l : Personalised.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Personalised tab is open by default");
        log.debug("5. Click on \"Browse\"");
        Browse browse = personalised.clickBrowseTab();
        for (OnixLocator l : Browse.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Browse tab is open");
        log.debug("6. Click on \"My Workouts\"");
        MyWorkouts myWorkouts = browse.clickMyWorkoutsTab();
        for (OnixLocator l : MyWorkouts.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("My workouts page is open");
        log.debug("7. Click on \"Support\"");
        PersonalTrainer personalTrainer = myWorkouts.clickSupportButton();
        for (OnixLocator l : PersonalTrainer.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Personal trainer is open");
        personalTrainer.clickClose().openUserDropDown().logout().clickHeaderJsaLogo();
        log.debug("Logout");
        onixUiAssert.assertAll();
    }

    @Test
    public void learn() {
        Allure.link("Full test case information", "https://docs.google.com/spreadsheets/d/1gudjZ7fh4aUsozP7aPIovLnI4qGdbUFpIHJ6AbTlbC4/edit?ts=5f7593b0#gid=1204697450&range=B31");
        log.debug("1. Open https://www.jamessmithacademy.com/");
        Main main = openSite();
        log.info("JSA home page is open");
        log.debug("2. Click on \"Login\" and pass an authorization");
        Login login = main.clickHeaderLogin();
        for (OnixLocator l : Login.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Login page is open");
        Home home = login.login(User.getValidUser());
        for (OnixLocator l : Home.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Successfully authorization");
        log.debug("3. Go to https://www.jamessmithacademy.com/users/#/learn or click on \"Learn\" page");
        Learn learn = home.clickLearnTab();
        for (OnixLocator l : Learn.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Learn page is open");
        log.debug("4. Click on \"Find\" icon");
        SearchVideos searchVideos = learn.clickSearchIcon();
        for (OnixLocator l : SearchVideos.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Searching page is open");
        log.debug("5. Click on video in \"New Videos\" section");
        SingleLearnVideo singleLearnVideo = searchVideos.clickBackArrow().clickVideo();
        for (OnixLocator l : SingleLearnVideo.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Page with video is open");
        log.debug("6. Click on any category in \"Categories\" section\n" +
                "- Introducing\n" +
                "- Exercise Principles \n" +
                "- Nutrition Principles\n" +
                "- Exercises\n" +
                "- Mobility & Functions\n" +
                "- Social Media");
        CategoriesMultiPage categoriesMultiPage = singleLearnVideo.clickBackArrow().clickCategory();
        for (OnixLocator l : CategoriesMultiPage.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Exercises page is open");
        log.debug("7. Click on \"Favourites\"");
        Favourites favourites = categoriesMultiPage.clickBackArrow().clickFavourites();
        for (OnixLocator l : Favourites.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Favourites page is open");
        log.debug("8. Click on \"To Complete\"");
        ToComplete toComplete = favourites.clickBackArrow().clickToComplete();
        for (OnixLocator l : ToComplete.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("To complete page is open");
        log.debug("9. Click on \"Support\"");
        PersonalTrainer personalTrainer = toComplete.clickBackArrow().clickSupportButton();
        for (OnixLocator l : PersonalTrainer.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Personal trainer is open");
        personalTrainer.clickClose().openUserDropDown().logout().clickHeaderJsaLogo();
        log.debug("Logout");
        onixUiAssert.assertAll();

    }

    @Test
    public void nutrition() {
        Allure.link("full test's steps link", "https://docs.google.com/spreadsheets/d/1gudjZ7fh4aUsozP7aPIovLnI4qGdbUFpIHJ6AbTlbC4/edit?ts=5f7593b0#gid=1204697450&range=B46");
        log.debug("1. Open https://www.jamessmithacademy.com/");
        Main main = openSite();
        for (OnixLocator l : Main.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("JSA main page is open");
        log.debug("2. Click on \"Login\" and pass an authorization");
        Home home = main.clickHeaderLogin().login(User.getValidUser());
        for (OnixLocator l : Home.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("'Home' page is open");
        log.debug("3. Click on \"Nutrition\" page");
        Meals meals = home.clickNutritionTab();
        for (OnixLocator l : Meals.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("4. \"Meals\" page is open by default");
        log.debug("5. Click on \"Recipes\" ");
        Recipes recipes = meals.clickRecipesTab();
        for (OnixLocator l : Recipes.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Recipes page is open");
        log.debug("6. Click on \"Shopping List\"");
        ShoppingLists shoppingLists = recipes.clickShoppingListsTab();
        for (OnixLocator l : ShoppingLists.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Shopping List is open");
//        log.debug("7. Click on \"Support\"");
//        PersonalTrainer personalTrainer = shoppingLists.clickSupportButton();
//        for(OnixLocator l : PersonalTrainer.Locator.values()) {
//            onixAssert.softCheckCountOfElementByLocator(l, 1);
//        }
//        personalTrainer.clickClose().openUserDropDown().logout();
        //TODO is there 'Support button' or no?
        shoppingLists.openUserDropDown().logout().clickHeaderJsaLogo();
        log.info("Logout");
        onixUiAssert.assertAll();
    }

    @Test
    public void account() {
        log.debug("1. Open https://www.jamessmithacademy.com/\n2. Click on \"Login\" and pass an authorization\n3. Click on \"Account\" ");
        MyPlan myPlan = openSite().clickHeaderLogin().login(User.getValidUser()).clickAccountIcon();
        for (OnixLocator l : MyPlan.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Account page is open and 'My Plan' tab is open by default");
        log.debug("5. Click on \"My Profile\"");
        MyProfile myProfile = myPlan.clickMyProfile();
        for (OnixLocator l : MyProfile.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("My profile page is open");
        log.debug("6. Click on \"Units\"");
        Units units = myProfile.clickUnits();
        for (OnixLocator l : Units.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Units page is open");
        log.debug("7. Click on \"Paired Devices\" ");
        PairedDevices pairedDevices = units.clickPairedDevices();
        for (OnixLocator l : PairedDevices.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Paired Devices page is open");
        pairedDevices.clickLogoutHeaderButton().clickHeaderJsaLogo();
        log.info("Logout");
        onixUiAssert.assertAll();

    }

    @Test
    public void myPlan() {
        Allure.link("Full test's info", "https://docs.google.com/spreadsheets/d/1gudjZ7fh4aUsozP7aPIovLnI4qGdbUFpIHJ6AbTlbC4/edit?ts=5f7593b0#gid=1204697450&range=B72");
        log.debug("1. Open https://www.jamessmithacademy.com/\n" +
                "2. Click on \"Login\" and pass an authorization\n" +
                "3. Go to https://www.jamessmithacademy.com/users/account/my-plan or click on \"Account\" \n" +
                "4. \"My Plan\" is open by default\n" +
                "5. Click on \"Change plan\"");
        MyPlan myPlan = openSite().clickHeaderLogin().login(User.getValidUser()).clickAccountIcon();
        for (OnixLocator l : MyPlan.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        PricingPlans pricingPlans = myPlan.clickChangePlan();
        for (OnixLocator l : PricingPlans.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Pricing plans page is open");
        log.debug("Click 'Cancel subscription plan'");
        ConfirmCancelPopup confirmCancelPopup = pricingPlans.clickAccountHeaderButton().clickCancelSubscriptionPlan();
        for (OnixLocator l : ConfirmCancelPopup.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("'ConfirmCancelPopup' is open");
        log.debug("Close popup amd click 'Update card'");
        UpdateCardPopup updateCardPopup = confirmCancelPopup.close().clickUpdateCard();
        for (OnixLocator l : UpdateCardPopup.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("'UpdateCardPopup' is open");
        log.debug("Input coupon code and click 'Redeem' button");
        //TODO real coupon code is needed for this test
        updateCardPopup.close().clickRedeem("12345");
        for (OnixLocator l : MyPlan.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        myPlan.clickLogoutHeaderButton();
        log.info("Logout");
        onixUiAssert.assertAll();
    }

    @Test
    public void myProfile() {
        Allure.link("Full test's info", "https://docs.google.com/spreadsheets/d/1gudjZ7fh4aUsozP7aPIovLnI4qGdbUFpIHJ6AbTlbC4/edit?ts=5f7593b0#gid=1204697450&range=B87");
        log.debug("1. Open https://www.jamessmithacademy.com/\tJSA home page is open\n" +
                "2. Click on \"Login\" and pass an authorization\tLogin page is open\n" +
                "3. Go to https://www.jamessmithacademy.com/users/account/my-plan or click on \"Account\" \tAccount page is open");
        log.debug("4. Go to \"My Profile\" page");
        MyProfile myProfile = openSite().clickHeaderLogin().login(User.getValidUser())
                .clickAccountIcon().clickMyProfile();
        for (OnixLocator l : MyProfile.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("My plan page is open");
        log.debug("5. Click on \"reset your password here\"");
        ResetPasswordFromMyProfile resetPasswordFromMyProfile = myProfile.clickResetPassword();
        for (OnixLocator l : ResetPasswordFromMyProfile.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Change password page is open");
        log.debug("6. Return to 'My Profile' and click on \"update your email preferences\"");
        EmailPreferences emailPreferences = resetPasswordFromMyProfile
                .clickAccountHeaderButton()
                .clickMyProfile()
                .clickUpdateEmailPreferences();
        for (OnixLocator l : EmailPreferences.Locator.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Email preferences page is open");
        log.debug("7. Return and click on \"Edit\" icon for uploading new photo");
        LocalFiles localFiles = emailPreferences.clickAccountHeaderButton().clickMyProfile().clickUploadImageIconButton();
        for (OnixLocator l : UploadImagePopup.UploadImagePopupLtr.values()) {
            onixUiAssert.softCheckCountOfElementByLocator(l, 1);
        }
        log.info("Choose local file pop-up is showed up");
        localFiles.close().clickLogoutHeaderButton();
        log.info("Logout");
        onixUiAssert.assertAll();
    }


}
