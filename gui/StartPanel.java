package gui;

import data.Constants;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StartPanel extends Application {

    //Start Panel Size
    private final int panelXOffset = 10;
    private final int panelYOffset = 10;
    private final int panelWidth = 612;
    private final int panelHeight = 500;

    //StartPanel Tabs
    private String tabTitles[] = {"Schedule Tasks", "Settings"};
    private Tab[] tabs = new Tab[2];
    private GridPane[] hBoxes = new GridPane[2];

    //Schedule Button Settings
    private final Color LABEL_COLOR = Color.rgb(32,178,170,1.0);
    private Font labelFont = new Font("sans-serif", 14);
    private final String labelStrings[] = {"Task", "Target", "Location", "Item Disposal", "Bank At", "Task Goal"};
    private final String buttonLabels[] = {"Add Task", "Remove Task", "Clear All", "START", "Appraise"};
    private final String sectionTitles[] = {"Overlay", "Options"};
    private final String overlayLabelStrings[] = {"Paint Detail", "Show Cursor", "Show Work Area"};
    private final String optionLabelStrings[] = {"Ignore Player Detection", "Debug"};
    private final String pathsLabelStrings[] = {"Dwarven Mine - Falador Entrance"};
    private final String overlayToolTips[] = {
            "Adjusting the paint detail will allow you to increase the FPS by hiding information provided by default.",
            "Enabling this option will show the bots cursor movments on your screen.",
            "Enabling this option will draw a grid of the current work zone the bot has setup."
    };
    private final String optionToolTips[] = {
            "Enabling this option will make the bot gather objects that could be in use by other players.",
            "Enabling this option will output information in TopBots Command line."
    };
    private final String pathsToolTips[] = {
            "Enabling this path will allow the bot to use the entrance in Falador to enter the Dwarven Mine."
    };
    private Label labels[] = new Label[7];
    private Label overlayLabels[] = new Label[3];
    private ComboBox<String>[] comboBoxes = new ComboBox[6];
    private Spinner goalAmount = new Spinner();
    private Button buttons[] = new Button[5];
    private ComboBox<String> overlayComboBoxes[] = new ComboBox[1];
    private CheckBox overlayCheckBoxes[] = new CheckBox[2];
    private CheckBox pathsCheckBoxes[] = new CheckBox[1];
    private Label optionsLabels[] = new Label[2];
    private Label pathsLabels[] = new Label[1];
    private CheckBox optionCheckBoxes[] = new CheckBox[2];

    private int buttonWidth = 160;
    private int buttonHeight = 20;
    private int buttonXOffset = panelXOffset - 5;
    private int labelWidth = 160;
    private int labelHeight = 20;
    private int labelXOffset = panelXOffset - 5;
    private int padding = 10;
    private int comboBoxWidth = 160;
    private int comboBoxHeight = 20;
    private int comboBoxXOffset = panelXOffset - 5;
    private int labelYOffset = labelHeight + comboBoxHeight + padding;
    private int comboBoxYOffset = labelYOffset;
    private int buttonYOffset = 25;
    private int taskListWidth = panelWidth - 195;
    private int taskListHeight = panelHeight - 75;
    private int taskListXOffset = comboBoxWidth + 10;
    private int taskListYOffset = panelXOffset - 5;
    private int sectionWidth = panelWidth - 28;
    private int sectionHeight = 215;
    private int sectionXOffset = panelXOffset - 7;
    private int sectionLabelXOffset = sectionXOffset + 3;
    private int sectionLabelYOffset = labelHeight + comboBoxHeight + padding;
    private int sectionComboBoxWidth = 80;
    private int sectionComboBoxHeight = 18;
    private int sectionComboBoxXOffset = panelXOffset - 3;
    private int sectionComboBoxYOffset = sectionLabelYOffset;
    private int checkBoxWidth = 20;
    private int checkBoxHeight = 13;
    private int checkBoxXOffset = panelXOffset - 7;
    private int checkBoxYOffset = sectionLabelYOffset - 30;
    private int rowIndex = 0;

    public static void main(String[] args) {
        launch(args);
    }

    private static double version;

    public static void setVersion(double version) {
        version = version;
    }

    @Override
    public void start(Stage primaryStage) {
        //Panel Settings
        if (version != 0.0) {
            primaryStage.setTitle("TopHat v" + version + " - By Bloodwi11");
        } else {
            primaryStage.setTitle("TopHat DEBUG - By Bloodwi11");
        }
        final TabPane startPanel = new TabPane();

        //Add Tabs
        for (int i=0,j=tabs.length;i<j;i++) {
            tabs[i] = new Tab();
            hBoxes[i] = new GridPane();
            hBoxes[i].setAlignment(Pos.TOP_LEFT);
            tabs[i].setText(tabTitles[i]);
            tabs[i].setClosable(false);
            tabs[i].setContent(hBoxes[i]);
            startPanel.getTabs().add(tabs[i]);
        }

        //Schedule
        for (int i=0,j=7;i<j;i++) {
            if (i < 6) {
                //ComboBoxes & Labels
                labels[i] = new Label();
                labels[i].setText(labelStrings[i]);
                labels[i].setLayoutX(labelXOffset);
                labels[i].setLayoutY((labelYOffset * i) + 5);
                labels[i].setMinWidth(labelWidth);
                labels[i].setMaxWidth(labelWidth);
                labels[i].setMinHeight(labelHeight);
                labels[i].setMaxHeight(labelHeight);
                labels[i].setFont(labelFont);
                hBoxes[0].add(labels[i], 0, rowIndex,1,1);
                rowIndex++;
                comboBoxes[i] = new ComboBox<String>();
                comboBoxes[i].setLayoutX(comboBoxXOffset);
                comboBoxes[i].setLayoutY((comboBoxYOffset * i) + 25);
                comboBoxes[i].setMinWidth(comboBoxWidth);
                comboBoxes[i].setMaxWidth(comboBoxWidth);
                comboBoxes[i].setMinHeight(comboBoxHeight);
                comboBoxes[i].setMaxHeight(comboBoxHeight);
                if (i == 0) {
                    for (int k = 0, l = Constants.Jobs.values().length; k < l; k++) {
                        comboBoxes[i].getItems().add(Constants.Jobs.values()[k].getJobLabel());
                    }
                }
                hBoxes[0].add(comboBoxes[i],0,rowIndex,2,1);
                rowIndex++;
            } else {
                //Spinner & Label
                labels[i] = new Label();
                labels[i].setLayoutX(labelXOffset + 5);
                labels[i].setLayoutY((labelYOffset * i) - 1);
                labels[i].setMinWidth(labelWidth / 2);
                labels[i].setMaxWidth(labelWidth / 2);
                labels[i].setMinHeight(labelHeight);
                labels[i].setMaxHeight(labelHeight);
                labels[i].setFont(new Font("sans-serif", 12));
                hBoxes[0].add(labels[i],0,rowIndex,1,1);
                rowIndex++;
                goalAmount.setLayoutX(labelXOffset * 12);
                goalAmount.setLayoutY(comboBoxYOffset * i);
                goalAmount.setMinWidth(comboBoxWidth / 2);
                goalAmount.setMaxWidth(comboBoxWidth / 2);
                goalAmount.setMinHeight(comboBoxHeight);
                goalAmount.setMaxHeight(comboBoxHeight);
                hBoxes[0].add(goalAmount,1,rowIndex,2,1);
                rowIndex++;
            }
        }
        for (int i=0,j=4;i<j;i++) {
            //Buttons
            buttons[i] = new Button(buttonLabels[i]);
            buttons[i].setLayoutX(buttonXOffset);
            buttons[i].setLayoutY((buttonYOffset * i) + 330);
            buttons[i].setMinWidth(buttonWidth);
            buttons[i].setMaxWidth(buttonWidth);
            buttons[i].setMinHeight(buttonHeight);
            buttons[i].setMaxHeight(buttonHeight);
            /*if (i == 3) {
                buttons[i].setBackground(Color.GREEN);
            }*/
            hBoxes[0].add(buttons[i], 0, rowIndex);
            rowIndex++;
        }
        buttons[4] = new Button(buttonLabels[4]);
        //buttons[4].setBounds(labelXOffset + (labelWidth - 100), labelYOffset, labelWidth - 60, labelHeight);
        buttons[4].setFont(new Font("sans-serif", 9));
        hBoxes[0].add(buttons[4],1,2,1,1);
        rowIndex++;
        //Remove these as they are added
        comboBoxes[0].getItems().remove(Constants.Jobs.QUEST.getJobLabel());
        comboBoxes[0].getItems().remove(Constants.Jobs.SMELT.getJobLabel());
        comboBoxes[0].getItems().remove(Constants.Jobs.WOODCUTTING.getJobLabel());
        comboBoxes[0].getItems().remove(Constants.Jobs.CRAFT.getJobLabel());
        /*tabs[2].removeAll();*/

        Scene scene = new Scene(startPanel, panelWidth, panelHeight);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}