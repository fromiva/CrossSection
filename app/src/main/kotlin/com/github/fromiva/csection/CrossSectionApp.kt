package com.github.fromiva.csection

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafx.stage.Stage

class CrossSectionApp : Application() {
    override fun start(stage: Stage) {
        val pane = Pane()
        pane.prefHeight = 500.0
        pane.prefWidth = 500.0
        stage.scene = Scene(pane)
        stage.title = "CrossSection"
        stage.show()
    }
}
