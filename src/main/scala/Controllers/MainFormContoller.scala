package Controllers

import scalafx.event.ActionEvent
import scalafx.scene.control.{Alert, Button, TextArea, TextField}
import scalafxml.core.macros.sfxml
import Affine.{AffineCoder, AffineDecoder}

/**
  * Created by Alkit on 9/16/2016.
  */
@sfxml
class MainFormContoller(private val encode: Button,
                        private val decode: Button,
                        private val encodeA: TextField,
                        private val encodeB: TextField,
                        private val decodeA: TextField,
                        private val decodeB: TextField,
                        private val encodeMessage: TextArea,
                        private val decodeMessage: TextArea) {

  def encodeText(event: ActionEvent): Unit = {
    if (validate(encodeA.getText) && validate(encodeB.getText)) {
      val aKey = encodeA.getText.toInt
      val bKey = encodeB.getText.toInt
      val affineCoder = new AffineCoder(aKey, bKey, 26)
      encodeMessage.text = affineCoder.encode(encodeMessage.getText())
    }
    else awareAboutError()
  }

  def decodeText(event: ActionEvent): Unit = {
    if (validate(decodeA.getText) && validate(decodeB.getText)) {
      val aKey = decodeA.getText.toInt
      val bKey = decodeB.getText.toInt
      val affineDecoder = new AffineDecoder(decodeA.getText.toInt, decodeB.getText.toInt, 26)
      decodeMessage.text = affineDecoder.decode(decodeMessage.getText)
    }
    else awareAboutError()
  }

  def validate(string: String) = {
    string.matches("[1-9]")
  }

  def awareAboutError(): Unit ={
      val alert = new Alert(Alert.AlertType.Information)
      alert.setTitle("Information")
      alert.setHeaderText(null)
      alert.setContentText("There are must me numbers!")
      alert.showAndWait()
  }
}
