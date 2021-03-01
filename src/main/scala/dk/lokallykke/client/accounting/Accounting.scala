package dk.lokallykke.client.accounting

import dk.lokallykke.client.Locations
import dk.lokallykke.client.util.WSConnector
import org.scalajs.dom.{Event, WebSocket}
import org.scalajs.dom.raw._
import dk.lokallykke.client.Messages.{Accounting => AccMessages}

import scala.scalajs.js.JSON
import scala.scalajs.js.annotation._

object Accounting extends WSConnector{
  override def location = Locations.Accounting.WebSocket

  override def onMessage: MessageEvent => Unit = (ev : MessageEvent) => {
    val mess = JSON.parse(ev.data.toString) match {
      case AccMessages.ToClient.Pong(str) => println(s"Received pong: $str")
      case _ =>
    }

  }

  def main(args: Array[String]): Unit = {

  }




}
