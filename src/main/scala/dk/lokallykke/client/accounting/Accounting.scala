package dk.lokallykke.client.accounting

import dk.lokallykke.client.Locations
import dk.lokallykke.client.util.WSConnector
import org.scalajs.dom.{Event, WebSocket}

import scala.scalajs.js.annotation._

object Accounting extends WSConnector{
  override def location = Locations.Accounting.WebSocket

  override def onMessage: Event => Unit = (ev : Event) => {
    println(s"Received messages")
  }

  def main(args: Array[String]): Unit = {

  }




}
