package controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import language.Lang;
import java.io.File;
import java.net.URISyntaxException;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import mainCV.MainCV;


public class CVController {
    MediaPlayer player = null;
    MainCV mainCV = new MainCV();

    public void initialize() {
        changePhoto();
        translateButtonsAndDictionary();
        playMusic();
        buttonExternalBrowserLinks();
    }

    private void buttonExternalBrowserLinks() {
        dellnerDEbutton.setOnAction(actionEvent -> {
            openLinkInBrowser(new TextField("https://dellner.com"));
        });
        dellnerDEbutton1.setOnAction(actionEvent -> {
            openLinkInBrowser(new TextField("https://dellner.com"));
        });
        dellnerDEbutton2.setOnAction(actionEvent -> {
            openLinkInBrowser(new TextField("https://dellner.com"));
        });
        githubButton.setOnAction(actionEvent -> {
            openLinkInBrowser(new TextField("https://github.com/dariuszszmycinski"));
        });
        codewarsButton.setOnAction(actionEvent -> {
            openLinkInBrowser(new TextField("https://www.codewars.com/users/dariuszszmycinski"));
        });

    }

    private void openLinkInBrowser(TextField textField) {
        mainCV.getHostServices().showDocument(textField.getText());
    }

    private void playMusic() {
        try {
            player = new MediaPlayer(new Media(getClass().getResource("/music.mp3").toURI().toString()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        player.setCycleCount(MediaPlayer.INDEFINITE);
        player.play();
        player.setVolume(0.3);
        musicButton.setOnAction(actionEvent -> {
            if (player.isMute()) {
                player.setMute(false);
            } else {
                player.setMute(true);
            }
        });
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
        aboutMeIntroductionLabel.setText(lang.dictionary[7]);
        dellnedDEPane.setText(lang.dictionary[8]);
        dellnerPEPane.setText(lang.dictionary[9]);
        dellenrSEPane.setText(lang.dictionary[10]);
        internshipPane.setText(lang.dictionary[11]);
        aboutMeBaseInfo.setText(lang.dictionary[12]);
        dellnerDElabel.setText(lang.dictionary[13]);
        dellnerDEbutton.setText(lang.dictionary[14]);
        dellnerPElabel.setText(lang.dictionary[15]);
        dellnerSElabel.setText(lang.dictionary[16]);
        dellnerDEbutton1.setText(lang.dictionary[14]);
        dellnerDEbutton2.setText(lang.dictionary[14]);
        bimetLabel.setText(lang.dictionary[17]);
        mondiLabel.setText(lang.dictionary[18]);
        universityPane.setText(lang.dictionary[19]);
        highschoolPane.setText(lang.dictionary[20]);
        universityLabel.setText(lang.dictionary[21]);
        highschoolLabel.setText(lang.dictionary[22]);
        programmingSkillsPane.setText(lang.dictionary[23]);
        engineeringSkillsPane.setText(lang.dictionary[24]);
        languagesSkillsPane.setText(lang.dictionary[25]);
        coursesSkillsPane.setText(lang.dictionary[26]);
        programmingLabel.setText(lang.dictionary[27]);
        linksLabel.setText(lang.dictionary[28]);
        engineeringSkillsLabel1.setText(lang.dictionary[29]);
        engineeringSkillsLabel2.setText(lang.dictionary[30]);
        engineeringSkillsLabel3.setText(lang.dictionary[31]);
        engineeringSkillsLabel4.setText(lang.dictionary[32]);
        engineeringSkillsLabel5.setText(lang.dictionary[33]);
        polishSkillsLabel.setText(lang.dictionary[34]);
        englishSkillsLabel.setText(lang.dictionary[35]);
        russianSkillsLabel.setText(lang.dictionary[36]);
        coursesLabel1.setText(lang.dictionary[37]);
        coursesLabel2.setText(lang.dictionary[38]);
        coursesLabel3.setText(lang.dictionary[39]);
        coursesLabel4.setText(lang.dictionary[40]);
        coursesLabel5.setText(lang.dictionary[41]);
        hobbiesPane.setText(lang.dictionary[42]);
        enneagramLabel.setText(lang.dictionary[43]);
        mbtiLabel.setText(lang.dictionary[44]);
        hobbiesLabel1.setText(lang.dictionary[45]);
        hobbiesLabel2.setText(lang.dictionary[46]);
        hobbiesLabel3.setText(lang.dictionary[47]);
        hobbiesLabel4.setText(lang.dictionary[48]);
        whyProgrammingPane.setText(lang.dictionary[49]);
        why31Pane.setText(lang.dictionary[50]);
        targetPane.setText(lang.dictionary[51]);
        whyDellnerPane.setText(lang.dictionary[52]);
        whyProgrammingLabel.setText(lang.dictionary[53]);
        why31Label.setText(lang.dictionary[54]);
        targetLabel.setText(lang.dictionary[55]);
        whyDellnerLabel.setText(lang.dictionary[56]);
        aboutProgramLabel.setText(lang.dictionary[57]);
        rodoLabel.setText(lang.dictionary[58]);
        musicLabel.setText(lang.dictionary[59]);
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


    @FXML    private VBox mainPane;
    @FXML    private AnchorPane topBarPane;
    @FXML    private Button polishButton;
    @FXML    private Button englishButton;
    @FXML    private RadioButton musicButton;
    @FXML    private TabPane tabMenuPane;
    @FXML    private Tab introductionTab;
    @FXML    private ImageView photoImageView;
    @FXML    private RadioButton firstPhotoRButton;
    @FXML    private RadioButton secondPhotoRButton;
    @FXML    private RadioButton thirdPhotoRButton;
    @FXML    private Label aboutMeIntroductionLabel;
    @FXML    private Tab experienceTab;
    @FXML    private TitledPane dellnedDEPane;
    @FXML    private TitledPane dellnerPEPane;
    @FXML    private TitledPane dellenrSEPane;
    @FXML    private TitledPane internshipPane;
    @FXML    private Tab educationTab;
    @FXML    private TitledPane universityPane;
    @FXML    private TitledPane highschoolPane;
    @FXML    private Tab skillsTab;
    @FXML    private TitledPane programmingSkillsPane;
    @FXML    private TitledPane engineeringSkillsPane;
    @FXML    private TitledPane languagesSkillsPane;
    @FXML    private Tab personTab;
    @FXML    private TitledPane enneagramPane;
    @FXML    private TitledPane mbtiPane;
    @FXML    private TitledPane hobbiesPane;
    @FXML    private Tab faqTab;
    @FXML    private TitledPane whyProgrammingPane;
    @FXML    private TitledPane why31Pane;
    @FXML    private TitledPane targetPane;
    @FXML    private Tab aboutProgramTab;
    @FXML    private Label aboutMeBaseInfo;
    @FXML    private Label dellnerDElabel;
    @FXML    private Button dellnerDEbutton;
    @FXML    private Label dellnerPElabel;
    @FXML    private Label dellnerSElabel;
    @FXML    private Button dellnerDEbutton1;
    @FXML    private Button dellnerDEbutton2;
    @FXML    private Label mondiLabel;
    @FXML    private Label bimetLabel;
    @FXML private Label universityLabel;
    @FXML private Label highschoolLabel;
    @FXML private TitledPane coursesSkillsPane;
    @FXML private Label programmingLabel;
    @FXML private Label linksLabel;
    @FXML private Button githubButton;
    @FXML private Button codewarsButton;
    @FXML private Label engineeringSkillsLabel1;
    @FXML private Label engineeringSkillsLabel2;
    @FXML private Label engineeringSkillsLabel3;
    @FXML private Label engineeringSkillsLabel4;
    @FXML private Label engineeringSkillsLabel5;
    @FXML private Label polishSkillsLabel;
    @FXML private Label englishSkillsLabel;
    @FXML private Label russianSkillsLabel;
    @FXML private Label coursesLabel1;
    @FXML private Label coursesLabel2;
    @FXML private Label coursesLabel3;
    @FXML private Label coursesLabel4;
    @FXML private Label coursesLabel5;
    @FXML private Label enneagramLabel;
    @FXML private Label mbtiLabel;
    @FXML private Label hobbiesLabel1;
    @FXML private Label hobbiesLabel2;
    @FXML private Label hobbiesLabel3;
    @FXML private Label hobbiesLabel4;
    @FXML private TitledPane whyDellnerPane;
    @FXML private Label whyProgrammingLabel;
    @FXML private Label why31Label;
    @FXML private Label targetLabel;
    @FXML private Label whyDellnerLabel;
    @FXML private Label aboutProgramLabel;
    @FXML private Label rodoLabel;
    @FXML private Label musicLabel;
}
