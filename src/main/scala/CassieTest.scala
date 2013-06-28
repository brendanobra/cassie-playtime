import com.twitter.cassie._
import com.twitter.finagle.stats.OstrichStatsReceiver

object CassieTest {
  def main(args: Array[String]) = {
	//val cluster = new Cluster("localhost", new com.twitter.finagle.stats.OstrichStatsReceiver)
        val cluster = new Cluster("localhost")
	val keyspace = cluster.keyspace("test").connect()
	println("Hi!")
  }
}

