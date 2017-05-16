# MVC exercise from the Head First Design Patterns book

The domain is a DJ app, that allows to control the BPMs (Beats per minute)
* it can be seen the use of the Strategy Pattern, between the DJView composed
with the BeatController in it (implementing the ControllerInterface).

## Building

$mvn clean install

## Running

$java -jar target/mvc-1.0-SNAPSHOT-jar-with-dependencies.jar