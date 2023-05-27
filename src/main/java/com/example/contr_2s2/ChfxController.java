package com.example.contr_2s2;

import com.example.contr_2s2.Models.Movie;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ChfxController {
    @FXML
    private TableView<Movie> filmTable;
    @FXML
    private TableColumn<Movie, Long> idColumn;
    @FXML
    private TableColumn<Movie, String> titleColumn;
    @FXML
    private TableColumn<Movie, String> genreColumn;
    @FXML
    private TableColumn<Movie, Integer> durationColumn;
    @FXML
    private TableColumn<Movie, Integer> releaseYearColumn;


}
