# create js file

```bash
❯ scala-cli --power package --js src/logic.scala -o src/logic.js --force
Compiling project (Scala 3.4.1, Scala.js 1.16.0)
Compiled project (Scala 3.4.1, Scala.js 1.16.0)
[hint] ./src/logic.scala:4:15
[hint] "scalajs-dom is outdated, update to 2.8.0"
[hint]      scalajs-dom 2.2.0 -> org.scala-js::scalajs-dom::2.8.0
[hint] //> using dep org.scala-js::scalajs-dom::2.2.0
[hint]               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
Wrote /Users/scala/47deg/scala-cli-exercise/scala-js/src/logic.js, run it with
  node ./src/logic.js
```

import later in the HTML file

![alt text](image.png)

# Doobie

run `docker-compose up`

## pre-requisites 

Cats effects


```bash
❯ scala-cli  doobie.scala
Compiling project (Scala 3.4.1, JVM (17))
Compiled project (Scala 3.4.1, JVM (17))
Found country: Country(FRA,France,59225700)
All countries: DEU, ESP, FRA, GBR, USA
```