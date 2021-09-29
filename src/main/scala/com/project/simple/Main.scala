package com.project.simple

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp {
  override def run(args: List[String]): IO[ExitCode] =
    for {
      _ <- IO { println("Hello World!") }
    } yield ExitCode.Success
}
