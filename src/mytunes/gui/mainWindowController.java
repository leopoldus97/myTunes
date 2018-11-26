/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.gui;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author leopo
 */
public class mainWindowController implements Initializable
{

    @FXML
    private ListView<?> listSongsOnPlaylist;
    @FXML
    private TextField txtSearch;
    @FXML
    private Label lblSongTitle;
    @FXML
    private TableView<?> tablePlaylist;
    @FXML
    private TableView<?> tableSongs;

    String bip = "C:\\Users\\leopo.DESKTOP-GS83DEO\\Documents\\NetBeansProjects\\myTunes\\src\\mytunes\\Champion.mp3";
    Media hit;
    MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        hit = new Media(new File(bip).toURI().toString());
        mediaPlayer = new MediaPlayer(hit);
    }

    @FXML
    private void clickToPutSong(ActionEvent event)
    {
    }

    @FXML
    private void clickToSearch(ActionEvent event)
    {
    }

    @FXML
    private void clickToDeleteSongFromPlaylist(ActionEvent event)
    {
    }

    @FXML
    private void clickToChangeOrderDown(ActionEvent event)
    {
    }

    @FXML
    private void clickToEditSong(ActionEvent event)
    {
    }

    @FXML
    private void clickToDeleteSong(ActionEvent event)
    {
    }

    @FXML
    private void clickToCloseTab(ActionEvent event)
    {
    }

    @FXML
    private void clickToNewPlaylist(ActionEvent event)
    {
    }

    @FXML
    private void clickToNewSong(ActionEvent event)
    {
    }

    @FXML
    private void clickToEditPlaylist(ActionEvent event)
    {
    }

    @FXML
    private void clickToDeletePlaylist(ActionEvent event)
    {
    }

    @FXML
    private void clickToChangeOrderUp(ActionEvent event)
    {
    }

    @FXML
    private void play(ActionEvent event)
    {
        boolean isPlaying = false;
        if (!isPlaying)
        {
           mediaPlayer.play(); 
        } else
        {
            mediaPlayer.pause();
        }
        

    }

    @FXML
    private void forward(ActionEvent event)
    {
    }

    @FXML
    private void backward(ActionEvent event)
    {
    }

}
