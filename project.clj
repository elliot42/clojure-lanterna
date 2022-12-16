(defproject clojure-lanterna "0.9.7"
  :description "A Clojure wrapper around the Lanterna terminal output library."
  :url "http://multimud.github.io/clojure-lanterna/"
  :license {:name "LGPL"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.googlecode.lanterna/lanterna "3.1.1"]]
  :java-source-paths ["./java"]
  ; :repositories {"sonatype-snapshots" "https://oss.sonatype.org/content/repositories/snapshots"}
  :repositories {"releases" {:url "https://clojars.org/repo"
                             :username :env
                             :password :env
                             :sign-releases false}})
