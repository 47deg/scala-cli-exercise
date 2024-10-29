package com.xebia.doobie

import cats.effect.{IO, IOApp}
import doobie.*
import doobie.implicits.*
import doobie.syntax.*
import cats.effect.IO
import scala.concurrent.ExecutionContext
import cats.effect.unsafe.implicits.global

object Main extends IOApp.Simple {

  val xa = Transactor.fromDriverManager[IO](
    driver = "org.postgresql.Driver",
    url = "jdbc:postgresql:world",
    user = "postgres",
    password = "password",
    logHandler = None
  )

  case class Country(code: String, name: String, population: Long)

  def find(n: String): ConnectionIO[Option[Country]] =
    sql"select code, name, population from country where name = $n"
      .query[Country]
      .option

  def findAll: ConnectionIO[List[String]] =
    sql"select * from country"
      .query[String]
      .to[List]

  def runFind(name: String): IO[Unit] =
    find(name).transact(xa).flatMap {
      case Some(country) => IO.println(s"Found country: $country")
      case None          => IO.println(s"No country found with name: $name")
    }

  def runFindAll: IO[Unit] =
    findAll.transact(xa).flatMap { countries =>
      IO.println(s"All countries: ${countries.mkString(", ")}")
    }

  override def run: IO[Unit] =
    for {
      _ <- runFind("France")
      _ <- runFindAll
    } yield ()
}
