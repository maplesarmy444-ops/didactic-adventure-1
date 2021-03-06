(defproject didactic-adventure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/tools.logging "0.4.0"]
                 [org.clojure/java.jdbc "0.7.5"]
                 [com.h2database/h2 "1.4.196"]
                 [http-kit "2.2.0"]
                 [stylefruits/gniazdo "1.0.1"]
                 ]
  :main ^:skip-aot didactic-adventure.core
  :target-path "target/%s"
  :profiles
  {:test {:dependencies [[http-kit.fake "0.2.1"]]}
   :uberjar {:aot :all}})
