package dk.lokallykke.client

object Messages {

  object Accounting {
    object ToClient {
      case class Pong(str : String)

    }

    object ToServer {
      case class Ping(str : String)
    }

  }


}
