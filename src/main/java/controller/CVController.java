package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import language.Lang;

import java.io.File;


public class CVController {

    public void initialize() {
        changePhoto();
        translateButtonsAndDictionary();
    }

    private void translateButtonsAndDictionary() {
        Lang lang = new Lang();
        lang.translate();

        loadTextFromDictionary(lang);

        polishButton.setOnAction(actionEvent -> {
            lang.changeEnglishToPolish();
            loadTextFromDictionary(lang);
        });
        englishButton.setOnAction(actionEvent -> {
            lang.changePolishToEnglish();
            loadTextFromDictionary(lang);
        });
    }

    private void loadTextFromDictionary(Lang lang) {
        introductionTab.setText(lang.dictionary[0]);
        experienceTab.setText(lang.dictionary[1]);
        educationTab.setText(lang.dictionary[2]);
        skillsTab.setText(lang.dictionary[3]);
        personTab.setText(lang.dictionary[4]);
        aboutProgramTab.setText(lang.dictionary[5]);
        musicButton.setText(lang.dictionary[6]);
    }

    private void changePhoto() {
        var image1 = new Image(new File("src/main/resources/photos/photo1.jpg").toURI().toString());
        var image2 = new Image(new File("src/main/resources/photos/photo2.jpg").toURI().toString());
        var image3 = new Image(new File("src/main/resources/photos/photo3.jpg").toURI().toString());
        firstPhotoRButton.setOnAction(actionEvent -> {
            photoImageView.setImage(image1);
        });
        secondPhotoRButton.setOnAction(actionEvent -> {
            photoImageView.setImage(image2);
        });
        thirdPhotoRButton.setOnAction(actionEvent -> {
            photoImageView.setImage(image3);
        });
    }

    @FXML
    private VBox mainPane;

    @FXML
    private AnchorPane topBarPane;

    @FXML
    private Button polishButton;

    @FXML
    private Button englishButton;

    @FXML
    private RadioButton musicButton;

    @FXML
    private TabPane tabMenuPane;

    @FXML
    private Tab introductionTab;

    @FXML
    private ImageView photoImageView;

    @FXML
    private RadioButton firstPhotoRButton;

    @FXML
    private RadioButton secondPhotoRButton;

    @FXML
    private RadioButton thirdPhotoRButton;

    @FXML
    private Label aboutMeIntroductionLabel;

    @FXML
    private Tab experienceTab;

    @FXML
    private TitledPane dellnedDEPane;

    @FXML
    private TitledPane dellnerPEPane;

    @FXML
    private TitledPane dellenrSEPane;

    @FXML
    private TitledPane internshipPane;

    @FXML
    private Tab educationTab;

    @FXML
    private TitledPane universityPane;

    @FXML
    private TitledPane highschoolPane;

    @FXML
    private TitledPane preschoolPane;

    @FXML
    private Tab skillsTab;

    @FXML
    private AnchorPane progrmmingSkillsPane;

    @FXML
    private TitledPane engineeringSkillsPane;

    @FXML
    private TitledPane languagesSkillsPane;

    @FXML
    private Tab personTab;

    @FXML
    private TitledPane enneagramPane;

    @FXML
    private TitledPane mbtiPane;

    @FXML
    private TitledPane hobbiesPane;

    @FXML
    private Tab faqTab;

    @FXML
    private TitledPane whyProgrammingPane;

    @FXML
    private TitledPane why31Pane;

    @FXML
    private TitledPane targetPane;

    @FXML
    private Tab aboutProgramTab;

}
