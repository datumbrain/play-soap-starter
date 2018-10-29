resolvers += Resolver.url("play-sbt-plugins", url("https://dl.bintray.com/playframework/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.15")
addSbtPlugin("com.typesafe.sbt" % "sbt-play-soap" % "1.1.4")
